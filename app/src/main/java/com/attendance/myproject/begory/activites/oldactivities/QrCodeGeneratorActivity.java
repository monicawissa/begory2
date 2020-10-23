package com.attendance.myproject.begory.activites.oldactivities;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.entites.Student;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class QrCodeGeneratorActivity extends AppCompatActivity {

    private Spinner mStudentSpinner;
    private ArrayList<Student> mStudentsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_generator);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                generateNow();
            }
        });

        initStudentsSpinner();

    }

    private void generateNow() {

        if (mStudentsList.size() == 0) {
            Toast.makeText(getApplicationContext(), R.string.choose_name, Toast.LENGTH_SHORT).show();
            return;
        }

        String text= mStudentsList.get(mStudentSpinner.getSelectedItemPosition()).getStudentId(); // Whatever you need to encode in the QR code
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
        try {
            BitMatrix bitMatrix = multiFormatWriter.encode(text, BarcodeFormat.QR_CODE,250,250);
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);

            ImageView mQrCodeImageView = (ImageView) findViewById(R.id.iv_qrcode);
            mQrCodeImageView.setImageBitmap(bitmap);

            View content = findViewById(R.id.rlid);
            content.setDrawingCacheEnabled(true);
            Bitmap bitmap2 = content.getDrawingCache();

            saveQrCodeToStorage(bitmap2);
        } catch (WriterException e) {
            e.printStackTrace();
        }
    }

    private void initStudentsSpinner() {

        mStudentSpinner = (Spinner) findViewById(R.id.sp_names);

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(this));
            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {

                        findViewById(R.id.progressBar).setVisibility(View.GONE);
                        Iterable<DataSnapshot> children = dataSnapshot.child(FBConnenctions.CONST_STUDENTS).getChildren();
                        for (DataSnapshot child : children) {

                            Student std1=child.getValue(Student.class);
                            mStudentsList.add(std1);
                        }

                        ArrayAdapter<Student> dataAdapter = new ArrayAdapter<Student>(QrCodeGeneratorActivity.this,
                                android.R.layout.simple_spinner_item, mStudentsList);
                        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        mStudentSpinner.setAdapter(dataAdapter);

                    } catch (Exception e) {
                        Log.e("Exception is", e.toString());
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }catch(Exception e){
            Log.e("Exception is",e.toString());
        }

        mStudentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                TextView mNameTextView = (TextView) findViewById(R.id.tv_name);
                mNameTextView.setText(mStudentsList.get(mStudentSpinner.getSelectedItemPosition()).getStudentName());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private Bitmap mBitmap = null;
    public void saveQrCodeToStorage(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                //Log.v(TAG,"Permission is granted");
                saveImage(bitmap);
            } else {

                mBitmap = bitmap;
               // Log.v(TAG,"Permission is revoked");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
          //  Log.v(TAG,"Permission is granted");
            saveImage(bitmap);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]== PackageManager.PERMISSION_GRANTED){
          //  Log.v(TAG,"Permission: "+permissions[0]+ "was "+grantResults[0]);
            //resume tasks needing this permission
            if (mBitmap!=null)
                saveImage(mBitmap);
        }
    }

    private void saveImage(Bitmap finalBitmap) {

        String root = Environment.getExternalStorageDirectory().toString();
        File myDir = new File(root + "/"+getString(R.string.app_name));
        myDir.mkdirs();

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fname = mStudentsList.get(mStudentSpinner.getSelectedItemPosition()).getStudentId()+"_"+
                mStudentsList.get(mStudentSpinner.getSelectedItemPosition()).getStudentName()+"_"+timeStamp +".jpg";

        File file = new File(myDir, fname);
        if (file.exists())
            file.delete ();
        try {
            FileOutputStream out = new FileOutputStream(file);
            finalBitmap.compress(Bitmap.CompressFormat.JPEG, 100, out);
            out.flush();
            out.close();

            Toast.makeText(getApplicationContext(),R.string.image_saved+" "+file.getAbsolutePath(),Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
