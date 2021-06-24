package com.attendance.myproject.begory.presentationLayer.main.bookedGift

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.databinding.FragmentBookedBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_shop.*
import java.util.ArrayList

@AndroidEntryPoint
class BookedFragment : Fragment(R.layout.fragment_booked), UpdatePoints {
    private lateinit var binding: FragmentBookedBinding
    private lateinit var mList: ArrayList<Int>
    var recyclerViewAdapter: BookedAdapter? = null
    //private var savedRecyclerLayoutState: Parcelable? = null
    private  val bookedViewModel: BookedViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //TODO :change layout
        //val root: View = inflater.inflate(R.layout.fragment_booked, container, false)
        binding = FragmentBookedBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.bookedViewModel=bookedViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(bookedViewModel)
        // TODO: change id
        (binding.rvMenuu as (RecyclerView)).setHasFixedSize(true)
        //TODO: Choose your layout
        //GridLayout
        val gridLayoutManager: GridLayoutManager = GridLayoutManager(activity, 1)
        binding.rvMenuu.layoutManager = gridLayoutManager
        //if (savedInstanceState != null) {
        //    displayDataFromInstanceState(savedInstanceState)
        //}
        return view
    }

    private fun subscribeToNavigationChanges(bookedViewModel: BookedViewModel)  {
        val activity = this@BookedFragment
        bookedViewModel.run {
            snackbarMessage.observe(viewLifecycleOwner, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(viewLifecycleOwner, Observer { showMessage(it) })
            mGiftListListener.observe(viewLifecycleOwner, Observer {if (it == true) initRecyclerView()})
//            isopenLogin.observe(viewLifecycleOwner,
//                    Observer {
//                        if (it == true) openLoginActivity()
//                    })
//            isDataAvailable.observe(viewLifecycleOwner,
//                    Observer {
//                        if (it == true) dataChanged()
//                    })
        }
    }



    private fun dataChanged() {
//        //binding.notifyPropertyChanged(BR.p)
//        binding.tvName.text=profileViewModel.name
//        binding.tvLevel.text=profileViewModel.studentLevel
//        binding.paymentBegory.text=profileViewModel.balanceBegory
//        binding.eqlomatDesc.text=profileViewModel.balanceEqlomat
//        binding.tiName
//        mobile=usertmp.mobile!!
//        mobile2=usertmp.mobile2!!
//        balanceBegory=usertmp.balanceBegory.toString()
//        balanceEqlomat=usertmp.balanceEqlomat.toString()
//        password=usertmp.password!!
//        address=usertmp.address!!
//        studentLevel=usertmp.studentLevel!!.toString()
    }
    fun showMessage(string: String){
        Toast.makeText(binding.root.context, string, Toast.LENGTH_SHORT).show()
        //Log.d(ContentValues.TAG, "showMessage: "+string)
    }
    private fun initRecyclerView() {
        recyclerViewAdapter = BookedAdapter(requireContext(), bookedViewModel.mGiftList,bookedViewModel.user!!,this)
        binding.rvMenuu.adapter = recyclerViewAdapter
        recyclerViewAdapter!!.notifyDataSetChanged()
        binding.rvMenuu.smoothScrollToPosition(0)
    }

    override fun onResume() {
        super.onResume()
        //mPresenter.start();
    }

    companion object {
        //save state
        private const val LIST_STATE = "list_state"
        private const val BUNDLE_RECYCLER_LAYOUT = "recycler_layout"
    }



    override fun onUpdate(points: User) {
        bookedViewModel.updateui(points)
        //binding.tvCurrentPoints.text=points.price.toString()
    }
    //    private fun displayDataFromInstanceState(savedInstanceState: Bundle?) {
//        mList = savedInstanceState!!.getIntegerArrayList(LIST_STATE)
//        savedRecyclerLayoutState = savedInstanceState!!.getParcelable(BUNDLE_RECYCLER_LAYOUT)
//
//        // restore Layout Manager Position
//        if (savedRecyclerLayoutState != null) checkNotNull(binding.rvMenuu!!.layoutManager).onRestoreInstanceState(savedRecyclerLayoutState)
//    }

//    override fun onSaveInstanceState(savedInstanceState: Bundle) {
//        super.onSaveInstanceState(savedInstanceState)
//        savedInstanceState.putIntegerArrayList(LIST_STATE, mList)
//        savedInstanceState.putParcelable(BUNDLE_RECYCLER_LAYOUT, checkNotNull(binding.rvMenuu!!.layoutManager).onSaveInstanceState())
//    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        if (savedInstanceState != null) {
//            mList = savedInstanceState.getIntegerArrayList(LIST_STATE)
//            savedRecyclerLayoutState = savedInstanceState.getParcelable(BUNDLE_RECYCLER_LAYOUT)
//        }
//        super.onActivityCreated(savedInstanceState)
//    }
}