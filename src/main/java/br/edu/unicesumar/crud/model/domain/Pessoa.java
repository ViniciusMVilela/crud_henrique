package br.edu.unicesumar.crud.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ES_PESSOA")
public class Pessoa {
    @Id // indicação de PK
    private Long id;

    private String nome;
    @Column(name = "doc", length = 14) // no bd o nome da coluna será doc, e irá possuir até 14 caracteres
    private String documento;

    public Pessoa(Long id, String nome, String documento) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
    }

    public Pessoa() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
