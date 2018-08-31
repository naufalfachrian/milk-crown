package id.bungamungil.kitsune.repository

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.jasminb.jsonapi.JSONAPIDocument
import com.github.jasminb.jsonapi.retrofit.JSONAPIConverterFactory
import id.bungamungil.kitsune.model.response.Anime
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

object NetworkRepository {

    private val objectMapper = ObjectMapper()

    private val retrofit = Retrofit.Builder()
            .baseUrl("https://kitsu.io/api/edge/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(JSONAPIConverterFactory(objectMapper, Anime::class.java))
            .build()

    private val restApi = retrofit.create(KitsuRestApi::class.java)

    fun fetchAnimeList(): Single<JSONAPIDocument<List<Anime>>> {
        return restApi.fetchAnimeList("-averageRating")
    }

}