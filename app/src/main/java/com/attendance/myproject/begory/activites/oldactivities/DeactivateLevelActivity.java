package com.attendance.myproject.begory.activites.oldactivities;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.entites.Level;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class DeactivateLevelActivity extends AppCompatActivity {

    private Spinner mLevelSpinner;
    private ArrayList<Level> mLevelsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deactivate_level);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                add();
            }
        });

        initLevelsSpinner();

    }

    private void initLevelsSpinner() {

        mLevelSpinner = (Spinner) findViewById(R.id.sp_levels);

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(this));

            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {

                        findViewById(R.id.progressBar).setVisibility(View.GONE);
                        Iterable<DataSnapshot> children = dataSnapshot.child(FBConnenctions.CONST_LEVELS).getChildren();
                        for (DataSnapshot child : children) {

                            Level std1=child.getValue(Level.class);
                             mLevelsList.add(std1);
                        }

                        ArrayAdapter<Level> dataAdapter = new ArrayAdapter<Level>(DeactivateLevelActivity.this,
                                android.R.layout.simple_spinner_item, mLevelsList);
                        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        mLevelSpinner.setAdapter(dataAdapter);

                        mLevelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                                if (mLevelsList.get(i).isLevelActive())
                                    ((Button)findViewById(R.id.btn_add)).setText(R.string.deactive);
                                else
                                    ((Button)findViewById(R.id.btn_add)).setText(R.string.activate);

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });

                        mLevelSpinner.setSelection(0);

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

    private void add() {

        if (mLevelsList.size() == 0) {
            Toast.makeText(getApplicationContext(), R.string.choose_level, Toast.LENGTH_SHORT).show();
            return;
        }

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));
        DatabaseReference attendanceDatabaseReference = mDatabase.child(FBConnenctions.CONST_LEVELS);

        Level level = mLevelsList.get(mLevelSpinner.getSelectedItemPosition());
        level.setLevelActive(!level.isLevelActive());
        mLevelsList.set(mLevelSpinner.getSelectedItemPosition(),level);

        attendanceDatabaseReference.child(level.getLevelId()).setValue(level).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                finish();
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Write failed
                        // ...
                        Toast.makeText(getApplicationContext(), R.string.error, Toast.LENGTH_SHORT).show();
                    }
                });
    }

}
