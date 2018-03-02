package br.com.fiap.view;

import java.util.Scanner;

import org.tempuri.CalcPrecoPrazoWSStub;
import org.tempuri.CalcPrecoPrazoWSStub.CServico;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazo;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazoResponse;

public class ConsoleView {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			CalcPrecoPrazoWSStub stub = new CalcPrecoPrazoWSStub();
			
			CalcPrazo valores = new CalcPrazo();
			
			//Valores para enviar para o web service
			valores.setNCdServico("4014");//SEDEX
			System.out.println("CEP de origem: ");
			valores.setSCepOrigem(sc.next() + sc.nextLine());
			
			System.out.println("CEP de destino: ");
			valores.setSCepDestino(sc.next() + sc.nextLine());
			
			//Chama o web service
			CalcPrazoResponse reposta = stub.calcPrazo(valores);
			
			//Recuperar as informações
			CServico servico = 
					reposta.getCalcPrazoResult().getServicos().getCServico()[0];
			
			System.out.println("Prazo " + servico.getPrazoEntrega());
			System.out.println("Data máxima: " + servico.getDataMaxEntrega());
			
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		sc.close();
		

	}

}
