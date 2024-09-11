public class User {

    private String firstName;
    private String lastName;
    private int idade;

    public User(String firstName, String lastName, int idade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", idade=" + idade + "]";
    }
}
