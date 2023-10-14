import javax.swing.JFrame;

public class RectTester {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setTitle("My Car");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyShapes car;
		car = new MyShapes();
	
	
		frame.add(car);
		frame.setVisible(true);
	}

}
