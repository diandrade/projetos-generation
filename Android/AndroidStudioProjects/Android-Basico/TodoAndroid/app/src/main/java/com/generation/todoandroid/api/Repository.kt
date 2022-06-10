package com.generation.todoandroid.api

import com.generation.todoandroid.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria() :Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }

}