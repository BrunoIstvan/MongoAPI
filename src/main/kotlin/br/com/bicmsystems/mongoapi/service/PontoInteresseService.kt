package br.com.bicmsystems.mongoapi.service

import br.com.bicmsystems.mongoapi.model.PontoDeInteresse
import br.com.bicmsystems.mongoapi.repository.PontoDeInteresseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PontoInteresseService {

    @Autowired
    lateinit var pontoDeInteresseRepository: PontoDeInteresseRepository

    fun findAll() : List<PontoDeInteresse> {
        return pontoDeInteresseRepository.findAll()
    }

    fun findByTitulo(titulo: String) : List<PontoDeInteresse> {
        return pontoDeInteresseRepository.findByTitulo(titulo)
    }

    fun findByTituloContainingIgnoreCase(titulo: String) : List<PontoDeInteresse> {
        return pontoDeInteresseRepository.findByTituloContainingIgnoreCase(titulo)
    }

    fun save(pontoDeInteresse: PontoDeInteresse) : PontoDeInteresse {
        return pontoDeInteresseRepository.save(pontoDeInteresse)
    }

    fun updateVisitedStatus(id: String) : PontoDeInteresse {
        val pontoDeInteresse = pontoDeInteresseRepository.findById(id).get()
        pontoDeInteresse.visitado = true
        return pontoDeInteresseRepository.save(pontoDeInteresse)
    }

    fun deleteById(id: String) {
        return pontoDeInteresseRepository.deleteById(id)
    }

}