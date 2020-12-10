package lessons.lesson12.task1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class House implements Generatable<House> {
    List<Flat> flats;

    public House() {
    }

    public House(List<Flat> flats) {
        this.flats = flats;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    @Override
    public House generate() {
        flats = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Flat flat = new Flat().generate();
            flats.add(flat);
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        return Objects.equals(flats, house.flats);
    }

    @Override
    public int hashCode() {
        return flats != null ? flats.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "House{" +
                "flats=" + flats +
                '}';
    }
}
