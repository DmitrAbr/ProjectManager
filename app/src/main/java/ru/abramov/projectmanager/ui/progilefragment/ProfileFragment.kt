package ru.abramov.projectmanager.ui.progilefragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.Toast
import androidx.core.widget.NestedScrollView
import androidx.core.widget.NestedScrollView.OnScrollChangeListener
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import ru.abramov.projectmanager.R
import ru.abramov.projectmanager.ui.progilefragment.adapter.ArchiveAdapter
import ru.abramov.projectmanager.ui.progilefragment.adapter.TeamAdapter
import ru.abramov.projectmanager.ui.progilefragment.viewmodel.ProfileViewModel


class ProfileFragment : Fragment() {

    val profileViewModel: ProfileViewModel by viewModels()
    lateinit var recyclerViewTeam:RecyclerView
    lateinit var recyclerViewArchive:RecyclerView
    lateinit var scrollviewItem:ScrollView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile,container,false)

        recyclerViewTeam = view.findViewById(R.id.recyclerViewTeam)
        recyclerViewArchive = view.findViewById(R.id.recyclerViewArchive)
        scrollviewItem = view.findViewById(R.id.scrollviewItem)

        apply {
            val teamAdapter by lazy { TeamAdapter(profileViewModel.loadDataTeam()) }
            recyclerViewTeam.apply {
                adapter = teamAdapter
                layoutManager = LinearLayoutManager(context,
                    LinearLayoutManager.VERTICAL,
                    false)
            }
            val archiveAdapter by lazy { ArchiveAdapter(profileViewModel.loadDataArchive()) }
            recyclerViewArchive.apply {
                adapter = archiveAdapter
                layoutManager = LinearLayoutManager(
                    context,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
            }
        }

        if (activity !=null && isAdded !=null){
            val bottomNavigationView = requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavView)
            val FAB = requireActivity().findViewById<FloatingActionButton>(R.id.floatBtnAdd)
            scrollviewItem.setOnScrollChangeListener(object: OnScrollChangeListener,
                View.OnScrollChangeListener {


                override fun onScrollChange(p0: View?, p1: Int, p2: Int, p3: Int, p4: Int) {

                    if(p4>p2){
                        FAB.show()
                        bottomNavigationView.menu.getItem(2).setVisible(true)
                    }
                    else{
                        FAB.hide()
                        bottomNavigationView.menu.getItem(2).setVisible(false)
                    }
                }

                override fun onScrollChange(
                    v: NestedScrollView,
                    scrollX: Int,
                    scrollY: Int,
                    oldScrollX: Int,
                    oldScrollY: Int
                ) {
                }
            })



        }

        return view
    }


}