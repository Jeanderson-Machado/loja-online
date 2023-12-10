package aplication;

import java.util.Scanner;

import entities.CarrihoDecompra;
import entities.Item;
import entities.ItemDoCarrinho;
import entities.Vitrine;

public class Loja {
	public static void main(String[] args) {
		int escolha;
		Vitrine vitrine = new Vitrine();
		CarrihoDecompra carrinhoDeCompra = new CarrihoDecompra();
		ItemDoCarrinho itemDoCarrinho;
		Scanner sc = new Scanner(System.in);

		
		do {
			System.out.println("Digite o numero do que deseja fazer");			
			System.out.println("1-Ver vitrine");
			System.out.println("2-Ver carrinho de compra");
			System.out.println("3-Comprar item");
			System.out.println("4-Entrar como administrador");
			System.out.println("5 sair");
			escolha = sc.nextInt();
			
			if(escolha == 1) {
				
				for(int i=0; i<vitrine.getVitrine().size(); i++) {
					System.out.println(
							"Nome:" + vitrine.getVitrine().get(i).nome + " "
									+"Valor:R$" + vitrine.getVitrine().get(i).valor + " "
									+ "Codigo:" + vitrine.getVitrine().get(i).codigoDoItem
									
							);
				}
				
				System.out.println("Favor informe o codigo e a quantidade dos produtos que deseja");
				int codigoDoCliente = sc.nextInt();
				int quantidadeDoCliente = sc.nextInt();
				
				for(int i=0; i<vitrine.getVitrine().size(); i++) {
					int codigo = vitrine.getVitrine().get(i).codigoDoItem;
					
					if(codigo == codigoDoCliente) {
						
						String nome1 = vitrine.getVitrine().get(i).nome;
						double valor1 = vitrine.getVitrine().get(i).valor;
						int codigo1 = vitrine.getVitrine().get(i).codigoDoItem;
						
						itemDoCarrinho = new ItemDoCarrinho(quantidadeDoCliente, new Item(nome1, valor1, codigo1));
						
						carrinhoDeCompra.setCarrinhoDeCompra(itemDoCarrinho);
					}
				}
				
				
			}else if(escolha == 2) {
				
				for(int i=0; i<carrinhoDeCompra.getCarrinhoDeCompra().size(); i++) {
					System.out.println(
							"Nome:" + carrinhoDeCompra.getCarrinhoDeCompra().get(i).getItemDoCarrinho().nome
							+ " " + "Valor:R$" + carrinhoDeCompra.getCarrinhoDeCompra().get(i).getItemDoCarrinho().valor
							+ " " + "Codigo do item:" + carrinhoDeCompra.getCarrinhoDeCompra().get(i).getItemDoCarrinho().codigoDoItem
							+ " " + "Quantidade:" + carrinhoDeCompra.getCarrinhoDeCompra().get(i).getQuantidadeDoCarrinho()
							
							);
				}
				
			}else if(escolha == 3){
				
				System.out.println("Total da sua compra e: " + carrinhoDeCompra.valorTotal());
				System.out.println("Como deseja pagar?");
				System.out.println("No cartao em ate 12 vezes de: " + carrinhoDeCompra.valorTotal()/12);
				System.out.println("Ou a vista com 10% de desconto: " + (carrinhoDeCompra.valorTotal()-(carrinhoDeCompra.valorTotal() * 0.1)));
				
				
			}else if(escolha == 4){
				System.out.println("Digite o numero do que deseja fazer");			
				System.out.println("1-Adicionar item");
				System.out.println("2-Remover item");
				System.out.println("3-Atualizar item");
				int escolha4 = sc.nextInt();
				
				if(escolha4 == 1) {
					for(int i = 0; i < 2; i++) {
						System.out.print("Nome");
						String nome = sc.next();
						System.out.print("Valor");
						double valor = sc.nextDouble();
						System.out.print("codigo");
						int codigo = sc.nextInt();
						vitrine.setVitrine(new Item(nome, valor, codigo));
					}	
				}else if(escolha4 == 2) {
					System.out.println("Insira o codigo do item que quer remover");
					int itemASerRemovido = sc.nextInt();
					
					for(int i=0; i<vitrine.getVitrine().size(); i++) {
						if(itemASerRemovido == vitrine.getVitrine().get(i).codigoDoItem) {
							vitrine.getVitrine().remove(i);
						}
					}
					
				}else if(escolha4 == 3) {
					System.out.println("Insira o codigo do item que deseja editar o valor");
					int itemASerRemovido = sc.nextInt();
					
					for(int i=0; i<vitrine.getVitrine().size(); i++) {
						if(itemASerRemovido == vitrine.getVitrine().get(i).codigoDoItem) {
							System.out.println("Insira o novo valor");
							double novoValor = sc.nextDouble();
							vitrine.getVitrine().get(i).valor = novoValor;
							System.out.println("Novo valor Adicionado");
						}
					}
					
				}else {
					System.out.println("Valor invalido");
				}
				
			}else {
				System.out.println("Volte Sempre :)");
			}
			
		}while(escolha != 5);
		
		sc.close();
	}
}
