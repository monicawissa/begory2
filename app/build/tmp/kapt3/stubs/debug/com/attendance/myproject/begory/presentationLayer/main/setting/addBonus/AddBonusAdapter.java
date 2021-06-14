package com.attendance.myproject.begory.presentationLayer.main.setting.addBonus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/setting/addBonus/AddBonusAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/attendance/myproject/begory/presentationLayer/main/setting/addBonus/AddBonusAdapter$MyViewHolder;", "context", "Landroid/app/Activity;", "mStudentsList", "Ljava/util/ArrayList;", "Lcom/attendance/myproject/begory/data/Models/User;", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "mContext", "getMStudentsList", "()Ljava/util/ArrayList;", "setMStudentsList", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class AddBonusAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.attendance.myproject.begory.presentationLayer.main.setting.addBonus.AddBonusAdapter.MyViewHolder> {
    private final android.app.Activity mContext = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.attendance.myproject.begory.data.Models.User> mStudentsList;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.attendance.myproject.begory.presentationLayer.main.setting.addBonus.AddBonusAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.presentationLayer.main.setting.addBonus.AddBonusAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.attendance.myproject.begory.data.Models.User> getMStudentsList() {
        return null;
    }
    
    public final void setMStudentsList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.attendance.myproject.begory.data.Models.User> p0) {
    }
    
    public AddBonusAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.attendance.myproject.begory.data.Models.User> mStudentsList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/setting/addBonus/AddBonusAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "mAdd", "Landroid/widget/ImageView;", "getMAdd", "()Landroid/widget/ImageView;", "setMAdd", "(Landroid/widget/ImageView;)V", "mMinus", "getMMinus", "setMMinus", "mNameTextView", "Landroid/widget/TextView;", "getMNameTextView", "()Landroid/widget/TextView;", "setMNameTextView", "(Landroid/widget/TextView;)V", "mTotalGradeTextView", "getMTotalGradeTextView", "setMTotalGradeTextView", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView mAdd;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView mMinus;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mNameTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mTotalGradeTextView;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMAdd() {
            return null;
        }
        
        public final void setMAdd(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getMMinus() {
            return null;
        }
        
        public final void setMMinus(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMNameTextView() {
            return null;
        }
        
        public final void setMNameTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMTotalGradeTextView() {
            return null;
        }
        
        public final void setMTotalGradeTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}