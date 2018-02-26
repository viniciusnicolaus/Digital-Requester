package br.com.fiap.ws.bo;

import org.apache.catalina.ant.ResourcesTask;

import br.com.fiap.ws.bo.FiapBOStub.CalcularMedia;
import br.com.fiap.ws.bo.FiapBOStub.CalcularMediaResponse;

public class TesteView {

	public static void main(String[] args) throws Exception {
	
	FiapBOStub stub = new FiapBOStub();
	
	// Valores para enviar para o web service
	CalcularMedia parametros = new CalcularMedia();
	parametros.setAm(10);
	parametros.setNac(8);
	parametros.setPs(8);
	
	// Chama o ws e recupera a reposta
	CalcularMediaResponse reposta = stub.calcularMedia(parametros);
		
	float media = reposta.get_return();
	System.out.println("A média : " + media);
	}

}
