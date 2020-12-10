package lessons.lesson12.task1.helpers;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lessons.lesson12.task1.model.Generatable;

import java.io.IOException;

public class XmlHelper<T extends Generatable<T>> implements SerializeHelper<T> {
    private static final XmlMapper XML_MAPPER = new XmlMapper();

    @Override
    public T deserialize(String data, Class<T> clazz) {
        try {
            return XML_MAPPER.readValue(data, clazz);
        } catch (IOException ex) {
            throw new IllegalArgumentException("Что-то пошло не так при десериализации", ex);
        }
    }

    @Override
    public String serialize(T object) {
        try {
            return XML_MAPPER.writeValueAsString(object);
        } catch (IOException ex) {
            throw new IllegalArgumentException("Что-то пошло не так при сериализации", ex);
        }
    }
}
