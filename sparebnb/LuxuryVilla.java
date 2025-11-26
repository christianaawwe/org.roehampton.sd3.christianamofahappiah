public class LuxuryVilla extends Accommodation {
    private boolean hasPool;

    public LuxuryVilla(int id, String name, String location, double pricePerNight, boolean available, boolean hasPool) {
        super(id, name, location, pricePerNight, available);
        this.hasPool = hasPool;
    }

    @Override
    public void printInfo() {
        System.out.println("Luxury Villa: " + getName() +
                " | Pool: " + (hasPool ? "Yes" : "No") +
                " | Available: " + (isAvailable() ? "Yes" : "No"));
        printFacilities();
        System.out.println();
    }
}

