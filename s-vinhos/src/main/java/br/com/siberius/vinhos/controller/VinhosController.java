package br.com.siberius.vinhos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.siberius.vinhos.model.TipoVinho;
import br.com.siberius.vinhos.model.Vinho;
import br.com.siberius.vinhos.repository.Vinhos;

@Controller
public class VinhosController {

	@Autowired
	private Vinhos vinhos;
	
	@GetMapping("/vinhos/novo")
	public String novo(Model model){
		model.addAttribute(new Vinho());
		model.addAttribute("tipos", TipoVinho.values());
		return "vinho/cadastro-vinho";
	}
	
	@PostMapping("/vinhos/novo")
	public String salvar(Vinho vinho){
		// salvar no banco de dados ...
		vinhos.save(vinho);
		return "redirect:/vinhos/novo";
	}
	
}
