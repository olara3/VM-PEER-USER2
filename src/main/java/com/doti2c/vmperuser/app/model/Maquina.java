package com.doti2c.vmperuser.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity                     
@Table(name = "tbl_maquina") 
public class Maquina {
	
	                                 
	@Id                                               
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int    id;
	
	@Column(name = "qntd_cpu")
	private int		qntd_cpu;
	
	@Column(name = "qntd_memoria")
	private int		qntd_memoria;
	
	@Column(name = "qntd_disco")
	private int		qntd_disco;
	
	@Column(name = "qntd_banda")
	private int		qntd_banda;
	
	@Column(name = "valorTotal")
	private float	valorTotal;
	
	/*@Column(name = "valorHora_cpu")
	private float	valorHora_cpu;
	
	@Column(name = "valorHora_memoria")
	private float	valorHora_memoria;
	
	@Column(name = "valorHora_discos")
	private float	valorHora_disco;
	
	@Column(name = "valorHora_banda")
	private float	valorHora_banda;*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQntd_cpu() {
		return qntd_cpu;
	}

	public void setQntd_cpu(int qntd_cpu) {
		this.qntd_cpu = qntd_cpu;
	}

	public int getQntd_memoria() {
		return qntd_memoria;
	}

	public void setQntd_memoria(int qntd_memoria) {
		this.qntd_memoria = qntd_memoria;
	}

	public int getQntd_disco() {
		return qntd_disco;
	}

	public void setQntd_disco(int qntd_disco) {
		this.qntd_disco = qntd_disco;
	}

	public int getQntd_banda() {
		return qntd_banda;
	}

	public void setQntd_banda(int qntd_banda) {
		this.qntd_banda = qntd_banda;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
}
