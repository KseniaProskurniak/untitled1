package lessons.lesson8.task4;

public class User extends Entity {
    private String jobTitle;

    public User(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        return jobTitle.equals(user.jobTitle);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + jobTitle.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "jobTitle='" + jobTitle + '\'' +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
