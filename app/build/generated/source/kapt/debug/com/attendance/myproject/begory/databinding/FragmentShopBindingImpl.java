package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentShopBindingImpl extends FragmentShopBinding implements com.attendance.myproject.begory.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.logo, 3);
        sViewsWithIds.put(R.id.lv_header, 4);
        sViewsWithIds.put(R.id.tv_current_points_hint, 5);
        sViewsWithIds.put(R.id.progressBar, 6);
        sViewsWithIds.put(R.id.rv_menuu, 7);
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
    private androidx.databinding.InverseBindingListener tvCurrentPointsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of shopViewModel.mUserPrice.getValue()
            //         is shopViewModel.mUserPrice.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvCurrentPoints);
            // localize variables for thread safety
            // shopViewModel
            com.attendance.myproject.begory.presentationLayer.main.shop.ShopViewModel shopViewModel = mShopViewModel;
            // shopViewModel.mUserPrice
            androidx.lifecycle.MutableLiveData<java.lang.String> shopViewModelMUserPrice = null;
            // shopViewModel.mUserPrice != null
            boolean shopViewModelMUserPriceJavaLangObjectNull = false;
            // shopViewModel != null
            boolean shopViewModelJavaLangObjectNull = false;
            // shopViewModel.mUserPrice.getValue()
            java.lang.String shopViewModelMUserPriceGetValue = null;



            shopViewModelJavaLangObjectNull = (shopViewModel) != (null);
            if (shopViewModelJavaLangObjectNull) {


                shopViewModelMUserPrice = shopViewModel.getMUserPrice();

                shopViewModelMUserPriceJavaLangObjectNull = (shopViewModelMUserPrice) != (null);
                if (shopViewModelMUserPriceJavaLangObjectNull) {




                    shopViewModelMUserPrice.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentShopBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentShopBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.ProgressBar) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            );
        this.btnBookNow.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCurrentPoints.setTag(null);
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
        if (BR.shopViewModel == variableId) {
            setShopViewModel((com.attendance.myproject.begory.presentationLayer.main.shop.ShopViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShopViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.main.shop.ShopViewModel ShopViewModel) {
        this.mShopViewModel = ShopViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.shopViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeShopViewModelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeShopViewModelMUserPrice((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeShopViewModelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ShopViewModelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeShopViewModelMUserPrice(androidx.lifecycle.MutableLiveData<java.lang.String> ShopViewModelMUserPrice, int fieldId) {
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
        boolean shopViewModelDataLoading = false;
        java.lang.String shopViewModelMUserPriceGetValue = null;
        java.lang.Boolean shopViewModelDataLoadingGetValue = null;
        com.attendance.myproject.begory.presentationLayer.main.shop.ShopViewModel shopViewModel = mShopViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxShopViewModelDataLoadingGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> ShopViewModelDataLoading1 = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> shopViewModelMUserPrice = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxShopViewModelDataLoading = false;
        android.graphics.drawable.Drawable shopViewModelDataLoadingBtnBookNowAndroidDrawableBtnMenuSelectorBtnBookNowAndroidDrawableBtnWhiteSelector = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (shopViewModel != null) {
                        // read shopViewModel.dataLoading
                        ShopViewModelDataLoading1 = shopViewModel.getDataLoading();
                    }
                    updateLiveDataRegistration(0, ShopViewModelDataLoading1);


                    if (ShopViewModelDataLoading1 != null) {
                        // read shopViewModel.dataLoading.getValue()
                        shopViewModelDataLoadingGetValue = ShopViewModelDataLoading1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(shopViewModel.dataLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxShopViewModelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(shopViewModelDataLoadingGetValue);
                if((dirtyFlags & 0xdL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxShopViewModelDataLoadingGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(shopViewModel.dataLoading.getValue())
                    shopViewModelDataLoading = !androidxDatabindingViewDataBindingSafeUnboxShopViewModelDataLoadingGetValue;
                    // read androidx.databinding.ViewDataBinding.safeUnbox(shopViewModel.dataLoading.getValue()) ? @android:drawable/btn_menu_selector : @android:drawable/btn_white_selector
                    shopViewModelDataLoadingBtnBookNowAndroidDrawableBtnMenuSelectorBtnBookNowAndroidDrawableBtnWhiteSelector = ((androidxDatabindingViewDataBindingSafeUnboxShopViewModelDataLoadingGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnBookNow.getContext(), R.drawable.btn_menu_selector)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnBookNow.getContext(), R.drawable.btn_white_selector)));


                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(shopViewModel.dataLoading.getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxShopViewModelDataLoading = androidx.databinding.ViewDataBinding.safeUnbox(shopViewModelDataLoading);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (shopViewModel != null) {
                        // read shopViewModel.mUserPrice
                        shopViewModelMUserPrice = shopViewModel.getMUserPrice();
                    }
                    updateLiveDataRegistration(1, shopViewModelMUserPrice);


                    if (shopViewModelMUserPrice != null) {
                        // read shopViewModel.mUserPrice.getValue()
                        shopViewModelMUserPriceGetValue = shopViewModelMUserPrice.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnBookNow, shopViewModelDataLoadingBtnBookNowAndroidDrawableBtnMenuSelectorBtnBookNowAndroidDrawableBtnWhiteSelector);
            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnBookNow, mCallback1, androidxDatabindingViewDataBindingSafeUnboxShopViewModelDataLoading);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCurrentPoints, shopViewModelMUserPriceGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvCurrentPoints, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvCurrentPointsandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // shopViewModel
        com.attendance.myproject.begory.presentationLayer.main.shop.ShopViewModel shopViewModel = mShopViewModel;
        // shopViewModel != null
        boolean shopViewModelJavaLangObjectNull = false;



        shopViewModelJavaLangObjectNull = (shopViewModel) != (null);
        if (shopViewModelJavaLangObjectNull) {


            shopViewModel.btnadd();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): shopViewModel.dataLoading
        flag 1 (0x2L): shopViewModel.mUserPrice
        flag 2 (0x3L): shopViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(shopViewModel.dataLoading.getValue()) ? @android:drawable/btn_menu_selector : @android:drawable/btn_white_selector
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(shopViewModel.dataLoading.getValue()) ? @android:drawable/btn_menu_selector : @android:drawable/btn_white_selector
    flag mapping end*/
    //end
}