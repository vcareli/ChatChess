public class Cavalo extends Peca {
	public Cavalo(boolean isBlack) {
		super(isBlack, "C");
	}

	@Override
	public boolean eMovimentoValido(int origemX, int origemY, int destinoX, int destinoY, Peca[][] tabuleiro) {
		// TODO Auto-generated method stub
		return super.eMovimentoValido(origemX, origemY, destinoX, destinoY, tabuleiro);
	}
}
