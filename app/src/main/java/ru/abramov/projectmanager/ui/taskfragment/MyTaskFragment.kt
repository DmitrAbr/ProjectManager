package ru.abramov.projectmanager.ui.taskfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import ru.abramov.projectmanager.R


class MyTaskFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_task, container, false)
        Toast.makeText(context, "Арсен ЧУРКА", Toast.LENGTH_SHORT).show()
    }

}