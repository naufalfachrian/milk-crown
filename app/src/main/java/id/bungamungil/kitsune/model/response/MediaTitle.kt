package id.bungamungil.kitsune.model.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class MediaTitle(

        @JsonProperty("en_us")
        val english: String?

)