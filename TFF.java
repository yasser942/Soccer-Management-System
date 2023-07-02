public class TFF {
    private Team[] teams;
    private Match[]matches;
    private int matchCount;
    private Player[]players;
    private int playerCount;
    private int teamCount;
    Team team= new Team();

    public TFF() {

        teams=new Team[21];
        teamCount=0;
        players=new Player[630];
        playerCount=0;
        matches=new Match[11];
        matchCount=0;

    }


    public void addMatch(Match match){
        matches[matchCount]=match;
        matchCount++;
    }
    public void showMatches(){
        for (int k=0;k<matchCount;k++){
            System.out.println(
                    matches[k].getHomeTeam().getTeam().getName()+" "+
                            matches[k].getHomeTeam().getNumber_of_goals()+" "+
                            matches[k].getAwayTeam().getTeam().getName()+" "+
                            matches[k].getAwayTeam().getNumber_of_goals()+" "+
                            matches[k].getRefereeOne().getId()+" "+
                            matches[k].getRefereeTwo().getId()+" "+
                            matches[k].getRefereeThree().getId()+" "+
                            matches[k].getStadiumId().id
            );
        }
    }
    public void addPlayer(Player player){
        players[playerCount]=player;
        playerCount++;
    }
    public void addTeam(Team team){
        teams[teamCount]=team;

        teamCount++;
    }
    public void showPlayers(){
        for (int i=0; i<playerCount;i++){
            if (players[i]!=null) {
                System.out.println(
                        players[i].getLicenseNumber() + " " + players[i].getName_surname() + " "
                                + players[i].getBirthdate().getDay() + " " +
                                players[i].getBirthdate().getMonth() + " " +
                                players[i].getBirthdate().getYear() + " " +
                                players[i].getNationality() + " " +
                                players[i].getAddress().getStreet() + " " +
                                players[i].getAddress().getDistrict() + " " +
                                players[i].getAddress().getCity() + " " +
                                players[i].getAddress().getCountry() + " " +
                                players[i].getPhone().getCountryCode() + " " +
                                players[i].getPhone().getAreaCode() + " " +
                                players[i].getPhone().getNumber() + " " +
                                players[i].getStartDate().getDay() + " " +
                                players[i].getStartDate().getMonth() + " " +
                                players[i].getStartDate().getYear() + " " +
                                players[i].getEndDate().getDay() + " " +
                                players[i].getEndDate().getMonth() + " " +
                                players[i].getEndDate().getYear() + " " +
                                players[i].getPositional_role()

                );
            }

        }
    }


    public void showTeams(){
        for (int i=0; i<teamCount;i++){

            System.out.println(teams[i].getName()+" "+teams[i].getYear().getYear()+
                    " "+teams[i].getCups()+" "+teams[i].getColor());
        }
    }

    public void showScores(){
        for (int i=0;i<teamCount;i++){
            System.out.println(teams[i].getName()+"         "+teams[i].getPoints());
        }
    }
    public void winner(){

        int max=0;
        for (int i = 0; i<teamCount; i++){
            if(teams[i].getPoints()>max){
                max=teams[i].getPoints();
            }
      }
        for (int k=0;k<teamCount;k++){
            if (max==teams[k].getPoints()){
                System.out.println(teams[k].getName()+" "+ max);
            }
        }

    }
    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public int getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(int teamCount) {
        this.teamCount = teamCount;
    }

    public Match[] getMatches() {
        return matches;
    }

    public void setMatches(Match[] matches) {
        this.matches = matches;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(int matchCount) {
        this.matchCount = matchCount;
    }
}
