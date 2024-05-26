package br.com.ifsc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifsc.app.service.InicioService;

@RestController
@RequestMapping("/app")
public class InicioController {
	
	@Autowired
	private InicioService inicioService;
	
	@GetMapping("/start")
	public void start() {
		try {
			inicioService.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
