package com.attendance.myproject.begory.Utilities;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.entites.Admin;
import com.attendance.myproject.begory.entites.Attendance;
import com.attendance.myproject.begory.entites.Level;
import com.attendance.myproject.begory.entites.Student;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class FBConnenctions {

    public static final String CONST_STUDENTS = "StudentsList";
    public static final String CONST_LEVELS = "LevelsList";
    public static final String CONST_ATTENDANCE = "StudentAttendence";
    public static final String CONST_ADMINS = "AdminsList";
    public static final String CONST_LEVEL_1 = "Level1";
    public static final String CONST_LEVEL_2 = "Level2";
    public static final String CONST_LEVEL_3 = "Level3";
    public static final String CONST_LEVEL_4 = "Level4";
    public static final String CONST_LEVEL_5 = "Level5";
    public static final String CONST_LEVEL_6 = "Level6";


    public static final int CONST_GRADE_FEAR = 0;
    public static final int CONST_GRADE_ACCEPTABLE = 1;
    public static final int CONST_GRADE_GOOD = 2;
    public static final int CONST_GRADE_VERY_GOOD = 3;
    public static final int CONST_GRADE_EXCELLENT = 4;


    public static void addNewStudent(final Context context, Student student,final ProgressBar progressBar) {
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(context));
        mDatabase.child(CONST_STUDENTS).child(student.getStudentId()).setValue(student).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                progressBar.setVisibility(View.GONE);
                Toast.makeText(context, R.string.added, Toast.LENGTH_SHORT).show();
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Write failed
                        // ...
                        progressBar.setVisibility(View.GONE);
                        Toast.makeText(context, R.string.error, Toast.LENGTH_SHORT).show();
                    }
                });
    }

    public static void getStudents(Context context)
    {
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(context));
            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {

                        // Toast.makeText(StudentInformationActivity.this, "Hello bro Again", Toast.LENGTH_SHORT).show();
                        Iterable<DataSnapshot> children = dataSnapshot.child(CONST_STUDENTS).getChildren();
                        for (DataSnapshot child : children) {

                            Student std1=child.getValue(Student.class);
                            Log.d("student",std1.getStudentName());
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

    public static void getStudentInfo (final Context context,String studentId)
    {
        final FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference databaseReference=database.getReference().child(Utils.getKey(context));
        Query query = databaseReference.child(CONST_STUDENTS).child(studentId);
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                try {
                    Student std1= dataSnapshot.getValue(Student.class);
                    Log.d("student",std1.getStudentName());

                } catch (Exception e) {
                    Log.e("Exception is", e.toString());
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

    }

    public static void addLevel(final Context context,Level student) {
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(context));

        DatabaseReference databaseReference = mDatabase.child(CONST_LEVELS);

        String key = databaseReference.push().getKey();
        student.setLevelId(key);

        mDatabase.child(key).setValue(student).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show();
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Write failed
                        // ...
                        Toast.makeText(context, "Not Added", Toast.LENGTH_SHORT).show();
                    }
                });
    }


    public static void getLevels(Context context)
    {
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(context));
            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {

                        // Toast.makeText(StudentInformationActivity.this, "Hello bro Again", Toast.LENGTH_SHORT).show();
                        Iterable<DataSnapshot> children = dataSnapshot.child(CONST_LEVELS).getChildren();
                        for (DataSnapshot child : children) {

                            Level std1=child.getValue(Level.class);
                            Log.d("student",std1.getLevelName());
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

    public static void addAttendance(final Context context,Attendance attendance) {
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(context));
        DatabaseReference attendanceDatabaseReference = mDatabase.child(CONST_ATTENDANCE);

        String key = attendanceDatabaseReference.push().getKey();

        //key += "@@@"+attendance.getLevelId()+"@@@"+attendance.getStudentId(); //here we append levelId & StudentId at end of key to be able to query them

        attendance.setId(key);
        attendanceDatabaseReference.child(key).setValue(attendance).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show();
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Write failed
                        // ...
                        Toast.makeText(context, "Not Added", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    public static void getAttendance(Context context)
    {
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(context));
            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {
                        Iterable<DataSnapshot> children = dataSnapshot.child(CONST_ATTENDANCE).getChildren();
                        for (DataSnapshot child : children) {

                            Attendance std1=child.getValue(Attendance.class);
                            Log.d("student",std1.getStudentId());
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

    public static void getSpecificAttendanceInfoByStudentId (final Context context,String studentId)
    {
        final FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference databaseReference=database.getReference().child(Utils.getKey(context));
        Query query = databaseReference.child(CONST_ATTENDANCE).orderByChild("studentId").equalTo(studentId); //get attendance where studentId = 1000
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                try {
                    Iterable<DataSnapshot> children = dataSnapshot.getChildren();
                    for (DataSnapshot child : children) {

                        Attendance std1=child.getValue(Attendance.class);
                        Log.d("student",std1.getId()+"     level="+std1.getLevelId());
                    }

                } catch (Exception e) {
                    Log.e("Exception is", e.toString());
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

    }

    public static void getSpecificAttendanceInfoByLevelId (final Context context,String levelId)
    {
        final FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference databaseReference=database.getReference().child(Utils.getKey(context));
        Query query = databaseReference.child(CONST_ATTENDANCE).orderByChild("levelId").equalTo(levelId); //get attendance where studentId = 1000
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                try {
                    Iterable<DataSnapshot> children = dataSnapshot.getChildren();
                    for (DataSnapshot child : children) {

                        Attendance std1=child.getValue(Attendance.class);
                        Log.d("student",std1.getId()+"     level="+std1.getLevelId());
                    }

                } catch (Exception e) {
                    Log.e("Exception is", e.toString());
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

    }

    public static void addAdmin(final Context context,Admin admin) {
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(context));
        DatabaseReference attendanceDatabaseReference = mDatabase.child(CONST_ADMINS);

        String key = attendanceDatabaseReference.push().getKey();

        //key += "@@@"+attendance.getLevelId()+"@@@"+attendance.getStudentId(); //here we append levelId & StudentId at end of key to be able to query them

        admin.setAdminId(key);
        attendanceDatabaseReference.child(key).setValue(admin).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show();
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Write failed
                        // ...
                        Toast.makeText(context, "Not Added", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    public static void deactivateAdmin(final Context context,String adminId,Admin admin) {
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(context));
        DatabaseReference attendanceDatabaseReference = mDatabase.child(CONST_ADMINS);

        attendanceDatabaseReference.child(adminId).setValue(admin).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                Toast.makeText(context, "Edited", Toast.LENGTH_SHORT).show();
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Write failed
                        // ...
                        Toast.makeText(context, "Not Added", Toast.LENGTH_SHORT).show();
                    }
                });
    }


    public static void getAllAdmins(Context context)
    {
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(context));
            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {
                        Iterable<DataSnapshot> children = dataSnapshot.child(CONST_ADMINS).getChildren();
                        for (DataSnapshot child : children) {

                            Admin std1=child.getValue(Admin.class);
                            Log.d("student",std1.getAdminName()+ "  isActive"+std1.isAccountActive() +"adminId"+ std1.getAdminId());
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

    public static void getAdminByName(Context context,String name)
    {
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            Query databaseReference=database.getReference().child(Utils.getKey(context)).child(CONST_ADMINS).orderByChild("adminName").equalTo(name);
            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {
                        Iterable<DataSnapshot> children = dataSnapshot.getChildren();
                        for (DataSnapshot child : children) {

                            Admin std1=child.getValue(Admin.class);
                            Log.d("student",std1.getAdminName()+ "  isActive"+std1.isAccountActive() +"adminId"+ std1.getAdminId());
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
}
