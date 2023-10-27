package br.edu.unicesumar.crud.exceptions;

public class PessoaException extends Exception{

    public PessoaException() {
        super("O id não foi encontrado");
    }
}
