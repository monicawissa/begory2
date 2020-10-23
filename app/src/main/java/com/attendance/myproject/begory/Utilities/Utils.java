package com.attendance.myproject.begory.Utilities;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

import com.attendance.myproject.begory.entites.Admin;
import com.attendance.myproject.begory.entites.Key;

public class Utils {

    public static String getKey(Context context)
    {
        SavePrefs<Key> mKeySavePrefs = new SavePrefs<>(context,Key.class);
        Key key = mKeySavePrefs.load();
        if (key!=null)
        {
            return key.getKey();
        }
        return null;
    }

    public static void saveKey (Context context,String keyStr)
    {
        SavePrefs<Key> mKeySavePrefs = new SavePrefs<>(context,Key.class);
        Key key = new Key();
        key.setKey(keyStr);

        if (keyStr==null)
            mKeySavePrefs.save(null);
        else
            mKeySavePrefs.save(key);
    }

    public static Admin getAdmin(Context context)
    {
        SavePrefs<Admin> mKeySavePrefs = new SavePrefs<>(context,Admin.class);
        Admin key = mKeySavePrefs.load();
        if (key!=null)
        {
            return key;
        }
        return null;
    }

    public static void saveAdmin (Context context, Admin admin)
    {
        SavePrefs<Admin> mKeySavePrefs = new SavePrefs<>(context,Admin.class);
        mKeySavePrefs.save(admin);
    }

    public static void hideKeyboard(Activity activity) {

        if (activity==null)
            return;
        InputMethodManager inputManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
    }
}
