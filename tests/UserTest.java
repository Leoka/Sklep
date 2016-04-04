import User.NormalUser;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Maja on 04.04.2016.
 */
public class UserTest {
    @Test
    public void userLoginTest() {
        System.out.println("Login function");
        System.out.println("Trying to put wrong username");
        NormalUser user = new NormalUser("user","pass");
        boolean isLogIn = user.login("user1","pass");
        Assert.assertEquals(false,isLogIn,"OK");
        Assert.assertEquals(false,user.isLogin(),"Access not granted.");
        isLogIn = user.login("user1","pass");
        Assert.assertEquals(false,isLogIn,"Wrong password");
        Assert.assertEquals(false,user.isLogin(),"Access not granted.");
        isLogIn = user.login("user","pass");
        Assert.assertEquals(true,isLogIn,"Correct login and password");
        Assert.assertEquals(true,user.isLogin(),"Access granted.");
    }

}
