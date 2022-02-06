package testCases;

import enums.StatusCodes;
import models.*;
import com.google.gson.Gson;
import framework.base.BaseTest;
import framework.utils.*;
import org.openqa.selenium.json.TypeToken;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class TestCase2 extends BaseTest {

    @Test
    public void test(){
        LoggerUtility.info("____Step2____");
        Post post99 = g.fromJson(APIUtils.sendGet(ConfigUtility.getStringValue("urlPosts99")), Post.class);
        Assert.assertEquals(StatusCodes.GET_OK.toInteger(),APIUtils.getStatusCode(),
                "Status code != 200 STEP2");
        Assert.assertEquals(post99.getUserId(), TestUtility.getIntValue("userIdStep2"),
                "userId value does not match STEP2");
        Assert.assertEquals(post99.getId(), TestUtility.getIntValue("idStep2"),
                "id value does not match STEP2");
        Assert.assertNotEquals(post99.getTitle(),null, "title empty string STEP2");
        Assert.assertNotEquals(post99.getBody(), null,"body empty string STEP2");
    }
}
