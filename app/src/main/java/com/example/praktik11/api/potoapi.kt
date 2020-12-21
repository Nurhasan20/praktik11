package com.example.praktik11.api

import com.example.praktik11.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface potoapi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}