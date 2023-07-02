public class Match {
    private Stadium []stadiums;
    private Referee[]referees;
    private int refereeCount;
    private HomeTeam homeTeam;
    private AwayTeam awayTeam;
    private int stadiumCount;
   private Stadium stadiumId;
   private Referee refereeOne;
   private Referee refereeTwo;
   private Referee refereeThree;

    public Match() {
        stadiums=new Stadium[60];
        stadiumCount=0;
        referees= new Referee[33];
        refereeCount=0;

    }

    public Match(HomeTeam homeTeam, AwayTeam awayTeam, Referee refereeOne, Referee refereeTwo, Referee refereeThree, Stadium stadiumId) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.refereeOne = refereeOne;
        this.refereeTwo = refereeTwo;
        this.refereeThree = refereeThree;
        this.stadiumId=stadiumId;
    }


    public  void addReferee(Referee referee){
        referees[refereeCount]=referee;
        refereeCount++;
    }
    public  void showReferees(){
        for (int i=0;i<refereeCount;i++){
            System.out.println(

                    referees[i].getName()+" "+
                            referees[i].getAddress().getStreet()+" "+
                            referees[i].getAddress().getDistrict()+" "+
                            referees[i].getAddress().getCity()+" "+
                            referees[i].getAddress().getCountry()+" "+
                            referees[i].getPhone().getCountryCode()+" "+
                            referees[i].getPhone().getAreaCode()+" "+
                            referees[i].getPhone().getNumber()+" "+
                            referees[i].getSalary()

            );
        }
    }
    public void addStadium(Stadium stadium){
        stadiums[stadiumCount]=stadium;
        stadiums[stadiumCount].setId(stadiumCount+1);
        stadiumCount++;

    }
    public void showStadiums(){
        for (int i=0;i<stadiumCount;i++){
            System.out.println(
                    stadiums[i].getId()+"."+
                    stadiums[i].getName()+" "+
                    stadiums[i].getCity()+" "+
                    stadiums[i].getCapacity()+" "+
                    stadiums[i].getLightning()+" "+
                    stadiums[i].getSurface()
            );
        }
    }
    public void biggestStadium(){
        int max =0;
        for (int i =0;i<stadiumCount;i++){
            if (stadiums[i].getCapacity()>max){
                max=stadiums[i].getCapacity();
            }
        }
        for (int k=0;k<stadiumCount;k++){
            if (max==stadiums[k].getCapacity()){
                System.out.println(stadiums[k].getName()+" "+ max);
            }
        }

    }

    public Stadium[] getStadiums() {
        return stadiums;
    }

    public void setStadiums(Stadium[] stadiums) {
        this.stadiums = stadiums;
    }

    public int getStadiumCount() {
        return stadiumCount;
    }

    public void setStadiumCount(int stadiumCount) {
        this.stadiumCount = stadiumCount;
    }

    public Referee[] getReferees() {
        return referees;
    }

    public void setReferees(Referee[] referees) {
        this.referees = referees;
    }

    public int getRefereeCount() {
        return refereeCount;
    }

    public void setRefereeCount(int refereeCount) {
        this.refereeCount = refereeCount;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }


    public Referee getRefereeOne() {
        return refereeOne;
    }

    public void setRefereeOne(Referee refereeOne) {
        this.refereeOne = refereeOne;
    }

    public Referee getRefereeTwo() {
        return refereeTwo;
    }

    public void setRefereeTwo(Referee refereeTwo) {
        this.refereeTwo = refereeTwo;
    }

    public Referee getRefereeThree() {
        return refereeThree;
    }

    public void setRefereeThree(Referee refereeThree) {
        this.refereeThree = refereeThree;
    }

    public Stadium getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(Stadium stadiumId) {
        this.stadiumId = stadiumId;
    }
}
