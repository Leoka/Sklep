import User.NormalUser;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maja on 04.04.2016.
 */
public class UserTest {
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
