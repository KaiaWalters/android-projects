package com.example.mvvmapp.data.api

import com.example.mvvmapp.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}

//Api Service interface tells us what an API service should be able to do
//Open- closed principle, we are able to create an interface that can be extended by any other class but remains the source pf truth in our app