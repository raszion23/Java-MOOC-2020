
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String fileName = scan.nextLine();

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        ArrayList<String[]> stats = new ArrayList<>();

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            String line;
            while (file.hasNextLine()) {
                line = file.nextLine();
                String[] parts = line.split(",");

                stats.add(parts);
            }

            int games = 0;
            int wins = 0;
            int losses = 0;

            for (String[] parts : stats) {
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int visitorScore = Integer.valueOf(parts[3]);

                if (homeTeam.equals(teamName) || visitingTeam.equals(teamName)) {
                    games++;
                }
                
                if (homeTeam.equals(teamName) && homeScore > visitorScore || visitingTeam.equals(teamName) && visitorScore > homeScore) {
                    wins++;
                } else if (homeTeam.equals(teamName) && homeScore < visitorScore || visitingTeam.equals(teamName) && visitorScore < homeScore) {
                    losses++;
                }
            }
            
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
