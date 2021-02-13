package com.example.mvvmrv.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmrv.R
import com.example.mvvmrv.model.Information
import com.example.mvvmrv.viewmodel.InformationViewModel

class InformationAdapter(
    private val context: Context,
    private val informationViewModel: InformationViewModel,
    private val infoList : ArrayList<Information>
) : RecyclerView.Adapter<InformationAdapter.InformationVH>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): InformationAdapter.InformationVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.info_list, parent, false)
        return InformationVH(view)
    }

    override fun getItemCount(): Int {
        return infoList.size
    }

    override fun onBindViewHolder(holder: InformationAdapter.InformationVH, position: Int) {
        val list = infoList[position]
        holder.name.text = list.name
        holder.age.text = list.age.toString()
    }

    inner class InformationVH(itemView : View) : RecyclerView.ViewHolder(itemView){
        val name : TextView = itemView.findViewById(R.id.info_name)
        val age : TextView = itemView.findViewById(R.id.info_age)
    }
}