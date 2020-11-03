package com.attendance.myproject.begory.Utilities.ggle;

import java.lang.System;

/**
 * A creator is used to inject the product ID into the ViewModel
 *
 *
 * This creator is to showcase how to inject dependencies into ViewModels. It's not
 * actually necessary in this case, as the product ID can be passed in a public method.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/attendance/myproject/begory/Utilities/ggle/ViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "appRepository", "Lcom/attendance/myproject/begory/data/source/AppRepository;", "(Lcom/attendance/myproject/begory/data/source/AppRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "app_debug"})
public final class ViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
    private final com.attendance.myproject.begory.data.source.AppRepository appRepository = null;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static volatile com.attendance.myproject.begory.Utilities.ggle.ViewModelFactory INSTANCE;
    public static final com.attendance.myproject.begory.Utilities.ggle.ViewModelFactory.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    private ViewModelFactory(com.attendance.myproject.begory.data.source.AppRepository appRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/attendance/myproject/begory/Utilities/ggle/ViewModelFactory$Companion;", "", "()V", "INSTANCE", "Lcom/attendance/myproject/begory/Utilities/ggle/ViewModelFactory;", "destroyInstance", "", "getInstance", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        public final void getInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
        }
        
        @androidx.annotation.VisibleForTesting()
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}