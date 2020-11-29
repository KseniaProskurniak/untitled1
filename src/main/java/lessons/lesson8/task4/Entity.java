package lessons.lesson8.task4;

public abstract class Entity implements Validatable {
    protected String uuid;
    protected String name;

    public Entity(String name) {
        this.name = name;
    }

    @Override
    public void validate() {
        System.out.println(this);
        ValidatorStub.validateEntity(this);
        System.out.println(this);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;

        return name.equals(entity.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Entity{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
