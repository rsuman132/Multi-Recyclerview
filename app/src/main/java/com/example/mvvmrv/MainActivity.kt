package com.example.mvvmrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmrv.Adapter.InformationAdapter
import com.example.mvvmrv.model.Information
import com.example.mvvmrv.viewmodel.InformationViewModel
import com.example.mvvmrv.viewmodelfactory.InfoViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val information = mutableListOf<Information>()
        val adapter = InformationAdapter(this, information)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


        val informationViewModel = ViewModelProviders.of(this, InfoViewModelFactory())[InformationViewModel::class.java]
        informationViewModel.getInformation().observe(this, Observer {
            information.addAll(it)

        })
    }
}
