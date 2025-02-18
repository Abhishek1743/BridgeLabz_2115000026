// Abstract class representing a product category
abstract class ProductCategory{
    private String categoryName;
    
    public ProductCategory(String categoryName){
        this.categoryName = categoryName;
    }
    
    public String getCategoryName(){
        return categoryName;
    }
}

// Specific product categories
class BookCategory extends ProductCategory{
    public BookCategory(){
        super("Books");
    }
}

class ClothingCategory extends ProductCategory{
    public ClothingCategory(){
        super("Clothing");
    }
}

class GadgetCategory extends ProductCategory{
    public GadgetCategory(){
        super("Gadgets");
    }
}

// Generic class for products
class Product<T extends ProductCategory>{
    private String name;
    private double price;
    private T category;
    
    public Product(String name, double price, T category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public T getCategory(){
        return category;
    }
    
    public void applyDiscount(double percentage) {
        this.price -= (this.price * percentage / 100);
    }
    
    @Override
    public String toString(){
        return name + " (Category: " + category.getCategoryName() + ", Price: " + price + ")";
    }
}

// Main class
public class DynamicMarketPlace{
    public static void main(String[] args){
        // Creating products
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Casual Shirt", 30.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 500.0, new GadgetCategory());
        
        // Applying discounts
        book.applyDiscount(10);
        shirt.applyDiscount(15);
        phone.applyDiscount(5);
        
        // Display products
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}
