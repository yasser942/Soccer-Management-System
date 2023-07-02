public class Team {
    private String name ;
    private int cups;
    private String color;
    private Coach[] coaches;
     private Company[]companies;
    private Date year;
    int coachCount;
    int companyCount;
    int points;

    public Team(String name, Date year, int cups, String color) {
        this.name = name;
        this.cups = cups;
        this.color = color;
        this.year = year;
    }

    public Team() {
        coaches=new Coach[21];
        companies=new Company[21];
        coachCount=0;
        companyCount=0;
        points=0;
    }


    public void addPoints(int i){
        points+=i;
    }

    public Team(String name) {
        this.name = name;
    }

    public Team(int points) {
        this.points = points;
    }

    public void addCompany(Company company){
        companies[companyCount]=company;
        companyCount++;
    }
    public void showCompanies()
    {
        for (int k=0;k<companyCount;k++){
            System.out.println(
                    companies[k].getName()+" "+
                    companies[k].getAddress().getStreet()+" "+
                    companies[k].getAddress().getDistrict()+" "+
                    companies[k].getAddress().getCity()+" "+
                    companies[k].getAddress().getCountry()+" "+
                            companies[k].getPhone().getCountryCode()+" "+
                            companies[k].getPhone().getAreaCode()+" "+
                            companies[k].getPhone().getNumber()+" "+
                            companies[k].getTeam().getName()


            );
        }
    }
    public void addCoach(Coach coach){
        coaches[coachCount]=coach;
        coachCount++;
    }
    public void showCoaches(){
        for (int i=0; i<coachCount;i++){
            System.out.println(coaches[i].getName()+" "+coaches[i].getAddress().getStreet()+" "+
                    coaches[i].getAddress().getDistrict()+" "+coaches[i].getAddress().getCity()+" "
                    +coaches[i].getAddress().getCountry()+" "+coaches[i].getPhone().getCountryCode()+
                    " "+coaches[i].getPhone().getAreaCode()+" "+coaches[i].getPhone().getNumber()+
                    " "+coaches[i].getTeam().getName()+" "+coaches[i].getStartDate().getDay()+" "
                    +coaches[i].getStartDate().getMonth()+" "+coaches[i].getStartDate().getYear()+" "+
                    coaches[i].getEndDate().getDay()+" "+
                    coaches[i].getEndDate().getMonth()+" "+
                    coaches[i].getEndDate().getYear()+" "+coaches[i].getSalary());
        }
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }



    public Coach[] getCoaches() {
        return coaches;
    }

    public void setCoaches(Coach[] coaches) {
        this.coaches = coaches;
    }

    public int getCoachCount() {
        return coachCount;
    }

    public void setCoachCount(int coachCount) {
        this.coachCount = coachCount;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }

    public int getCompanyCount() {
        return companyCount;
    }

    public void setCompanyCount(int companyCount) {
        this.companyCount = companyCount;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
