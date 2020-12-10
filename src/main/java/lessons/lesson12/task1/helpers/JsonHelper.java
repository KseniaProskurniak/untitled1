package lessons.lesson12.task1.helpers;

import com.google.gson.Gson;
import lessons.lesson12.task1.model.Generatable;

public class JsonHelper<T extends Generatable<T>> implements SerializeHelper<T> {
    private static final Gson GSON = new Gson();

    @Override
    public T deserialize(String data, Class<T> clazz) {
        return GSON.fromJson(data, clazz);
    }

    @Override
    public String serialize(T object) {
        return GSON.toJson(object);
    }
}
