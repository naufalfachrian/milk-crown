package id.bungamungil.kitsune.repository

import com.github.jasminb.jsonapi.JSONAPIDocument
import id.bungamungil.kitsune.model.response.Anime
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface KitsuRestApi {

    @GET("anime")
    fun fetchAnimeList(@Query("sort") sortBy: String): Single<JSONAPIDocument<List<Anime>>>

}