public class Sofa extends Accommodation {
    private boolean inSharedRoom;

    public Sofa(int id, String name, String location, double pricePerNight, boolean available, boolean inSharedRoom) {
        super(id, name, location, pricePerNight, available);
        this.inSharedRoom = inSharedRoom;
    }

    @Override
    public void printInfo() {
        System.out.println("Sofa: " + getName() +
                " | Shared Room: " + (inSharedRoom ? "Yes" : "No") +
                " | Available: " + (isAvailable() ? "Yes" : "No"));
        printFacilities();
        System.out.println();
    }
}
