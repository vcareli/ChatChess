import javax.swing.JFrame;

public class App {
	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame("Chat Chesssss");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Painel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
