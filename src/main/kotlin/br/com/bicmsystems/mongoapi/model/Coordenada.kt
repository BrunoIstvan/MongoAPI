package br.com.bicmsystems.mongoapi.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Coordenada (
        var longitude: Double?,
        var latitude: Double?
) {
}