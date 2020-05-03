package testModule;

import coreCode.BaseTest;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.Test;

public class Pruebas extends BaseTest {


    @Test
    public void Sample(){
        AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();

        try {
            System.out.println("Im inside the test");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
