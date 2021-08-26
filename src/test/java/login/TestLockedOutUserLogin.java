package login;

import base.BaseTest;
import com.saucedemo.page.ProductsPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLockedOutUserLogin extends BaseTest {

    @Test
    public void testLockedOutUserGetsErrorMassage(){

        loginPage.setUsername("locked_out_user");
        loginPage.setPassword("secret_sauce");
        ProductsPage productsPage=loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.getErrorMessage().contains("Epic sadface"));
    }
}
