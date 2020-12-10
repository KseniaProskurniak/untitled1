package lessons.lesson12.task1.helpers;

import lessons.lesson12.task1.model.Flat;
import lessons.lesson12.task1.model.House;
import lessons.lesson12.task1.model.Room;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;


class JsonHelperTest {
    private static final String HOUSE_PATH = "src/main/java/lessons/lesson12/task1/expected_json.txt";
    private static final String ROOM_PATH = "src/main/java/lessons/lesson12/task1/room.json";
    private static final String FLAT_PATH = "src/main/java/lessons/lesson12/task1/flat.json";

    @Test
    @DisplayName("Cериализация в json сгенерированного дома")
    void testSerialize() throws IOException {
        House house = new House().generate();
        JsonHelper<House> jsonHelper = new JsonHelper<>();
        String actual = jsonHelper.serialize(house);
        String expected = String.join("", Files.readAllLines(Paths.get(HOUSE_PATH)));
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Дессериализация файла json с данными типа Room")
    void testRoomDeserialize() throws IOException {
        Room expected = new Room().generate();
        String json = String.join("", Files.readAllLines(Paths.get(ROOM_PATH)));
        JsonHelper<Room> jsonHelper = new JsonHelper<>();
        Room actual = jsonHelper.deserialize(json, Room.class);
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Дессериализация файла json с данными типа Flat")
    void testFlatDeserialize() throws IOException {
        Flat expected = new Flat().generate();
        String json = String.join("", Files.readAllLines(Paths.get(FLAT_PATH)));
        JsonHelper<Flat> jsonHelper = new JsonHelper<>();
        Flat actual = jsonHelper.deserialize(json, Flat.class);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Дессериализация файла json с данными типа House")
    void testHouseDeserialize() throws IOException {
        House expected = new House().generate();
        String json = String.join("", Files.readAllLines(Paths.get(HOUSE_PATH)));
        JsonHelper<House> jsonHelper = new JsonHelper<>();
        House actual = jsonHelper.deserialize(json, House.class);
        assertEquals(expected, actual);
    }
}