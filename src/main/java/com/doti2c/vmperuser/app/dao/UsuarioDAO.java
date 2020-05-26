package com.doti2c.vmperuser.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.doti2c.vmperuser.app.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	public Usuario findByEmailAndSenha(String email, String senha);
	public Usuario findByRacfAndSenha(String racf, String senha);
}
