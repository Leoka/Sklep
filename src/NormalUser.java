import java.util.List;

/**
 * Created by emajgra on 3/24/2016.
 */
public class NormalUser {

    static int nextId = 1;
    int userID;
    private String login;
    private String password;
    private List<Order> orders;

    public NormalUser(String login, String password) {
        this.userID = nextId;
        nextId++;
        this.login = login;
        this.password = password;
    }

    public boolean login(String login, String password) {
        if ((login.equals(this.login)) && (password.equals(this.password))){
            System.out.println("Successful login for user: " + login);
            return true;
        } else {
            System.out.println("Unsuccessful login. Wrong login or password.");
            return false;
        }
    }
}
