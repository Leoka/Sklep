package User;

/**
 * Created by Maja on 24.03.2016.
 */
public abstract class User {
    protected String login;
    protected String password;
    protected boolean isLogin = false;

    public boolean isLogin() {
        return isLogin;
    }

    public boolean login(String login, String password) {
        if ((login.equals(this.login)) && (password.equals(this.password))){
            this.isLogin = true;
            System.out.println("Successful login for user: " + login);
            return true;
        } else {
            this.isLogin = false;
            System.out.println("Unsuccessful login. Wrong login or password.");
            return false;
        }
    }

    public boolean changingPassword (String oldPassword, String newPassword){
        if (oldPassword.equals(this.password)){
            if (newPassword.equals(oldPassword)){
                System.out.println("You cannot change your password to the same password.");
                return false;
            } else {
                this.password = newPassword;
                System.out.println("Password has been changed.");
                return true;
            }
        } else {
            System.out.println("Wrong password");
            return false;
        }
    }
}
