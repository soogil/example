package com.soogil.example.aac

import androidx.lifecycle.LiveData
import retrofit2.http.GET
import retrofit2.http.Path

interface WebInterface {
    /**
     * @GET declares an HTTP GET request
     * @Path("user") annotation on the userId parameter marks it as a
     * replacement for the {user} placeholder in the @GET path
     */
    @GET("/users/{user}")
    fun getData(@Path("user") uid: String): LiveData<String>

    //todo what is suspend ? => suspend fun getData(@Path("user") uid: String): LiveData<String>
}