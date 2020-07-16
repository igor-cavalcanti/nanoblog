package com.programem.formulario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class formularioController {
    @GetMapping("/")
  public String formularioForm(Model model) {
    model.addAttribute("pessoa", new Pessoa());
    return "pessoa";
  }

  @PostMapping("/")
  public String pessoaSubmit(@ModelAttribute Pessoa pessoa) {
    return "resposta";
  }
}