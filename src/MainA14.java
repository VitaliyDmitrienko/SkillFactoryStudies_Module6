public class MainA14 {

    public static void main(String[] args) {

        String[] pages = new String[] {"page 1", "page 2", "page 3", "page 4", "page 5"};
//        String[] pages1 = new String[5];
        Book book = new Book("Romeo & Juliette", 5, 1988, "Schakespear", pages);
        System.out.println(book.getPage(4));

        Schoolbook schoolbook = new Schoolbook("Elementary geometry", 5, 1995, "Euclid", pages,"Mathematic", 15);
        System.out.println(schoolbook.getPage(0));

    }
}
