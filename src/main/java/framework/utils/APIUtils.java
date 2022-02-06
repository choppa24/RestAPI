package framework.utils;

import enums.ContentTypes;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.Post;
import com.google.gson.Gson;

public class APIUtils {
    private final static String TYPE = "Content-Type";
    private static Response response;

    public static int getStatusCode(){
        LoggerUtility.info("Request Status code");
        return response.getStatusCode();
    }

    public static String sendGet(String myURL){
        LoggerUtility.info("GET request");
        RequestSpecification request = RestAssured.given();
        request.header(TYPE, ContentTypes.APPLICATION_JSON.toString());
        response = request.get(myURL);
        return response.asString();
    }

    public static String sendPosts(String myURL, Post post){
        LoggerUtility.info("POST request");
        RequestSpecification request = RestAssured.given();
        request.header(TYPE, ContentTypes.APPLICATION_JSON.toString());
        Gson g = new Gson();
        request.body(g.toJson(post));
        response = request.post(myURL);
        return  response.asString();
    }
}
