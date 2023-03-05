package visitorPattern;

import java.util.Iterator;

public class DirectoryIterator implements Iterator {
    private Directory directory;
    private int index;

    public DirectoryIterator(Directory directory) {
        this.directory = directory;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < directory.getFiles().size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        if (this.hasNext() == false) {
            return null;
        }
        return directory.getFiles().get(index++);
    }
}