package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityUpdateblablaBindingImpl extends ActivityUpdateblablaBinding implements com.attendance.myproject.begory.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.user_update, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener cbShamasandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of updateBlaBlaViewModel.isshamas
            //         is updateBlaBlaViewModel.setIsshamas((boolean) callbackArg_0)
            boolean callbackArg_0 = cbShamas.isChecked();
            // localize variables for thread safety
            // updateBlaBlaViewModel.isshamas
            boolean updateBlaBlaViewModelIsshamas = false;
            // updateBlaBlaViewModel != null
            boolean updateBlaBlaViewModelJavaLangObjectNull = false;
            // updateBlaBlaViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaViewModel updateBlaBlaViewModel = mUpdateBlaBlaViewModel;



            updateBlaBlaViewModelJavaLangObjectNull = (updateBlaBlaViewModel) != (null);
            if (updateBlaBlaViewModelJavaLangObjectNull) {




                updateBlaBlaViewModel.setIsshamas(((boolean) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etAddressandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of updateBlaBlaViewModel.address
            //         is updateBlaBlaViewModel.setAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etAddress);
            // localize variables for thread safety
            // updateBlaBlaViewModel.address
            java.lang.String updateBlaBlaViewModelAddress = null;
            // updateBlaBlaViewModel != null
            boolean updateBlaBlaViewModelJavaLangObjectNull = false;
            // updateBlaBlaViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaViewModel updateBlaBlaViewModel = mUpdateBlaBlaViewModel;



            updateBlaBlaViewModelJavaLangObjectNull = (updateBlaBlaViewModel) != (null);
            if (updateBlaBlaViewModelJavaLangObjectNull) {




                updateBlaBlaViewModel.setAddress(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etMobileandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of updateBlaBlaViewModel.mobile
            //         is updateBlaBlaViewModel.setMobile((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etMobile);
            // localize variables for thread safety
            // updateBlaBlaViewModel.mobile
            java.lang.String updateBlaBlaViewModelMobile = null;
            // updateBlaBlaViewModel != null
            boolean updateBlaBlaViewModelJavaLangObjectNull = false;
            // updateBlaBlaViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaViewModel updateBlaBlaViewModel = mUpdateBlaBlaViewModel;



            updateBlaBlaViewModelJavaLangObjectNull = (updateBlaBlaViewModel) != (null);
            if (updateBlaBlaViewModelJavaLangObjectNull) {




                updateBlaBlaViewModel.setMobile(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etMobile2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of updateBlaBlaViewModel.mobile2
            //         is updateBlaBlaViewModel.setMobile2((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etMobile2);
            // localize variables for thread safety
            // updateBlaBlaViewModel.mobile2
            java.lang.String updateBlaBlaViewModelMobile2 = null;
            // updateBlaBlaViewModel != null
            boolean updateBlaBlaViewModelJavaLangObjectNull = false;
            // updateBlaBlaViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaViewModel updateBlaBlaViewModel = mUpdateBlaBlaViewModel;



            updateBlaBlaViewModelJavaLangObjectNull = (updateBlaBlaViewModel) != (null);
            if (updateBlaBlaViewModelJavaLangObjectNull) {




                updateBlaBlaViewModel.setMobile2(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of updateBlaBlaViewModel.name
            //         is updateBlaBlaViewModel.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etName);
            // localize variables for thread safety
            // updateBlaBlaViewModel.name
            java.lang.String updateBlaBlaViewModelName = null;
            // updateBlaBlaViewModel != null
            boolean updateBlaBlaViewModelJavaLangObjectNull = false;
            // updateBlaBlaViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaViewModel updateBlaBlaViewModel = mUpdateBlaBlaViewModel;



            updateBlaBlaViewModelJavaLangObjectNull = (updateBlaBlaViewModel) != (null);
            if (updateBlaBlaViewModelJavaLangObjectNull) {




                updateBlaBlaViewModel.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityUpdateblablaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityUpdateblablaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[10]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[5]
            , (com.attendance.myproject.begory.multispinnerfilter.MultiSpinnerSearch) bindings[4]
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.Spinner) bindings[3]
            , (androidx.core.widget.NestedScrollView) bindings[11]
            );
        this.btnAdd.setTag(null);
        this.cbShamas.setTag(null);
        this.dTitle.setTag(null);
        this.etAddress.setTag(null);
        this.etMobile.setTag(null);
        this.etMobile2.setTag(null);
        this.etName.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.multipleItemSelectionSpinner.setTag(null);
        this.progressBar.setTag(null);
        this.spLevels.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.attendance.myproject.begory.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.updateBlaBlaViewModel == variableId) {
            setUpdateBlaBlaViewModel((com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUpdateBlaBlaViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaViewModel UpdateBlaBlaViewModel) {
        this.mUpdateBlaBlaViewModel = UpdateBlaBlaViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.updateBlaBlaViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUpdateBlaBlaViewModelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeUpdateBlaBlaViewModelIsStudentAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeUpdateBlaBlaViewModelIsBtnAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUpdateBlaBlaViewModelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> UpdateBlaBlaViewModelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUpdateBlaBlaViewModelIsStudentAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> UpdateBlaBlaViewModelIsStudentAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUpdateBlaBlaViewModelIsBtnAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> UpdateBlaBlaViewModelIsBtnAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int updateBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<java.lang.Boolean> updateBlaBlaViewModelDataLoading = null;
        android.widget.AdapterView.OnItemSelectedListener updateBlaBlaViewModelSpinnerListener = null;
        java.lang.String updateBlaBlaViewModelMTitleTV = null;
        java.lang.Boolean updateBlaBlaViewModelDataLoadingGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> updateBlaBlaViewModelIsStudentAvailable = null;
        boolean updateBlaBlaViewModelIsshamas = false;
        java.lang.String updateBlaBlaViewModelName = null;
        java.lang.String updateBlaBlaViewModelMobile2 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelIsBtnAvailableGetValue = false;
        java.lang.Boolean updateBlaBlaViewModelIsStudentAvailableGetValue = null;
        int updateBlaBlaViewModelDataLoadingViewVISIBLEViewGONE = 0;
        java.lang.String updateBlaBlaViewModelMobile = null;
        com.androidbuts.multispinnerfilter.MultiSpinnerListener updateBlaBlaViewModelSelectedItemsListener = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelIsStudentAvailableGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelDataLoadingGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> updateBlaBlaViewModelIsBtnAvailable = null;
        java.lang.Boolean updateBlaBlaViewModelIsBtnAvailableGetValue = null;
        com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaViewModel updateBlaBlaViewModel = mUpdateBlaBlaViewModel;
        java.lang.String updateBlaBlaViewModelAddress = null;
        int updateBlaBlaViewModelIsStudentAvailableViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (updateBlaBlaViewModel != null) {
                        // read updateBlaBlaViewModel.dataLoading
                        updateBlaBlaViewModelDataLoading = updateBlaBlaViewModel.getDataLoading();
                    }
                    updateLiveDataRegistration(0, updateBlaBlaViewModelDataLoading);


                    if (updateBlaBlaViewModelDataLoading != null) {
                        // read updateBlaBlaViewModel.dataLoading.getValue()
                        updateBlaBlaViewModelDataLoadingGetValue = updateBlaBlaViewModelDataLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.dataLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModelDataLoadingGetValue);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelDataLoadingGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
                    updateBlaBlaViewModelDataLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelDataLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (updateBlaBlaViewModel != null) {
                        // read updateBlaBlaViewModel.spinnerListener
                        updateBlaBlaViewModelSpinnerListener = updateBlaBlaViewModel.getSpinnerListener();
                        // read updateBlaBlaViewModel.mTitleTV
                        updateBlaBlaViewModelMTitleTV = updateBlaBlaViewModel.getMTitleTV();
                        // read updateBlaBlaViewModel.isshamas
                        updateBlaBlaViewModelIsshamas = updateBlaBlaViewModel.getIsshamas();
                        // read updateBlaBlaViewModel.name
                        updateBlaBlaViewModelName = updateBlaBlaViewModel.getName();
                        // read updateBlaBlaViewModel.mobile2
                        updateBlaBlaViewModelMobile2 = updateBlaBlaViewModel.getMobile2();
                        // read updateBlaBlaViewModel.mobile
                        updateBlaBlaViewModelMobile = updateBlaBlaViewModel.getMobile();
                        // read updateBlaBlaViewModel.selectedItemsListener
                        updateBlaBlaViewModelSelectedItemsListener = updateBlaBlaViewModel.getSelectedItemsListener();
                        // read updateBlaBlaViewModel.address
                        updateBlaBlaViewModelAddress = updateBlaBlaViewModel.getAddress();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (updateBlaBlaViewModel != null) {
                        // read updateBlaBlaViewModel.isStudentAvailable
                        updateBlaBlaViewModelIsStudentAvailable = updateBlaBlaViewModel.isStudentAvailable();
                    }
                    updateLiveDataRegistration(1, updateBlaBlaViewModelIsStudentAvailable);


                    if (updateBlaBlaViewModelIsStudentAvailable != null) {
                        // read updateBlaBlaViewModel.isStudentAvailable.getValue()
                        updateBlaBlaViewModelIsStudentAvailableGetValue = updateBlaBlaViewModelIsStudentAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.isStudentAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelIsStudentAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModelIsStudentAvailableGetValue);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelIsStudentAvailableGetValue) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.isStudentAvailable.getValue()) ? View.VISIBLE : View.GONE
                    updateBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelIsStudentAvailableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.isStudentAvailable.getValue()) ? View.GONE : View.VISIBLE
                    updateBlaBlaViewModelIsStudentAvailableViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelIsStudentAvailableGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (updateBlaBlaViewModel != null) {
                        // read updateBlaBlaViewModel.isBtnAvailable
                        updateBlaBlaViewModelIsBtnAvailable = updateBlaBlaViewModel.isBtnAvailable();
                    }
                    updateLiveDataRegistration(2, updateBlaBlaViewModelIsBtnAvailable);


                    if (updateBlaBlaViewModelIsBtnAvailable != null) {
                        // read updateBlaBlaViewModel.isBtnAvailable.getValue()
                        updateBlaBlaViewModelIsBtnAvailableGetValue = updateBlaBlaViewModelIsBtnAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.isBtnAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelIsBtnAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModelIsBtnAvailableGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnAdd, mCallback9, androidxDatabindingViewDataBindingSafeUnboxUpdateBlaBlaViewModelIsBtnAvailableGetValue);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.cbShamas, updateBlaBlaViewModelIsshamas);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dTitle, updateBlaBlaViewModelMTitleTV);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etAddress, updateBlaBlaViewModelAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etMobile, updateBlaBlaViewModelMobile);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etMobile2, updateBlaBlaViewModelMobile2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etName, updateBlaBlaViewModelName);
            this.multipleItemSelectionSpinner.setItemsListener(updateBlaBlaViewModelSelectedItemsListener);
            this.spLevels.setOnItemSelectedListener(updateBlaBlaViewModelSpinnerListener);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.cbShamas.setVisibility(updateBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE);
            this.etAddress.setVisibility(updateBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE);
            this.etMobile2.setVisibility(updateBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE);
            this.etName.setVisibility(updateBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE);
            this.multipleItemSelectionSpinner.setVisibility(updateBlaBlaViewModelIsStudentAvailableViewGONEViewVISIBLE);
            this.spLevels.setVisibility(updateBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.cbShamas, (android.widget.CompoundButton.OnCheckedChangeListener)null, cbShamasandroidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etAddressandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etMobile, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etMobileandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etMobile2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etMobile2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.progressBar.setVisibility(updateBlaBlaViewModelDataLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // updateBlaBlaViewModel != null
        boolean updateBlaBlaViewModelJavaLangObjectNull = false;
        // updateBlaBlaViewModel
        com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaViewModel updateBlaBlaViewModel = mUpdateBlaBlaViewModel;



        updateBlaBlaViewModelJavaLangObjectNull = (updateBlaBlaViewModel) != (null);
        if (updateBlaBlaViewModelJavaLangObjectNull) {


            updateBlaBlaViewModel.register();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): updateBlaBlaViewModel.dataLoading
        flag 1 (0x2L): updateBlaBlaViewModel.isStudentAvailable
        flag 2 (0x3L): updateBlaBlaViewModel.isBtnAvailable
        flag 3 (0x4L): updateBlaBlaViewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.isStudentAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.isStudentAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.isStudentAvailable.getValue()) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(updateBlaBlaViewModel.isStudentAvailable.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}