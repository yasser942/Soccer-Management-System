public class Player {
    private int licenseNumber;
    private String name_surname;
    private String nationality;
    private Address address;
    private Phone phone;
    private Team team;
    private Double salary;
    private String positional_role;
    private Date birthdate;
    private Date startDate;
    private Date endDate;

    public Player(int licenseNumber, String name_surname, Date birthdate,String nationality, Address address, Phone phone, Team team,Date startDate, Date endDate ,Double salary, String positional_role) {
        this.licenseNumber = licenseNumber;
        this.name_surname = name_surname;
        this.nationality = nationality;
        this.address = address;
        this.phone = phone;
        this.team = team;
        this.salary = salary;
        this.positional_role = positional_role;
        this.birthdate = birthdate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPositional_role() {
        return positional_role;
    }

    public void setPositional_role(String positional_role) {
        this.positional_role = positional_role;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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
}
