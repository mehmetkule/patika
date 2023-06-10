import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Beşiktaş");
        teams.add("Galatasaray");
        teams.add("Fenerbahçe");
        teams.add("Bursaspor");
        teams.add("Başakşehir");
        //teams.add("Trabzonspor");

        FixtureGenerator generator = new FixtureGenerator(teams);
        List<String> fixtures = generator.generateFixtures();

        for (int i=1; i < fixtures.size() ; i++) {
            System.out.println("Round " + i);
            System.out.println(fixtures.get(i));
            System.out.println();
        }
    }
}