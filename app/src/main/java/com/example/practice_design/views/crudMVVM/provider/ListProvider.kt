package com.example.practice_design.views.crudMVVM.provider

import com.example.practice_design.views.crudMVVM.model.User
import com.example.practice_design.views.crudMVVM.view.service.ApiUtils
import com.example.practice_design.views.crudMVVM.view.service.ErrorData
import com.example.practice_design.views.crudMVVM.datatype.Result
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import retrofit2.Response

class ListProvider {
    companion object{
        suspend fun getAll():Result<List<User>>{
            val call: Response<List<User>> = ApiUtils.apiService.getAllUsers("users")
            val users:List<User>? = call.body()

            if (call.isSuccessful){
                return Result.success(call.body()!!)
            }else{
                var gson = GsonBuilder().create()
                var type = object: TypeToken<List<ErrorData>>(){}.type
                var errores:List<ErrorData> = gson.fromJson(
                    call.errorBody()!!.charStream(),type
                )

                return Result.error("[ERROR]: "+errores[0].field+" "+errores[0].message)
            }
        }
    }
}