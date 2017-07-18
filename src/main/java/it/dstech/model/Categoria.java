package it.dstech.model;

public enum Categoria {

	ALIMENTI(4), BENI(22), FARMACI(10);

	private int iva;

	private Categoria(int iva) {
		this.iva = iva;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

}
