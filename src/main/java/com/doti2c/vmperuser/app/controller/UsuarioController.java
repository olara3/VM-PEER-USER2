package com.doti2c.vmperuser.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doti2c.vmperuser.app.dao.UsuarioDAO;
import com.doti2c.vmperuser.app.model.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;

	@PostMapping("/login")
	public ResponseEntity<Usuario> loginPorEmail(@RequestBody Usuario incompleto) {
		try {
			Usuario logado = dao.findByEmailAndSenha(incompleto.getEmail(), incompleto.getSenha());
			if (logado != null) {
				logado.setSenha("***********");
				return ResponseEntity.ok(logado);
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception ex) {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/usuarios")
	public ResponseEntity<ArrayList<Usuario>> buscarTodos() {
		ArrayList<Usuario> lista = (ArrayList<Usuario>) dao.findAll();
		return ResponseEntity.ok(lista);
	}
}
