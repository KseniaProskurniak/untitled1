package lessons.lesson12.task1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flat implements Generatable<Flat> {
    List<Room> rooms;

    public Flat() {
    }

    public Flat(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public Flat generate() {
        rooms = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Room room = new Room().generate();
            rooms.add(room);
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flat flat = (Flat) o;

        return Objects.equals(rooms, flat.rooms);
    }

    @Override
    public int hashCode() {
        return rooms != null ? rooms.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "rooms=" + rooms +
                '}';
    }
}
