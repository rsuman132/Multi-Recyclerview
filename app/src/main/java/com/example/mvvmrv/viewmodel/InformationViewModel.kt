package com.example.mvvmrv.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmrv.model.Information

class InformationViewModel : ViewModel(){
    var infoList = MutableLiveData<ArrayList<Information>>()
    var newlist = arrayListOf<Information>()

}