public class Peao extends Peca {
	public Peao(boolean isBlack) {
		super(isBlack, "P");
	}

	@Override
	public boolean eMovimentoValido(int origemX, int origemY, int destinoX, int destinoY, Peca[][] tabuleiro) {
		// TODO Auto-generated method stub
		if (origemX != destinoX && tabuleiro[destinoY][destinoX] != null) {return false;}
		if ((!getIsBlack() && destinoY == origemY - 1) ||
			(getIsBlack() && destinoY == origemY + 1)) {
			return true;
		} else if ((!getIsBlack() && origemY == 6 && destinoY == origemY - 2) 
				&& origemY - 1 == null ||
				(getIsBlack() && origemY == 1 && destinoY == origemY + 2)
				&& origemY + 1 == null) {
					return true;
		}
		return false;
	}
}
