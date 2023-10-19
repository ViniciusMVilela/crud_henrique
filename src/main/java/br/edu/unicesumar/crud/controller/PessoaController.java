package br.edu.unicesumar.crud.controller;

import br.edu.unicesumar.crud.model.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @GetMapping
    public List<Pessoa> all() {
        return mock();
    }

    @GetMapping("/{id}")
    public Pessoa byId(@PathVariable Long id) {
        return mock().stream().filter(pessoa -> pessoa.getId().equals(id)).findFirst().orElse(null);
    }

    @GetMapping("/pesquisa")
    public List<Pessoa> searchBy(@RequestParam("nome") String nome) {
        return mock().stream().filter(pessoa -> pessoa.getNome().toLowerCase().contains(nome.toLowerCase())).collect(Collectors.toList());
    }

    @PostMapping
    public Pessoa create(@RequestBody Pessoa novaPessoa) {
        long idMax = mock().stream().mapToLong(Pessoa::getId).max().orElse(0L);

        return new Pessoa(idMax + 1L, novaPessoa.getNome(), novaPessoa.getDocumento());
    }

    private List<Pessoa> mock() {
        return Arrays.asList(
                new Pessoa(1L, "Roberto", "123"),
                new Pessoa(2L, "Ronaldo", "321"),
                new Pessoa(3L, "Maria", "546"),
                new Pessoa(4L, "Ricardo", "987"),
                new Pessoa(5L, "Ricardo", "789"),
                new Pessoa(6L, "Vilela", "147")
        );
    }
}
