package iteratorPattern;

public interface Iterator {
    public abstract boolean hasNext();
	public abstract Object first();
	public abstract Object next();
    public abstract Object currentItem();
}
