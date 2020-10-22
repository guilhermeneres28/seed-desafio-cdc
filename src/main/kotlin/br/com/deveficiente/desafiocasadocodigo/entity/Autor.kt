package br.com.deveficiente.desafiocasadocodigo.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "TB_AUTOR")
class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val Id: Long? = null

    @Column(name = "TX_NOME")
    var nome: String

    @Column(name = "TX_EMAIL")
    var email: String

    @Column(name = "TX_DESCRICAO")
    var descricao: String

    @Column(name = "DT_DATACRIACAO")
    var criadoEm: LocalDateTime = LocalDateTime.now()

    constructor(nome: String, email: String, descricao: String) {
        this.nome = nome
        this.email = email
        this.descricao = descricao
    }
}
