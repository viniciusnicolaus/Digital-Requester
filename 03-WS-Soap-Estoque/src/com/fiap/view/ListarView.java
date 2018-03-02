package com.fiap.view;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import com.fiap.invertario.EstoqueBOStub;
import com.fiap.invertario.EstoqueBOStub.Listar;
import com.fiap.invertario.EstoqueBOStub.ListarResponse;
import com.fiap.invertario.EstoqueBOStub.ProdutoTO;

public class ListarView {

	public static void main(String[] args) throws RemoteException {
		//Listar todos os produtos do web service

		try{
			EstoqueBOStub stub = new EstoqueBOStub();
			Listar listar = new Listar();
			
			//Chamar a web service
			ListarResponse response = stub.listar(listar);
			//Recuperar os valores
			ProdutoTO[] vetor = response.get_return();
			//Transforma o array em lista
			List<ProdutoTO> lista = Arrays.asList(vetor);
			for(ProdutoTO produtoTO : lista) {
				System.out.println("Código: " + produtoTO.getCodigo());
				System.out.println("Descrição: " + produtoTO.getDescricao());
				System.out.println("Quantidade: " + produtoTO.getQuantidade());
				System.out.println("Preço Unit: " + produtoTO.getPrecoUnit());
			}
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
