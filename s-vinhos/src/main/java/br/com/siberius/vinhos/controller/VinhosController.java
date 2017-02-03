package br.com.siberius.vinhos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.siberius.vinhos.model.TipoVinho;
import br.com.siberius.vinhos.model.Vinho;
import br.com.siberius.vinhos.repository.Vinhos;

@Controller
public class VinhosController {

	@Autowired
	private Vinhos vinhos;
	
	@GetMapping("/vinhos/novo")
	public ModelAndView novo(Vinho vinho){
		ModelAndView  mv = new ModelAndView("vinho/cadastro-vinho");
		mv.addObject("tipos", TipoVinho.values());
		return mv;
	}
	
	@PostMapping("/vinhos/novo")
	public ModelAndView salvar(@Valid Vinho vinho, BindingResult result){
		// salvar no banco de dados ...
		
		if (result.hasErrors()) {
			return novo(vinho);
		}
		
		vinhos.save(vinho);
		return new ModelAndView("redirect:/vinhos/novo");
	}
	
}
