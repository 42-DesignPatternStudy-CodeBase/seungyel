package decoratorPattern;

public class BaseComponent implements Component {
    String type;
    
    BaseComponent(String type){
        this.type = type;
    }
    
    @Override
    public String add() {
        return type;
    }
}
