package visitorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private int size;
    private ArrayList<Entry> dir = new ArrayList<Entry>();

    public Directory(String name) {
        this.name = name;
        this.size = 0;    
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        this.size += entry.getSize();
        return this;
    }

    public Iterator iterator() {
        return new DirectoryIterator(this);
    }

    public ArrayList<Entry> getFiles() {
        return this.dir;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }
}