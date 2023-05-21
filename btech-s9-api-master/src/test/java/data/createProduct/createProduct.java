package data.createProduct;

import org.json.simple.JSONObject;

import java.util.Random;

public class createProduct {
    static Random rand = new Random();
    static String randomCode = String.valueOf(rand.nextInt(1000));

    public static JSONObject newProduct(){
        JSONObject data = new JSONObject();
        data.put("name","permen");
        data.put("price",40000);
        data.put("cost",50000);
        data.put("stock",4);
        data.put("code",randomCode);
        return data;
    }
}
