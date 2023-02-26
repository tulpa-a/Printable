public class Printable2 {
    //№4
    public static void main (String[] args){
        Book book1 = new Book("Первая книга");
        Book book2 = new Book("Вторая книга");
        Magazine magazine1 = new Magazine("Первый журнал");
        Magazine magazine2 = new Magazine("Второй журнал");
        //массив
        Printable[] printables = {book1, book2, magazine1, magazine2};
        //№5
        for (Printable printable : printables){
            printable.print();
        }

        //№6
        Magazine.printMagazines(printables);
        //№7
        Book.printBooks(printables);
    }
}
