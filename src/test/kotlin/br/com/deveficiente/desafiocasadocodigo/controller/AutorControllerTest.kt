package br.com.deveficiente.desafiocasadocodigo.controller

import br.com.deveficiente.desafiocasadocodigo.entity.Autor
import br.com.deveficiente.desafiocasadocodigo.repository.AutorRepository
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
internal class AutorControllerTest{

    @Autowired
    lateinit var mockMvc: MockMvc

    @Autowired
    lateinit var objectMapper: ObjectMapper

    @MockBean
    lateinit var autorRepository: AutorRepository

    @Test
    fun deveCriarUmAutor(){
        val autor = Autor("Guilherme", "guilhermeneresbsb@gmail.com", "Guilherme Dev Java")
        this.mockMvc.perform(post("/api/autores")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(autor)))
                .andExpect(status().is2xxSuccessful)
    }

    @Test
    fun deveRetornarBadRequestQuandoCriarUmAutorComNomeVazio(){
        val autor = Autor("", "guilhermeneresbsb@gmail.com", "Guilherme Dev Java")
        this.mockMvc.perform(post("/api/autores")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(autor)))
                .andExpect(status().is4xxClientError)
    }

    @Test
    fun deveRetornarBadRequestQuandoCriarUmAutorComEmailVazio(){
        val autor = Autor("Guilherme", "", "Guilherme Dev Java")
        this.mockMvc.perform(post("/api/autores")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(autor)))
                .andExpect(status().is4xxClientError)
    }

    @Test
    fun deveRetornarBadRequestQuandoCriarUmAutorComDescricaoVazia(){
        val autor = Autor("Guilherme", "guilhermeneresbsb@gmail.com", "")
        this.mockMvc.perform(post("/api/autores")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(autor)))
                .andExpect(status().is4xxClientError)
    }
}