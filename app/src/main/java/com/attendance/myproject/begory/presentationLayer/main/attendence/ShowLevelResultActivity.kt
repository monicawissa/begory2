//package com.attendance.myproject.begory.presentationLayer.main.attendence
//
//import android.Manifest
//import android.content.pm.PackageManager
//import android.graphics.Bitmap
//import android.graphics.Canvas
//import android.graphics.Color
//import android.graphics.Paint
//import android.graphics.drawable.ColorDrawable
//import android.graphics.pdf.PdfDocument
//import android.graphics.pdf.PdfDocument.PageInfo
//import android.os.Build
//import android.os.Bundle
//import android.os.Environment
//import android.support.v4.app.ActivityCompat
//import android.support.v7.app.AppCompatActivity
//import android.support.v7.widget.GridLayoutManager
//import android.support.v7.widget.RecyclerView
//import android.util.Log
//import android.view.View
//import android.widget.AdapterView
//import android.widget.ArrayAdapter
//import android.widget.Spinner
//import android.widget.Toast
//import com.attendance.myproject.attendanceregister.R
//import com.attendance.myproject.attendanceregister.Utils.FBConnenctions
//import com.attendance.myproject.attendanceregister.Utils.Utils
//import com.attendance.myproject.attendanceregister.adapters.ShowStudentResultAdapter
//import com.attendance.myproject.attendanceregister.beans.LevelItem
//import com.attendance.myproject.attendanceregister.beans.ResultItem
//import com.attendance.myproject.attendanceregister.beans.StudentItem
//import com.attendance.myproject.attendanceregister.beans.StudentWithResult
//import com.attendance.myproject.attendanceregister.beans.TermItem
//import com.attendance.myproject.attendanceregister.entites.Admin
//import com.attendance.myproject.attendanceregister.entites.Level
//import com.google.firebase.database.*
//import java.io.File
//import java.io.FileNotFoundException
//import java.io.FileOutputStream
//import java.io.IOException
//import java.util.*
//
//class ShowLevelResultActivity : AppCompatActivity() {
//    private val mStudentList: ArrayList<StudentItem> = ArrayList<StudentItem>()
//    private var mAdapter: ShowStudentResultAdapter? = null
//    private val mStudentWithResultsList: ArrayList<StudentWithResult> = ArrayList<StudentWithResult>()
//    private var levelItem: LevelItem? = null
//    private var mLevelSpinner: Spinner? = null
//    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()
//    var pdfDocument: PdfDocument? = null
//    private var width = 0
//    private var height = 0
//    private var mRecyclerView: RecyclerView? = null
//    protected fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_show_level_result)
//        getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        setTitle(R.string.m_show_results)
//        initLevelsSpinner()
//        initRecyclerView()
//        findViewById(R.id.btn_save).setVisibility(View.GONE)
//        findViewById(R.id.btn_save).setOnClickListener(View.OnClickListener { if (mStudentWithResultsList.size > 0) saveToStorage() })
//    }
//
//    private fun initLevelsSpinner() {
//        var level = Level()
//        level.setLevelId("-1")
//        level.setLevelName(getString(R.string.choose_level))
//        mLevelsList.add(level)
//        val mAdmin: Admin = Utils.getAdmin(this)
//        if (mAdmin.isMainAdmin()) {
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_1)
//            level.setLevelName(getString(R.string.lev_1))
//            mLevelsList.add(level)
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_2)
//            level.setLevelName(getString(R.string.lev_2))
//            mLevelsList.add(level)
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_3)
//            level.setLevelName(getString(R.string.lev_3))
//            mLevelsList.add(level)
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_4)
//            level.setLevelName(getString(R.string.lev_4))
//            mLevelsList.add(level)
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_5)
//            level.setLevelName(getString(R.string.lev_5))
//            mLevelsList.add(level)
//            level = Level()
//            level.setLevelId(FBConnenctions.CONST_LEVEL_6)
//            level.setLevelName(getString(R.string.lev_6))
//            mLevelsList.add(level)
//        } else {
//            if (mAdmin.getLevels() != null) {
//                for (i in 0 until mAdmin.getLevels().size()) {
//                    if (mAdmin.getLevels().get(i).isSelected()) {
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_1)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_1)
//                            level.setLevelName(getString(R.string.lev_1))
//                            mLevelsList.add(level)
//                        }
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_2)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_2)
//                            level.setLevelName(getString(R.string.lev_2))
//                            mLevelsList.add(level)
//                        }
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_3)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_3)
//                            level.setLevelName(getString(R.string.lev_3))
//                            mLevelsList.add(level)
//                        }
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_4)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_4)
//                            level.setLevelName(getString(R.string.lev_4))
//                            mLevelsList.add(level)
//                        }
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_5)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_5)
//                            level.setLevelName(getString(R.string.lev_5))
//                            mLevelsList.add(level)
//                        }
//                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_6)) {
//                            level = Level()
//                            level.setLevelId(FBConnenctions.CONST_LEVEL_6)
//                            level.setLevelName(getString(R.string.lev_6))
//                            mLevelsList.add(level)
//                        }
//                    }
//                }
//            }
//        }
//        mLevelSpinner = findViewById(R.id.sp_levels) as Spinner?
//        val dataAdapter: ArrayAdapter<Level> = ArrayAdapter<Level>(this@ShowLevelResultActivity,
//                android.R.layout.simple_spinner_item, mLevelsList)
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        mLevelSpinner!!.adapter = dataAdapter
//        mLevelSpinner!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(adapterView: AdapterView<*>?, view: View, i: Int, l: Long) {
//                if (mLevelSpinner!!.selectedItemPosition > 0) {
//                    mStudentList.clear()
//                    mStudentWithResultsList.clear()
//                    mAdapter.notifyDataSetChanged()
//                    studentsList
//                }
//            }
//
//            override fun onNothingSelected(adapterView: AdapterView<*>?) {}
//        }
//    }
//
//    private fun initRecyclerView() {
//        mRecyclerView = findViewById(R.id.rv_attendance) as RecyclerView?
//
//        // use this setting to improve performance if you know that changes
//        // in content do not change the layout size of the RecyclerView
//        mRecyclerView.setHasFixedSize(true)
//
//        // use a linear layout manager
//        val mLayoutManager = GridLayoutManager(this, 1)
//        mRecyclerView.setLayoutManager(mLayoutManager)
//        mAdapter = ShowStudentResultAdapter(this, mStudentWithResultsList)
//        mRecyclerView.setAdapter(mAdapter)
//    }
//
//    private val studentsList: Unit
//        private get() {
//            findViewById(R.id.progressBar).setVisibility(View.VISIBLE)
//            try {
//                val database = FirebaseDatabase.getInstance()
//                val databaseReference = database.reference.child(Utils.getKey(this)).child((mLevelSpinner!!.selectedItem as Level).getLevelId())
//                databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
//                    override fun onDataChange(dataSnapshot: DataSnapshot) {
//                        try {
//                            findViewById(R.id.progressBar).setVisibility(View.GONE)
//                            levelItem = dataSnapshot.getValue(LevelItem::class.java)
//                            if (levelItem.getStudents() != null) {
//                                mStudentList.addAll(levelItem.getStudents())
//                                manageStudentWithAttendance()
//                            }
//                        } catch (e: Exception) {
//                            Log.e("Exception is", e.toString())
//                        }
//                    }
//
//                    override fun onCancelled(databaseError: DatabaseError) {}
//                })
//            } catch (e: Exception) {
//                Log.e("Exception is", e.toString())
//            }
//        }
//
//    private fun manageStudentWithAttendance() {
//        for (i in mStudentList.indices) {
//            if (mStudentList[i].getStudentRes() == null) {
//                setEmptyResult(i)
//            } else {
//                val studentWithResult = StudentWithResult()
//                studentWithResult.setId(mStudentList[i].getId())
//                studentWithResult.setName(mStudentList[i].getName())
//                val resultItem: ResultItem = mStudentList[i].getStudentRes()
//                var totalSubjects = 0
//                var studentResult = 0
//                if (resultItem.getfTerm().getfSubGrade() !== -1) {
//                    totalSubjects += 1
//                    studentResult += resultItem.getfTerm().getfSubGrade()
//                }
//                if (resultItem.getfTerm().getsSubGrade() !== -1) {
//                    totalSubjects += 1
//                    studentResult += resultItem.getfTerm().getsSubGrade()
//                }
//                if (resultItem.getsTerm().getfSubGrade() !== -1) {
//                    totalSubjects += 1
//                    studentResult += resultItem.getsTerm().getfSubGrade()
//                }
//                if (resultItem.getsTerm().getsSubGrade() !== -1) {
//                    totalSubjects += 1
//                    studentResult += resultItem.getsTerm().getsSubGrade()
//                }
//                if (resultItem.gettTerm().getfSubGrade() !== -1) {
//                    totalSubjects += 1
//                    studentResult += resultItem.gettTerm().getfSubGrade()
//                }
//                if (resultItem.gettTerm().getsSubGrade() !== -1) {
//                    totalSubjects += 1
//                    studentResult += resultItem.gettTerm().getsSubGrade()
//                }
//                if (totalSubjects > 0) {
//
//                    //3.5  Exe  2.5 very good 1.5 good 0.5 acc 0.0 fear
//                    val totalResult = studentResult.toFloat() / totalSubjects
//                    resultItem.setTotalStudentResult(studentResult)
//                    if (totalResult >= 3.5) {
//                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_EXCELLENT)
//                    } else if (totalResult >= 2.5) {
//                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_VERY_GOOD)
//                    } else if (totalResult >= 1.5) {
//                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_GOOD)
//                    } else if (totalResult >= 0.5) {
//                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_ACCEPTABLE)
//                    } else resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_FEAR)
//
//                    /*float totalResult = (studentResult * 100) / (totalSubjects * 4);
//
//                    if (totalResult >= 90) {
//                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_EXCELLENT);
//                    } else if (totalResult >= 80) {
//                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_VERY_GOOD);
//                    } else if (totalResult >= 65) {
//                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_GOOD);
//                    } else if (totalResult >= 50) {
//                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_ACCEPTABLE);
//                    } else
//                        resultItem.setTotalGrade(FBConnenctions.CONST_GRADE_FEAR);*/
//                }
//                studentWithResult.setResultItem(resultItem)
//                mStudentWithResultsList.add(studentWithResult)
//            }
//        }
//        Collections.sort(mStudentWithResultsList, Comparator<Any> { o1, o2 -> o2.getResultItem().getTotalGrade() - o1.getResultItem().getTotalGrade() })
//        Collections.sort(mStudentWithResultsList, Comparator<Any> { o1, o2 -> o2.getResultItem().getTotalStudentResult() - o1.getResultItem().getTotalStudentResult() })
//        mAdapter.notifyDataSetChanged()
//    }
//
//    private fun setEmptyResult(index: Int) {
//        val studentWithResult = StudentWithResult()
//        studentWithResult.setId(mStudentList[index].getId())
//        studentWithResult.setName(mStudentList[index].getName())
//        val resultItem = ResultItem()
//        var termItem = TermItem()
//        termItem.setsSubGrade(-1)
//        termItem.setfSubGrade(-1)
//        resultItem.setfTerm(termItem)
//        termItem = TermItem()
//        termItem.setsSubGrade(-1)
//        termItem.setfSubGrade(-1)
//        resultItem.setsTerm(termItem)
//        termItem = TermItem()
//        termItem.setsSubGrade(-1)
//        termItem.setfSubGrade(-1)
//        resultItem.settTerm(termItem)
//        resultItem.setTotalGrade(-1)
//        studentWithResult.setResultItem(resultItem)
//        mStudentWithResultsList.add(studentWithResult)
//    }
//
//    fun saveToStorage() {
//        if (Build.VERSION.SDK_INT >= 23) {
//            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
//                    === PackageManager.PERMISSION_GRANTED) {
//                //Log.v(TAG,"Permission is granted");
//                saveToPdf()
//            } else {
//
//                // Log.v(TAG,"Permission is revoked");
//                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), 1)
//            }
//        } else { //permission is automatically granted on sdk<23 upon installation
//            //  Log.v(TAG,"Permission is granted");
//            saveToPdf()
//        }
//    }
//
//    fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String?>?, grantResults: IntArray) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//            //  Log.v(TAG,"Permission: "+permissions[0]+ "was "+grantResults[0]);
//            //resume tasks needing this permission
//            saveToPdf()
//        }
//    }
//
//    private fun saveToPdf() {
//        width = mRecyclerView.getWidth()
//        height = mRecyclerView.getHeight()
//        val b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
//        val c1 = Canvas(b)
//        mRecyclerView.draw(c1)
//        val pd = PdfDocument()
//        val pi = PageInfo.Builder(width, height, 1).create()
//        val p = pd.startPage(pi)
//        val c = p.canvas
//        c.drawBitmap(b, 0f, 0f, Paint())
//        pd.finishPage(p)
//        try {
//            //make sure you have asked for storage permission before this
//            val f = File(Environment.getExternalStorageDirectory().toString() + File.separator +
//                    (mLevelSpinner!!.selectedItem as Level).getLevelName() + "_" + Calendar.getInstance().timeInMillis + ".pdf")
//            pd.writeTo(FileOutputStream(f))
//            Toast.makeText(getApplicationContext(), R.string.saved_pdf, Toast.LENGTH_LONG).show()
//        } catch (fnfe: FileNotFoundException) {
//            fnfe.printStackTrace()
//            Toast.makeText(getApplicationContext(), R.string.error, Toast.LENGTH_LONG).show()
//        } catch (ioe: IOException) {
//            ioe.printStackTrace()
//            Toast.makeText(getApplicationContext(), R.string.error, Toast.LENGTH_LONG).show()
//        }
//        pd.close()
//    }
//}