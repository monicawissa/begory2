package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityShowRankBindingImpl extends ActivityShowRankBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.logo, 2);
        sViewsWithIds.put(R.id.progressBar, 3);
        sViewsWithIds.put(R.id.tv_chooselevel, 4);
        sViewsWithIds.put(R.id.rv_attendance, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityShowRankBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityShowRankBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ProgressBar) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.Spinner) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.spLevels.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.showGiftBookedViewModel == variableId) {
            setShowGiftBookedViewModel((com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked.ShowGiftBookedViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShowGiftBookedViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked.ShowGiftBookedViewModel ShowGiftBookedViewModel) {
        this.mShowGiftBookedViewModel = ShowGiftBookedViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.showGiftBookedViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        android.widget.AdapterView.OnItemSelectedListener showGiftBookedViewModelSpinnerListener = null;
        com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked.ShowGiftBookedViewModel showGiftBookedViewModel = mShowGiftBookedViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (showGiftBookedViewModel != null) {
                    // read showGiftBookedViewModel.spinnerListener
                    showGiftBookedViewModelSpinnerListener = showGiftBookedViewModel.getSpinnerListener();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.spLevels.setOnItemSelectedListener(showGiftBookedViewModelSpinnerListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): showGiftBookedViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}