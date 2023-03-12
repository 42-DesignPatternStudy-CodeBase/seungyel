package Flyweight;

import java.util.*;

public class BigCharFactory {
    private static BigCharFactory instance;
    private Map<Character, BigChar> pool = new HashMap<Character, BigChar>();

    private BigCharFactory() {}
    
    public BigChar getBigChar(char c) {
        if (pool.containsKey(c)) {
            return pool.get(c);
        }
        BigChar bigChar = new BigChar(c);
        pool.put(c, bigChar);
        return bigChar;
    }
    
    public static BigCharFactory getInstance() {
        if (instance == null)
            instance = new BigCharFactory();
        return instance;
    }
}
