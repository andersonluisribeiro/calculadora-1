
public class Item {

	public Float quantidade;
	public Produto produto;
	
	public Float valorTotal() {
		Float valorTotal = quantidade * produto.valorUnitario;
		return valorTotal;
	}
	
}
