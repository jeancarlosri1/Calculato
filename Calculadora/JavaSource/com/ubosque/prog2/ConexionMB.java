package com.ubosque.prog2;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "loginMB")
public class ConexionMB {

	public float numero1;
	public float numero2;
	public float resultado;

	
	public float suma() {
		resultado= numero1 + numero2;
		return resultado;
	}
	
	public float resta() {
		resultado= numero1 - numero2;
		return resultado;
	}
	
	public float multiplicacion() {
		resultado= numero1 * numero2;
		return resultado;
	}
	
	public float division() {
		resultado= numero1 / numero2;
			return resultado;
	}

	public float getNumero1() {
		return numero1;
	}

	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}

	public float getNumero2() {
		return numero2;
	}

	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}


}
