package org.tech.town.hola

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.dong_item.view.*
import kotlinx.android.synthetic.main.dong_item.view.dongNameTv
import kotlinx.android.synthetic.main.guname.view.*

class GuListAdapter : RecyclerView.Adapter<GuListAdapter.ViewHolder>(){

    var items = ArrayList<GuList>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.guname, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.setItem(item)
    }

    override fun getItemCount() = items.size



    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun setItem(item: GuList) {
            itemView.guNameTv.text = item.guName.toString()

        }
    }
/*
    var items = ArrayList<DongScore>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.dong_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.setItem(item)
    }

    override fun getItemCount() = items.size



    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun setItem(item: DongScore) {
            itemView.dongNameTv.text = item.dongName
            itemView.educationScoreTv.text = item.educationScore.toString()
            itemView.convenienceScoreTv.text = item.convenienceScore.toString()
            itemView.welfareScoreTv.text = item.welfareScore.toString()
            itemView.restScoreTv.text = item.restScore.toString()
            itemView.medicalScoreTv.text = item.medicalScore.toString()
            itemView.trafficScoreTv.text = item.trafficScore.toString()
        }
    }
*/

}