package testCases;

import enums.StatusCodes;
import framework.base.BaseTest;
import framework.utils.*;
import models.Address;
import models.Company;
import models.Geo;
import models.User;
import org.openqa.selenium.json.TypeToken;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class TestCase5 extends BaseTest {

    @Test
    public void test(){
        LoggerUtility.info("____Step5____");
        Assert.assertTrue(JsonUtility.isJSON(APIUtils.sendGet(ConfigUtility.getStringValue("urlUsers"))),
                "List of users not in JSON format STEP5");
        Assert.assertEquals(StatusCodes.GET_OK.toInteger(),APIUtils.getStatusCode(),
                "Status code != 200 Step5");
        ArrayList<User> users;
        Type usersType = new TypeToken<ArrayList<User>>(){}.getType();
        users = g.fromJson(APIUtils.sendGet(ConfigUtility.getStringValue("urlUsers")),usersType);
        Assert.assertTrue(testUser.equals(users.get(4)), "User data does not match Step5");
    }
}
