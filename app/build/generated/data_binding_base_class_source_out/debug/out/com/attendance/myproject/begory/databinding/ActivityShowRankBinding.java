// Generated by data binding compiler. Do not edit!
package com.attendance.myproject.begory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked.ShowGiftBookedViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityShowRankBinding extends ViewDataBinding {
  @NonNull
  public final ImageView logo;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rvAttendance;

  @NonNull
  public final Spinner spLevels;

  @NonNull
  public final TextView tvChooselevel;

  @Bindable
  protected ShowGiftBookedViewModel mShowGiftBookedViewModel;

  protected ActivityShowRankBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView logo, ProgressBar progressBar, RecyclerView rvAttendance, Spinner spLevels,
      TextView tvChooselevel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.logo = logo;
    this.progressBar = progressBar;
    this.rvAttendance = rvAttendance;
    this.spLevels = spLevels;
    this.tvChooselevel = tvChooselevel;
  }

  public abstract void setShowGiftBookedViewModel(
      @Nullable ShowGiftBookedViewModel showGiftBookedViewModel);

  @Nullable
  public ShowGiftBookedViewModel getShowGiftBookedViewModel() {
    return mShowGiftBookedViewModel;
  }

  @NonNull
  public static ActivityShowRankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_show_rank, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityShowRankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityShowRankBinding>inflateInternal(inflater, R.layout.activity_show_rank, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityShowRankBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_show_rank, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityShowRankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityShowRankBinding>inflateInternal(inflater, R.layout.activity_show_rank, null, false, component);
  }

  public static ActivityShowRankBinding bind(@NonNull View view) {
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
  public static ActivityShowRankBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityShowRankBinding)bind(component, view, R.layout.activity_show_rank);
  }
}
