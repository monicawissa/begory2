package com.attendance.myproject.begory.multispinnerfilter;

import com.androidbuts.multispinnerfilter.KeyPairBoolData;

public interface SingleSpinnerListener {
    void onItemsSelected(KeyPairBoolData selectedItem);
    void onClear();
}