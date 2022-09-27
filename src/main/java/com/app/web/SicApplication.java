package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.repositorio.ProductoRepositorio;

@SpringBootApplication
public class SicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SicApplication.class, args);
	}
    @Autowired
    private ProductoRepositorio repositorio;
    @Override
    public void run(String... args) throws Exception {
		 
		  
	}
}
