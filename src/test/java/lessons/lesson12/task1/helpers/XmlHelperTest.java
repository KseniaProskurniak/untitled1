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

class XmlHelperTest {

    private static final String HOUSE_PATH = "src/main/java/lessons/lesson12/task1/expected_xml.txt";
    private static final String ROOM_PATH = "src/main/java/lessons/lesson12/task1/room.xml";
    private static final String FLAT_PATH = "src/main/java/lessons/lesson12/task1/flat.xml";

    @Test
    @DisplayName("Cериализация в xml сгенерированного дома")
    void testSerialize() throws IOException {
        House house = new House().generate();
        XmlHelper<House> xmlHelper = new XmlHelper<>();
        String actual = xmlHelper.serialize(house);
        String expected = String.join("", Files.readAllLines(Paths.get(HOUSE_PATH)));
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Дессериализация файла xml с данными типа Room")
    void testRoomDeserialize() throws IOException {
        Room expected = new Room().generate();
        String xml = String.join("", Files.readAllLines(Paths.get(ROOM_PATH)));
        XmlHelper<Room> xmlHelper = new XmlHelper<>();
        Room actual = xmlHelper.deserialize(xml, Room.class);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Дессериализация файла xml с данными типа Flat")
    void testFlatDeserialize() throws IOException {
        Flat expected = new Flat().generate();
        String xml = String.join("", Files.readAllLines(Paths.get(FLAT_PATH)));
        XmlHelper<Flat> xmlHelper = new XmlHelper<>();
        Flat actual = xmlHelper.deserialize(xml, Flat.class);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Дессериализация файла xml с данными типа House")
    void testHouseDeserialize() throws IOException {
        House expected = new House().generate();
        String xml = String.join("", Files.readAllLines(Paths.get(HOUSE_PATH)));
        XmlHelper<House> jsonHelper = new XmlHelper<>();
        House actual = jsonHelper.deserialize(xml, House.class);
        assertEquals(expected, actual);
    }
}
