package com.example.presentation2022.builderpattern;

import com.example.presentation2022.builderpattern.sandwich.Builder;
import com.example.presentation2022.builderpattern.sandwich.toppings.*;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.*;

public class HavAJavaWorker {
    public void createSalmonSandwich(Builder builder){
        builder.setVeggies(Veggies.salad)
                .size(10)
                .setMeat(Meat.Salmon)
                .setDressing(Dressing.dillDressing)
                .setCondiments(Condiments.pickledRedOnions);
    }


    public void createPickledSandwich(Builder builder){
        builder.setVeggies(Veggies.salad)
                .size(10)
                .setDressing(Dressing.dillDressing)
                .setCondiments(Condiments.pickledRedOnions);
    }

    public void createOrderedSandwich(Builder builder){
        String jsonString = getJsonOrder().toString();
        JsonObject jsonObject = new Gson().fromJson(jsonString, JsonObject.class);
        builder.size(jsonObject.get("size").getAsInt())
                .setCondiments(Condiments.valueOf(jsonObject.get("condiments").getAsString()))
                .setDressing(Dressing.valueOf(jsonObject.get("dressing").getAsString()))
                .setMeat(Meat.valueOf(jsonObject.get("meat").getAsString()))
                .setVeggies(Veggies.valueOf(jsonObject.get("veggies").getAsString()));
    }

    private JsonObject getJsonOrder(){
        try {
            JsonElement jsonElement = JsonParser.parseReader(new FileReader("src/main/resources/com/example/presentation2022/order.json"));
            return jsonElement.getAsJsonObject();
        } catch (FileNotFoundException e) {
            System.err.println("error reading json");
            e.printStackTrace();
        }
        return new Gson().fromJson("\"null\": \"null\"", JsonObject.class);
    }
}
