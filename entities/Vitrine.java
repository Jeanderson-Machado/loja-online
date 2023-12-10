package entities;

import java.util.ArrayList;
import java.util.List;

public class Vitrine {
	List<Item> itens = new ArrayList<>();
	
	public Vitrine(Item item) {
		itens.add(item);
	}
	
	public Vitrine() {

	}
	
	public void setVitrine(Item item) {
		 this.itens.add(item);
	}
	
	public List<Item> getVitrine(){
		return itens;
	}
	
}
