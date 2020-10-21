package br.com.deveficiente.desafiocasadocodigo.dto

import javax.validation.constraints.Email
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class AutorDTO(

        @field:NotNull(message = "Nome não pode ser nulo")
        val nome: String?,

        @field:NotNull(message = "Email não pode ser nulo")
        @field:Email(message = "Email tem que ser valido")
        val email: String?,

        @field:NotNull(message = "Descrição não pode ser nula")
        @field:Size(max = 400, message = "Descrição só ter até 400 caracteres")
        val descricao: String?
)