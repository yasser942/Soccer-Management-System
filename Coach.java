public class Coach {
    private String name;
    private Phone phone;
    private Address address;
    private Double salary;
    private Date startDate;
    private Date endDate;
    private Team team;




    public Coach(String name,  Address address,Phone phone,Team team, Date startDate, Date endDate, Double salary ) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.startDate = startDate;
        this.endDate = endDate;
        this.team = team;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
