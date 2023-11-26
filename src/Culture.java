public class Culture
{
    Race race;
    String cultureName;
    /*
    0 - Mas/Fem
    1 - Power Distance
    2 - Individualism / Collectivism
    3 - Uncertainty Avoidance
    4 - Long / Short term orientation
    5 - Restraint vs indulgence
     */
    double dimensions[];
    final int numberOfDimensions = 6;

    /*
    0 - Gender
    1 - Ethnocentrism
    */
    double biases[];
    final int numberOfBiases = 2;

    Culture(Race race, String cultureName)
    {
        this.cultureName = cultureName;
        this.race = race;
        this.dimensions = new double[numberOfDimensions];
        this.biases = new double[numberOfDimensions];

        for(int x = 0; x<numberOfDimensions; x++) {
            dimensions[x] = Math.random() + race.cultureDimensionBiases[x];
            if(dimensions[x] > 1){dimensions[x] = 1;}
            else if(dimensions[x] < 0){dimensions[x] = 0;}
        }
        for(int x = 0; x < numberOfBiases; x++)
        {
            biases[x] = Math.random() + race.culturalNaturalBiases[x];
            if(biases[x] > 1){biases[x] = 1;}
            else if(biases[x] < 0){biases[x] = 0;}

        }
    }

    void printCulture()
    {
        System.out.format
                ("Cultural Dimensions Values are 0 - 1\n" +
                 "Culture: %s \n" +
                 "Masculine / Feminine               %.2f\n" +
                 "High / Low Power Distance          %.2f\n" +
                 "Individualism / Collectivism       %.2f\n" +
                 "High / Low Uncertainty Avoidance   %.2f\n" +
                 "Long / Short term orientation      %.2f\n" +
                 "Restraint / indulgence             %.2f\n\n", cultureName, dimensions[0], dimensions[1], dimensions[2], dimensions[3], dimensions[4], dimensions[5]);
        System.out.format
                ("Cultural Biases Values are 0 - 1\n" +
                 "Gender Bias                        %.2f\n"+
                 "Ethnocentrism                      %.2f\n", biases[0], biases[1]);
        System.out.println("--------------------");
    }
}
