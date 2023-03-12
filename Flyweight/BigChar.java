package Flyweight;
import java.nio.file.*;

public class BigChar {
    private String something;

    public BigChar(char c) {
        try {
            something = Files.readString(Paths.get("Flyweight/big" , "big" + c + ".txt"));
        } catch (Exception e) {
           something = c + "?";
        }
    }

    public void print() {
        System.out.print(something);
    }
}
