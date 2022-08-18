package org.tech.town.hola

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.dong_item.view.*
import org.tech.town.hola.dataClass.DongScore
import kotlin.math.roundToInt

class DongScoreAdapter : RecyclerView.Adapter<DongScoreAdapter.ViewHolder>(){

    lateinit var listener: OnDongScoreClickListener
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

        init {
            itemView.setOnClickListener{
                listener?.onItemClick(this, itemView, adapterPosition)
            }
        }

        fun setItem(item: DongScore) {
            var avgScore:Double
            avgScore = ((item.cultureScore + item.convenienceScore + item.welfareScore + item.greeneryScore + item.medicalScore + item.trafficScore + item.activityScore)/7)

            itemView.dongNameTv.text = item.dongName
            itemView.cultureScoreTv.text = item.cultureScore.toString()
            itemView.convenienceScoreTv.text = item.convenienceScore.toString()
            itemView.welfareScoreTv.text = item.welfareScore.toString()
            itemView.greeneryScoreTv.text = item.greeneryScore.toString()
            itemView.medicalScoreTv.text = item.medicalScore.toString()
            itemView.trafficScoreTv.text = item.trafficScore.toString()
            itemView.activityScoreTv.text = item.activityScore.toString()
            itemView.avgScoreTv.text =((avgScore * 10.0).roundToInt()/10.0).toString()


        }
    }


}