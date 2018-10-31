package br.com.bicmsystems.mongoapi.repository

import br.com.bicmsystems.mongoapi.model.Usuario
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository : MongoRepository<Usuario, String> {

    //fun findByFirebaseUid(firebaseUid: String) : Usuario

    fun findByEmailAndSenha(email: String, senha: String) : Usuario

}