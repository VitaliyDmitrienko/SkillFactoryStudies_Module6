// Задача А14

public class Schoolbook extends Book {

    String subject;
    int grade;

    public Schoolbook(String name, int quantityOfPages, int year, String author, String[] pages, String subject, int grades){
        super(name, quantityOfPages, year, author, pages);
        this.subject = subject;
        this.grade = grade;
    }
}
