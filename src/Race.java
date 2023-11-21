public class Race
{
    private String raceName;
    private String raceSize;
    private int raceMaxAge;
    private int raceAdultAge;

    Race(String raceName, String raceSize, int raceMaxAge, int raceAdultAge)
    {
        this.raceName = raceName;
        this.raceSize = raceSize;
        this.raceMaxAge = raceMaxAge;
        this.raceAdultAge = raceAdultAge;

    }

    void printRace()
    {
        System.out.format("Race Name: %s\nRace Size: %s\nRace Average Lifespan: %d - AdultHood Age: %d\n", raceName, raceSize, raceMaxAge, raceAdultAge);
    }
}
