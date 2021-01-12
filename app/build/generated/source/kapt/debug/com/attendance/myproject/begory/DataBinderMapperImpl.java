package com.attendance.myproject.begory;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.attendance.myproject.begory.databinding.ActivityAddblablaBindingImpl;
import com.attendance.myproject.begory.databinding.ActivityLevelAttendanceBindingImpl;
import com.attendance.myproject.begory.databinding.ActivityLoginBindingImpl;
import com.attendance.myproject.begory.databinding.ActivityMainBindingImpl;
import com.attendance.myproject.begory.databinding.ActivityPasswordBindingImpl;
import com.attendance.myproject.begory.databinding.ActivityShowLevelAttendanceBindingImpl;
import com.attendance.myproject.begory.databinding.ActivitySplashBindingImpl;
import com.attendance.myproject.begory.databinding.ActivityUpdateblablaBindingImpl;
import com.attendance.myproject.begory.databinding.ActivityUserBindingImpl;
import com.attendance.myproject.begory.databinding.FragmentProfileBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADDBLABLA = 1;

  private static final int LAYOUT_ACTIVITYLEVELATTENDANCE = 2;

  private static final int LAYOUT_ACTIVITYLOGIN = 3;

  private static final int LAYOUT_ACTIVITYMAIN = 4;

  private static final int LAYOUT_ACTIVITYPASSWORD = 5;

  private static final int LAYOUT_ACTIVITYSHOWLEVELATTENDANCE = 6;

  private static final int LAYOUT_ACTIVITYSPLASH = 7;

  private static final int LAYOUT_ACTIVITYUPDATEBLABLA = 8;

  private static final int LAYOUT_ACTIVITYUSER = 9;

  private static final int LAYOUT_FRAGMENTPROFILE = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.attendance.myproject.begory.R.layout.activity_addblabla, LAYOUT_ACTIVITYADDBLABLA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.attendance.myproject.begory.R.layout.activity_level_attendance, LAYOUT_ACTIVITYLEVELATTENDANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.attendance.myproject.begory.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.attendance.myproject.begory.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.attendance.myproject.begory.R.layout.activity_password, LAYOUT_ACTIVITYPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.attendance.myproject.begory.R.layout.activity_show_level_attendance, LAYOUT_ACTIVITYSHOWLEVELATTENDANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.attendance.myproject.begory.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.attendance.myproject.begory.R.layout.activity_updateblabla, LAYOUT_ACTIVITYUPDATEBLABLA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.attendance.myproject.begory.R.layout.activity_user, LAYOUT_ACTIVITYUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.attendance.myproject.begory.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYADDBLABLA: {
          if ("layout/activity_addblabla_0".equals(tag)) {
            return new ActivityAddblablaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_addblabla is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLEVELATTENDANCE: {
          if ("layout/activity_level_attendance_0".equals(tag)) {
            return new ActivityLevelAttendanceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_level_attendance is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPASSWORD: {
          if ("layout/activity_password_0".equals(tag)) {
            return new ActivityPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_password is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSHOWLEVELATTENDANCE: {
          if ("layout/activity_show_level_attendance_0".equals(tag)) {
            return new ActivityShowLevelAttendanceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_show_level_attendance is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUPDATEBLABLA: {
          if ("layout/activity_updateblabla_0".equals(tag)) {
            return new ActivityUpdateblablaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_updateblabla is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUSER: {
          if ("layout/activity_user_0".equals(tag)) {
            return new ActivityUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_user is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(11);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "addBlaBlaViewModel");
      sKeys.put(2, "levelAttendViewModel");
      sKeys.put(3, "loginViewModel");
      sKeys.put(4, "mainViewModel");
      sKeys.put(5, "passwordViewModel");
      sKeys.put(6, "profileViewModel");
      sKeys.put(7, "showLevelAttendViewModel");
      sKeys.put(8, "splashViewModel");
      sKeys.put(9, "updateBlaBlaViewModel");
      sKeys.put(10, "userViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_addblabla_0", com.attendance.myproject.begory.R.layout.activity_addblabla);
      sKeys.put("layout/activity_level_attendance_0", com.attendance.myproject.begory.R.layout.activity_level_attendance);
      sKeys.put("layout/activity_login_0", com.attendance.myproject.begory.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.attendance.myproject.begory.R.layout.activity_main);
      sKeys.put("layout/activity_password_0", com.attendance.myproject.begory.R.layout.activity_password);
      sKeys.put("layout/activity_show_level_attendance_0", com.attendance.myproject.begory.R.layout.activity_show_level_attendance);
      sKeys.put("layout/activity_splash_0", com.attendance.myproject.begory.R.layout.activity_splash);
      sKeys.put("layout/activity_updateblabla_0", com.attendance.myproject.begory.R.layout.activity_updateblabla);
      sKeys.put("layout/activity_user_0", com.attendance.myproject.begory.R.layout.activity_user);
      sKeys.put("layout/fragment_profile_0", com.attendance.myproject.begory.R.layout.fragment_profile);
    }
  }
}
