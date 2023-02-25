package abstractFactoryPattern;

public class MssqlUserProductDao implements ProductDao {
    @Override
	public boolean insertProduct(Product product) {
		String message = "insert into Mssql DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean updateProduct(Product product) {
		String message = "update into Mssql DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
	@Override
	public boolean deleteProduct(Product product) {
		String message = "delete into Mssql DB productId = " + product.getProductId();
		System.out.println(message);
		return true;
	}
}