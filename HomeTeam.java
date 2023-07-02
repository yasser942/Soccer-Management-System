public class HomeTeam {
   private Team team;
   private int number_of_goals;

    public HomeTeam(Team team, int number_of_goals) {
        this.team = team;
        this.number_of_goals = number_of_goals;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getNumber_of_goals() {
        return number_of_goals;
    }

    public void setNumber_of_goals(int number_of_goals) {
        this.number_of_goals = number_of_goals;
    }
}
