package id.bungamungil.kitsune.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PosterImage(

        @JsonProperty("tiny")
        val tiny: String?,

        @JsonProperty("small")
        val small: String?,

        @JsonProperty("medium")
        val medium: String?,

        @JsonProperty("original")
        val original: String?

)