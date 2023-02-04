public class Book {
    private String name;
    private int yearPublication;
    private Author author;


    public Book(String name, int yearPublication, Author author) {
        this.name = name;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getName() {
        return name;
    }
    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}

