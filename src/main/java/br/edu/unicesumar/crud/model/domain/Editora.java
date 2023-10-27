package br.edu.unicesumar.crud.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ES_EDITORA")
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nome;

    @Column(name = "ano_fundacao", length = 4)
    private Integer ano;

    public Editora() {
    }

    public Editora(Long id, String nome, Integer ano) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
    }
}
