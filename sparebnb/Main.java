public class Main {
    public static void main(String[] args) {

        // Facilities
        Facility wifi = new Facility("Wi-Fi");
        Facility kitchen = new Facility("Kitchen");
        Facility pool = new Facility("Private Pool");
        Facility breakfast = new Facility("Breakfast Included");

        // Accommodations
        Accommodation villa = new LuxuryVilla(1, "Sea Breeze Villa", "Milan", 500.0, true, true);
        villa.addFacility(pool);
        villa.addFacility(wifi);

        Accommodation flat = new Flat(2, "City Studio", "London", 120.0, true, 3);
        flat.addFacility(wifi);
        flat.addFacility(kitchen);

        Accommodation hotel = new Hotel(3, "Sunrise Hotel", "Paris", 200.0, true, 4);
        hotel.addFacility(wifi);
        hotel.addFacility(breakfast);

        Accommodation sofa = new Sofa(4, "Couch", "Berlin", 30.0, true, true);
        sofa.addFacility(wifi);

        // Users
        User james = new User(1, "James", "j@email.com");
        User daniel = new User(2, "Daniel", "d@email.com");
        User charles = new User(3, "Charles", "c@email.com");

        // Booking tests
        Booking b1 = james.book(villa);  // works
        Booking b2 = daniel.book(villa); // politely denied
        Booking b4 = charles.book(hotel);

        // Release
        james.release(villa);

        // Try again
        Booking b3 = daniel.book(villa); // now works

        System.out.println("\n=== Accommodation Status ===");
        villa.printInfo();
        flat.printInfo();
        hotel.printInfo();
        sofa.printInfo();

        System.out.println("=== Bookings ===");
        if (b1 != null) b1.printInfo();
        if (b3 != null) b3.printInfo();
        if (b4 != null) b4.printInfo();


    }

}

