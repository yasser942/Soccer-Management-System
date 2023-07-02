public class Company {
    private String  name;
    private  Address address;
    private  Phone phone;
    Team team;

    public Company(String name, Address address, Phone phone, Team team) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.team = team;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
