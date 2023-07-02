public class Stadium {
    private String name ;
    private String city;
    private int capacity;
    private Boolean lightning;
    private String surface;
    int id;

    public Stadium(int id) {
        this.id = id;
    }

    public Stadium(String name, String city, int capacity, Boolean lightning, String surface) {
        this.name = name;
        this.city = city;
        this.capacity = capacity;
        this.lightning = lightning;
        this.surface = surface;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Boolean getLightning() {
        return lightning;
    }

    public void setLightning(Boolean lightning) {
        this.lightning = lightning;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
