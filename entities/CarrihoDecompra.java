package entities;

import java.util.ArrayList;
import java.util.List;

public class CarrihoDecompra {
	List<ItemDoCarrinho> itemDoCarrinho = new ArrayList<>();
	
	public CarrihoDecompra() {
		
	}
	
	public List<ItemDoCarrinho> getCarrinhoDeCompra(){
		return itemDoCarrinho;
	}
	
	public void setCarrinhoDeCompra(ItemDoCarrinho item) {
		itemDoCarrinho.add(item);
	}
	
	@Override
	public String toString() {
		return itemDoCarrinho.toString();
	}
	
	public double valorTotal() {
		double valorTotal1 = 0.0;
		for(int i=0; i<itemDoCarrinho.size(); i++) {
			valorTotal1 = valorTotal1 + itemDoCarrinho.get(i).getItemDoCarrinho().valor;
	}
		return valorTotal1;
}
}