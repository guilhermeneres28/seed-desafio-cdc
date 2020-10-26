package br.com.deveficiente.desafiocasadocodigo.controller

import br.com.deveficiente.desafiocasadocodigo.dto.AutorDTO
import br.com.deveficiente.desafiocasadocodigo.entity.Autor
import br.com.deveficiente.desafiocasadocodigo.repository.AutorRepository
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/autores")
class AutorController(val autorRepository: AutorRepository) {

    private val log = LoggerFactory.getLogger(AutorController::class.java)

    @PostMapping
    fun salvar(@RequestBody @Valid autorDTO: AutorDTO): Autor {
        log.info("Salvando Autor: $autorDTO")
        return autorRepository.save(autorDTO.toEntity())
    }
}