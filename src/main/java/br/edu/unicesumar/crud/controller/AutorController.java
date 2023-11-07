package br.edu.unicesumar.crud.controller;

import br.edu.unicesumar.crud.model.domain.Autor;
import br.edu.unicesumar.crud.model.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    // agora que trabalhamos com a view faremos de forma diferente
    @GetMapping
    public ModelAndView all() {
       List<Autor> autores =  autorRepository.findAll();

        ModelAndView view = new ModelAndView("autor");
        view.addObject("autores", autorRepository.findAll());
        return view;
    }
}
