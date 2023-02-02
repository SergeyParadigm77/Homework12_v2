public class Main {
    public static void main(String[] args) {
        Book alchemist = new Book("Алхимик", 1988);
        alchemist.setYearPublication(1995);
        Author coelho = new Author("Паоло", "Коэльо");
        Book scaffold = new Book("Плаха", 1986);
        Author aitmatov = new Author("Чингиз", "Айтматов");

        System.out.println("Наименование книги - " + alchemist.getName() + ", " + "Год издания - " + alchemist.getYearPublication() + ", " + "Имя автора - " + coelho.getFirstName() + ", " + "Фамилия автора - " + coelho.getLastName());
        System.out.println("Наименование книги - " + scaffold.getName() + ", " + "Год издания - " + scaffold.getYearPublication() + ", " + "Имя автора - " + aitmatov.getFirstName() + ", " + "Фамилия автора - " + aitmatov.getLastName());
    }
}