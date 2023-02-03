// Задача А14

import java.util.Arrays;

public class Book extends PrintEdition {

    int quantityOfPages;
    int year;
    String author;
    String[] pages;
    String[] pages2;

    public Book(String name, int quantityOfPages, int year, String author, String[] pages){
        super(name);
        this.quantityOfPages = quantityOfPages;
        this.year = year;
        this.author = author;
        pages2 = new String[quantityOfPages];
        for (int i=pages.length; i > 0; i--) {
            pages2[i] = pages [i-1];
        }
        this.pages2[0] = name + ", " + author;
        this.pages = pages2;
//        this.pages = new String[quantityOfPages];
//        for (int i=1; i < this.pages.length; i++) {
//            pages[i] = pages[i-1];
//            System.out.println(pages[i]);
//        }
    }

    public String getPage(int n) {
        System.out.println(Arrays.toString(pages));
        return pages[n];
    }
}
