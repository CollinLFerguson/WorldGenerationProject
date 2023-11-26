public class Race
{
    private String raceName;
    private String raceSize;
    private int raceMaxAge;
    private int raceAdultAge;

    double culturalNaturalBiases[];
    double cultureDimensionBiases[];
    Race(String raceName, String raceSize, int raceMaxAge, int raceAdultAge, double cultureDimensionBiases[], double culturalNaturalBiases[])
    {
        this.raceName = raceName;
        this.raceSize = raceSize;
        this.raceMaxAge = raceMaxAge;
        this.raceAdultAge = raceAdultAge;
        this.cultureDimensionBiases = cultureDimensionBiases;
        this.culturalNaturalBiases = culturalNaturalBiases;
    }

    void printRace()
    {
        System.out.format("Race Name: %s\nRace Size: %s\nRace Average Lifespan: %d - Adulthood Age: %d\n", raceName, raceSize, raceMaxAge, raceAdultAge);
        System.out.println("--------------------");

    }
}
