package com.attendance.myproject.begory.databinding;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityLevelAttendanceBindingImpl extends ActivityLevelAttendanceBinding implements com.attendance.myproject.begory.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rg_terms, 3);
        sViewsWithIds.put(R.id.rb_term2, 4);
        sViewsWithIds.put(R.id.rb_term1, 5);
        sViewsWithIds.put(R.id.et_date, 6);
        sViewsWithIds.put(R.id.tv_a3traf, 7);
        sViewsWithIds.put(R.id.tv_tnawel, 8);
        sViewsWithIds.put(R.id.tv_kodas, 9);
        sViewsWithIds.put(R.id.tv_attend, 10);
        sViewsWithIds.put(R.id.tv_title, 11);
        sViewsWithIds.put(R.id.rv_attendance, 12);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLevelAttendanceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityLevelAttendanceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[2]
            , (android.widget.EditText) bindings[6]
            , (android.widget.ProgressBar) bindings[1]
            , (androidx.appcompat.widget.AppCompatRadioButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatRadioButton) bindings[4]
            , (android.widget.RadioGroup) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[8]
            );
        this.btnAdd.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.attendance.myproject.begory.generated.callback.OnClickListener(this, 1);
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
        if (BR.levelAttendViewModel == variableId) {
            setLevelAttendViewModel((com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.LevelAttendViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLevelAttendViewModel(@Nullable com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.LevelAttendViewModel LevelAttendViewModel) {
        this.mLevelAttendViewModel = LevelAttendViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.levelAttendViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLevelAttendViewModelIsCheckBtnAvailable((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeLevelAttendViewModelDataLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLevelAttendViewModelIsCheckBtnAvailable(androidx.lifecycle.LiveData<java.lang.Boolean> LevelAttendViewModelIsCheckBtnAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLevelAttendViewModelDataLoading(androidx.lifecycle.LiveData<java.lang.Boolean> LevelAttendViewModelDataLoading, int fieldId) {
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
        androidx.lifecycle.LiveData<java.lang.Boolean> levelAttendViewModelIsCheckBtnAvailable = null;
        java.lang.Boolean levelAttendViewModelDataLoadingGetValue = null;
        int levelAttendViewModelDataLoadingViewVISIBLEViewGONE = 0;
        com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.LevelAttendViewModel levelAttendViewModel = mLevelAttendViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxLevelAttendViewModelIsCheckBtnAvailableGetValue = false;
        java.lang.Boolean levelAttendViewModelIsCheckBtnAvailableGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> levelAttendViewModelDataLoading = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxLevelAttendViewModelDataLoadingGetValue = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (levelAttendViewModel != null) {
                        // read levelAttendViewModel.isCheckBtnAvailable()
                        levelAttendViewModelIsCheckBtnAvailable = levelAttendViewModel.isCheckBtnAvailable();
                    }
                    updateLiveDataRegistration(0, levelAttendViewModelIsCheckBtnAvailable);


                    if (levelAttendViewModelIsCheckBtnAvailable != null) {
                        // read levelAttendViewModel.isCheckBtnAvailable().getValue()
                        levelAttendViewModelIsCheckBtnAvailableGetValue = levelAttendViewModelIsCheckBtnAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(levelAttendViewModel.isCheckBtnAvailable().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxLevelAttendViewModelIsCheckBtnAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(levelAttendViewModelIsCheckBtnAvailableGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (levelAttendViewModel != null) {
                        // read levelAttendViewModel.dataLoading
                        levelAttendViewModelDataLoading = levelAttendViewModel.getDataLoading();
                    }
                    updateLiveDataRegistration(1, levelAttendViewModelDataLoading);


                    if (levelAttendViewModelDataLoading != null) {
                        // read levelAttendViewModel.dataLoading.getValue()
                        levelAttendViewModelDataLoadingGetValue = levelAttendViewModelDataLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(levelAttendViewModel.dataLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxLevelAttendViewModelDataLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(levelAttendViewModelDataLoadingGetValue);
                if((dirtyFlags & 0xeL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxLevelAttendViewModelDataLoadingGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(levelAttendViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
                    levelAttendViewModelDataLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxLevelAttendViewModelDataLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnAdd, mCallback4, androidxDatabindingViewDataBindingSafeUnboxLevelAttendViewModelIsCheckBtnAvailableGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.progressBar.setVisibility(levelAttendViewModelDataLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // levelAttendViewModel
        com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.LevelAttendViewModel levelAttendViewModel = mLevelAttendViewModel;
        // levelAttendViewModel != null
        boolean levelAttendViewModelJavaLangObjectNull = false;



        levelAttendViewModelJavaLangObjectNull = (levelAttendViewModel) != (null);
        if (levelAttendViewModelJavaLangObjectNull) {


            levelAttendViewModel.btnadd();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): levelAttendViewModel.isCheckBtnAvailable()
        flag 1 (0x2L): levelAttendViewModel.dataLoading
        flag 2 (0x3L): levelAttendViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(levelAttendViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(levelAttendViewModel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}