public class Referee {

    private String name;
    private Address address;
    private Phone phone;
    private Double salary;
    int id ;

    public Referee(String name, Address address, Phone phone, Double salary) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salary = salary+((salary*10)/100);
    }

    public Referee(int id) {
        this.id = id;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
