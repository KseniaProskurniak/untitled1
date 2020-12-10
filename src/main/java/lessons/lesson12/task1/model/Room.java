package lessons.lesson12.task1.model;

public class Room implements Generatable<Room> {
    private int width;
    private int height;

    public Room() {
    }

    public Room(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Room generate() {
        width = 5;
        height = 3;
        return this;
    }

    @Override
    public String toString() {
        return "Room{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (width != room.width) return false;
        return height == room.height;
    }

    @Override
    public int hashCode() {
        int result = width;
        result = 31 * result + height;
        return result;
    }
}
