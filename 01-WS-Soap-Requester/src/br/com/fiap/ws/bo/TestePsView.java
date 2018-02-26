package br.com.fiap.ws.bo;

import java.rmi.RemoteException;
import java.util.Scanner;

import br.com.fiap.ws.bo.FiapBOStub.CalcularPs;
import br.com.fiap.ws.bo.FiapBOStub.CalcularPsResponse;

public class TestePsView {

	public static void main(String[] args) throws RemoteException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a média de nac: ");
		float nac = sc.nextFloat();

		System.out.println("Digite a nota do am: ");
		float am = sc.nextFloat();

		FiapBOStub stub = new FiapBOStub();
		
		//Parametros para o ws
		CalcularPs params = new CalcularPs();
		params.setAm(am);
		params.setNac(nac);
		
		CalcularPsResponse reposta = stub.calcularPs(params);
		
		
		System.out.println("Você precisa de: " + reposta.get_return());
		
	}
}
