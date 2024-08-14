package introduction;
/*Store username, password and confirm password from a user and check following requirements:

Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”*/
public class MethodPassUserName {
    public static void main(String[] args) {
        String userName = "User123";
        String password = "pass123";
        String confirmPassword = "pass123";

        checkInput(userName,password,confirmPassword);

    }
    public static void checkInput(String userName, String pass, String confPass) {
        if (userName.isEmpty() || pass.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        }else if(pass.length() < 8){
            System.out.println("Password is too short");
        } else if (pass.equals(userName)) {
            System.out.println("Password cannot contain username");
        } else if (!confPass.equals(pass)) {
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }

    }
}
