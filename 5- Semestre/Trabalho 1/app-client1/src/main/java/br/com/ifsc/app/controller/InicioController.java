package br.com.ifsc.app.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifsc.app.service.InicioService;

@RestController
@RequestMapping("/client1")
public class InicioController {

	@Autowired
	private InicioService inicioService;

	@GetMapping("/start")
	public List<List<BigDecimal>> start(@RequestHeader("valores") String valores) {
		String[] array = valores.substring(1, valores.length() - 1).split(",");

		List<BigDecimal> list = new ArrayList<>(array.length);
		for (String numero : array) {
			list.add(new BigDecimal(numero.replaceAll(" ", "")));
		}
		return inicioService.start(list);
	}
}
