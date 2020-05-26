package com.doti2c.vmperuser.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doti2c.vmperuser.app.dao.MaquinaDAO;
import com.doti2c.vmperuser.app.model.Maquina;

/*
 * Valor 1x CPU por hora R$10
 * Valor 1x GBMemoria por hora R$5
 * Valor 1x 1GBDisco por hora R$1
 * Valor 1x MB por hora R$1
 */

@RestController
@CrossOrigin("*")
public class MaquinaController {

	@Autowired
	MaquinaDAO mdao;
	
	@PostMapping("/maquina/nova")
	public ResponseEntity<Maquina> adicionarMaquina(@RequestBody Maquina nova){
		try {
			float i;
			i = (nova.getQntd_cpu() * 10) + (nova.getQntd_memoria() * 5) + nova.getQntd_disco() + nova.getQntd_banda();
			nova.setValorTotal(i);
			mdao.save(nova);
			return ResponseEntity.ok(nova);
		}
		catch (Exception ex) {
			return ResponseEntity.status(500).build();
		}
		
	}
	
	
	@GetMapping("/maquinas")
	public ResponseEntity<ArrayList<Maquina>> buscarTodos() {
		ArrayList<Maquina> lista = (ArrayList<Maquina>) mdao.findAll();
		return ResponseEntity.ok(lista);
	}
	
}
