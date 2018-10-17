public class Product
{
	protected String name;
	protected float price;
	public Product()
	{
		name = "abc";
		price = 0f;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public void compare(Product product)
	{
		if(this.price > product.price){
			System.out.println(this.name +" is more expensive than " 
					                        + product.name);
		}else{
			System.out.println(this.name +" is cheaper than " + product.name); 
		}
	}

	public void print()
	{
		System.out.println("name:" + name + ", price: " + price);
	}
}
