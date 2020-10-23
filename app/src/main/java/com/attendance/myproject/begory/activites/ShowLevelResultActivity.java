package com.attendance.myproject.begory.activites;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.pdf.PdfDocument;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.adapters.ShowStudentResultAdapter;
import com.attendance.myproject.begory.beans.LevelItem;
import com.attendance.myproject.begory.beans.ResultItem;
import com.attendance.myproject.begory.beans.StudentItem;
import com.attendance.myproject.begory.beans.StudentWithResult;
import com.attendance.myproject.begory.beans.TermItem;
import com.attendance.myproject.begory.entites.Admin;
import com.attendance.myproject.begory.entites.Level;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;


public class ShowLevelResultActivity extends AppCompatActivity {

    private ArrayList<StudentItem> mStudentList = new ArrayList<>();

    private ShowStudentResultAdapter mAdapter;
    private ArrayList<StudentWithResult> mStudentWithResultsList = new ArrayList<>();

    private LevelItem levelItem;

    private Spinner mLevelSpinner;
    private ArrayList<Level> mLevelsList = new ArrayList<>();

    PdfDocument pdfDocument;
    private int width, height;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_level_result);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        setTitle(R.string.m_show_results);

      initLevelsSpinner();
      initRecyclerView();

        findViewById(R.id.btn_save).setVisibility(View.GONE);
      findViewById(R.id.btn_save).setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (mStudentWithResultsList.size()>0)
                  saveToStorage();
          }
      });
    }

    private void initLevelsSpinner() {

        Level level = new Level();
        level.setLevelId("-1");
        level.setLevelName(getString(R.string.choose_level));
        mLevelsList.add(level);

        Admin mAdmin = Utils.getAdmin(this);
        if (mAdmin.isMainAdmin()) {

            level = new Level();
            level.setLevelId(FBConnenctions.CONST_LEVEL_1);
            level.setLevelName(getString(R.string.lev_1));
            mLevelsList.add(level);

            level = new Level();
            level.setLevelId(FBConnenctions.CONST_LEVEL_2);
            level.setLevelName(getString(R.string.lev_2));
            mLevelsList.add(level);

            level = new Level();
            level.setLevelId(FBConnenctions.CONST_LEVEL_3);
            level.setLevelName(getString(R.string.lev_3));
            mLevelsList.add(level);

            level = new Level();
            level.setLevelId(FBConnenctions.CONST_LEVEL_4);
            level.setLevelName(getString(R.string.lev_4));
            mLevelsList.add(level);

            level = new Level();
            level.setLevelId(FBConnenctions.CONST_LEVEL_5);
            level.setLevelName(getString(R.string.lev_5));
            mLevelsList.add(level);

            level = new Level();
            level.setLevelId(FBConnenctions.CONST_LEVEL_6);
            level.setLevelName(getString(R.string.lev_6));
            mLevelsList.add(level);

        }
        else
        {
            if (mAdmin.getLevels()!=null)
            {
                for (int i=0;i<mAdmin.getLevels().size();i++)
                {
                    if (mAdmin.getLevels().get(i).isSelected())
                    {
                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_1))
                        {
                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_1);
                            level.setLevelName(getString(R.string.lev_1));
                            mLevelsList.add(level);
                        }
                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_2))
                        {
                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_2);
                            level.setLevelName(getString(R.string.lev_2));
                            mLevelsList.add(level);
                        }
                        if (mAdmin.getLevels().get(i).getId().equals( FBConnenctions.CONST_LEVEL_3))
                        {
                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_3);
                            level.setLevelName(getString(R.string.lev_3));
                            mLevelsList.add(level);

                        }
                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_4))
                        {

                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_4);
                            level.setLevelName(getString(R.string.lev_4));
                            mLevelsList.add(level);

                        }
                        if (mAdmin.getLevels().get(i).getId().equals( FBConnenctions.CONST_LEVEL_5))
                        {

                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_5);
                            level.setLevelName(getString(R.string.lev_5));
                            mLevelsList.add(level);


                        }
                        if (mAdmin.getLevels().get(i).getId().equals( FBConnenctions.CONST_LEVEL_6))
                        {
                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_6);
                            level.setLevelName(getString(R.string.lev_6));
                            mLevelsList.add(level);
                        }
                    }
                }
            }
        }


        mLevelSpinner = (Spinner) findViewById(R.id.sp_levels);
        ArrayAdapter<Level> dataAdapter = new ArrayAdapter<Level>(ShowLevelResultActivity.this,
                android.R.layout.simple_spinner_item, mLevelsList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mLevelSpinner.setAdapter(dataAdapter);

        mLevelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (mLevelSpinner.getSelectedItemPosition()>0) {
                    mStudentList.clear();
                    mStudentWithResultsList.clear();
                    mAdapter.notifyDataSetChanged();
                    getStudentsList();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    private void initRecyclerView() {

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_attendance);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        GridLayoutManager mLayoutManager = new GridLayoutManager(this,1);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new ShowStudentResultAdapter(this,mStudentWithResultsList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void getStudentsList() {

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(this)).child(((Level)mLevelSpinner.getSelectedItem()).getLevelId());

            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {

                        findViewById(R.id.progressBar).setVisibility(View.GONE);
                        levelItem=dataSnapshot.getValue(LevelItem.class);
                        if (levelItem.getStudents()!=null) {
                            mStudentList.addAll(levelItem.getStudents());
                            manageStudentWithAttendance();
                        }

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

    }

    private void manageStudentWithAttendance() {
        for (int i=0;i<mStudentList.size();i++)
        {
            if (mStudentList.get(i).getStudentRes()==null)
            {
                setEmptyResult(i);
            }
            else
            {
                StudentWithResult studentWithResult = new StudentWithResult();
                studentWithResult.setId(mStudentList.get(i).getId());
                studentWithResult.setName(mStudentList.get(i).getName());

                ResultItem resultItem = mStudentList.get(i).getStudentRes();
                int totalSubjects = 0;
                int studentResult = 0;
                if (resultItem.getfTerm().getfSubGrade() !=-1) {
                    totalSubjects += 1;
                    studentResult += resultItem.getfTerm().getfSubGrade();
                }
                if (resultItem.getfTerm().getsSubGrade() !=-1)
                {
                    totalSubjects += 1;
                    studentResult += resultItem.getfTerm().getsSubGrade();
                }
                if (resultItem.getsTerm().getfSubGrade() !=-1)
                {
                    totalSubjects += 1;
                    studentResult += resultItem.getsTerm().getfSubGrade();
                }
                if (resultItem.getsTerm().getsSubGrade() !=-1)
                {
                    totalSubjects += 1;
                    studentResult += resultItem.getsTerm().getsSubGrade();
                }
                if (resultItem.gettTerm().getfSubGrade() !=-1)
                {
                    totalSubjects += 1;
                    studentResult += resultItem.gettTerm().getfSubGrade();
                }
                if (resultItem.gettTerm().getsSubGrade() !=-1)
                {
                    totalSubjects += 1;
                    studentResult += resultItem.gettTerm().getsSubGrade();
                }

                if (totalSubjects>0) {

                    //3.5  Exe  2.5 very good 1.5 good 0.5 acc 0.0 fear

                    float totalResult =(float) studentResult /totalSubjects ;
                    resultItem.setTotalStudentResult(studentResult);

                    if (totalResult >= 3.5) {
                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_EXCELLENT);
                    } else if (totalResult >= 2.5) {
                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_VERY_GOOD);
                    } else if (totalResult >= 1.5) {
                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_GOOD);
                    } else if (totalResult >= 0.5) {
                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_ACCEPTABLE);
                    } else
                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_FEAR);

                    /*float totalResult = (studentResult * 100) / (totalSubjects * 4);

                    if (totalResult >= 90) {
                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_EXCELLENT);
                    } else if (totalResult >= 80) {
                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_VERY_GOOD);
                    } else if (totalResult >= 65) {
                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_GOOD);
                    } else if (totalResult >= 50) {
                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_ACCEPTABLE);
                    } else
                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_FEAR);*/
                }

                studentWithResult.setResultItem(resultItem);
                mStudentWithResultsList.add(studentWithResult);
            }
        }

        Collections.sort(mStudentWithResultsList, new Comparator<StudentWithResult>() {
            @Override
            public int compare(StudentWithResult o1, StudentWithResult o2) {
                return o2.getResultItem().getTotalGrade()-(o1.getResultItem().getTotalGrade());
            }
        });

        Collections.sort(mStudentWithResultsList, new Comparator<StudentWithResult>() {
            @Override
            public int compare(StudentWithResult o1, StudentWithResult o2) {
                return o2.getResultItem().getTotalStudentResult()-(o1.getResultItem().getTotalStudentResult());
            }
        });

        mAdapter.notifyDataSetChanged();


    }

    private void setEmptyResult(int index) {
        StudentWithResult studentWithResult = new StudentWithResult();
        studentWithResult.setId(mStudentList.get(index).getId());
        studentWithResult.setName(mStudentList.get(index).getName());

        ResultItem resultItem = new ResultItem();

        TermItem termItem = new TermItem();
        termItem.setsSubGrade(-1);
        termItem.setfSubGrade(-1);
        resultItem.setfTerm(termItem);
        termItem = new TermItem();
        termItem.setsSubGrade(-1);
        termItem.setfSubGrade(-1);
        resultItem.setsTerm(termItem);
        termItem = new TermItem();
        termItem.setsSubGrade(-1);
        termItem.setfSubGrade(-1);
        resultItem.settTerm(termItem);
        resultItem.setTotalGrade(-1);
        studentWithResult.setResultItem(resultItem);

        mStudentWithResultsList.add(studentWithResult);
    }

    public void saveToStorage() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                //Log.v(TAG,"Permission is granted");
                saveToPdf();
            } else {

                // Log.v(TAG,"Permission is revoked");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
            //  Log.v(TAG,"Permission is granted");
            saveToPdf();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]== PackageManager.PERMISSION_GRANTED){
            //  Log.v(TAG,"Permission: "+permissions[0]+ "was "+grantResults[0]);
            //resume tasks needing this permission
            saveToPdf();
        }
    }

    private void saveToPdf ()
    {
        width = mRecyclerView.getWidth();
        height = mRecyclerView.getHeight();

        Bitmap b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c1 = new Canvas(b);
        mRecyclerView.draw(c1);

        PdfDocument pd = new PdfDocument();

        PdfDocument.PageInfo pi = new PdfDocument.PageInfo.Builder(width, height, 1).create();
        PdfDocument.Page p = pd.startPage(pi);
        Canvas c = p.getCanvas();
        c.drawBitmap(b, 0, 0, new Paint());
        pd.finishPage(p);

        try {
            //make sure you have asked for storage permission before this
            File f = new File(Environment.getExternalStorageDirectory() + File.separator +
                    ((Level)mLevelSpinner.getSelectedItem()).getLevelName() +"_"+Calendar.getInstance().getTimeInMillis() +".pdf");
            pd.writeTo(new FileOutputStream(f));
            Toast.makeText(getApplicationContext(),R.string.saved_pdf,Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            Toast.makeText(getApplicationContext(),R.string.error,Toast.LENGTH_LONG).show();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            Toast.makeText(getApplicationContext(),R.string.error,Toast.LENGTH_LONG).show();
        }

        pd.close();
    }
}
