package abstractFactoryPattern;

public class Product {
    private String id;
    private String name;

    public void setProductId(String id) {
        this.id = id;
    }
    public void setProductName(String name) {
        this.name = name;
    }
    public String getProductId() {
        return id;
    }
    public String getProductName() {
        return name;
    }
}
