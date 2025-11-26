import java.util.ArrayList;
import java.util.List;

public abstract class Accommodation {
    private int id;
    private String name;
    private String location;
    private double pricePerNight;
    private boolean available;
    private List<Facility> facilities = new ArrayList<>();

    public Accommodation(int id, String name, String location, double pricePerNight, boolean available) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.available = available;
    }

    public String getName() { return name; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public void addFacility(Facility f) {
        facilities.add(f);
    }

    protected void printFacilities() {
        if (!facilities.isEmpty()) {
            System.out.println("   Facilities:");
            for (Facility f : facilities) {
                System.out.println("    - " + f.getName());
            }
        }
    }

    public abstract void printInfo();
}
