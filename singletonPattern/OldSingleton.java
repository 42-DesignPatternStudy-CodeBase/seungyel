package singletonPattern;

public class OldSingleton {
    private static OldSingleton instance;

    private OldSingleton() {
        // 생성자는 외부에서 호출못하게 private 으로 지정해야 한다.
    }

    public static synchronized OldSingleton getInstance() {
        if (instance == null){
            instance = new OldSingleton();
        }
        return instance;
    }

    public void say() {
        System.out.println("hi, there");
    }
}
