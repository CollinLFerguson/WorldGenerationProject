public class Religion
{
    Race primaryRace;
    String type;
    String structure;
    String tenants[];

    Person religiousLeader;
    //Deity deity[]

    //TODO: Make the generation random to allow for more diverse religions. Pull tenants from a list of possible tenants.
    //TODO: Make clergy and Deity randomly generated.

    Religion(Race primaryRace, String type, String structure, String tenants[])
    {
        this.primaryRace = primaryRace;
        this.type = type;
        this.structure = structure;
        this.tenants = tenants;
    }

    void printReligions()
    {
        System.out.format("Religion Info\n"+
                           "Primary race:       %s\n" +
                           "Religion Type:      %s\n"+
                           "Religion Structure: %s\nTenants:", primaryRace.getRaceName(), this.type, structure);
        for(int x = 0; x<tenants.length; x++)
        {
            System.out.format("*%s\n", tenants[x]);
        }
    }
}
