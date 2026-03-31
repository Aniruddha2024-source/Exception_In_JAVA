import entity.User;
import exception.InvalidEmailException;
import exception.UserAlreadyExistsException;
import exception.WeakPasswordException;
import service.UserService;
import service.impl.UserServiceImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {

            System.out.println("Enter the Email");
            String email = sc.nextLine();
            System.out.println("Enter the Password");
            String password = sc.nextLine();
            User user = new User();
            user.setEmail(email);
            user.setPassword(password);
            UserService userService = new UserServiceImpl();

            try {
                userService.registerUser(user);
                System.out.println("User registered Succesfully");
                break;
            }catch(InvalidEmailException | WeakPasswordException | UserAlreadyExistsException e) {
                System.out.println("Error: " + e.getMessage());
                continue;

            }

        }
        sc.close();

    }
}