package abstractFactoryPattern;

public class MySqlUserProductDao implements ProductDao {
    @Override
	public boolean insertProduct(Product product) {
		String message = "insert into MYSQL DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean updateProduct(Product product) {
		String message = "update into MYSQL DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean deleteProduct(Product product) {
		String message = "delete into MYSQL DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
}