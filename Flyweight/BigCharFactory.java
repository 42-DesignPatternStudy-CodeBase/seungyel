package Flyweight;

public class BigCharFactory {
    private static BigCharFactory instance;
    private BigCharFactory() {}
    
    public BigChar getBigChar(char c) {
        return new BigChar(c);
    }
    
    public static BigCharFactory getInstance() {
        if (instance == null)
            instance = new BigCharFactory();
        return instance;
    }
}
