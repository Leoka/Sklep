import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by emajgra on 4/7/2016.
 */
public class UsersTest {

    @Test()
    public void userLoginTest() {
        System.out.println("Normal user login:");
        NormalUser user = new NormalUser("user","pass");
        Assert.assertFalse(user.login("user1","pass"));
        Assert.assertFalse(user.isLogin());
        Assert.assertFalse(user.login("user","pass1"));
        Assert.assertFalse(user.isLogin());
        Assert.assertFalse(user.login("user1","pass1"));
        Assert.assertFalse(user.isLogin());
        Assert.assertTrue(user.login("user","pass"));
        Assert.assertTrue(user.isLogin());
        System.out.println("_________________________________");
    }

    @Test()
    public void changingPasswordTest(){
        System.out.println("Normal user changing password");
        NormalUser user = new NormalUser("user","pass");
        Assert.assertFalse(user.changingPassword("pass","pass"));
        Assert.assertFalse(user.changingPassword("pass1","pass2"));
        Assert.assertFalse(user.login("user","pass2"));
        Assert.assertTrue(user.changingPassword("pass","pass2"));
        Assert.assertTrue(user.login("user","pass2"));
        System.out.println("_________________________________");
    }

    @Test()
    public void adminLoginTest() {
        System.out.println("Admin login:");
        Admin admin = new Admin();
        Assert.assertFalse(admin.login("admin1","admin"));
        Assert.assertFalse(admin.isLogin());
        Assert.assertFalse(admin.login("admin","admin1"));
        Assert.assertFalse(admin.isLogin());
        Assert.assertTrue(admin.login("admin","admin"));
        Assert.assertTrue(admin.isLogin());
        System.out.println("_________________________________");
    }

    @Test()
    public void changingPasswordForAdminTest() {
        System.out.println("Admin changing password:");
        Admin admin = new Admin();
        Assert.assertFalse(admin.changingPassword("admin","admin"));
        Assert.assertFalse(admin.changingPassword("pass","pass"));
        Assert.assertFalse(admin.login("admin","pass"));
        Assert.assertTrue(admin.changingPassword("admin","pass"));
        Assert.assertTrue(admin.login("admin","pass"));
    }

    @Test()
    public void accessTest() {
        System.out.println("Access test for admin:");
        Admin admin = new Admin();
        NormalUser user = new NormalUser("user","pass");
        Assert.assertTrue(admin.isAdmin());
        Assert.assertFalse(user.isAdmin());
    }
}
