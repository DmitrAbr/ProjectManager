package ru.abramov.projectmanager.ui.homefragment.adapter

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
import java.util.zip.Inflater

class OngoingAdapter(private val items: List<OngoingDomain>): RecyclerView.Adapter<OngoingAdapter.ViewHolder>() {
    inner class ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {

        val titleItem: TextView = itemview.findViewById(R.id.nameItemTV)
        val dateItem:TextView = itemview.findViewById(R.id.dateTV)
        val progressItem:TextView = itemview.findViewById(R.id.progressTV)
        val imageItem:ImageView = itemview.findViewById(R.id.imageViewItem)
        val progressTitleText:TextView = itemview.findViewById(R.id.progressTitleText)
        val progressBarItem:ProgressBar = itemview.findViewById(R.id.progressBar)
        val layoutItem:ConstraintLayout = itemview.findViewById(R.id.layoutItem)

        fun setColors(color:Int){
            titleItem.setTextColor(itemView.context.getColor(color))
            dateItem.setTextColor(itemView.context.getColor(color))
            progressItem.setTextColor(itemView.context.getColor(color))
            progressTitleText.setTextColor(itemView.context.getColor(color))

            imageItem.setColorFilter(ContextCompat.getColor(itemView.context, color), PorterDuff.Mode.SRC_IN)
            progressBarItem.progressTintList= ColorStateList.valueOf(ContextCompat.getColor(itemView.context,color))
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_ongoing, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = items[position]
        holder.titleItem.text = currentItem.nameItem
        holder.dateItem.text = currentItem.date
        holder.progressItem.text = "${currentItem.progressItem}%"
        holder.progressBarItem.progress = currentItem.progressItem
        val drawableResourceId = holder.itemView.context.resources.getIdentifier(currentItem.picPath,"drawable",holder.itemView.context.packageName)

        Glide.with(holder.itemView.context).load(drawableResourceId).into(holder.imageItem)

        with(holder){
            if(position == 0){
                layoutItem.setBackgroundResource(R.drawable.dark_bcg)
                setColors(R.color.white)
            }else{
                layoutItem.setBackgroundResource(R.drawable.light_purple_bckg)
                setColors(R.color.dark_purple)
            }
        }


    }


}