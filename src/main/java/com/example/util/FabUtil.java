package com.example.util;

import com.example.model.Fish;
import com.example.model.Fruit;
import com.example.model.ResponseResult;
import com.google.gson.Gson;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 16/8/19.
 */
public class FabUtil {

    public static int fab(int m, int n) {
        if (m < 1 && n < 1) {
            return 0;
        }
        if (m < 1 || n < 1) {
            return 0;
        }
        if (m == 1 && n == 2) {
            return 1;
        }
        if (m == 2 && n == 1) {
            return 1;
        }
        if (m == 1 && n == 1) {
            return 0;
        }
        return fab(m - 1, n) + fab(m, n - 1);
    }

    public void test1(){
        int a = 0;
        test(a);
        System.out.println("a="+a);
        Integer i = new Integer(1);
        test2(i);
        System.out.println(i.intValue());

        List<String> list = new ArrayList<>();
        test(list);
        System.out.println(list.size());
    }

    public void test(int a){
        a = 1;
    }

    public void test2(Integer a){
        a = new Integer(2);
    }

    public void test(List<String> list){
        list.add("aa");
        list.add("bb");

    }

    public void change(Fruit fruit){
        fruit.setName("change");
    }

    public static void main(String[] args) {
        System.out.println(fab(3, 2));
        System.out.println(fab(6, 9));

        BigDecimal bigDecimal = new BigDecimal(-1);
        System.out.println(BigDecimal.ZERO.compareTo(bigDecimal));

        System.out.println(BigDecimal.ZERO.toPlainString());

//转化为字符串输出

        BigDecimal bigDecimal2 = new BigDecimal(0);
        bigDecimal2 = bigDecimal2.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal2.toPlainString());

        FabUtil fabUtil = new FabUtil();
        Fruit fruit = new Fruit();
        fruit.setName("original");
        fabUtil.change(fruit);
        System.out.println(fruit.getName());

        Map<String,String> map = new LinkedHashMap();
        map.put("version","1");
        map.put("name","bao");
        map.put("age","12");
        map.put("gender","male");
        StringBuffer origin = new StringBuffer();
//        for (Map.Entry<String, String> e : map.entrySet()) {
//            origin.append(e.getValue());
//        }
//        System.out.println(origin.toString());

        map.forEach((key, value) -> {
            if (!StringUtils.isEmpty(value)) {
                if (!StringUtils.isEmpty(origin.toString())) {
                    origin.append("&");
                }
                origin.append(key).append("=").append(value);
            }
        });

        System.out.println(origin.toString());

    }
}
