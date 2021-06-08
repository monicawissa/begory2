package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityUserBindingImpl extends ActivityUserBinding implements com.attendance.myproject.begory.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.user_exist, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etCheckmobileandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of userViewModel.mobile
            //         is userViewModel.setMobile((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etCheckmobile);
            // localize variables for thread safety
            // userViewModel
            com.attendance.myproject.begory.presentationLayer.main.setting.userExist.UserViewModel userViewModel = mUserViewModel;
            // userViewModel.mobile
            java.lang.String userViewModelMobile = null;
            // userViewModel != null
            boolean userViewModelJavaLangObjectNull = false;



            userViewModelJavaLangObjectNull = (userViewModel) != (null);
            if (userViewModelJavaLangObjectNull) {




                userViewModel.setMobile(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.ProgressBar) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[5]
            );
        this.btnCheck.setTag(null);
        this.dTitle.setTag(null);
        this.etCheckmobile.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.attendance.myproject.begory.generated.callback.OnClickListener(this, 1);
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
        if (BR.userViewModel == variableId) {
            setUserViewModel((com.attendance.myproject.begory.presentationLayer.main.setting.userExist.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.main.setting.userExist.UserViewModel UserViewModel) {
        this.mUserViewModel = UserViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.userViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUserViewModelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeUserViewModelIsCheckBtnAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserViewModelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> UserViewModelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserViewModelIsCheckBtnAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> UserViewModelIsCheckBtnAvailable, int fieldId) {
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
        com.attendance.myproject.begory.presentationLayer.main.setting.userExist.UserViewModel userViewModel = mUserViewModel;
        java.lang.String userViewModelMobile = null;
        java.lang.String userViewModelMTitleTV = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxUserViewModelIsCheckBtnAvailableGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> userViewModelDataLoading = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxUserViewModelDataLoadingGetValue = false;
        int userViewModelDataLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean userViewModelDataLoadingGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> userViewModelIsCheckBtnAvailable = null;
        java.lang.Boolean userViewModelIsCheckBtnAvailableGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (userViewModel != null) {
                        // read userViewModel.mobile
                        userViewModelMobile = userViewModel.getMobile();
                        // read userViewModel.mTitleTV
                        userViewModelMTitleTV = userViewModel.getMTitleTV();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (userViewModel != null) {
                        // read userViewModel.dataLoading
                        userViewModelDataLoading = userViewModel.getDataLoading();
                    }
                    updateLiveDataRegistration(0, userViewModelDataLoading);


                    if (userViewModelDataLoading != null) {
                        // read userViewModel.dataLoading.getValue()
                        userViewModelDataLoadingGetValue = userViewModelDataLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(userViewModel.dataLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxUserViewModelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(userViewModelDataLoadingGetValue);
                if((dirtyFlags & 0xdL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxUserViewModelDataLoadingGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(userViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
                    userViewModelDataLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxUserViewModelDataLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (userViewModel != null) {
                        // read userViewModel.isCheckBtnAvailable()
                        userViewModelIsCheckBtnAvailable = userViewModel.isCheckBtnAvailable();
                    }
                    updateLiveDataRegistration(1, userViewModelIsCheckBtnAvailable);


                    if (userViewModelIsCheckBtnAvailable != null) {
                        // read userViewModel.isCheckBtnAvailable().getValue()
                        userViewModelIsCheckBtnAvailableGetValue = userViewModelIsCheckBtnAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(userViewModel.isCheckBtnAvailable().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxUserViewModelIsCheckBtnAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(userViewModelIsCheckBtnAvailableGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnCheck, mCallback6, androidxDatabindingViewDataBindingSafeUnboxUserViewModelIsCheckBtnAvailableGetValue);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dTitle, userViewModelMTitleTV);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etCheckmobile, userViewModelMobile);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etCheckmobile, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCheckmobileandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.progressBar.setVisibility(userViewModelDataLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // userViewModel
        com.attendance.myproject.begory.presentationLayer.main.setting.userExist.UserViewModel userViewModel = mUserViewModel;
        // userViewModel != null
        boolean userViewModelJavaLangObjectNull = false;



        userViewModelJavaLangObjectNull = (userViewModel) != (null);
        if (userViewModelJavaLangObjectNull) {


            userViewModel.check();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userViewModel.dataLoading
        flag 1 (0x2L): userViewModel.isCheckBtnAvailable()
        flag 2 (0x3L): userViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(userViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(userViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}