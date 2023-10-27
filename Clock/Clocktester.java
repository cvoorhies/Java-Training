
public class ClockTester {

	public static void main(string[] args) {

		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("My Clock");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		clock myclock = new clock();

		frame.add(myclock);

	}
}