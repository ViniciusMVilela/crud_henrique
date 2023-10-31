package br.edu.unicesumar.crud.model.repository;

import br.edu.unicesumar.crud.model.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {


    // forma nativa
    @Query(nativeQuery = true, value = " select id from ES_PESSOA " + " where nome like '%:search%' ")
    Long pesquisaNativa(String search);


    // HQL
    // passamos o nome da entidade ao invés da tabela
    @Query(value = " select p.id from Pessoa p " + " where p.nome like '%:search%' ")
    Long pesquisaComHql(String search);

    // SpringData
    Long findByNomeLike(String search);




    Pessoa findByDocumentoEquals(String search);
}