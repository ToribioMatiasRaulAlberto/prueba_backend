package com.prueba.practica.modelo;

public class Documento {
	private char id;
	private long numeroDocumento;
	public Documento() {}
	public Documento(char id, long numeroDocumento) {
		super();
		this.id = id;
		this.numeroDocumento = numeroDocumento;
	}
	public char getId() {
		return id;
	}
	public void setId(char id) {
		this.id = id;
	}
	public long getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	
}
