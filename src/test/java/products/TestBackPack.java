package products;

import base.BaseTest;
import com.saucedemo.page.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBackPack extends BaseTest {

    @Test
    public void testAddBackPack() throws InterruptedException {
        ProductsPage productsPage=loginPage.loginWith(
                "standard_user","secret_sauce");
        productsPage.addBackPack();
             Thread.sleep(1000);
      Assert.assertEquals(productsPage.getButtonName(),"REMOVE");
    }

}
