package com.fiap.view;

import java.util.Scanner;

import org.apache.axis2.AxisFault;

import com.fiap.invertario.EstoqueBOStub;
import com.fiap.invertario.EstoqueBOStub.BuscarProduto;
import com.fiap.invertario.EstoqueBOStub.BuscarProdutoResponse;
import com.fiap.invertario.EstoqueBOStub.ProdutoTO;

public class ConsoleView {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		try {
			EstoqueBOStub stub = new EstoqueBOStub();
			
			BuscarProduto valores = new BuscarProduto();
			
			//Valor para o web service
			System.out.println("Digite o código: ");
			valores.setCodProduto(scn.nextInt());
			
			//Chamar web service
			BuscarProdutoResponse resposta = stub.buscarProduto(valores);
			
			//Recuperar os valores
			ProdutoTO produto = resposta.get_return();
			
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("Preço Unit: " + produto.getPrecoUnit());
			System.out.println("Quantidade: " + produto.getQuantidade());
			
	
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		scn.close();	
	}
}
