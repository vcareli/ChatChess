public class Bispo extends Peca {
    public Bispo(boolean isBlack) {
		super(isBlack, "B");
	}

	@Override
	public boolean eMovimentoValido(int origemX, int origemY, int destinoX, int destinoY, Peca[][] tabuleiro) {
		// TODO Auto-generated method stub
		return super.eMovimentoValido(origemX, origemY, destinoX, destinoY, tabuleiro);
	}
}
