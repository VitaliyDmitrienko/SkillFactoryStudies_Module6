// Задача А14

import java.util.Arrays;

public class Book extends PrintEdition {

    int quantityOfPages;
    int year;
    String author;
    String[] pages;

    public Book(String name, int quantityOfPages, int year, String author, String[] pages){
        super(name);
        this.quantityOfPages = quantityOfPages;
        this.year = year;
        this.author = author;
        this.pages = new String[quantityOfPages+1];
        this.pages[0] = name + ", " + author;
        for (int i=1; i < this.pages.length; i++) {
            this.pages[i] = pages[i-1];
            System.out.println(this.pages[i]);
        }
    }

    public String getPage(int n) {
        System.out.println(Arrays.toString(pages));
        return pages[n];
    }
}
