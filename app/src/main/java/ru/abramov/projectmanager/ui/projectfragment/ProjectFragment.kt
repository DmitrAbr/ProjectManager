package ru.abramov.projectmanager.ui.projectfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import ru.abramov.projectmanager.R


class ProjectFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_project, container, false)
        Toast.makeText(context, "Арсен ЧУРКА", Toast.LENGTH_SHORT).show()
    }


}