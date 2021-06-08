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

    public FragmentShopBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentShopBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.shopViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeShopViewModelIsCheckBtnAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeShopViewModelIsCheckBtnAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> ShopViewModelIsCheckBtnAvailable, int fieldId) {
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
        com.attendance.myproject.begory.presentationLayer.main.shop.ShopViewModel shopViewModel = mShopViewModel;
        java.lang.Boolean shopViewModelIsCheckBtnAvailableGetValue = null;
        java.lang.Double shopViewModelUserPrice = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> shopViewModelIsCheckBtnAvailable = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxShopViewModelIsCheckBtnAvailableGetValue = false;
        java.lang.String shopViewModelUserPriceToString = null;
        com.attendance.myproject.begory.data.Models.User shopViewModelUser = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (shopViewModel != null) {
                    // read shopViewModel.isCheckBtnAvailable()
                    shopViewModelIsCheckBtnAvailable = shopViewModel.isCheckBtnAvailable();
                }
                updateLiveDataRegistration(0, shopViewModelIsCheckBtnAvailable);


                if (shopViewModelIsCheckBtnAvailable != null) {
                    // read shopViewModel.isCheckBtnAvailable().getValue()
                    shopViewModelIsCheckBtnAvailableGetValue = shopViewModelIsCheckBtnAvailable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(shopViewModel.isCheckBtnAvailable().getValue())
                androidxDatabindingViewDataBindingSafeUnboxShopViewModelIsCheckBtnAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(shopViewModelIsCheckBtnAvailableGetValue);
            if ((dirtyFlags & 0x6L) != 0) {

                    if (shopViewModel != null) {
                        // read shopViewModel.user
                        shopViewModelUser = shopViewModel.getUser();
                    }


                    if (shopViewModelUser != null) {
                        // read shopViewModel.user.price
                        shopViewModelUserPrice = shopViewModelUser.getPrice();
                    }


                    if (shopViewModelUserPrice != null) {
                        // read shopViewModel.user.price.toString()
                        shopViewModelUserPriceToString = shopViewModelUserPrice.toString();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnBookNow, mCallback1, androidxDatabindingViewDataBindingSafeUnboxShopViewModelIsCheckBtnAvailableGetValue);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCurrentPoints, shopViewModelUserPriceToString);
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
        flag 0 (0x1L): shopViewModel.isCheckBtnAvailable()
        flag 1 (0x2L): shopViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}