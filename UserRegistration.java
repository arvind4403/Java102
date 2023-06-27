import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class users {
    private String Name;
    private String Email;
    private String Password;
    private String Address;

    public users(String Name, String Email, String Password, String Address){
        this.Name=Name;
        this.Email=Email;
        this.Password=Password;
        this.Address=Address;

    }
    public String getName(){
        return Name;
    }
    public String getEmail(){
        return Email;
    }
    public String getPassword(){
        return Password;
    }
    public String getAddress(){
        return Address;
    }
}
class UserRepository{
    private List users;

    public UserRepository(){
        users =new ArrayList<>();
    }
    public void registerUser(users user){
        users.add(String.valueOf(user));
    }
    public boolean isEmailTaken(String Email){
        for (users user:users){
            if(user.getEmail().equalsIgnoreCase(Email)){
                return true;
            }
        }
        return false;
    }
}
public class UserRegistration{
    public static void main(String[] args){
        UserRepository userRepository=new UserRepository();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String Name=scanner.nextLine();

        System.out.println("Enter Your Email: ");
        String Email=scanner.nextLine();

        System.out.println("Enter your Password: ");
        String Password=scanner.nextLine();

        System.out.println("Enter your Address: ");
        String Address=scanner.nextLine();

        if(Name.isEmpty() || Email.isEmpty() || Password.isEmpty() || Address.isEmpty()){
            System.out.println("All field are required ");
        } else if (userRepository.isEmailTaken(Email)) {
            System.out.println("Email address is already registered. Please try again with a different email");
        } else if (!isValidEmail(Email)) {
            System.out.println("Email is Invalid, please try is again");
        }else {
            users user = new users(Name, Email, Password, Address);
            userRepository.registerUser(user);

            System.out.println("User registration successful");
        }
        scanner.close();

    }
    private static boolean isValidEmail(String Email){
        String EmailRegex="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(EmailRegex);
        Matcher matcher = pattern.matcher(Email);
        return matcher.matches();
    }

}

