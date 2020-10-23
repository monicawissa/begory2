package com.attendance.myproject.begory.activites;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.beans.LevelItem;
import com.attendance.myproject.begory.entites.Admin;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class DeactivateAdminActivity extends AppCompatActivity {

    private Spinner mAdminSpinner;
    private ArrayList<Admin> mAdminsList = new ArrayList<>();
    private ArrayList<LevelItem> mLevelsList = new ArrayList<>();
    private Admin mSelectedAdmin;
    private CheckBox mIsActiveCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deactivate_admin);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        mIsActiveCheckBox = findViewById(R.id.cb_is_active);
        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                add();
            }
        });

        findViewById(R.id.btn_select_levels).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectLevels();
            }
        });

        initUsersSpinner();

    }

    private void selectLevels() {

        mLevelsList.clear();
        if (mSelectedAdmin.getLevels()==null)
        {
            LevelItem level = new LevelItem();
            level.setId(FBConnenctions.CONST_LEVEL_1);
            level.setName(getString(R.string.lev_1));
            level.setSelected(false);
            mLevelsList.add(level);

            level = new LevelItem();
            level.setId(FBConnenctions.CONST_LEVEL_2);
            level.setName(getString(R.string.lev_2));
            level.setSelected(false);
            mLevelsList.add(level);

            level = new LevelItem();
            level.setId(FBConnenctions.CONST_LEVEL_3);
            level.setName(getString(R.string.lev_3));
            level.setSelected(false);
            mLevelsList.add(level);

            level = new LevelItem();
            level.setId(FBConnenctions.CONST_LEVEL_4);
            level.setName(getString(R.string.lev_4));
            level.setSelected(false);
            mLevelsList.add(level);

            level = new LevelItem();
            level.setId(FBConnenctions.CONST_LEVEL_5);
            level.setName(getString(R.string.lev_5));
            level.setSelected(false);
            mLevelsList.add(level);

            level = new LevelItem();
            level.setId(FBConnenctions.CONST_LEVEL_6);
            level.setName(getString(R.string.lev_6));
            level.setSelected(false);
            mLevelsList.add(level);
        }
        else
        {
            mLevelsList.addAll(mSelectedAdmin.getLevels());
        }

        boolean[] checkedItems = new boolean[mLevelsList.size()];
        String[] items = new String[mLevelsList.size()];

        for (int i=0;i<mLevelsList.size();i++) {
            checkedItems[i] = mLevelsList.get(i).isSelected();
            items[i] = mLevelsList.get(i).getName();
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(DeactivateAdminActivity.this);
        builder.setTitle(R.string.update_levels);

        builder.setMultiChoiceItems(items, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int selectedItem, boolean isChecked) {
                //Toast.makeText(DeactivateAdminActivity.this, "Position: " + which + " Value: " + listItems[which] + " State: " + (isChecked ? "checked" : "unchecked"), Toast.LENGTH_LONG).show();
                mLevelsList.get(selectedItem).setSelected(isChecked);
            }
        });

        builder.setPositiveButton(getString(R.string.save), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void initUsersSpinner() {

        mAdminSpinner = (Spinner) findViewById(R.id.sp_levels);

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(this));

            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {

                        findViewById(R.id.progressBar).setVisibility(View.GONE);
                        Iterable<DataSnapshot> children = dataSnapshot.child(FBConnenctions.CONST_ADMINS).getChildren();
                        for (DataSnapshot child : children) {

                            Admin std1=child.getValue(Admin.class);
                            mAdminsList.add(std1);
                        }

                        ArrayAdapter<Admin> dataAdapter = new ArrayAdapter<Admin>(DeactivateAdminActivity.this,
                                android.R.layout.simple_spinner_item, mAdminsList);
                        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        mAdminSpinner.setAdapter(dataAdapter);

                        mAdminSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                                mSelectedAdmin = mAdminsList.get(i);

                                if (!mAdminsList.get(i).isAccountActive())
                                    mIsActiveCheckBox.setChecked(true);
                                else
                                    mIsActiveCheckBox.setChecked(false);

                                if (mSelectedAdmin.isMainAdmin())
                                    findViewById(R.id.btn_select_levels).setVisibility(View.GONE);
                                else
                                    findViewById(R.id.btn_select_levels).setVisibility(View.VISIBLE);
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });

                        mAdminSpinner.setSelection(0);
                        mSelectedAdmin = mAdminsList.get(0);

                        if (mSelectedAdmin.isMainAdmin())
                            findViewById(R.id.btn_select_levels).setVisibility(View.GONE);
                        else
                            findViewById(R.id.btn_select_levels).setVisibility(View.VISIBLE);

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

        if (mAdminsList.size() == 0) {
            Toast.makeText(getApplicationContext(), R.string.choose_name, Toast.LENGTH_SHORT).show();
            return;
        }

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));
        DatabaseReference attendanceDatabaseReference = mDatabase.child(FBConnenctions.CONST_ADMINS);

        Admin admin = mAdminsList.get(mAdminSpinner.getSelectedItemPosition());
        admin.setAccountActive(!mIsActiveCheckBox.isChecked());
        if ( !mAdminsList.get(mAdminSpinner.getSelectedItemPosition()).isMainAdmin())
            admin.setLevels(mLevelsList);

        mAdminsList.set(mAdminSpinner.getSelectedItemPosition(),admin);

        attendanceDatabaseReference.child(admin.getAdminId()).setValue(admin).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                findViewById(R.id.progressBar).setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), R.string.edited, Toast.LENGTH_SHORT).show();
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
