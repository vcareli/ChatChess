public class Torre extends Peca{
	public Torre(boolean isBlack) {
		super(isBlack, "T");
	}

	@Override
	public boolean eMovimentoValido(int origemX, int origemY, int destinoX, int destinoY, Peca[][] tabuleiro) {
		// TODO Auto-generated method stub
		return super.eMovimentoValido(origemX, origemY, destinoX, destinoY, tabuleiro);
	}
}
