package com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/attendence/takeAttendance/StudentAttendanceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/attendance/myproject/begory/presentationLayer/main/attendence/takeAttendance/StudentAttendanceAdapter$MyViewHolder;", "context", "Landroid/app/Activity;", "menuList", "", "Lcom/attendance/myproject/begory/data/Models/Attendance;", "(Landroid/app/Activity;Ljava/util/List;)V", "mContext", "mMenuList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class StudentAttendanceAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.StudentAttendanceAdapter.MyViewHolder> {
    private final java.util.List<com.attendance.myproject.begory.data.Models.Attendance> mMenuList = null;
    private final android.app.Activity mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.StudentAttendanceAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.StudentAttendanceAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public StudentAttendanceAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.Nullable()
    java.util.List<com.attendance.myproject.begory.data.Models.Attendance> menuList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/attendence/takeAttendance/StudentAttendanceAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "mKodasCheckBox", "Landroid/widget/CheckBox;", "getMKodasCheckBox", "()Landroid/widget/CheckBox;", "setMKodasCheckBox", "(Landroid/widget/CheckBox;)V", "mTextView", "Landroid/widget/TextView;", "getMTextView", "()Landroid/widget/TextView;", "setMTextView", "(Landroid/widget/TextView;)V", "ma3trafCheckBox", "getMa3trafCheckBox", "setMa3trafCheckBox", "mattendCheckBox", "getMattendCheckBox", "setMattendCheckBox", "mtnawelCheckBox", "getMtnawelCheckBox", "setMtnawelCheckBox", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.CheckBox mKodasCheckBox;
        @org.jetbrains.annotations.NotNull()
        private android.widget.CheckBox mattendCheckBox;
        @org.jetbrains.annotations.NotNull()
        private android.widget.CheckBox ma3trafCheckBox;
        @org.jetbrains.annotations.NotNull()
        private android.widget.CheckBox mtnawelCheckBox;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMTextView() {
            return null;
        }
        
        public final void setMTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getMKodasCheckBox() {
            return null;
        }
        
        public final void setMKodasCheckBox(@org.jetbrains.annotations.NotNull()
        android.widget.CheckBox p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getMattendCheckBox() {
            return null;
        }
        
        public final void setMattendCheckBox(@org.jetbrains.annotations.NotNull()
        android.widget.CheckBox p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getMa3trafCheckBox() {
            return null;
        }
        
        public final void setMa3trafCheckBox(@org.jetbrains.annotations.NotNull()
        android.widget.CheckBox p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getMtnawelCheckBox() {
            return null;
        }
        
        public final void setMtnawelCheckBox(@org.jetbrains.annotations.NotNull()
        android.widget.CheckBox p0) {
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}