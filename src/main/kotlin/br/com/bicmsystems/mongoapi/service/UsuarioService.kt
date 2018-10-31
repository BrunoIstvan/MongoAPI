package br.com.bicmsystems.mongoapi.service

import br.com.bicmsystems.mongoapi.model.Usuario
import br.com.bicmsystems.mongoapi.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService {

    @Autowired
    lateinit var usuarioRepository: UsuarioRepository

    fun salvar(usuario: Usuario) : Usuario {
        return usuarioRepository.save(usuario)
    }

    //fun buscarPorFirebaseUid(firebaseUid: String) : Usuario {
    //    return usuarioRepository.findByFirebaseUid(firebaseUid)
    //}

    fun buscarPorId(id: String) : Optional<Usuario> {
        return usuarioRepository.findById(id)
    }

    fun entrar(email: String, senha: String) : Usuario {
        return usuarioRepository.findByEmailAndSenha(email, senha)
    }

}