public class Main
{
    public static void main(String[] args)
    {
        Race race = new Race("Human", "Medium" ,80, 18, new double[] {0,0,0,0,0,0}, new double[] {0,0} );
        Culture culture = new Culture(race, "Random Culture");
        Person person = new Person(race, culture, "dave", "male", 18);
        person.printPerson();
    }
}
