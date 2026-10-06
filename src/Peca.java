public class Peca {
	private boolean isBlack;
	private String icone;
	
	public Peca(boolean isBlack, String icone) {
		this.isBlack = isBlack;
		this.icone = icone;
	}

	public String getIcone() {
		return this.icone;
	}

	public boolean getIsBlack() {
		return this.isBlack;
	}

	public boolean eMovimentoValido(int origemX, int origemY, int destinoX, int destinoY, Peca[][] tabuleiro) {
		return false;
	}
}
