package br.com.deveficiente.desafiocasadocodigo.dto

import br.com.deveficiente.desafiocasadocodigo.entity.Autor
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class AutorDTO(

        @field:NotBlank(message = "Nome não pode ser vazio")
        val nome: String,

        @field:NotBlank(message = "Email não pode ser vazio")
        @field:Email(message = "Email tem que ser valido")
        val email: String,

        @field:NotBlank(message = "Descrição não pode ser vazio")
        @field:Size(max = 400, message = "Descrição só ter até 400 caracteres")
        val descricao: String
) {
    fun toEntity(): Autor {
        return Autor(nome, email, descricao)
    }
}