public class Booking {
    private static int counter = 1;
    private int bookingId;
    private User user;
    private Accommodation accommodation;

    public Booking(User user, Accommodation accommodation) {
        this.bookingId = counter++;
        this.user = user;
        this.accommodation = accommodation;
    }

    public void printInfo() {
        System.out.println("Booking #" + bookingId + ": " + user.getName() +
                " booked " + accommodation.getName());
    }
}
