package br.com.bicmsystems.mongoapi.controller

import br.com.bicmsystems.mongoapi.model.Usuario
import br.com.bicmsystems.mongoapi.service.UsuarioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*", maxAge = 3600)
class UsuarioController {

    @Autowired
    lateinit var usuarioService: UsuarioService

    @PostMapping
    fun salvar(@RequestBody usuario: Usuario) : Usuario {
        return usuarioService.salvar(usuario)
    }

    @GetMapping("/{id}")
    fun obterPorId(@PathVariable("id") id: String) : Optional<Usuario> {
        return usuarioService.buscarPorId(id)
    }

    @PostMapping("/login")
    fun entrar(@RequestBody usuario: Usuario ) : Usuario {
        return usuarioService.entrar(usuario.email, usuario.senha)
    }

    //@GetMapping("/firebase/{id}")
    //fun obterPorFirebaseUid(@PathVariable("id") id: String) : Usuario {
    //    return usuarioService.buscarPorFirebaseUid(id)
    //}

}