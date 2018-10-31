package br.com.bicmsystems.mongoapi.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class PontoDeInteresse(
        var id: String?,
        var titulo: String?,
        var descricao: String?,
        var avaliacao: Double?,
        var visitado: Boolean?,
        var imagem: String?,
        var pago: Boolean?,
        var coordenada: Coordenada?
) {
}