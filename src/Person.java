public class Person {
    private String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void info(){
        System.out.printf("%s %s", this.firstName, this.lastName);
    }
}
