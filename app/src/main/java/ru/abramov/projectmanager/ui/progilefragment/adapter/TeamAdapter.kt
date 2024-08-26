package ru.abramov.projectmanager.ui.progilefragment.adapter

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ru.abramov.projectmanager.R
import ru.abramov.projectmanager.ui.homefragment.domain.OngoingDomain
import ru.abramov.projectmanager.ui.progilefragment.domain.TeamDomain
import java.util.zip.Inflater

class TeamAdapter(private val items: List<TeamDomain>): RecyclerView.Adapter<TeamAdapter.ViewHolder>() {
    inner class ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {

        val titleItemTeam: TextView = itemview.findViewById(R.id.titleItemTeam)
        val descriptionItemTeam:TextView = itemview.findViewById(R.id.descriptionItemTeam)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_profile_my_team, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = items[position]
        holder.titleItemTeam.text = currentItem.titleItemTeam
        holder.descriptionItemTeam.text = currentItem.descriptionItemTeam

    }


}