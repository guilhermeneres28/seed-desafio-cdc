package br.com.deveficiente.desafiocasadocodigo.repository

import br.com.deveficiente.desafiocasadocodigo.entity.Autor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AutorRepository : CrudRepository<Autor, Long> {

}
