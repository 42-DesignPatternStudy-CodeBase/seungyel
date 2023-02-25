package compositePattern;
import java.util.ArrayList;

class Category extends ProductCategory {
    ArrayList<ProductCategory> data = new ArrayList<ProductCategory>();
    private int cnt;
    
	public Category(int id, String name, int price) {
        super(id, name, price);
        cnt = 0;
    }

    @Override
	public void addProduct(ProductCategory product){
		data.add(product);
	}
    @Override
	public void removeProduct(ProductCategory product){
		if (cnt == 0)
			return ;
		data.remove(product);
	}
    @Override
	public int getCount(){
		for (ProductCategory product : data)
			cnt += product.getCount();
		return cnt;
	}
    @Override
	public String getName(){
        return name;
	}
    @Override
	public int getPrice(){
		for (ProductCategory product : data)
			price += product.getPrice();
		return price;
	}
    @Override
	public int getId(){
		return id;
	}
}