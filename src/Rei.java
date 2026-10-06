public class Rei extends Peca {
	public Rei(boolean isBlack) {
		super(isBlack, "R");
	}

	@Override
	public boolean eMovimentoValido(int origemX, int origemY, int destinoX, int destinoY, Peca[][] tabuleiro) {
		// TODO Auto-generated method stub
		return super.eMovimentoValido(origemX, origemY, destinoX, destinoY, tabuleiro);
	}
}
