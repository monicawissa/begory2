package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityAddBonusBindingImpl extends ActivityAddBonusBinding implements com.attendance.myproject.begory.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_chooselevel, 5);
        sViewsWithIds.put(R.id.rv_attendance, 6);
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

    public ActivityAddBonusBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityAddBonusBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ProgressBar) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.Spinner) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.btnBookNow.setTag(null);
        this.dTitle.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
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
                mDirtyFlags = 0x4L;
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
        if (BR.addBonusViewModel == variableId) {
            setAddBonusViewModel((com.attendance.myproject.begory.presentationLayer.main.setting.addBonus.AddBonusViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddBonusViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.main.setting.addBonus.AddBonusViewModel AddBonusViewModel) {
        this.mAddBonusViewModel = AddBonusViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.addBonusViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAddBonusViewModelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAddBonusViewModelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> AddBonusViewModelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        boolean addBonusViewModelDataLoading = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddBonusViewModelDataLoadingGetValue = false;
        com.attendance.myproject.begory.presentationLayer.main.setting.addBonus.AddBonusViewModel addBonusViewModel = mAddBonusViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddBonusViewModelDataLoading = false;
        java.lang.Boolean addBonusViewModelDataLoadingGetValue = null;
        java.lang.String addBonusViewModelMTitleTV = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> AddBonusViewModelDataLoading1 = null;
        android.widget.AdapterView.OnItemSelectedListener addBonusViewModelSpinnerListener = null;
        android.graphics.drawable.Drawable addBonusViewModelDataLoadingBtnBookNowAndroidDrawableBtnMenuSelectorBtnBookNowAndroidDrawableBtnWhiteSelector = null;
        int addBonusViewModelDataLoadingViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (addBonusViewModel != null) {
                        // read addBonusViewModel.mTitleTV
                        addBonusViewModelMTitleTV = addBonusViewModel.getMTitleTV();
                        // read addBonusViewModel.spinnerListener
                        addBonusViewModelSpinnerListener = addBonusViewModel.getSpinnerListener();
                    }
            }

                if (addBonusViewModel != null) {
                    // read addBonusViewModel.dataLoading
                    AddBonusViewModelDataLoading1 = addBonusViewModel.getDataLoading();
                }
                updateLiveDataRegistration(0, AddBonusViewModelDataLoading1);


                if (AddBonusViewModelDataLoading1 != null) {
                    // read addBonusViewModel.dataLoading.getValue()
                    addBonusViewModelDataLoadingGetValue = AddBonusViewModelDataLoading1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(addBonusViewModel.dataLoading.getValue())
                androidxDatabindingViewDataBindingSafeUnboxAddBonusViewModelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(addBonusViewModelDataLoadingGetValue);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxAddBonusViewModelDataLoadingGetValue) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(addBonusViewModel.dataLoading.getValue())
                addBonusViewModelDataLoading = !androidxDatabindingViewDataBindingSafeUnboxAddBonusViewModelDataLoadingGetValue;
                // read androidx.databinding.ViewDataBinding.safeUnbox(addBonusViewModel.dataLoading.getValue()) ? @android:drawable/btn_menu_selector : @android:drawable/btn_white_selector
                addBonusViewModelDataLoadingBtnBookNowAndroidDrawableBtnMenuSelectorBtnBookNowAndroidDrawableBtnWhiteSelector = ((androidxDatabindingViewDataBindingSafeUnboxAddBonusViewModelDataLoadingGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnBookNow.getContext(), R.drawable.btn_menu_selector)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnBookNow.getContext(), R.drawable.btn_white_selector)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(addBonusViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
                addBonusViewModelDataLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxAddBonusViewModelDataLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));


                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(addBonusViewModel.dataLoading.getValue()))
                androidxDatabindingViewDataBindingSafeUnboxAddBonusViewModelDataLoading = androidx.databinding.ViewDataBinding.safeUnbox(addBonusViewModelDataLoading);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnBookNow, addBonusViewModelDataLoadingBtnBookNowAndroidDrawableBtnMenuSelectorBtnBookNowAndroidDrawableBtnWhiteSelector);
            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnBookNow, mCallback9, androidxDatabindingViewDataBindingSafeUnboxAddBonusViewModelDataLoading);
            this.progressBar.setVisibility(addBonusViewModelDataLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dTitle, addBonusViewModelMTitleTV);
            this.spLevels.setOnItemSelectedListener(addBonusViewModelSpinnerListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // addBonusViewModel
        com.attendance.myproject.begory.presentationLayer.main.setting.addBonus.AddBonusViewModel addBonusViewModel = mAddBonusViewModel;
        // addBonusViewModel != null
        boolean addBonusViewModelJavaLangObjectNull = false;



        addBonusViewModelJavaLangObjectNull = (addBonusViewModel) != (null);
        if (addBonusViewModelJavaLangObjectNull) {


            addBonusViewModel.btnadd();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): addBonusViewModel.dataLoading
        flag 1 (0x2L): addBonusViewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(addBonusViewModel.dataLoading.getValue()) ? @android:drawable/btn_menu_selector : @android:drawable/btn_white_selector
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(addBonusViewModel.dataLoading.getValue()) ? @android:drawable/btn_menu_selector : @android:drawable/btn_white_selector
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(addBonusViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(addBonusViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}