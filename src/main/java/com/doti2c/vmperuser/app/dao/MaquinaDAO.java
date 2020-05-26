package com.doti2c.vmperuser.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.doti2c.vmperuser.app.model.Maquina;

public interface MaquinaDAO extends CrudRepository<Maquina, Integer> {
	//public Maquina findByNovaMaquina(int qntd_cpu, int qntd_memoria,int qntd_disco,int qntd_banda);
}
