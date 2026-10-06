public class Dama extends Peca {
	public Dama(boolean isBlack) {
		super(isBlack, "D");
	}

	@Override
	public boolean eMovimentoValido(int origemX, int origemY, int destinoX, int destinoY, Peca[][] tabuleiro) {
		// TODO Auto-generated method stub
		return super.eMovimentoValido(origemX, origemY, destinoX, destinoY, tabuleiro);
	}
}
