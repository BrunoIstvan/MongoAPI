package br.com.bicmsystems.mongoapi.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "Usuario")
data class Usuario (
        @Id var id: String?,
        var email: String = "",
        var senha: String = "",
        var apelido: String = "",
        var nome: String = "",
        var pontosDeInteresse: List<PontoDeInteresse> = listOf()
)