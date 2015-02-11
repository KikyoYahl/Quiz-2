import javax.swing.JOptionPane;


public class JOptionPane1 {

	public static void main(String[] args) {
		
		String username;
		String password;
		
		username = JOptionPane.showInputDialog("Enter the Username: ");
		password = JOptionPane.showInputDialog("Enter the Password: ");
		
		UserAuthentication.authentication(username, password);
	}
}