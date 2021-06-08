package com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0018B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0017J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/setting/showTakedAttendance/ShowLevelAttendanceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/attendance/myproject/begory/presentationLayer/main/setting/showTakedAttendance/ShowLevelAttendanceAdapter$MyViewHolder;", "context", "Landroid/app/Activity;", "menuList", "Ljava/util/ArrayList;", "Lcom/attendance/myproject/begory/data/Models/StudentWithTotalAttendanceCount;", "mTerm1CheckBox", "Landroid/widget/CheckBox;", "mTerm2CheckBox", "(Landroid/app/Activity;Ljava/util/ArrayList;Landroid/widget/CheckBox;Landroid/widget/CheckBox;)V", "mContext", "mMenuList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class ShowLevelAttendanceAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance.ShowLevelAttendanceAdapter.MyViewHolder> {
    private final java.util.ArrayList<com.attendance.myproject.begory.data.Models.StudentWithTotalAttendanceCount> mMenuList = null;
    private final android.app.Activity mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance.ShowLevelAttendanceAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance.ShowLevelAttendanceAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ShowLevelAttendanceAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.attendance.myproject.begory.data.Models.StudentWithTotalAttendanceCount> menuList, @org.jetbrains.annotations.NotNull()
    android.widget.CheckBox mTerm1CheckBox, @org.jetbrains.annotations.NotNull()
    android.widget.CheckBox mTerm2CheckBox) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/setting/showTakedAttendance/ShowLevelAttendanceAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "mHesaTextView", "Landroid/widget/TextView;", "getMHesaTextView", "()Landroid/widget/TextView;", "setMHesaTextView", "(Landroid/widget/TextView;)V", "mKodasTextView", "getMKodasTextView", "setMKodasTextView", "mTextView", "getMTextView", "setMTextView", "ma3trafTextView", "getMa3trafTextView", "setMa3trafTextView", "mtnawelTextView", "getMtnawelTextView", "setMtnawelTextView", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mKodasTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mHesaTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView ma3trafTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mtnawelTextView;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMTextView() {
            return null;
        }
        
        public final void setMTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMKodasTextView() {
            return null;
        }
        
        public final void setMKodasTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMHesaTextView() {
            return null;
        }
        
        public final void setMHesaTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMa3trafTextView() {
            return null;
        }
        
        public final void setMa3trafTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMtnawelTextView() {
            return null;
        }
        
        public final void setMtnawelTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}