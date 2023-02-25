package abstractFactoryPattern;

public interface ProductDao {
    boolean insertProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(Product product);
}