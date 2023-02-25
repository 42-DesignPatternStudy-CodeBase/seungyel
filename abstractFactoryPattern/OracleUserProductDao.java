package abstractFactoryPattern;

public class OracleUserProductDao implements ProductDao {
    @Override
	public boolean insertProduct(Product product) {
		String message = "insert into Oracle DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean updateProduct(Product product) {
		String message = "update into Oracle DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean deleteProduct(Product product) {
		String message = "delete into Oracle DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
}