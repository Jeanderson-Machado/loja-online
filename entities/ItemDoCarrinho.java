package entities;

public class ItemDoCarrinho {
	Item item;
	int quantidade;
	
	public ItemDoCarrinho(int quantidade, Item item) {
		this.quantidade = quantidade;
		this.item = item;
	}
	
	public Item getItemDoCarrinho() {
		return item;
	}
	
	public int getQuantidadeDoCarrinho() {
		return quantidade;
	}
}
