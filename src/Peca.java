public class Peca {
	private boolean isBlack;
	private String icone;
	
	public Peca(boolean isBlack, String icone) {
		this.isBlack = isBlack;
		this.icone = icone;
	}

	public String getIcone() {
		return this.icone;
	}

	public boolean getIsBlack() {
		return this.isBlack;
	}
}
