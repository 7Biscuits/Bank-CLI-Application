import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        System.out.println("===================================");
        System.out.println("/n|| Welcome to Bank Application 🏦 ||");
        System.out.println("/n=================================");

        ArrayList<ArrayList<String>> userCredentials = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);

        Options options = new Options();

        options.authOptions();
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        Auth auth = new Auth();

        do {
            switch (choice) {
                case 1:
                    auth.login();
                    break;

                case 2:
                    auth.register(username, password, userCredentials);
                    System.out.println("Account registered succssfully");
                    break;
            }

        } while (choice != 0);
    }
}

class Auth {
    User user = new User();
    void login(String username, String password, ArrayList<ArrayList<String>> userCredentials) {
        System.out.println("Login");
    }

    void register(String username, String password, ArrayList<ArrayList<String>> userCredentials) {
        user.createUser(username, password, userCredentials);
    }
}

class User {
    public void createUser(String username, String password, ArrayList<ArrayList<String>> userCredentials) {
        ArrayList<String> credentials = new ArrayList<>();
        credentials.add(username);
        credentials.add(password);
        userCredentials.add(credentials);
    }
}

class Options {

    public void authOptions() {
        String options[] = {
            "1. Login into your account", 
            "2. Register an account", 
            "0. Exit"
        };
        for (int i=0; i<=options.length; i++) {
            System.out.println(options[i]);
        }
    }

    public void accountOptions() {
        String options[] = {
            "1. Show account details",
            "2. Deposit amount",
            "3. Withdraw amount",
            "4. Delete account",
            "5. Go back",
            "0. Exit"
        };
        for (int i=0; i<=options.length; i++) {
            System.out.println(options[i]);
        }
    }
}
