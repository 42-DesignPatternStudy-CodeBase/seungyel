package iteratorPattern;

public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}

public interface Aggregate {
     public abstract Iterator iterator();
     public int getLength();
}

public class Book {
    private String name;
    public Book(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    } 
}