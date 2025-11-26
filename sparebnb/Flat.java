public class Flat extends Accommodation {
    private int floorNumber;

    public Flat(int id, String name, String location, double pricePerNight, boolean available, int floorNumber) {
        super(id, name, location, pricePerNight, available);
        this.floorNumber = floorNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Flat: " + getName() +
                " | Floor: " + floorNumber +
                " | Available: " + (isAvailable() ? "Yes" : "No"));
        printFacilities();
        System.out.println();
    }
}

