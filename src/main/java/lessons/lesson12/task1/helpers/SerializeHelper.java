package lessons.lesson12.task1.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import lessons.lesson12.task1.model.Generatable;

import java.io.IOException;

public interface SerializeHelper<T extends Generatable<T>> {
    T deserialize(String data, Class<T> clazz) throws IOException;

    String serialize(T object) throws JsonProcessingException;

}
