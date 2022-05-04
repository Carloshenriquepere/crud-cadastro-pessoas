package com.carlos.cadastro.crud;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudCadastroPessoasApplication<AppConfig> {

	public CrudCadastroPessoasApplication( AppConfig appConfig){

	}
	public static void main(String[] args) {
		SpringApplication.run(CrudCadastroPessoasApplication.class, args);
		SpringApplication app = new SpringApplication(CrudCadastroPessoasApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
