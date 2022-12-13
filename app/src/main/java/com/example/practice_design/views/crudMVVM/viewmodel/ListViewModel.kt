package com.example.practice_design.views.crudMVVM.viewmodel

import androidx.lifecycle.viewModelScope
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.launch
import com.example.practice_design.views.crudMVVM.datatype.ResultType
import com.example.practice_design.views.crudMVVM.model.User
import com.example.practice_design.views.crudMVVM.provider.ListProvider

class ListViewModel {
    var data: MutableLiveData<List<User>> = MutableLiveData()
    var err:MutableLiveData<String> = MutableLiveData()
    var isApiProgress:MutableLiveData<Boolean> = MutableLiveData()

    fun getAll(){
        isApiProgress.value = true
        viewModelScope.launch {
            var response = ListProvider.getAll()
            if(response.resultType == ResultType.SUCCESS){
                data.value = response.data!!
                isApiProgress.value = false
            }else{
                err.value = response.error!!
                isApiProgress.value = false
            }
        }
    }
}