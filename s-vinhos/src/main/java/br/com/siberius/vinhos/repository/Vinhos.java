package br.com.siberius.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.siberius.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long> {

}
