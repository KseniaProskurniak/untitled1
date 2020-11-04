package main.lesson8.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ValidatorStub {
    private static final List<Entity> ENTITIES = new ArrayList<>();

    public static void validateEntity(Entity entity) {
//        int index = ENTITIES.indexOf(entity);
//        if (index >= 0) {
//            Entity e = ENTITIES.get(index);
//            entity.setUuid(e.getUuid());
//        } else {
//            entity.setUuid(UUID.randomUUID().toString());
//            ENTITIES.add(entity);
//        }
        for (Entity e : ENTITIES) {
            if (e.equals(entity)) {
                entity.setUuid(e.getUuid());
                return;
            }
        }
        entity.setUuid(UUID.randomUUID().toString());
        ENTITIES.add(entity);
    }

    public static void printEntities() {
        for (Entity e : ENTITIES) {
            System.out.println(e);
        }
    }
}
