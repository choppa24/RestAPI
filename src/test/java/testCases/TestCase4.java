package testCases;

import enums.StatusCodes;
import framework.base.BaseTest;
import framework.utils.*;
import models.Post;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4 extends BaseTest {
    private final int STR_LEN = 20;

    @Test
    public void test(){
        LoggerUtility.info("____Step4____");
        String body = RandomUtility.getRandomString(STR_LEN);
        String title = RandomUtility.getRandomString(STR_LEN);
        Post inPost  = new Post(TestUtility.getIntValue("userIdStep4"),title,body);
        Post outPost = g.fromJson(APIUtils.sendPosts(ConfigUtility.getStringValue("urlPosts"), inPost), Post.class);
        Assert.assertEquals(StatusCodes.POST_CRATED.toInteger(),APIUtils.getStatusCode(),
                "Status code != 201 STEP4");
        Assert.assertTrue(inPost.equals(outPost),"title, body, or user Id does not match the values passed in the request STEP4");
        Assert.assertNotEquals(outPost.getId(),null,"id value are null STEP4");
    }
}
