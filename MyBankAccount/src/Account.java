import javax.swing.*;

public class Account {

	private int id;
	private int balance;
	String title;
	
	public Account(String input){
		id = 0;
		balance = 0;
		title = input;
	};
	
	public void deposit(){
		int d;
		String ind;
		ind = JOptionPane.showInputDialog(null, "Enter Deposit amount : ", title, JOptionPane.QUESTION_MESSAGE);
		d = Integer.parseInt(ind);
		balance = balance + d;
		
	};
	
	public void withdraw(){
		int w;
		String ind;
		ind = JOptionPane.showInputDialog(null, "Enter Withdraw amount : ", title, JOptionPane.QUESTION_MESSAGE);
		w = Integer.parseInt(ind);
		balance = balance - w;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public int getId(){
		return id;
	}
	
	public void setInfo(int b, int i){
		balance = b;
		id = i;
	}
	
	public void displayInfo(){
		String display;
		
		display = String.format("The New Balance is : %d. The account Id is : %d", balance, id);
		JOptionPane.showMessageDialog(null, display, title, JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}

