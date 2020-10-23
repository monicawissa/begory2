package com.attendance.myproject.begory.activites;

import android.support.annotation.NonNull;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.attendance.myproject.begory.BaseActivity;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.adapters.MenuAdapter;
import com.attendance.myproject.begory.beans.LevelItem;
import com.attendance.myproject.begory.entites.Admin;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.rv_menu);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        GridLayoutManager mLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        MenuAdapter mAdapter = new MenuAdapter(this,fillMenu());
        mRecyclerView.setAdapter(mAdapter);

        //setupLevels();
    }

    private ArrayList<Integer> fillMenu() {

        Admin mAdmin = Utils.getAdmin(this);

        ArrayList<Integer> mItems = new ArrayList<>();



        if (mAdmin.isMainAdmin()) {

            mItems.add(R.string.a_lev_2);
            mItems.add(R.string.a_lev_1);
            mItems.add(R.string.a_lev_4);
            mItems.add(R.string.a_lev_3);
            mItems.add(R.string.a_lev_6);
            mItems.add(R.string.a_lev_5);
            mItems.add(R.string.m_edit_student);
            mItems.add(R.string.m_add_student);
            mItems.add(R.string.m_level_attendance);
            mItems.add(R.string.m_show_results);
            mItems.add(R.string.m_add_results);
            mItems.add(R.string.m_add_admin);
            mItems.add(R.string.m_deactive_admin);
        }
        else
        {
            if (mAdmin.getLevels()!=null)
            {
                for (int i=0;i<mAdmin.getLevels().size();i++)
                {
                    if (mAdmin.getLevels().get(i).isSelected())
                    {
                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_2))
                            mItems.add(R.string.a_lev_2);

                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_1))
                            mItems.add(R.string.a_lev_1);

                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_4))
                            mItems.add(R.string.a_lev_4);

                        if (mAdmin.getLevels().get(i).getId().equals( FBConnenctions.CONST_LEVEL_3))
                            mItems.add(R.string.a_lev_3);

                        if (mAdmin.getLevels().get(i).getId().equals( FBConnenctions.CONST_LEVEL_6))
                            mItems.add(R.string.a_lev_6);

                        if (mAdmin.getLevels().get(i).getId().equals( FBConnenctions.CONST_LEVEL_5))
                            mItems.add(R.string.a_lev_5);

                    }
                }
            }


            mItems.add(R.string.m_level_attendance);
            mItems.add(R.string.m_show_results);
        }

        mItems.add(R.string.m_signout);

        return mItems;
    }

    private void setupLevels()
    {
        setupLevel1();
        setupLevel2();
        setupLevel3();
        setupLevel4();
        setupLevel5();
        setupLevel6();
    }

    private void setupLevel1() {

        LevelItem levelItem = new LevelItem();
        levelItem.setId(FBConnenctions.CONST_LEVEL_1);
        levelItem.setName("حضانة");

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));

        DatabaseReference databaseReference = mDatabase.child(FBConnenctions.CONST_LEVEL_1);

        levelItem.setId(FBConnenctions.CONST_LEVEL_1);

        databaseReference.setValue(levelItem).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });
    }

    private void setupLevel2() {

        LevelItem levelItem = new LevelItem();
        levelItem.setId(FBConnenctions.CONST_LEVEL_2);
        levelItem.setName("1,2");

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));

        DatabaseReference databaseReference = mDatabase.child(FBConnenctions.CONST_LEVEL_2);

        levelItem.setId(FBConnenctions.CONST_LEVEL_2);

        databaseReference.setValue(levelItem).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });
    }

    private void setupLevel3() {

        LevelItem levelItem = new LevelItem();
        levelItem.setId(FBConnenctions.CONST_LEVEL_3);
        levelItem.setName("3,4");

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));

        DatabaseReference databaseReference = mDatabase.child(FBConnenctions.CONST_LEVEL_3);

        levelItem.setId(FBConnenctions.CONST_LEVEL_3);

        databaseReference.setValue(levelItem).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });
    }

    private void setupLevel4() {

        LevelItem levelItem = new LevelItem();
        levelItem.setId(FBConnenctions.CONST_LEVEL_4);
        levelItem.setName("5,6");

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));

        DatabaseReference databaseReference = mDatabase.child(FBConnenctions.CONST_LEVEL_4);

        levelItem.setId(FBConnenctions.CONST_LEVEL_4);

        databaseReference.setValue(levelItem).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });
    }

    private void setupLevel5() {

        LevelItem levelItem = new LevelItem();
        levelItem.setId(FBConnenctions.CONST_LEVEL_5);
        levelItem.setName("اعدادى");

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));

        DatabaseReference databaseReference = mDatabase.child(FBConnenctions.CONST_LEVEL_5);

        levelItem.setId(FBConnenctions.CONST_LEVEL_5);

        databaseReference.setValue(levelItem).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });
    }

    private void setupLevel6() {

        LevelItem levelItem = new LevelItem();
        levelItem.setId(FBConnenctions.CONST_LEVEL_6);
        levelItem.setName("ثانوى وجامعة");

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));

        DatabaseReference databaseReference = mDatabase.child(FBConnenctions.CONST_LEVEL_6);

        levelItem.setId(FBConnenctions.CONST_LEVEL_6);

        databaseReference.setValue(levelItem).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });
    }

}
