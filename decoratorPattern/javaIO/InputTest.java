package decoratorPattern.javaIO;

import java.io.*;

public class InputTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int c;
        try {
            // FileInputStream을 만들고 BufferedInputStream과 새로 만든 LowercaseInputStream으로 감싼다.
            InputStream in = new LowercaseInputStream(
                    new BufferedInputStream(new FileInputStream("decoratorPattern/javaIO/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}