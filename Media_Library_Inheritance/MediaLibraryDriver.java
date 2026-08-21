public class MediaLibraryDriver {
    public static void main(String[] args){

        Item[] library = new Item[4];

        Book b1 = new Book(15, "Lord of the Rings", 100, "Tolkien");
        JournalPaper jp1 = new JournalPaper(18, "New York Times", 150, "John Smith", 2026);
        Video v1 = new Video(14, "YouTube", 125, 1, "Christopher Nolan", "Action", 2025);
        CD cd1 = new CD(13, "Beatles", 160, 2, "Paul McCartney", "Pop");
        CD cd2 = new CD(13, "Beatles", 160, 2, "Paul McCartney", "Pop");
        System.out.println(b1);
        jp1.print();
        System.out.println(v1);
        System.out.println(cd1);
        // Check out and Check in
        b1.checkOut();
        System.out.println("COPIES AFTER CHECKOUT: " + b1.getNumCopies());
        jp1.checkIn();
        System.out.println("COPIES AFTER CHECK IN: " + jp1.getNumCopies());
        // Add Item
        v1.addItem();
        System.out.println("COPIES AFTER ADD ITEM: " + v1.getNumCopies());
        System.out.println("CD 1 = CD 2?: " + cd1.equals(cd2));
        
        cd1.addItem();
        System.out.println("COPIES AFTER ADD ITEM: " + cd1.getNumCopies());
        System.out.println("CD 1 = CD 2?: " + cd1.equals(cd2));

        library[0] = b1;
        library[1] = jp1;
        library[2] = v1;
        library[3] = cd1;

        System.out.println("\nLIBRARY ITEMS");
        System.out.println("-------------");

        for (int i = 0; i < library.length; i++) {
            library[i].print();
            System.out.println();
    }
}
}
