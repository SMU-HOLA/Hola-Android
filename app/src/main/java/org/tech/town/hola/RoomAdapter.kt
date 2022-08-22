package org.tech.town.hola

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.room_item.view.*
import org.tech.town.hola.dataClass.Room

class RoomAdapter: RecyclerView.Adapter<RoomAdapter.ViewHolder>() {

    var items = ArrayList<Room>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.room_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.setItem(item)
    }

    override fun getItemCount() = items.size


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setItem(item: Room) {
            itemView.costTv.text = item.cost.toString()
            itemView.formTv.text = item.form.toString()
            itemView.explainTv.text = item.explain.toString()
            itemView.detailTv.text = item.detail.toString()

        }
    }
}