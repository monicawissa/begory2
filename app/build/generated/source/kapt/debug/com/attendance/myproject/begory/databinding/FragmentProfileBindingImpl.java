package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentProfileBindingImpl extends FragmentProfileBinding implements com.attendance.myproject.begory.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.profile_image, 11);
        sViewsWithIds.put(R.id.payment_label, 12);
        sViewsWithIds.put(R.id.eqlomat_label, 13);
        sViewsWithIds.put(R.id.ti_Name, 14);
        sViewsWithIds.put(R.id.ti_password, 15);
        sViewsWithIds.put(R.id.ti_address, 16);
        sViewsWithIds.put(R.id.ti_mobile2, 17);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView8;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileViewModel.name.getValue()
            //         is profileViewModel.name.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // profileViewModel.name
            androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelName = null;
            // profileViewModel.name != null
            boolean profileViewModelNameJavaLangObjectNull = false;
            // profileViewModel.name.getValue()
            java.lang.String profileViewModelNameGetValue = null;
            // profileViewModel
            com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel profileViewModel = mProfileViewModel;
            // profileViewModel != null
            boolean profileViewModelJavaLangObjectNull = false;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {


                profileViewModelName = profileViewModel.getName();

                profileViewModelNameJavaLangObjectNull = (profileViewModelName) != (null);
                if (profileViewModelNameJavaLangObjectNull) {




                    profileViewModelName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileViewModel.password.getValue()
            //         is profileViewModel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // profileViewModel.password != null
            boolean profileViewModelPasswordJavaLangObjectNull = false;
            // profileViewModel.password
            androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelPassword = null;
            // profileViewModel
            com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel profileViewModel = mProfileViewModel;
            // profileViewModel.password.getValue()
            java.lang.String profileViewModelPasswordGetValue = null;
            // profileViewModel != null
            boolean profileViewModelJavaLangObjectNull = false;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {


                profileViewModelPassword = profileViewModel.getPassword();

                profileViewModelPasswordJavaLangObjectNull = (profileViewModelPassword) != (null);
                if (profileViewModelPasswordJavaLangObjectNull) {




                    profileViewModelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileViewModel.address.getValue()
            //         is profileViewModel.address.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // profileViewModel.address.getValue()
            java.lang.String profileViewModelAddressGetValue = null;
            // profileViewModel.address != null
            boolean profileViewModelAddressJavaLangObjectNull = false;
            // profileViewModel
            com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel profileViewModel = mProfileViewModel;
            // profileViewModel.address
            androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelAddress = null;
            // profileViewModel != null
            boolean profileViewModelJavaLangObjectNull = false;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {


                profileViewModelAddress = profileViewModel.getAddress();

                profileViewModelAddressJavaLangObjectNull = (profileViewModelAddress) != (null);
                if (profileViewModelAddressJavaLangObjectNull) {




                    profileViewModelAddress.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of profileViewModel.mobile2.getValue()
            //         is profileViewModel.mobile2.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // profileViewModel.mobile2.getValue()
            java.lang.String profileViewModelMobile2GetValue = null;
            // profileViewModel.mobile2 != null
            boolean profileViewModelMobile2JavaLangObjectNull = false;
            // profileViewModel
            com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel profileViewModel = mProfileViewModel;
            // profileViewModel != null
            boolean profileViewModelJavaLangObjectNull = false;
            // profileViewModel.mobile2
            androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelMobile2 = null;



            profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
            if (profileViewModelJavaLangObjectNull) {


                profileViewModelMobile2 = profileViewModel.getMobile2();

                profileViewModelMobile2JavaLangObjectNull = (profileViewModelMobile2) != (null);
                if (profileViewModelMobile2JavaLangObjectNull) {




                    profileViewModelMobile2.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (com.google.android.material.textfield.TextInputLayout) bindings[17]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.Button) bindings[10]
            );
        this.eqlomatDesc.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (com.google.android.material.textfield.TextInputEditText) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (com.google.android.material.textfield.TextInputEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (com.google.android.material.textfield.TextInputEditText) bindings[9];
        this.mboundView9.setTag(null);
        this.paymentBegory.setTag(null);
        this.tvLevel.setTag(null);
        this.tvName.setTag(null);
        this.updateData.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.attendance.myproject.begory.generated.callback.OnClickListener(this, 2);
        mCallback7 = new com.attendance.myproject.begory.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
        if (BR.profileViewModel == variableId) {
            setProfileViewModel((com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProfileViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel ProfileViewModel) {
        this.mProfileViewModel = ProfileViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.profileViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProfileViewModelBalancePrice((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeProfileViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeProfileViewModelBalanceRealPrice((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeProfileViewModelName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeProfileViewModelStudentLevel((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeProfileViewModelAddress((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeProfileViewModelMobile2((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProfileViewModelBalancePrice(androidx.lifecycle.MutableLiveData<java.lang.String> ProfileViewModelBalancePrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProfileViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ProfileViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProfileViewModelBalanceRealPrice(androidx.lifecycle.MutableLiveData<java.lang.String> ProfileViewModelBalanceRealPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProfileViewModelName(androidx.lifecycle.MutableLiveData<java.lang.String> ProfileViewModelName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProfileViewModelStudentLevel(androidx.lifecycle.MutableLiveData<java.lang.String> ProfileViewModelStudentLevel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProfileViewModelAddress(androidx.lifecycle.MutableLiveData<java.lang.String> ProfileViewModelAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProfileViewModelMobile2(androidx.lifecycle.MutableLiveData<java.lang.String> ProfileViewModelMobile2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelBalancePrice = null;
        java.lang.String profileViewModelAddressGetValue = null;
        java.lang.String profileViewModelBalanceRealPriceGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelPassword = null;
        java.lang.String profileViewModelPasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelBalanceRealPrice = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelName = null;
        com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel profileViewModel = mProfileViewModel;
        java.lang.String profileViewModelBalancePriceGetValue = null;
        java.lang.String profileViewModelMobile2GetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelStudentLevel = null;
        java.lang.String profileViewModelStudentLevelGetValue = null;
        java.lang.String profileViewModelNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelAddress = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> profileViewModelMobile2 = null;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (profileViewModel != null) {
                        // read profileViewModel.balancePrice
                        profileViewModelBalancePrice = profileViewModel.getBalancePrice();
                    }
                    updateLiveDataRegistration(0, profileViewModelBalancePrice);


                    if (profileViewModelBalancePrice != null) {
                        // read profileViewModel.balancePrice.getValue()
                        profileViewModelBalancePriceGetValue = profileViewModelBalancePrice.getValue();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (profileViewModel != null) {
                        // read profileViewModel.password
                        profileViewModelPassword = profileViewModel.getPassword();
                    }
                    updateLiveDataRegistration(1, profileViewModelPassword);


                    if (profileViewModelPassword != null) {
                        // read profileViewModel.password.getValue()
                        profileViewModelPasswordGetValue = profileViewModelPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (profileViewModel != null) {
                        // read profileViewModel.balanceRealPrice
                        profileViewModelBalanceRealPrice = profileViewModel.getBalanceRealPrice();
                    }
                    updateLiveDataRegistration(2, profileViewModelBalanceRealPrice);


                    if (profileViewModelBalanceRealPrice != null) {
                        // read profileViewModel.balanceRealPrice.getValue()
                        profileViewModelBalanceRealPriceGetValue = profileViewModelBalanceRealPrice.getValue();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (profileViewModel != null) {
                        // read profileViewModel.name
                        profileViewModelName = profileViewModel.getName();
                    }
                    updateLiveDataRegistration(3, profileViewModelName);


                    if (profileViewModelName != null) {
                        // read profileViewModel.name.getValue()
                        profileViewModelNameGetValue = profileViewModelName.getValue();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (profileViewModel != null) {
                        // read profileViewModel.studentLevel
                        profileViewModelStudentLevel = profileViewModel.getStudentLevel();
                    }
                    updateLiveDataRegistration(4, profileViewModelStudentLevel);


                    if (profileViewModelStudentLevel != null) {
                        // read profileViewModel.studentLevel.getValue()
                        profileViewModelStudentLevelGetValue = profileViewModelStudentLevel.getValue();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (profileViewModel != null) {
                        // read profileViewModel.address
                        profileViewModelAddress = profileViewModel.getAddress();
                    }
                    updateLiveDataRegistration(5, profileViewModelAddress);


                    if (profileViewModelAddress != null) {
                        // read profileViewModel.address.getValue()
                        profileViewModelAddressGetValue = profileViewModelAddress.getValue();
                    }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (profileViewModel != null) {
                        // read profileViewModel.mobile2
                        profileViewModelMobile2 = profileViewModel.getMobile2();
                    }
                    updateLiveDataRegistration(6, profileViewModelMobile2);


                    if (profileViewModelMobile2 != null) {
                        // read profileViewModel.mobile2.getValue()
                        profileViewModelMobile2GetValue = profileViewModelMobile2.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.eqlomatDesc, profileViewModelBalancePriceGetValue);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback7);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
            this.updateData.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, profileViewModelNameGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, profileViewModelNameGetValue);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, profileViewModelPasswordGetValue);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, profileViewModelAddressGetValue);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, profileViewModelMobile2GetValue);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paymentBegory, profileViewModelBalanceRealPriceGetValue);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLevel, profileViewModelStudentLevelGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // profileViewModel
                com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel profileViewModel = mProfileViewModel;
                // profileViewModel != null
                boolean profileViewModelJavaLangObjectNull = false;



                profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
                if (profileViewModelJavaLangObjectNull) {


                    profileViewModel.update();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // profileViewModel
                com.attendance.myproject.begory.presentationLayer.main.profile.ProfileViewModel profileViewModel = mProfileViewModel;
                // profileViewModel != null
                boolean profileViewModelJavaLangObjectNull = false;



                profileViewModelJavaLangObjectNull = (profileViewModel) != (null);
                if (profileViewModelJavaLangObjectNull) {


                    profileViewModel.logout();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): profileViewModel.balancePrice
        flag 1 (0x2L): profileViewModel.password
        flag 2 (0x3L): profileViewModel.balanceRealPrice
        flag 3 (0x4L): profileViewModel.name
        flag 4 (0x5L): profileViewModel.studentLevel
        flag 5 (0x6L): profileViewModel.address
        flag 6 (0x7L): profileViewModel.mobile2
        flag 7 (0x8L): profileViewModel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}