package br.com.deveficiente.desafiocasadocodigo.controller

import br.com.deveficiente.desafiocasadocodigo.dto.AutorDTO
import br.com.deveficiente.desafiocasadocodigo.entity.Autor
import br.com.deveficiente.desafiocasadocodigo.repository.AutorRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.AdditionalAnswers.returnsFirstArg
import org.mockito.ArgumentMatchers.any
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.web.bind.MethodArgumentNotValidException

@ExtendWith(MockitoExtension::class)
internal class AutorControllerTest{

    @Mock
    lateinit var autorRepository: AutorRepository

    lateinit var autorController: AutorController

    @BeforeEach
    fun initAutorController() {
        autorController = AutorController(autorRepository)
    }

    @Test
    fun `Deve criar autor e retornar objeto com data de criação preenchida`() {
        val autorDTO = AutorDTO("Guilherme", "guilhermeneresbsb@gmail.com", "Guilherme Dev Java")
        `when`(autorRepository.save(any(Autor::class.java))).then(returnsFirstArg<Autor>())
        val autorSalvo = autorController.salvar(autorDTO)
        assertThat(autorSalvo.criadoEm).isNotNull()
    }
}