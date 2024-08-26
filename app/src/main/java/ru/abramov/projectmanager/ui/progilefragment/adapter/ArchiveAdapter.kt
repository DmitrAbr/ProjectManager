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
import ru.abramov.projectmanager.ui.progilefragment.domain.ArchiveDomain
import ru.abramov.projectmanager.ui.progilefragment.domain.TeamDomain
import java.util.zip.Inflater

class ArchiveAdapter(private val items: List<String>): RecyclerView.Adapter<ArchiveAdapter.ViewHolder>() {
    inner class ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {

        val titleItemArchive: TextView = itemview.findViewById(R.id.titleItemArchive)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_profile, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = items[position]
        holder.titleItemArchive.text = currentItem

    }


}