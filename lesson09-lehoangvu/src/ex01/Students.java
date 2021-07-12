package ex01;

public class Students {
    private String id;
    private String name;
    private Level rank;

    public Students() {
    }

    public Students(String id, String name, Level rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return rank;
    }

    public void setLevel(Level rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", Level=" + rank + "]";
    }

}
