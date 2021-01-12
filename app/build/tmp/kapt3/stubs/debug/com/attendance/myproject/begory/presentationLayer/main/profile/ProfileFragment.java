package com.attendance.myproject.begory.presentationLayer.main.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/attendance/myproject/begory/presentationLayer/main/profile/ProfileFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/attendance/myproject/begory/presentationLayer/main/profile/ProfileNavigator;", "()V", "binding", "Lcom/attendance/myproject/begory/databinding/FragmentProfileBinding;", "mLevelsList", "Ljava/util/ArrayList;", "Lcom/attendance/myproject/begory/data/Models/Level;", "profileViewModel", "Lcom/attendance/myproject/begory/presentationLayer/main/profile/ProfileViewModel;", "getProfileViewModel", "()Lcom/attendance/myproject/begory/presentationLayer/main/profile/ProfileViewModel;", "profileViewModel$delegate", "Lkotlin/Lazy;", "dataChanged", "", "hide_Keyboard", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "openLoginActivity", "showMessage", "string", "", "subscribeToNavigationChanges", "viewModel", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProfileFragment extends androidx.fragment.app.Fragment implements com.attendance.myproject.begory.presentationLayer.main.profile.ProfileNavigator {
    private com.attendance.myproject.begory.databinding.FragmentProfileBinding binding;
    private final java.util.ArrayList<com.attendance.myproject.begory.data.Models.Level> mLevelsList = null;
    private final kotlin.Lazy profileViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel getProfileViewModel() {
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
    
    @java.lang.Override()
    public void openLoginActivity() {
    }
    
    private final void subscribeToNavigationChanges(com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel viewModel) {
    }
    
    private final void dataChanged() {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    public final void hide_Keyboard() {
    }
    
    public ProfileFragment() {
        super();
    }
}