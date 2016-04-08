/**
 * Created by emajgra on 4/5/2016.
 */
public class Admin extends User {

    static final boolean isAdmin = true;
    private boolean isLogin = false;

    public boolean isAdmin() {
        return isAdmin;
    }

    public Admin () {
        this.login = "admin";
        this.password = "admin";
    }
}
