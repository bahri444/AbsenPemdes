package com.example.absenpemdesv1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterGetAllHistory(private val list: ArrayList<GetAllResponse>): RecyclerView.Adapter<AdapterGetAllHistory.PostViewHolder>(){
    private lateinit var tvText: TextView
    inner class PostViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bid(getAllResponse: GetAllResponse){
            with(itemView){
                val text = "absen_uuid: ${getAllResponse.absen_uuid}\n"+
                        "user_uuid: ${getAllResponse.user_uuid}"+
                        "jam_masuk: ${getAllResponse.jam_masuk}"+
                        "jam_pulang: ${getAllResponse.jam_pulang}"+
                        "jarak_koordinat: ${getAllResponse.jarak_koordinat}"+
                        "tanggal_absen: ${getAllResponse.tanggal_absen}"
                tvText.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_getall_history,parent,false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bid(list[position])
    }
}