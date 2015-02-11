import java.util.Scanner;

public class UserAuthentication {
   private static String correctUsername = "Qinghui";
   private static String correctPassword = "Maple0629";
   private static String username;
   private static String password;
   public static Scanner keyboard = new Scanner(System.in);
   public static void main(String[] args) {

	   System.out.println("Enter the username");
       username = keyboard.next();
       System.out.println("Enter the password");
       password = keyboard.next();
   
	   authentication(username, password);
   }

   
   public static boolean authentication(String username, String password){
       //authentication
       boolean status;
       if (username.equals(correctUsername)){
           if (password.equals(correctPassword)){
               status = true;
               System.out.println("Welcome " + correctUsername);
           }else{
               status = false;
               System.out.println("Invalid Password");
           }return status;
       }else{
           status = false;
           System.out.println("Invalid Username!");
       }
       return false;
   }
}
