package framework.base;

import com.google.gson.Gson;
import framework.utils.ConfigUtility;
import framework.utils.TestUtility;
import models.Address;
import models.Company;
import models.Geo;
import models.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected   Gson g = new Gson();

    protected User testUser;

    @BeforeTest
    public void initialization() {
        ConfigUtility.setConfigUtility();
        TestUtility.setTestUtility();
    }

    @BeforeMethod
    public void initUser(){
        testUser = new User(
                TestUtility.getIntValue("id"),
                TestUtility.getStringValue("name"),
                TestUtility.getStringValue("userName"),
                TestUtility.getStringValue("email"),
                new Address(
                        TestUtility.getStringValue("street"),
                        TestUtility.getStringValue("suite"),
                        TestUtility.getStringValue("city"),
                        TestUtility.getStringValue("zipcode"),
                        new Geo(
                                TestUtility.getStringValue("lat"),
                                TestUtility.getStringValue("lng")
                        )
                ),
                TestUtility.getStringValue("phone"),
                TestUtility.getStringValue("website"),
                new Company(
                        TestUtility.getStringValue("nameCompany"),
                        TestUtility.getStringValue("catchPhrase"),
                        TestUtility.getStringValue("bs")
                )
        );
    }

}

