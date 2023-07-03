import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {
    private List<String> teams;

    public FixtureGenerator(List<String> teams) {
        this.teams = teams;
    }

    public List<String> generateFixtures() {
        List<String> fixtures = new ArrayList<>();

        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int numWeeks = teams.size() - 1;
        int halfSize = teams.size() / 2;

        List<String> teamsCopy = new ArrayList<>(teams);
        teamsCopy.remove(0); // Exclude the "Bay" team if present

        for (int week = 0; week < numWeeks; week++) {
            Collections.shuffle(teamsCopy);

            for (int i = 0; i < halfSize; i++) {
                String homeTeam = teams.get(i);
                String awayTeam = teamsCopy.get(i);

                String fixture = homeTeam + " vs " + awayTeam;
                fixtures.add(fixture);
            }

            teamsCopy.add(0, teamsCopy.remove(teamsCopy.size() - 1));
        }

        return fixtures;
    }
}
