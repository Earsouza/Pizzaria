package model;

public class Pizza {

	private String sabor;
	private String tamanhoPizza;
	private String valorUnitario;

	public Pizza(String sabor, String tamanhoPizza, String valorUnitario) {
		super();
		this.sabor = sabor;
		this.tamanhoPizza = tamanhoPizza;
		this.valorUnitario = valorUnitario;
	}

	public Pizza() {

	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTamanhoPizza() {
		return tamanhoPizza;
	}

	public void setTamanhoPizza(String tamanhoPizza) {
		this.tamanhoPizza = tamanhoPizza;
	}

	public String getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(String valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
