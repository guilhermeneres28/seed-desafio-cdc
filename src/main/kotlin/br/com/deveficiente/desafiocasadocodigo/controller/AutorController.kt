package br.com.deveficiente.desafiocasadocodigo.controller

import br.com.deveficiente.desafiocasadocodigo.dto.AutorDTO
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/autores")
class AutorController {

    private val log = LoggerFactory.getLogger(AutorController::class.java);

    @PostMapping
    fun salvar(@RequestBody @Valid autorDTO: AutorDTO) {
        log.info("Cadastrando autor: $autorDTO")
    }
}