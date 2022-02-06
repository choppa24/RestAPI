package testCases;

import enums.StatusCodes;
import io.restassured.response.Response;
import models.*;
import com.google.gson.Gson;
import framework.base.BaseTest;
import framework.utils.*;
import org.json.JSONArray;
import org.openqa.selenium.json.TypeToken;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;



import java.lang.reflect.Type;
import java.util.ArrayList;

public class TestCase1 extends BaseTest {


    @Test
    public void test() {
        LoggerUtility.info("____Step1____");
        Assert.assertTrue(JsonUtility.isJSON(APIUtils.sendGet(ConfigUtility.getStringValue("urlPosts"))),
                "List of posts not in JSON format STEP1");
        Assert.assertEquals(StatusCodes.GET_OK.toInteger(), APIUtils.getStatusCode(),
                "Status code != 200 STEP1");
        ArrayList<Post> posts;
        Type postsType = new TypeToken<ArrayList<Post>>() {
        }.getType();
        posts = g.fromJson(APIUtils.sendGet(ConfigUtility.getStringValue("urlPosts")), postsType);
        for (int i = 0; i < posts.size() - 1; i++) {
            Assert.assertTrue(posts.get(i).getId() < posts.get(i + 1).getId(),
                    "The list is not sorted in ascending order STEP1");
        }
    }
}
