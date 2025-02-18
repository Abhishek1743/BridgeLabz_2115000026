import java.util.*;

// Abstract class representing a warehouse item
abstract class WarehouseItem{
    private String name;
    
    public WarehouseItem(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return getClass().getSimpleName() + " - " + name;
    }
}

// Specific item types extending WarehouseItem
class Electronics extends WarehouseItem{
    public Electronics(String name){
        super(name);
    }
}

class Groceries extends WarehouseItem{
    public Groceries(String name){
        super(name);
    }
}

class Furniture extends WarehouseItem{
    public Furniture(String name){
        super(name);
    }
}

// Generic class for storage management
class Storage<T extends WarehouseItem>{
    private List<T> items = new ArrayList<>();
    
    public void addItem(T item){
        items.add(item);
    }
    
    public List<T> getItems(){
        return items;
    }
}

// Utility class to display items with wildcard
class WarehouseUtils{
    public static void displayItems(List<? extends WarehouseItem> items){
        for (WarehouseItem item : items){
            System.out.println(item);
        }
    }
}

// Main class
public class SmartWarehouseSystem{
    public static void main(String[] args){
		
        // Creating storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));
        
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Milk"));
        
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));
        
        // Display stored items
        System.out.println("Electronics:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());
        
        System.out.println("\nGroceries:");
        WarehouseUtils.displayItems(groceriesStorage.getItems());
        
        System.out.println("\nFurniture:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
