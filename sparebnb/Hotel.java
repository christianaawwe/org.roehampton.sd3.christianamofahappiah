public class Hotel extends Accommodation {
    private int starRating;

    public Hotel(int id, String name, String location, double pricePerNight, boolean available, int starRating) {
        super(id, name, location, pricePerNight, available);
        this.starRating = starRating;
    }

    @Override
    public void printInfo() {
        System.out.println("Hotel: " + getName() +
                " | Stars: " + starRating +
                " | Available: " + (isAvailable() ? "Yes" : "No"));
        printFacilities();
        System.out.println();
    }
}
