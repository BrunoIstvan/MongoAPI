package br.com.bicmsystems.mongoapi.controller

import br.com.bicmsystems.mongoapi.model.PontoDeInteresse
import br.com.bicmsystems.mongoapi.service.PontoInteresseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/pontos-de-interesse")
class PontoDeInteresseController {

    @Autowired
    lateinit var pontoInteresseService: PontoInteresseService

    @PostMapping
    fun save(@RequestBody pontoDeInteresse: PontoDeInteresse) : PontoDeInteresse {
        return pontoInteresseService.save(pontoDeInteresse)
    }

    @PutMapping(value = "/{id}")
    fun updateVisitedStatus(@PathVariable("id") id: String) : PontoDeInteresse {
        return pontoInteresseService.updateVisitedStatus(id)
    }

    @GetMapping
    fun findAll() : List<PontoDeInteresse> {
        return pontoInteresseService.findAll()
    }

    @GetMapping("/find/titulo/{titulo}")
    fun findByTitulo(@PathVariable("titulo") titulo: String) : List<PontoDeInteresse> {
        return pontoInteresseService.findByTitulo(titulo)
    }

    @GetMapping("/find/titulo/contains/{titulo}")
    fun findByTituloContainingIgnoreCase(@PathVariable("titulo") titulo: String) : List<PontoDeInteresse> {
        return pontoInteresseService.findByTituloContainingIgnoreCase(titulo)
    }

    @DeleteMapping(value = "/{id}")
    fun apagaPontoDeInteresse(@PathVariable("id") id: String)  {
        pontoInteresseService.deleteById(id)
    }

}