public class Peao extends Peca {
	public Peao(boolean isBlack) {
		super(isBlack, "P");
	}

	@Override
	public boolean eMovimentoValido(int origemX, int origemY, int destinoX, int destinoY, Peca[][] tabuleiro) {
		// TODO Auto-generated method stub
		int direcao = getIsBlack() ? 1 : -1;
		int linhaInicial = getIsBlack() ? 1 : 6;
		
		//Movimento reto sem captura
		if (origemX == destinoX && tabuleiro[destinoY][destinoX] == null) {
			//1 casa pra frente
			if (destinoY == origemY + direcao)
				return true;	
			
			//2 casas pra frente (com caminho livre)
			if (origemY == linhaInicial 
				&& destinoY == origemY + 2 * direcao 
				&& tabuleiro[origemY + direcao][origemX] == null) {
				return true;
			}
		}

		//Captura na diagonal
		if ((Math.abs(destinoX - origemX) == 1) 
			&& destinoY == origemY + direcao 
			&& tabuleiro[destinoY][destinoX] != null 
			&& tabuleiro[destinoY][destinoX].getIsBlack() != getIsBlack()) {
			return true;
		}


		/*
		if (origemX == destinoX  && 
			tabuleiro[destinoY][destinoX] == null) {
				return true;
		} else if ((Math.abs(destinoX - origemX) == 1 && 
			tabuleiro[destinoY][destinoX] != null) && 
			(tabuleiro[destinoY][destinoX].getIsBlack() != getIsBlack()) && 
			((!getIsBlack() && destinoY == origemY - 1) || 
			(getIsBlack() && destinoY == origemY + 1))) {
				return true;
		}
		if ((!getIsBlack() && destinoY == origemY - 1) || 
			(getIsBlack() && destinoY == origemY + 1)) {
			return true;
		} else if (((!getIsBlack() && origemY == 6 && destinoY == origemY - 2) && 
				tabuleiro[origemY - 1][origemX] == null && 
				tabuleiro[origemY - 2][origemX] == null) || 
				((getIsBlack() && origemY == 1 && destinoY == origemY + 2) && 
				tabuleiro[origemY + 1][origemX] == null && 
				tabuleiro[origemY + 2][origemX] == null)) {
					return true;
		}
		return false;
	}*/

}
