package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityPasswordBindingImpl extends ActivityPasswordBinding implements com.attendance.myproject.begory.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etUpdatemobileandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of passwordViewModel.password
            //         is passwordViewModel.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etUpdatemobile);
            // localize variables for thread safety
            // passwordViewModel.password
            java.lang.String passwordViewModelPassword = null;
            // passwordViewModel
            com.attendance.myproject.begory.presentationLayer.main.changePassword.PasswordViewModel passwordViewModel = mPasswordViewModel;
            // passwordViewModel != null
            boolean passwordViewModelJavaLangObjectNull = false;



            passwordViewModelJavaLangObjectNull = (passwordViewModel) != (null);
            if (passwordViewModelJavaLangObjectNull) {




                passwordViewModel.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.ProgressBar) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[5]
            );
        this.btnUpdate.setTag(null);
        this.dTitle.setTag(null);
        this.etUpdatemobile.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.attendance.myproject.begory.generated.callback.OnClickListener(this, 1);
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
        if (BR.passwordViewModel == variableId) {
            setPasswordViewModel((com.attendance.myproject.begory.presentationLayer.main.changePassword.PasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPasswordViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.main.changePassword.PasswordViewModel PasswordViewModel) {
        this.mPasswordViewModel = PasswordViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.passwordViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePasswordViewModelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangePasswordViewModelIsUpdateBtnAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePasswordViewModelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> PasswordViewModelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePasswordViewModelIsUpdateBtnAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> PasswordViewModelIsUpdateBtnAvailable, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxPasswordViewModelIsUpdateBtnAvailableGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> passwordViewModelDataLoading = null;
        int passwordViewModelDataLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean passwordViewModelDataLoadingGetValue = null;
        java.lang.String passwordViewModelMTitleTV = null;
        java.lang.Boolean passwordViewModelIsUpdateBtnAvailableGetValue = null;
        java.lang.String passwordViewModelPassword = null;
        com.attendance.myproject.begory.presentationLayer.main.changePassword.PasswordViewModel passwordViewModel = mPasswordViewModel;
        androidx.lifecycle.LiveData<java.lang.Boolean> passwordViewModelIsUpdateBtnAvailable = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPasswordViewModelDataLoadingGetValue = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (passwordViewModel != null) {
                        // read passwordViewModel.dataLoading
                        passwordViewModelDataLoading = passwordViewModel.getDataLoading();
                    }
                    updateLiveDataRegistration(0, passwordViewModelDataLoading);


                    if (passwordViewModelDataLoading != null) {
                        // read passwordViewModel.dataLoading.getValue()
                        passwordViewModelDataLoadingGetValue = passwordViewModelDataLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(passwordViewModel.dataLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxPasswordViewModelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(passwordViewModelDataLoadingGetValue);
                if((dirtyFlags & 0xdL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxPasswordViewModelDataLoadingGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(passwordViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
                    passwordViewModelDataLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxPasswordViewModelDataLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (passwordViewModel != null) {
                        // read passwordViewModel.mTitleTV
                        passwordViewModelMTitleTV = passwordViewModel.getMTitleTV();
                        // read passwordViewModel.password
                        passwordViewModelPassword = passwordViewModel.getPassword();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (passwordViewModel != null) {
                        // read passwordViewModel.isUpdateBtnAvailable()
                        passwordViewModelIsUpdateBtnAvailable = passwordViewModel.isUpdateBtnAvailable();
                    }
                    updateLiveDataRegistration(1, passwordViewModelIsUpdateBtnAvailable);


                    if (passwordViewModelIsUpdateBtnAvailable != null) {
                        // read passwordViewModel.isUpdateBtnAvailable().getValue()
                        passwordViewModelIsUpdateBtnAvailableGetValue = passwordViewModelIsUpdateBtnAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(passwordViewModel.isUpdateBtnAvailable().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxPasswordViewModelIsUpdateBtnAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(passwordViewModelIsUpdateBtnAvailableGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnUpdate, mCallback3, androidxDatabindingViewDataBindingSafeUnboxPasswordViewModelIsUpdateBtnAvailableGetValue);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dTitle, passwordViewModelMTitleTV);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etUpdatemobile, passwordViewModelPassword);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etUpdatemobile, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etUpdatemobileandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.progressBar.setVisibility(passwordViewModelDataLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // passwordViewModel
        com.attendance.myproject.begory.presentationLayer.main.changePassword.PasswordViewModel passwordViewModel = mPasswordViewModel;
        // passwordViewModel != null
        boolean passwordViewModelJavaLangObjectNull = false;



        passwordViewModelJavaLangObjectNull = (passwordViewModel) != (null);
        if (passwordViewModelJavaLangObjectNull) {


            passwordViewModel.update();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): passwordViewModel.dataLoading
        flag 1 (0x2L): passwordViewModel.isUpdateBtnAvailable()
        flag 2 (0x3L): passwordViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(passwordViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(passwordViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}