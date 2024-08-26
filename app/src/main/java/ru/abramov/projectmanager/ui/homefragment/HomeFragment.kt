package ru.abramov.projectmanager.ui.homefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.Toast
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.OnScrollListener
import com.google.android.material.floatingactionbutton.FloatingActionButton
import ru.abramov.projectmanager.R
import ru.abramov.projectmanager.ui.homefragment.adapter.OngoingAdapter
import ru.abramov.projectmanager.ui.homefragment.viewmodel.MainViewModel


class HomeFragment : Fragment() {

    private val mainViewModel:MainViewModel by viewModels()
    lateinit var viewOnGoingR:RecyclerView
    lateinit var FAB:FloatingActionButton
    lateinit var scrollViewHome: ScrollView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)


        viewOnGoingR = view.findViewById(R.id.viewOnGoing)
        scrollViewHome = view.findViewById(R.id.scrollViewHome)
        Toast.makeText(context, "Арсен ЧУРКА", Toast.LENGTH_SHORT).show()
        apply {
            val ongoingAdapter by lazy {OngoingAdapter(mainViewModel.loadData())}

            viewOnGoingR.apply {
                adapter = ongoingAdapter
                layoutManager = GridLayoutManager(context, 2)
            }

        }


        return view
    }


}