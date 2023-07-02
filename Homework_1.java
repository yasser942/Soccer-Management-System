import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework_1 {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("D:\\input.txt");
        Scanner s = new Scanner(input);
        String line = "";
        while (s.hasNextLine()) {
            line+=s.nextLine()+"\n";
        }
        System.out.println("========================================================");
        TFF tff =new TFF();
        Team team= new Team();
        Match match= new Match();

        line = line.replace("\n", ";");
        String[] l = line.split(";");

        for (int i = 0; i < l.length; i++) {
            if (l[i].startsWith("AddTeam")) {
              //  System.out.println(l[i] + " " + l[i + 1] + " " + l[i + 2] + " " + l[i + 3] + " " + l[i + 4]);
                tff.addTeam(new Team(l[i + 1], new Date(l[i+2]), Integer.parseInt(l[i + 3]), l[i + 4]));

            }
            if (l[i].startsWith("AddCoach")){

               // System.out.println(l[i] + " " + l[i + 1] + " " + l[i + 2] + " " + l[i + 3] + " " + l[i + 4] + " " + l[i + 5] + " " + l[i + 6] + " " + l[i + 7] + " " + l[i + 8] + " " + l[i + 9] + " " + l[i + 10] + " " + l[i + 11] + " " + l[i + 12] + " " + l[i + 13] + " " + l[i + 14] + " " + l[i + 15] + " " + l[i + 16]);

                team.addCoach( new Coach(l[i+1],new Address(l[i+2],l[i+3],l[i+4],l[i+5]),new Phone(l[i+6],l[i+7],l[i+8]),new Team(l[i+9]),new Date(l[i+10],l[i+11],l[i+12]),new Date(l[i+13],l[i+14],l[i+15]),Double.parseDouble(l[i+16])));


            }

            if (l[i].startsWith("AddPlayer")) {


               // System.out.println(l[i] + " " + l[i + 1] + " " + l[i + 2] + " " + l[i + 3] + " " + l[i + 4] + " " + l[i + 5] + " " + l[i + 6] + " " + l[i + 7] + " " + l[i + 8] + " " + l[i + 9] + " " + l[i + 10] + " " + l[i + 11] + " " + l[i + 12] + " " + l[i + 13] + " " + l[i + 14] + " " + l[i + 15] + " " + l[i + 16] + " " + l[i + 17] + " " + l[i + 18] + " " + l[i + 19] + " " + l[i + 20] + " " + l[i + 21] + " " + l[i + 22]);
                tff.addPlayer( new Player(Integer.parseInt(l[i+1]),l[i+2],new Date(l[i+3],l[i+4],l[i+5]),l[i+6],new Address(l[i+7],l[i+8],l[i+9],l[i+10]),
                        new Phone(l[i+11],l[i+12],l[i+13]),new Team(l[i+14]),new Date(l[i+15],l[i+16],l[i+17]),
                        new Date(l[i+18],l[i+19],l[i+20]),Double.parseDouble(l[i+21]),l[i+22]));

            }
            if (l[i].startsWith("AddStadium")) {
                //System.out.println(l[i] + " " + l[i + 1] + " " + l[i + 2] + " " + l[i + 3] + " " + l[i + 4] + " " + l[i + 5]);
                match.addStadium(new Stadium(l[i+1],l[i+2],Integer.parseInt(l[i+3]),Boolean.parseBoolean(l[i+4]),l[i+5]));

            }
            if (l[i].startsWith("AddReferee")) {
               // System.out.println(l[i] + " " + l[i + 1] + " " + l[i + 2] + " " + l[i + 3] + " " + l[i + 4]);
                match.addReferee( new Referee(l[i+1],new Address(l[i+2],l[i+3],l[i+4],l[i+5]),new Phone(l[i+6],l[i+7],l[i+8]),Double.parseDouble(l[i+9]))
                );
            }
            if (l[i].startsWith("AddCompany")) {

               // System.out.println(l[i] + " " + l[i + 1] + " " + l[i + 2] + " " + l[i + 3] + " " + l[i + 4]+ " " + l[i + 5] + " " + l[i + 6] + " " + l[i + 7] + " " + l[i + 8]+" "+l[i+9]);
                team.addCompany( new Company(l[i+1],new Address(l[i+2],l[i+3],l[i+4],l[i+5]),new Phone(l[i+6],l[i+7],l[i+8]),new Team(l[i+9])));

            }
            if (l[i].startsWith("AddMatch")) {
              //  System.out.println(l[i] + " " + l[i + 1] + " " + l[i + 2] + " " + l[i + 3] + " " + l[i + 4] + " " + l[i + 5] + " " + l[i + 6] + " " + l[i + 7] + " " + l[i + 8]);

                    tff.addMatch(new Match(new HomeTeam(new Team(l[i + 1]), Integer.parseInt(l[i + 2])), new AwayTeam(new Team(l[i + 3]), Integer.parseInt(l[i + 4])),
                            new Referee(Integer.parseInt(l[i + 5])), new Referee(Integer.parseInt(l[i + 6])), new Referee(Integer.parseInt(l[i + 7])), new Stadium(Integer.parseInt(l[i + 8]))));


                    if (Integer.parseInt(l[i + 2]) > Integer.parseInt(l[i + 4])) {
                        for (int k = 0; k < tff.getTeamCount(); k++) {
                            if (l[i + 1].equals(tff.getTeams()[k].getName())) {
                                tff.getTeams()[k].addPoints(3);
                            }
                        }
                    }
                    if (Integer.parseInt(l[i + 2]) < Integer.parseInt(l[i + 4])) {
                        for (int k = 0; k < tff.getTeamCount(); k++) {
                            if (l[i + 3].equals(tff.getTeams()[k].getName())) {
                                tff.getTeams()[k].addPoints(3);
                            }
                        }
                    }
                    if (Integer.parseInt(l[i + 2]) == Integer.parseInt(l[i + 4])) {
                        for (int k = 0; k < tff.getTeamCount(); k++) {
                            if (l[i + 1].equals(tff.getTeams()[k].getName())) {
                                tff.getTeams()[k].addPoints(1);
                            }
                            if (l[i + 3].equals(tff.getTeams()[k].getName())) {
                                tff.getTeams()[k].addPoints(1);
                            }
                        }
                    }
            }

            if (l[i].startsWith("DeletePlayer")) {
               // System.out.println(l[i] + " " + l[i + 1]);
                for (int k=0;k<tff.getPlayerCount();k++){
                    if (tff.getPlayers()[k].getLicenseNumber()==Integer.parseInt(l[i+1])){
                        tff.getPlayers()[k]=null;
                    }
                }

            }
        }

        System.out.println("           *** Soccer Management System ***             ");
        System.out.println("========================================================");
        System.out.println("-------- List of Teams --------- ");
        tff.showTeams();
        System.out.println();
        System.out.println("-------- List of Coaches --------- ");
        team.showCoaches();
        System.out.println();
        System.out.println("-------- List of Players --------- ");
        tff.showPlayers();
        System.out.println();
        System.out.println("-------- List of Sponsor Companies --------- ");
        team.showCompanies();
        System.out.println();
        System.out.println("-------- List of Scores --------- ");
        tff.showScores();
        System.out.println();
        System.out.print("* Winner: ");
        tff.winner();
        System.out.println();
        System.out.print("* The biggest stadium : ");
        match.biggestStadium();
        System.out.println();



    }


}

