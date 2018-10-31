package br.com.bicmsystems.mongoapi.repository

import br.com.bicmsystems.mongoapi.model.PontoDeInteresse
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PontoDeInteresseRepository : MongoRepository<PontoDeInteresse, String> {


    fun findByTitulo(titulo: String) : List<PontoDeInteresse>

    fun findByTituloContainingIgnoreCase(titulo: String) : List<PontoDeInteresse>

}