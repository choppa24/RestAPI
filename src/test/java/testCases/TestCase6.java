package testCases;

import enums.StatusCodes;
import framework.base.BaseTest;
import framework.utils.APIUtils;
import framework.utils.ConfigUtility;
import framework.utils.LoggerUtility;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6 extends BaseTest {

    @Test
    public void test(){
        LoggerUtility.info("____Step6____");
        User user5 = g.fromJson(APIUtils.sendGet(ConfigUtility.getStringValue("urlUsers5")), User.class);
        Assert.assertEquals(StatusCodes.GET_OK.toInteger(),APIUtils.getStatusCode(),
                "Status code != 200 Step6 ");
        Assert.assertTrue(user5.equals(testUser), "User data does not match Step6");
    }
}
