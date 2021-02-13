package com.example.mvvmrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmrv.Adapter.InformationAdapter
import com.example.mvvmrv.model.Information
import com.example.mvvmrv.viewmodel.InformationViewModel
import com.example.mvvmrv.viewmodelfactory.InfoViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var informationViewModel: InformationViewModel
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        val application = requireNotNull(this).application
        val factory = InfoViewModelFactory()
        informationViewModel = ViewModelProviders.of(this,factory).get(InformationViewModel::class.java)


        addData()

        recyclerView.layoutManager = LinearLayoutManager(this)
        informationViewModel.infoList.observe(this, Observer{
            recyclerView.adapter = InformationAdapter(this, informationViewModel,it)
        })
    }

    private fun addData() {
        informationViewModel.apply {
            newlist.add(Information("Suman", 25))
            newlist.add(Information("Suman", 25))
            newlist.add(Information("Suman", 25))
            newlist.add(Information("Suman", 25))
        }
    }
}