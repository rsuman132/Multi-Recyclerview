package com.example.mvvmrv.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmrv.model.Information

class InformationViewModel : ViewModel(){
    var infoList : MutableLiveData<MutableList<Information>> = MutableLiveData()

    init {
        infoList.value = createInformation()
    }


    fun getInformation() : LiveData<MutableList<Information>>{
        return infoList
    }



    private fun createInformation(): MutableList<Information>? {
        val information = mutableListOf<Information>()
        information.add(Information("Suman", 25))
        information.add(Information("Radhakrishnan", 25))
        information.add(Information("Vishnu", 25))
        information.add(Information("Prakash", 25))

        return information
    }
}