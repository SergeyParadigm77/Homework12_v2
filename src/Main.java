public class Main {
    public static void main(String[] args) {
        Author coelho = new Author("Паоло", "Коэльо");
        Book alchemist = new Book("Алхимик", 1988, coelho);
        alchemist.setYearPublication(1995);
        Author aitmatov = new Author("Чингиз", "Айтматов");
        Book scaffold = new Book("Плаха", 1986, aitmatov);

        System.out.println("Наименование книги - " + alchemist.getName() + ", Год издания - " + alchemist.getYearPublication() + ", Имя автора - " + alchemist.getAuthor().getFirstName() + ", Фамилия автора - " + alchemist.getAuthor().getLastName() );
        System.out.println("Наименование книги - " + scaffold.getName() + ", Год издания - " + scaffold.getYearPublication() + ", Имя автора - " + scaffold.getAuthor().getFirstName() + ", Фамилия автора - " + scaffold.getAuthor().getLastName());
    }
}