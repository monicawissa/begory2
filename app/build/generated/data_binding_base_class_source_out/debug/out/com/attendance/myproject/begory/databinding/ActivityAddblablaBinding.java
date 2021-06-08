// Generated by data binding compiler. Do not edit!
package com.attendance.myproject.begory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.multispinnerfilter.MultiSpinnerSearch;
import com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAddblablaBinding extends ViewDataBinding {
  @NonNull
  public final Button btnAdd;

  @NonNull
  public final AppCompatCheckBox cbShamas;

  @NonNull
  public final TextView dTitle;

  @NonNull
  public final EditText etAddress;

  @NonNull
  public final EditText etMobile;

  @NonNull
  public final EditText etMobile2;

  @NonNull
  public final EditText etName;

  @NonNull
  public final MultiSpinnerSearch multipleItemSelectionSpinner;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Spinner spLevels;

  @Bindable
  protected AddBlaBlaViewModel mAddBlaBlaViewModel;

  protected ActivityAddblablaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnAdd, AppCompatCheckBox cbShamas, TextView dTitle, EditText etAddress,
      EditText etMobile, EditText etMobile2, EditText etName,
      MultiSpinnerSearch multipleItemSelectionSpinner, ProgressBar progressBar, Spinner spLevels) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAdd = btnAdd;
    this.cbShamas = cbShamas;
    this.dTitle = dTitle;
    this.etAddress = etAddress;
    this.etMobile = etMobile;
    this.etMobile2 = etMobile2;
    this.etName = etName;
    this.multipleItemSelectionSpinner = multipleItemSelectionSpinner;
    this.progressBar = progressBar;
    this.spLevels = spLevels;
  }

  public abstract void setAddBlaBlaViewModel(@Nullable AddBlaBlaViewModel addBlaBlaViewModel);

  @Nullable
  public AddBlaBlaViewModel getAddBlaBlaViewModel() {
    return mAddBlaBlaViewModel;
  }

  @NonNull
  public static ActivityAddblablaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_addblabla, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddblablaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAddblablaBinding>inflateInternal(inflater, R.layout.activity_addblabla, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAddblablaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_addblabla, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddblablaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAddblablaBinding>inflateInternal(inflater, R.layout.activity_addblabla, null, false, component);
  }

  public static ActivityAddblablaBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityAddblablaBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityAddblablaBinding)bind(component, view, R.layout.activity_addblabla);
  }
}
