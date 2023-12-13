public class Person {
    private String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String  info(){
        return String.format("%s %s", this.firstName, this.lastName);
    }
}
