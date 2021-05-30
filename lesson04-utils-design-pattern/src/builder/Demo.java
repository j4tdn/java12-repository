package builder;

public class Demo {
    public static void main(String[] args) {
        Person p1 = Person.builder().setAge(13).setFirstName("VuLe").setAge(24).build();
        System.out.println(p1);
    }
}
