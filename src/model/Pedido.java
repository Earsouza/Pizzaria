package model;

public class Pedido {

	private Double valorTotal;
	private String descricao;
	private String status;
	private String formaPagamento;

	public Pedido(Double valorTotal, String descricao, String status, String formaPagamento) {
		super();
		this.valorTotal = valorTotal;
		this.descricao = descricao;
		this.status = status;
		this.formaPagamento = formaPagamento;
	}

	Pedido() {

	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
