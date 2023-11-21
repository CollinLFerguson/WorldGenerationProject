public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello Ang");

        Race race = new Race("Human", "Medium" ,80, 18);

        Person person = new Person(race,"dave", "male", 18);
        person.printPerson();
    }
}
