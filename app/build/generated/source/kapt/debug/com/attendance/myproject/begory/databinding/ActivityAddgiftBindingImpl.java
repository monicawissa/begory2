package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityAddgiftBindingImpl extends ActivityAddgiftBinding implements com.attendance.myproject.begory.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_add_image, 9);
        sViewsWithIds.put(R.id.imageView, 10);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etCosstandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addGiftViewModel.cost
            //         is addGiftViewModel.setCost((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etCosst);
            // localize variables for thread safety
            // addGiftViewModel.cost
            java.lang.String addGiftViewModelCost = null;
            // addGiftViewModel != null
            boolean addGiftViewModelJavaLangObjectNull = false;
            // addGiftViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.addGift.AddGiftViewModel addGiftViewModel = mAddGiftViewModel;



            addGiftViewModelJavaLangObjectNull = (addGiftViewModel) != (null);
            if (addGiftViewModelJavaLangObjectNull) {




                addGiftViewModel.setCost(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addGiftViewModel.name
            //         is addGiftViewModel.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etName);
            // localize variables for thread safety
            // addGiftViewModel.name
            java.lang.String addGiftViewModelName = null;
            // addGiftViewModel != null
            boolean addGiftViewModelJavaLangObjectNull = false;
            // addGiftViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.addGift.AddGiftViewModel addGiftViewModel = mAddGiftViewModel;



            addGiftViewModelJavaLangObjectNull = (addGiftViewModel) != (null);
            if (addGiftViewModelJavaLangObjectNull) {




                addGiftViewModel.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etNotesandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addGiftViewModel.notes
            //         is addGiftViewModel.setNotes((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etNotes);
            // localize variables for thread safety
            // addGiftViewModel != null
            boolean addGiftViewModelJavaLangObjectNull = false;
            // addGiftViewModel.notes
            java.lang.String addGiftViewModelNotes = null;
            // addGiftViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.addGift.AddGiftViewModel addGiftViewModel = mAddGiftViewModel;



            addGiftViewModelJavaLangObjectNull = (addGiftViewModel) != (null);
            if (addGiftViewModelJavaLangObjectNull) {




                addGiftViewModel.setNotes(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etNumberOfItemsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of addGiftViewModel.number
            //         is addGiftViewModel.setNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etNumberOfItems);
            // localize variables for thread safety
            // addGiftViewModel != null
            boolean addGiftViewModelJavaLangObjectNull = false;
            // addGiftViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.addGift.AddGiftViewModel addGiftViewModel = mAddGiftViewModel;
            // addGiftViewModel.number
            java.lang.String addGiftViewModelNumber = null;



            addGiftViewModelJavaLangObjectNull = (addGiftViewModel) != (null);
            if (addGiftViewModelJavaLangObjectNull) {




                addGiftViewModel.setNumber(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityAddgiftBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityAddgiftBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[5]
            , (android.widget.ImageView) bindings[10]
            , (com.attendance.myproject.begory.multispinnerfilter.MultiSpinnerSearch) bindings[3]
            , (android.widget.ProgressBar) bindings[2]
            );
        this.btnAdd.setTag(null);
        this.dTitle.setTag(null);
        this.etCosst.setTag(null);
        this.etName.setTag(null);
        this.etNotes.setTag(null);
        this.etNumberOfItems.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.multipleItemSelectionSpinner.setTag(null);
        this.progressBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.attendance.myproject.begory.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.addGiftViewModel == variableId) {
            setAddGiftViewModel((com.attendance.myproject.begory.presentationLayer.main.setting.addGift.AddGiftViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddGiftViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.main.setting.addGift.AddGiftViewModel AddGiftViewModel) {
        this.mAddGiftViewModel = AddGiftViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.addGiftViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAddGiftViewModelIsBtnAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeAddGiftViewModelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAddGiftViewModelIsBtnAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> AddGiftViewModelIsBtnAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddGiftViewModelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> AddGiftViewModelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        int addGiftViewModelDataLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean addGiftViewModelIsBtnAvailableGetValue = null;
        com.attendance.myproject.begory.presentationLayer.main.setting.addGift.AddGiftViewModel addGiftViewModel = mAddGiftViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddGiftViewModelDataLoadingGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddGiftViewModelIsBtnAvailableGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> addGiftViewModelIsBtnAvailable = null;
        java.lang.String addGiftViewModelNotes = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> addGiftViewModelDataLoading = null;
        com.androidbuts.multispinnerfilter.MultiSpinnerListener addGiftViewModelSelectedItemsListener = null;
        java.lang.String addGiftViewModelNumber = null;
        java.lang.Boolean addGiftViewModelDataLoadingGetValue = null;
        java.lang.String addGiftViewModelCost = null;
        java.lang.String addGiftViewModelName = null;
        java.lang.String addGiftViewModelMTitleTV = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (addGiftViewModel != null) {
                        // read addGiftViewModel.isBtnAvailable
                        addGiftViewModelIsBtnAvailable = addGiftViewModel.isBtnAvailable();
                    }
                    updateLiveDataRegistration(0, addGiftViewModelIsBtnAvailable);


                    if (addGiftViewModelIsBtnAvailable != null) {
                        // read addGiftViewModel.isBtnAvailable.getValue()
                        addGiftViewModelIsBtnAvailableGetValue = addGiftViewModelIsBtnAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addGiftViewModel.isBtnAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxAddGiftViewModelIsBtnAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(addGiftViewModelIsBtnAvailableGetValue);
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (addGiftViewModel != null) {
                        // read addGiftViewModel.notes
                        addGiftViewModelNotes = addGiftViewModel.getNotes();
                        // read addGiftViewModel.selectedItemsListener
                        addGiftViewModelSelectedItemsListener = addGiftViewModel.getSelectedItemsListener();
                        // read addGiftViewModel.number
                        addGiftViewModelNumber = addGiftViewModel.getNumber();
                        // read addGiftViewModel.cost
                        addGiftViewModelCost = addGiftViewModel.getCost();
                        // read addGiftViewModel.name
                        addGiftViewModelName = addGiftViewModel.getName();
                        // read addGiftViewModel.mTitleTV
                        addGiftViewModelMTitleTV = addGiftViewModel.getMTitleTV();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (addGiftViewModel != null) {
                        // read addGiftViewModel.dataLoading
                        addGiftViewModelDataLoading = addGiftViewModel.getDataLoading();
                    }
                    updateLiveDataRegistration(1, addGiftViewModelDataLoading);


                    if (addGiftViewModelDataLoading != null) {
                        // read addGiftViewModel.dataLoading.getValue()
                        addGiftViewModelDataLoadingGetValue = addGiftViewModelDataLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addGiftViewModel.dataLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxAddGiftViewModelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(addGiftViewModelDataLoadingGetValue);
                if((dirtyFlags & 0xeL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxAddGiftViewModelDataLoadingGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(addGiftViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
                    addGiftViewModelDataLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxAddGiftViewModelDataLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnAdd, mCallback2, androidxDatabindingViewDataBindingSafeUnboxAddGiftViewModelIsBtnAvailableGetValue);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dTitle, addGiftViewModelMTitleTV);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etCosst, addGiftViewModelCost);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etName, addGiftViewModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNotes, addGiftViewModelNotes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNumberOfItems, addGiftViewModelNumber);
            this.multipleItemSelectionSpinner.setItemsListener(addGiftViewModelSelectedItemsListener);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etCosst, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCosstandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etNotes, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNotesandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etNumberOfItems, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNumberOfItemsandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.progressBar.setVisibility(addGiftViewModelDataLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // addGiftViewModel != null
        boolean addGiftViewModelJavaLangObjectNull = false;
        // addGiftViewModel
        com.attendance.myproject.begory.presentationLayer.main.setting.addGift.AddGiftViewModel addGiftViewModel = mAddGiftViewModel;



        addGiftViewModelJavaLangObjectNull = (addGiftViewModel) != (null);
        if (addGiftViewModelJavaLangObjectNull) {


            addGiftViewModel.register();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): addGiftViewModel.isBtnAvailable
        flag 1 (0x2L): addGiftViewModel.dataLoading
        flag 2 (0x3L): addGiftViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(addGiftViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(addGiftViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}