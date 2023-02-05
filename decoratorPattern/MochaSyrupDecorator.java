package decoratorPattern;

//물을 추가해주는 클래스
public class MochaSyrupDecorator extends Decorator {
    public MochaSyrupDecorator(Component coffeeComponent) {
        super(coffeeComponent);
    }
    
    @Override
    public String add() {
        return super.add() + " + MochaSyrup";
    }
}