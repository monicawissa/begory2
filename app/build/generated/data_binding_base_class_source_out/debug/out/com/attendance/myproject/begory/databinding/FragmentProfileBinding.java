// Generated by data binding compiler. Do not edit!
package com.attendance.myproject.begory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel;
import com.google.android.material.textfield.TextInputLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentProfileBinding extends ViewDataBinding {
  @NonNull
  public final TextView eqlomatDesc;

  @NonNull
  public final TextView eqlomatLabel;

  @NonNull
  public final TextView paymentBegory;

  @NonNull
  public final TextView paymentLabel;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final TextInputLayout tiAddress;

  @NonNull
  public final TextInputLayout tiMobile2;

  @NonNull
  public final TextInputLayout tiName;

  @NonNull
  public final TextInputLayout tiPassword;

  @NonNull
  public final TextView tvLevel;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final Button updateData;

  @Bindable
  protected ProfileViewModel mProfileViewModel;

  protected FragmentProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView eqlomatDesc, TextView eqlomatLabel, TextView paymentBegory, TextView paymentLabel,
      CircleImageView profileImage, TextInputLayout tiAddress, TextInputLayout tiMobile2,
      TextInputLayout tiName, TextInputLayout tiPassword, TextView tvLevel, TextView tvName,
      Button updateData) {
    super(_bindingComponent, _root, _localFieldCount);
    this.eqlomatDesc = eqlomatDesc;
    this.eqlomatLabel = eqlomatLabel;
    this.paymentBegory = paymentBegory;
    this.paymentLabel = paymentLabel;
    this.profileImage = profileImage;
    this.tiAddress = tiAddress;
    this.tiMobile2 = tiMobile2;
    this.tiName = tiName;
    this.tiPassword = tiPassword;
    this.tvLevel = tvLevel;
    this.tvName = tvName;
    this.updateData = updateData;
  }

  public abstract void setProfileViewModel(@Nullable ProfileViewModel profileViewModel);

  @Nullable
  public ProfileViewModel getProfileViewModel() {
    return mProfileViewModel;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileBinding>inflateInternal(inflater, R.layout.fragment_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileBinding>inflateInternal(inflater, R.layout.fragment_profile, null, false, component);
  }

  public static FragmentProfileBinding bind(@NonNull View view) {
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
  public static FragmentProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProfileBinding)bind(component, view, R.layout.fragment_profile);
  }
}