import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Painel extends JPanel {
	private final int LARG_CASA = 80;
	private final int LADO_TELA = 8 * LARG_CASA;

	Pecas[][] tabuleiro = new Pecas[8][8];

	public Painel() {
		this.setPreferredSize(new Dimension(LADO_TELA, LADO_TELA));		//Dimensoes do tabuleiro
		tabuleiro = new Pecas[8][8];
		for (int j = 0; j < tabuleiro[1].length; j++) {
			tabuleiro[1][j] = new Pecas(true, "P");
			tabuleiro[6][j] = new Pecas(false, "P");
		}
	}

	@Override
	protected void paintComponent(Graphics g) {				//Desenho to tabuleiro
		// TODO Auto-generated method stub
		super.paintComponent(g);
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if ((i+j) %2 != 0) {
					g.setColor(Color.BLACK);
					g.fillRect(i * LARG_CASA, j * LARG_CASA, LARG_CASA, LARG_CASA);
				} else {
					g.setColor(Color.WHITE);
					g.fillRect(i * LARG_CASA, j * LARG_CASA, LARG_CASA, LARG_CASA);
				}
			}
		}
	}
}
