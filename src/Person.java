public class Person
{
    final private Race race;
    Culture culture;
    //Religion religions[]
    //Town town

    private String name;
    private String gender;
    private int age;

    //String style
    //

    Person(Race race, Culture culture, String name, String gender, int age)
    {
        this.race = race;
        this.culture = culture;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void printPerson()
    {
        race.printRace();
        culture.printCulture();
        System.out.format("Hello, my name is %s, I am %s. I am %d years old\n", name, gender, age);
        System.out.println("--------------------");

    }
}
