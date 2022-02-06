package testCases;

import enums.StatusCodes;
import framework.base.BaseTest;
import framework.utils.APIUtils;
import framework.utils.ConfigUtility;
import framework.utils.LoggerUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest {

    @Test
    public void test(){
        LoggerUtility.info("____Step3____");
        Assert.assertEquals(APIUtils.sendGet(ConfigUtility.getStringValue("urlPosts150")),"{}", "" +
                "the answer is not empty STEP3");
        Assert.assertEquals(StatusCodes.ERROR_NOT_FOUND.toInteger(),APIUtils.getStatusCode(),
                "Status code != 404 STEP3");
    }
}
