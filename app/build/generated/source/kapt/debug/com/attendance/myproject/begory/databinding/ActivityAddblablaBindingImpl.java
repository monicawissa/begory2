package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityAddblablaBindingImpl extends ActivityAddblablaBinding implements com.attendance.myproject.begory.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener cbShamasandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addBlaBlaViewModel.isshamas
            //         is addBlaBlaViewModel.setIsshamas((boolean) callbackArg_0)
            boolean callbackArg_0 = cbShamas.isChecked();
            // localize variables for thread safety
            // addBlaBlaViewModel.isshamas
            boolean addBlaBlaViewModelIsshamas = false;
            // addBlaBlaViewModel != null
            boolean addBlaBlaViewModelJavaLangObjectNull = false;
            // addBlaBlaViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaViewModel addBlaBlaViewModel = mAddBlaBlaViewModel;



            addBlaBlaViewModelJavaLangObjectNull = (addBlaBlaViewModel) != (null);
            if (addBlaBlaViewModelJavaLangObjectNull) {




                addBlaBlaViewModel.setIsshamas(((boolean) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etAddressandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addBlaBlaViewModel.address
            //         is addBlaBlaViewModel.setAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etAddress);
            // localize variables for thread safety
            // addBlaBlaViewModel.address
            java.lang.String addBlaBlaViewModelAddress = null;
            // addBlaBlaViewModel != null
            boolean addBlaBlaViewModelJavaLangObjectNull = false;
            // addBlaBlaViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaViewModel addBlaBlaViewModel = mAddBlaBlaViewModel;



            addBlaBlaViewModelJavaLangObjectNull = (addBlaBlaViewModel) != (null);
            if (addBlaBlaViewModelJavaLangObjectNull) {




                addBlaBlaViewModel.setAddress(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etMobileandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addBlaBlaViewModel.mobile
            //         is addBlaBlaViewModel.setMobile((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etMobile);
            // localize variables for thread safety
            // addBlaBlaViewModel.mobile
            java.lang.String addBlaBlaViewModelMobile = null;
            // addBlaBlaViewModel != null
            boolean addBlaBlaViewModelJavaLangObjectNull = false;
            // addBlaBlaViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaViewModel addBlaBlaViewModel = mAddBlaBlaViewModel;



            addBlaBlaViewModelJavaLangObjectNull = (addBlaBlaViewModel) != (null);
            if (addBlaBlaViewModelJavaLangObjectNull) {




                addBlaBlaViewModel.setMobile(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etMobile2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addBlaBlaViewModel.mobile2
            //         is addBlaBlaViewModel.setMobile2((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etMobile2);
            // localize variables for thread safety
            // addBlaBlaViewModel.mobile2
            java.lang.String addBlaBlaViewModelMobile2 = null;
            // addBlaBlaViewModel != null
            boolean addBlaBlaViewModelJavaLangObjectNull = false;
            // addBlaBlaViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaViewModel addBlaBlaViewModel = mAddBlaBlaViewModel;



            addBlaBlaViewModelJavaLangObjectNull = (addBlaBlaViewModel) != (null);
            if (addBlaBlaViewModelJavaLangObjectNull) {




                addBlaBlaViewModel.setMobile2(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addBlaBlaViewModel.name
            //         is addBlaBlaViewModel.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etName);
            // localize variables for thread safety
            // addBlaBlaViewModel.name
            java.lang.String addBlaBlaViewModelName = null;
            // addBlaBlaViewModel != null
            boolean addBlaBlaViewModelJavaLangObjectNull = false;
            // addBlaBlaViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaViewModel addBlaBlaViewModel = mAddBlaBlaViewModel;



            addBlaBlaViewModelJavaLangObjectNull = (addBlaBlaViewModel) != (null);
            if (addBlaBlaViewModelJavaLangObjectNull) {




                addBlaBlaViewModel.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityAddblablaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityAddblablaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        mCallback5 = new com.attendance.myproject.begory.generated.callback.OnClickListener(this, 1);
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
        if (BR.addBlaBlaViewModel == variableId) {
            setAddBlaBlaViewModel((com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddBlaBlaViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaViewModel AddBlaBlaViewModel) {
        this.mAddBlaBlaViewModel = AddBlaBlaViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.addBlaBlaViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAddBlaBlaViewModelIsBtnAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeAddBlaBlaViewModelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeAddBlaBlaViewModelIsStudentAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAddBlaBlaViewModelIsBtnAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> AddBlaBlaViewModelIsBtnAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddBlaBlaViewModelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> AddBlaBlaViewModelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddBlaBlaViewModelIsStudentAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> AddBlaBlaViewModelIsStudentAvailable, int fieldId) {
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
        androidx.lifecycle.LiveData<java.lang.Boolean> addBlaBlaViewModelIsBtnAvailable = null;
        com.androidbuts.multispinnerfilter.MultiSpinnerListener addBlaBlaViewModelSelectedItemsListener = null;
        boolean addBlaBlaViewModelIsshamas = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelIsBtnAvailableGetValue = false;
        java.lang.String addBlaBlaViewModelAddress = null;
        java.lang.String addBlaBlaViewModelMobile2 = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> addBlaBlaViewModelDataLoading = null;
        java.lang.Boolean addBlaBlaViewModelDataLoadingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelDataLoadingGetValue = false;
        int addBlaBlaViewModelDataLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean addBlaBlaViewModelIsStudentAvailableGetValue = null;
        int addBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelIsStudentAvailableGetValue = false;
        java.lang.String addBlaBlaViewModelMTitleTV = null;
        int addBlaBlaViewModelIsStudentAvailableViewGONEViewVISIBLE = 0;
        androidx.lifecycle.LiveData<java.lang.Boolean> addBlaBlaViewModelIsStudentAvailable = null;
        java.lang.String addBlaBlaViewModelName = null;
        java.lang.String addBlaBlaViewModelMobile = null;
        java.lang.Boolean addBlaBlaViewModelIsBtnAvailableGetValue = null;
        com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaViewModel addBlaBlaViewModel = mAddBlaBlaViewModel;
        android.widget.AdapterView.OnItemSelectedListener addBlaBlaViewModelSpinnerListener = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (addBlaBlaViewModel != null) {
                        // read addBlaBlaViewModel.isBtnAvailable
                        addBlaBlaViewModelIsBtnAvailable = addBlaBlaViewModel.isBtnAvailable();
                    }
                    updateLiveDataRegistration(0, addBlaBlaViewModelIsBtnAvailable);


                    if (addBlaBlaViewModelIsBtnAvailable != null) {
                        // read addBlaBlaViewModel.isBtnAvailable.getValue()
                        addBlaBlaViewModelIsBtnAvailableGetValue = addBlaBlaViewModelIsBtnAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.isBtnAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelIsBtnAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModelIsBtnAvailableGetValue);
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (addBlaBlaViewModel != null) {
                        // read addBlaBlaViewModel.selectedItemsListener
                        addBlaBlaViewModelSelectedItemsListener = addBlaBlaViewModel.getSelectedItemsListener();
                        // read addBlaBlaViewModel.isshamas
                        addBlaBlaViewModelIsshamas = addBlaBlaViewModel.getIsshamas();
                        // read addBlaBlaViewModel.address
                        addBlaBlaViewModelAddress = addBlaBlaViewModel.getAddress();
                        // read addBlaBlaViewModel.mobile2
                        addBlaBlaViewModelMobile2 = addBlaBlaViewModel.getMobile2();
                        // read addBlaBlaViewModel.mTitleTV
                        addBlaBlaViewModelMTitleTV = addBlaBlaViewModel.getMTitleTV();
                        // read addBlaBlaViewModel.name
                        addBlaBlaViewModelName = addBlaBlaViewModel.getName();
                        // read addBlaBlaViewModel.mobile
                        addBlaBlaViewModelMobile = addBlaBlaViewModel.getMobile();
                        // read addBlaBlaViewModel.spinnerListener
                        addBlaBlaViewModelSpinnerListener = addBlaBlaViewModel.getSpinnerListener();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (addBlaBlaViewModel != null) {
                        // read addBlaBlaViewModel.dataLoading
                        addBlaBlaViewModelDataLoading = addBlaBlaViewModel.getDataLoading();
                    }
                    updateLiveDataRegistration(1, addBlaBlaViewModelDataLoading);


                    if (addBlaBlaViewModelDataLoading != null) {
                        // read addBlaBlaViewModel.dataLoading.getValue()
                        addBlaBlaViewModelDataLoadingGetValue = addBlaBlaViewModelDataLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.dataLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModelDataLoadingGetValue);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelDataLoadingGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
                    addBlaBlaViewModelDataLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelDataLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (addBlaBlaViewModel != null) {
                        // read addBlaBlaViewModel.isStudentAvailable
                        addBlaBlaViewModelIsStudentAvailable = addBlaBlaViewModel.isStudentAvailable();
                    }
                    updateLiveDataRegistration(2, addBlaBlaViewModelIsStudentAvailable);


                    if (addBlaBlaViewModelIsStudentAvailable != null) {
                        // read addBlaBlaViewModel.isStudentAvailable.getValue()
                        addBlaBlaViewModelIsStudentAvailableGetValue = addBlaBlaViewModelIsStudentAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.isStudentAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelIsStudentAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModelIsStudentAvailableGetValue);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelIsStudentAvailableGetValue) {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.isStudentAvailable.getValue()) ? View.VISIBLE : View.GONE
                    addBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelIsStudentAvailableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.isStudentAvailable.getValue()) ? View.GONE : View.VISIBLE
                    addBlaBlaViewModelIsStudentAvailableViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelIsStudentAvailableGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnAdd, mCallback5, androidxDatabindingViewDataBindingSafeUnboxAddBlaBlaViewModelIsBtnAvailableGetValue);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.cbShamas, addBlaBlaViewModelIsshamas);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dTitle, addBlaBlaViewModelMTitleTV);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etAddress, addBlaBlaViewModelAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etMobile, addBlaBlaViewModelMobile);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etMobile2, addBlaBlaViewModelMobile2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etName, addBlaBlaViewModelName);
            this.multipleItemSelectionSpinner.setItemsListener(addBlaBlaViewModelSelectedItemsListener);
            this.spLevels.setOnItemSelectedListener(addBlaBlaViewModelSpinnerListener);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.cbShamas.setVisibility(addBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE);
            this.etAddress.setVisibility(addBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE);
            this.etMobile2.setVisibility(addBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE);
            this.etName.setVisibility(addBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE);
            this.multipleItemSelectionSpinner.setVisibility(addBlaBlaViewModelIsStudentAvailableViewGONEViewVISIBLE);
            this.spLevels.setVisibility(addBlaBlaViewModelIsStudentAvailableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.cbShamas, (android.widget.CompoundButton.OnCheckedChangeListener)null, cbShamasandroidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etAddressandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etMobile, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etMobileandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etMobile2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etMobile2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.progressBar.setVisibility(addBlaBlaViewModelDataLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // addBlaBlaViewModel != null
        boolean addBlaBlaViewModelJavaLangObjectNull = false;
        // addBlaBlaViewModel
        com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaViewModel addBlaBlaViewModel = mAddBlaBlaViewModel;



        addBlaBlaViewModelJavaLangObjectNull = (addBlaBlaViewModel) != (null);
        if (addBlaBlaViewModelJavaLangObjectNull) {


            addBlaBlaViewModel.register();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): addBlaBlaViewModel.isBtnAvailable
        flag 1 (0x2L): addBlaBlaViewModel.dataLoading
        flag 2 (0x3L): addBlaBlaViewModel.isStudentAvailable
        flag 3 (0x4L): addBlaBlaViewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.isStudentAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.isStudentAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.isStudentAvailable.getValue()) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(addBlaBlaViewModel.isStudentAvailable.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}