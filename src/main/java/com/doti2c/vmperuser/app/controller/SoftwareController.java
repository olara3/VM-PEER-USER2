package com.doti2c.vmperuser.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doti2c.vmperuser.app.dao.SoftwareDAO;
import com.doti2c.vmperuser.app.model.Software;


@RestController
@CrossOrigin("*")
public class SoftwareController {
	
	@Autowired
	SoftwareDAO swdao;
	
	@PostMapping("/software/novo")
	public ResponseEntity<Software> adicionarSoftware(@RequestBody Software novo){
		return ResponseEntity.ok(novo);
		
	}
	
	@GetMapping("/softwares")
	public ResponseEntity<ArrayList<Software>> buscarTodos() {
		ArrayList<Software> lista = (ArrayList<Software>) swdao.findAll();
		return ResponseEntity.ok(lista);
	}
	
}
