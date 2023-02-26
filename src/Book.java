import java.util.Objects;
//№2
public class Book implements Printable{
    private String name;
    public Book (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Печатаю книгу " + getName());

    }
    //№7
    public static void printBooks(Printable[] printables) {
        System.out.println("Печатаю книги: ");
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                System.out.println(((Book) printable).getName());
            }
        }
    }
}
