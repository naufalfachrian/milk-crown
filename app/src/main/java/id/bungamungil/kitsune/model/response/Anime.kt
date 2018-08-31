package id.bungamungil.kitsune.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.github.jasminb.jsonapi.annotations.Id
import com.github.jasminb.jsonapi.annotations.Type

@JsonIgnoreProperties(ignoreUnknown = true)
@Type("anime")
data class Anime(

        @Id
        @JsonProperty("id")
        val id: String?,

        @JsonProperty("createdAt")
        val createdAt: String,

        @JsonProperty("updatedAt")
        val updatedAt: String,

        @JsonProperty("slug")
        val slug: String?,

        @JsonProperty("synopsis")
        val synopsis: String?,

        @JsonProperty("titles")
        val titles: MediaTitle?,

        @JsonProperty("canonicalTitle")
        val canonicalTitle: String?,

        @JsonProperty("abbreviatedTitles")
        val abbreviatedTitles: List<String>?,

        @JsonProperty("averageRating")
        val averageRating: String?,

        @JsonProperty("userCount")
        val userCount: Int?,

        @JsonProperty("favoritesCount")
        val favouritesCount: Int?,

        @JsonProperty("startDate")
        val startDate: String?,

        @JsonProperty("endDate")
        val endDate: String?,

        @JsonProperty("popularityRank")
        val popularityRank: Int?,

        @JsonProperty("ratingRank")
        val ratingRank: Int?,

        @JsonProperty("ageRating")
        val ageRating: String?,

        @JsonProperty("ageRatingGuide")
        val ageRatingGuide: String?,

        @JsonProperty("subtype")
        val subtype: String?,

        @JsonProperty("status")
        val status: String?,

        @JsonProperty("posterImage")
        val posterImage: PosterImage?,

        @JsonProperty("coverImage")
        val coverImage: CoverImage?,

        @JsonProperty("episodeCount")
        val episodeCount: Int?,

        @JsonProperty("episodeLength")
        val episodeLength: Int?,

        @JsonProperty("totalLength")
        val totalLength: Int?,

        @JsonProperty("youtubeVideoId")
        val youtubeId: String?,

        @JsonProperty("nsfw")
        val isNsfw: Boolean?

)