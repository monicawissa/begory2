package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityShowLevelAttendanceBindingImpl extends ActivityShowLevelAttendanceBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rg_terms, 3);
        sViewsWithIds.put(R.id.cb_term2, 4);
        sViewsWithIds.put(R.id.cb_term1, 5);
        sViewsWithIds.put(R.id.tv_a3traf, 6);
        sViewsWithIds.put(R.id.tv_tnawel, 7);
        sViewsWithIds.put(R.id.tv_kodas, 8);
        sViewsWithIds.put(R.id.tv_attend, 9);
        sViewsWithIds.put(R.id.tv_title, 10);
        sViewsWithIds.put(R.id.rv_attendance, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityShowLevelAttendanceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityShowLevelAttendanceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[5]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[4]
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.LinearLayout) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (android.widget.Spinner) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.spLevels.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.showLevelAttendViewModel == variableId) {
            setShowLevelAttendViewModel((com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance.ShowLevelAttendViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShowLevelAttendViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance.ShowLevelAttendViewModel ShowLevelAttendViewModel) {
        this.mShowLevelAttendViewModel = ShowLevelAttendViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.showLevelAttendViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeShowLevelAttendViewModelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeShowLevelAttendViewModelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ShowLevelAttendViewModelDataLoading, int fieldId) {
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
        androidx.lifecycle.LiveData<java.lang.Boolean> showLevelAttendViewModelDataLoading = null;
        int showLevelAttendViewModelDataLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean showLevelAttendViewModelDataLoadingGetValue = null;
        com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance.ShowLevelAttendViewModel showLevelAttendViewModel = mShowLevelAttendViewModel;
        android.widget.AdapterView.OnItemSelectedListener showLevelAttendViewModelSpinnerListener = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxShowLevelAttendViewModelDataLoadingGetValue = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (showLevelAttendViewModel != null) {
                    // read showLevelAttendViewModel.dataLoading
                    showLevelAttendViewModelDataLoading = showLevelAttendViewModel.getDataLoading();
                }
                updateLiveDataRegistration(0, showLevelAttendViewModelDataLoading);


                if (showLevelAttendViewModelDataLoading != null) {
                    // read showLevelAttendViewModel.dataLoading.getValue()
                    showLevelAttendViewModelDataLoadingGetValue = showLevelAttendViewModelDataLoading.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(showLevelAttendViewModel.dataLoading.getValue())
                androidxDatabindingViewDataBindingSafeUnboxShowLevelAttendViewModelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(showLevelAttendViewModelDataLoadingGetValue);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxShowLevelAttendViewModelDataLoadingGetValue) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(showLevelAttendViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
                showLevelAttendViewModelDataLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxShowLevelAttendViewModelDataLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            if ((dirtyFlags & 0x6L) != 0) {

                    if (showLevelAttendViewModel != null) {
                        // read showLevelAttendViewModel.spinnerListener
                        showLevelAttendViewModelSpinnerListener = showLevelAttendViewModel.getSpinnerListener();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.progressBar.setVisibility(showLevelAttendViewModelDataLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.spLevels.setOnItemSelectedListener(showLevelAttendViewModelSpinnerListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): showLevelAttendViewModel.dataLoading
        flag 1 (0x2L): showLevelAttendViewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(showLevelAttendViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(showLevelAttendViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}