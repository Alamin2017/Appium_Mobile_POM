package testCases;

import EnvSetup.BaseEnv;
import org.testng.annotations.Test;
import pages.Onboarding;

public class test extends BaseEnv {


    @Test
    public void test_por() {

        Onboarding op=new Onboarding(driver);
        op.click_button();
        op.click_button2();


    }

}
