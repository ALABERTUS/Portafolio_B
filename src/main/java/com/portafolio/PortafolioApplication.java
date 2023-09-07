package com.portafolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class PortafolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortafolioApplication.class, args);
}

@getMapping(path = "/")
public List<String>getProyecto() {
	return List.of(
			"https://github.com/ALABERTUS/POKEMON.git",
			"https://github.com/ALABERTUS/API_Characters_Crud.git",
			"https://github.com/ALABERTUS/Lo_tienes_CRUDo.git",
			"https://github.com/ALABERTUS/LO-TIENES-CRUDO.git",
			"https://github.com/AnthonyBrayan/techcycle.git"
	);
}