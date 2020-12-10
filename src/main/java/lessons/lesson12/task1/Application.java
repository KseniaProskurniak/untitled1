package lessons.lesson12.task1;

import lessons.lesson12.task1.helpers.JsonHelper;
import lessons.lesson12.task1.model.House;

public class Application {
    public static void main(String[] args) {
        House house = new House().generate();
        JsonHelper<House> jsonHelper = new JsonHelper<>();
        String json = jsonHelper.serialize(house);
        System.out.println(json);
        System.out.println();
        House deserializedHouse = jsonHelper.deserialize(json, House.class);
        System.out.println(deserializedHouse);
    }
}
