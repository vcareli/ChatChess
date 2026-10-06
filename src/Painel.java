import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.event.*;

public class Painel extends JPanel implements MouseListener {
	private final int LARG_CASA = 80;
	private final int LADO_TELA = 8 * LARG_CASA;

	Peca[][] tabuleiro = new Peca[8][8];
	Peca pecaSelecionada = null;
	boolean turnoWhite = true;
	int origemX;
	int origemY;
	int score;


	public Painel() {
		this.setPreferredSize(new Dimension(LADO_TELA, LADO_TELA));		//Dimensoes do tabuleiro
		addMouseListener(this);											//Adiciona o mouse para ser "escutado"
		score = 0;
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				// ===== PEÇAS PRETAS =====
				// Linha 0 → peças maiores (true = preta)
				if (i == 0) {
					if (j == 0 || j == 7)
						tabuleiro[i][j] = new Torre(true);	// Tour
					else if (j == 1 || j == 6)
						tabuleiro[i][j] = new Cavalo(true);	// Cavalier
					else if (j == 2 || j == 5)
						tabuleiro[i][j] = new Bispo(true);	// Fou (Bispo)
					else if (j == 3)
						tabuleiro[i][j] = new Dama(true);	// Dama/Reigne
					else if (j == 4)
						tabuleiro[i][j] = new Rei(true);	// Roi
					} else if (i == 1) {
						tabuleiro[i][j] = new Peao(true);	// Peao
					}
					// ===== PEÇAS BRANCAS =====
					// Linha 6 → peões brancos
					else if (i == 6) {
						tabuleiro[i][j] = new Peao(false);
					}	// Linha 7 → peças maiores (false = branca)
					else if (i == 7) {
						if (j == 0 || j == 7)
							tabuleiro[i][j] = new Torre(false);
						else if (j == 1 || j == 6)
							tabuleiro[i][j] = new Cavalo(false);
						else if (j == 2 || j == 5)
							tabuleiro[i][j] = new Bispo(false);
						else if (j == 3)
							tabuleiro[i][j] = new Dama(false);
						else if (j == 4)
								tabuleiro[i][j] = new Rei(false);
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
		Graphics2D g2d = (Graphics2D) g;
		if (pecaSelecionada != null) {
			g2d.setColor(Color.YELLOW);
			g2d.setStroke(new BasicStroke(5));
			g2d.drawRect(
				origemX * LARG_CASA,
				origemY * LARG_CASA,
				LARG_CASA,
				LARG_CASA);
			//g.drawRect(origemY * LARG_CASA, origemX * LARG_CASA, LARG_CASA, LARG_CASA);
		}
	}

	public void mouseClicked(MouseEvent e) {
		int clickX = e.getX() / LARG_CASA;
		int clickY = e.getY() / LARG_CASA;
		if (pecaSelecionada == null) {
			if (tabuleiro[clickY][clickX] != null) {
				//Selecao e Movimento da peca
				origemX = clickX;
				origemY = clickY;
				pecaSelecionada = tabuleiro[origemY][origemX];
				if (pecaSelecionada.getIsBlack() == turnoWhite)
					pecaSelecionada = null;
				repaint();
			}
		} else if (pecaSelecionada != null) {
			if (tabuleiro[clickY][clickX] != null && 
				(tabuleiro[clickY][clickX].getIsBlack() == pecaSelecionada.getIsBlack())) {
				//Pecas da mesma cor - Mov. Invalido - Seleciona outra peça
				origemX = clickX;
				origemY = clickY;
				pecaSelecionada = tabuleiro[origemY][origemX];
				repaint();
			} else {
				turnoWhite = !turnoWhite;
				//Captura peca do inimigo ou em espaco vazio
				if (tabuleiro[clickY][clickX] != null)		//Captura e aumenta score
					score += 10;
				tabuleiro[clickY][clickX] = pecaSelecionada;
				tabuleiro[origemY][origemX] = null;
				pecaSelecionada = null;
			}
			repaint();
		}
	}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}
}
