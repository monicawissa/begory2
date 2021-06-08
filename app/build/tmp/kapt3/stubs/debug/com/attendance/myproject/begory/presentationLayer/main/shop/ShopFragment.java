package com.attendance.myproject.begory.presentationLayer.main.shop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&J\u0010\u0010\'\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006)"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/shop/ShopFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/attendance/myproject/begory/presentationLayer/main/shop/UpdatePoints;", "()V", "binding", "Lcom/attendance/myproject/begory/databinding/FragmentShopBinding;", "mList", "Ljava/util/ArrayList;", "", "recyclerViewAdapter", "Lcom/attendance/myproject/begory/presentationLayer/main/shop/ShopAdapter;", "getRecyclerViewAdapter", "()Lcom/attendance/myproject/begory/presentationLayer/main/shop/ShopAdapter;", "setRecyclerViewAdapter", "(Lcom/attendance/myproject/begory/presentationLayer/main/shop/ShopAdapter;)V", "shopViewModel", "Lcom/attendance/myproject/begory/presentationLayer/main/shop/ShopViewModel;", "getShopViewModel", "()Lcom/attendance/myproject/begory/presentationLayer/main/shop/ShopViewModel;", "shopViewModel$delegate", "Lkotlin/Lazy;", "dataChanged", "", "initRecyclerView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onUpdate", "points", "Lcom/attendance/myproject/begory/data/Models/User;", "showMessage", "string", "", "subscribeToNavigationChanges", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ShopFragment extends androidx.fragment.app.Fragment implements com.attendance.myproject.begory.presentationLayer.main.shop.UpdatePoints {
    private com.attendance.myproject.begory.databinding.FragmentShopBinding binding;
    private java.util.ArrayList<java.lang.Integer> mList;
    @org.jetbrains.annotations.Nullable()
    private com.attendance.myproject.begory.presentationLayer.main.shop.ShopAdapter recyclerViewAdapter;
    private final kotlin.Lazy shopViewModel$delegate = null;
    private static final java.lang.String LIST_STATE = "list_state";
    private static final java.lang.String BUNDLE_RECYCLER_LAYOUT = "recycler_layout";
    public static final com.attendance.myproject.begory.presentationLayer.main.shop.ShopFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.attendance.myproject.begory.presentationLayer.main.shop.ShopAdapter getRecyclerViewAdapter() {
        return null;
    }
    
    public final void setRecyclerViewAdapter(@org.jetbrains.annotations.Nullable()
    com.attendance.myproject.begory.presentationLayer.main.shop.ShopAdapter p0) {
    }
    
    private final com.attendance.myproject.begory.presentationLayer.main.shop.ShopViewModel getShopViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void subscribeToNavigationChanges(com.attendance.myproject.begory.presentationLayer.main.shop.ShopViewModel shopViewModel) {
    }
    
    private final void dataChanged() {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    private final void initRecyclerView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onUpdate(@org.jetbrains.annotations.NotNull()
    com.attendance.myproject.begory.data.Models.User points) {
    }
    
    public ShopFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/shop/ShopFragment$Companion;", "", "()V", "BUNDLE_RECYCLER_LAYOUT", "", "LIST_STATE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}