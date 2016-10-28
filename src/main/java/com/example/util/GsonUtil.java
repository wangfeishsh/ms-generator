package com.example.util;

import com.example.model.Fish;
import com.example.model.Fruit;
import com.example.model.ResponseResult;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 16/8/15.
 */
public class GsonUtil {

    public static void main(String []args){
        Gson gson = new Gson();
        String json = "{\n" +
                "\"code\":\"000\",\n" +
                "\"msg\":\"success\",\n" +
                "\"data\":{\n" +
                "\"name\":\"000\",\n" +
                "\"fish\":{\n" +
                "\"name\":\"salmon\"\n" +
                "      }\n" +
                "      }\n" +
                "}";
        long start = System.currentTimeMillis();
        ResponseResult responseResult = gson.fromJson(json, ResponseResult.class);
        Fruit fruit = gson.fromJson(responseResult.getData().toString(),Fruit.class);
        Fish fish = gson.fromJson(fruit.getFish().toString(),Fish.class);
        System.out.println(System.currentTimeMillis()-start);
        System.out.println(fish.getName());

        Map map = new HashMap();
        map.put("name","bao");
        map.put("age","30");
        System.out.println(gson.toJson(map));

        String str  ="{\"name\":\"bao\",\"age\":\"30\"}";
        Map test = gson.fromJson(str,Map.class);
        System.out.println(test.get("name"));

    }
}
