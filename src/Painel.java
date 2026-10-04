import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Painel extends JPanel {
	private final int LARG_CASA = 80;
	private final int LADO_TELA = 8 * LARG_CASA;

	Peca[][] tabuleiro = new Peca[8][8];

	public Painel() {
		this.setPreferredSize(new Dimension(LADO_TELA, LADO_TELA));		//Dimensoes do tabuleiro
		tabuleiro = new Peca[8][8];
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				// ===== PEÇAS PRETAS =====
				// Linha 0 → peças maiores (true = preta)
				if (i == 0) {
					if (j == 0 || j == 7)
						tabuleiro[i][j] = new Peca(true, "T");	// Tour
					else if (j == 1 || j == 6)
						tabuleiro[i][j] = new Peca(true, "C");	// Cavalier
					else if (j == 2 || j == 5)
						tabuleiro[i][j] = new Peca(true, "F");	// Fou (Bispo)
					else if (j == 3)
						tabuleiro[i][j] = new Peca(true, "D");	// Dama/Reigne
					else if (j == 4)
						tabuleiro[i][j] = new Peca(true, "R");	// Roi
					} else if (i == 1) {										// Peao
						tabuleiro[i][j] = new Peca(true, "P");
					}
					// ===== PEÇAS BRANCAS =====
					// Linha 6 → peões brancos
					else if (i == 6) {
						tabuleiro[i][j] = new Peca(false, "P");
					}	// Linha 7 → peças maiores (false = branca)
					else if (i == 7) {
						if (j == 0 || j == 7)
							tabuleiro[i][j] = new Peca(false, "T");
						else if (j == 1 || j == 6)
							tabuleiro[i][j] = new Peca(false, "C");
						else if (j == 2 || j == 5)
							tabuleiro[i][j] = new Peca(false, "F");
						else if (j == 3)
							tabuleiro[i][j] = new Peca(false, "D");
						else if (j == 4)
								tabuleiro[i][j] = new Peca(false, "R");
					}
			}
		}
	}

	@Override
	protected void paintComponent(Graphics g) {				//Desenho to tabuleiro
		// TODO Auto-generated method stub
		super.paintComponent(g);
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				Peca peca = tabuleiro[i][j];
				if ((i + j) %2 != 0) {
					g.setColor(Color.BLACK);
					g.fillRect(j * LARG_CASA, i * LARG_CASA, LARG_CASA, LARG_CASA);
				} else {
					g.setColor(Color.WHITE);
					g.fillRect(j * LARG_CASA, i * LARG_CASA, LARG_CASA, LARG_CASA);
				}
				if (peca != null) {
					if (peca.getIsBlack()) {
						g.setColor(Color.RED);
					} else {
						g.setColor(Color.GRAY);
					}
					g.drawString(peca.getIcone(), j * LARG_CASA + 35, i * LARG_CASA + 45);
				}
			}
		}
	}
}
