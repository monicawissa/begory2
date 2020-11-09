package com.attendance.myproject.begory.Utilities.ggle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u001a\u0010\u000b\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0001\u001a-\u0010\r\u001a\u00020\u0005*\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010\u00a2\u0006\u0002\b\u0012\u001a&\u0010\u0013\u001a\u00020\u0005*\u00020\u00142\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0010\u00a2\u0006\u0002\b\u0012H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"ADD_EDIT_RESULT_OK", "", "DELETE_RESULT_OK", "EDIT_RESULT_OK", "addFragmentToActivity", "", "Landroidx/appcompat/app/AppCompatActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "", "replaceFragmentInActivity", "frameId", "setupActionBar", "toolbarId", "action", "Lkotlin/Function1;", "Landroidx/appcompat/app/ActionBar;", "Lkotlin/ExtensionFunctionType;", "transact", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentTransaction;", "app_debug"})
public final class AppCompatActivityExtKt {
    public static final int ADD_EDIT_RESULT_OK = 2;
    public static final int DELETE_RESULT_OK = 3;
    public static final int EDIT_RESULT_OK = 4;
    
    /**
     * The `fragment` is added to the container view with id `frameId`. The operation is
     * performed by the `fragmentManager`.
     */
    public static final void replaceFragmentInActivity(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$replaceFragmentInActivity, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int frameId) {
    }
    
    /**
     * The `fragment` is added to the container view with tag. The operation is
     * performed by the `fragmentManager`.
     */
    public static final void addFragmentToActivity(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$addFragmentToActivity, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public static final void setupActionBar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$setupActionBar, @androidx.annotation.IdRes()
    int toolbarId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.appcompat.app.ActionBar, kotlin.Unit> action) {
    }
    
    /**
     * Runs a FragmentTransaction, then calls commit().
     */
    private static final void transact(androidx.fragment.app.FragmentManager $this$transact, kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.Unit> action) {
    }
}