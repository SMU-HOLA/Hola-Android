package org.tech.town.hola

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.dong_item.view.*

class GuListAdapter : RecyclerView.Adapter<GuListAdapter.ViewHolder>(){

    var items = ArrayList<GuList>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.gu_list, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.setItem(item)
    }

    override fun getItemCount() = items.size



    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun setItem(item: GuList) {
            itemView.dongNameTv.text = item.guName.toString()

        }
    }


}