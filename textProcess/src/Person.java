public class Person
{
    private String firstName;
    private String lastName;
    private String email;

    public Person()
    {
        this("no_first_name", "no_last_name");
    }

    public Person(String firstname, String lastname)
    {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    Person(String firstname, String lastname, String emailaddress)
    {
        this.firstName = firstname;
        this.lastName = lastname;
        this.email = emailaddress;
    }

    @Override
    public String toString()
    {

        return String.format("Firstname: %s Lastname: %s Email: %s", firstName, lastName, email
        );
    }
}
