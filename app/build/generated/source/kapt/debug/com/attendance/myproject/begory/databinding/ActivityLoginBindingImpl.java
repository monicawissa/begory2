package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements com.attendance.myproject.begory.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.password
            //         is loginViewModel.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPassword);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.password
            java.lang.String loginViewModelPassword = null;
            // loginViewModel
            com.attendance.myproject.begory.presentationLayer.login.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {




                loginViewModel.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etUserMobileandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.mobile
            //         is loginViewModel.setMobile((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etUserMobile);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.mobile
            java.lang.String loginViewModelMobile = null;
            // loginViewModel
            com.attendance.myproject.begory.presentationLayer.login.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {




                loginViewModel.setMobile(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ProgressBar) bindings[4]
            );
        this.btnLogin.setTag(null);
        this.etPassword.setTag(null);
        this.etUserMobile.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.attendance.myproject.begory.generated.callback.OnClickListener(this, 1);
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
        if (BR.loginViewModel == variableId) {
            setLoginViewModel((com.attendance.myproject.begory.presentationLayer.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.login.LoginViewModel LoginViewModel) {
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.loginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginViewModelIsDataAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeLoginViewModelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginViewModelIsDataAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> LoginViewModelIsDataAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> LoginViewModelDataLoading, int fieldId) {
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
        java.lang.String loginViewModelMobile = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxLoginViewModelDataLoadingGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> loginViewModelIsDataAvailable = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxLoginViewModelIsDataAvailableGetValue = false;
        int loginViewModelDataLoadingViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<java.lang.Boolean> loginViewModelDataLoading = null;
        java.lang.String loginViewModelPassword = null;
        java.lang.Boolean loginViewModelIsDataAvailableGetValue = null;
        java.lang.Boolean loginViewModelDataLoadingGetValue = null;
        com.attendance.myproject.begory.presentationLayer.login.LoginViewModel loginViewModel = mLoginViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.mobile
                        loginViewModelMobile = loginViewModel.getMobile();
                        // read loginViewModel.password
                        loginViewModelPassword = loginViewModel.getPassword();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.isDataAvailable
                        loginViewModelIsDataAvailable = loginViewModel.isDataAvailable();
                    }
                    updateLiveDataRegistration(0, loginViewModelIsDataAvailable);


                    if (loginViewModelIsDataAvailable != null) {
                        // read loginViewModel.isDataAvailable.getValue()
                        loginViewModelIsDataAvailableGetValue = loginViewModelIsDataAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.isDataAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxLoginViewModelIsDataAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(loginViewModelIsDataAvailableGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.dataLoading
                        loginViewModelDataLoading = loginViewModel.getDataLoading();
                    }
                    updateLiveDataRegistration(1, loginViewModelDataLoading);


                    if (loginViewModelDataLoading != null) {
                        // read loginViewModel.dataLoading.getValue()
                        loginViewModelDataLoadingGetValue = loginViewModelDataLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.dataLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxLoginViewModelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(loginViewModelDataLoadingGetValue);
                if((dirtyFlags & 0xeL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxLoginViewModelDataLoadingGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
                    loginViewModelDataLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxLoginViewModelDataLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnLogin, mCallback1, androidxDatabindingViewDataBindingSafeUnboxLoginViewModelIsDataAvailableGetValue);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPassword, loginViewModelPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etUserMobile, loginViewModelMobile);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etUserMobile, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etUserMobileandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.progressBar.setVisibility(loginViewModelDataLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // loginViewModel != null
        boolean loginViewModelJavaLangObjectNull = false;
        // loginViewModel
        com.attendance.myproject.begory.presentationLayer.login.LoginViewModel loginViewModel = mLoginViewModel;



        loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
        if (loginViewModelJavaLangObjectNull) {


            loginViewModel.login();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginViewModel.isDataAvailable
        flag 1 (0x2L): loginViewModel.dataLoading
        flag 2 (0x3L): loginViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(loginViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}