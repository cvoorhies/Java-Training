import javax.swing.JFrame;

public class myaccount {

	/**
	 * Main Class
	 */
	public static void main(String[] args) {
		Account acct1;
		acct1 = new Account("Bank Account 1");
		Account acct2;
		acct2 = new Account("Bank Account 2");
		
		JFrame frame;
		frame = new JFrame();
				
		frame.setSize(300, 400);
		frame.setTitle("My Bank Account");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setVisible(true);
						
		acct1.displayInfo();
		acct2.displayInfo();
		
		acct1.setInfo(55, 5);
		acct2.setInfo(72, 101);
		
		acct1.displayInfo();
		acct2.displayInfo();
		
		acct1.deposit();
		acct2.deposit();
		
		acct1.displayInfo();
		acct2.displayInfo();
		
		acct1.withdraw();
		acct2.withdraw();
		
		acct1.displayInfo();
		acct2.displayInfo();
		
		System.out.println("Account 1 Final Balance is " + acct1.getBalance());
		System.out.println("Account 1 Final Id is " + acct1.getId());
		System.out.println("Account 2 Final Balance is " + acct2.getBalance());
		System.out.println("Account 2 Final Id is " + acct2.getId());
		
		
	}
}
