package decoratorPattern;

//우유를 추가해주는 클래스
public class MilkDecorator extends Decorator {
    public MilkDecorator(Component coffeeComponent) {
        super(coffeeComponent);
    }
    
    @Override
    public String add() {
        return super.add() + " + Milk";
    }
}