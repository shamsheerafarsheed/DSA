package SearchingAlgorithms;


	import java.util.Arrays;
	import java.util.Comparator;

	class Product {
	    int id;
	    String name;
	    double price;

	    public Product(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
	    }
	}

	public class String_binarySearch {
	    public static void main(String[] args) {
	        Product[] products = {
	            new Product(101, "Laptop", 55000),
	            new Product(102, "Mouse", 800),
	            new Product(103, "Keyboard", 1500),
	            new Product(104, "Monitor", 12000),
	            new Product(105, "Printer", 7000)
	        };

	        // ✅ Step 1: Sort products by ID
	        Arrays.sort(products, Comparator.comparingInt(p -> p.id));

	        // ✅ Step 2: Key to search
	        int searchId = 104;

	        // ✅ Step 3: Perform binary search
	        int index = Arrays.binarySearch(products, new Product(searchId, "", 0),
	                Comparator.comparingInt(p -> p.id));

	        // ✅ Step 4: Display result
	        if (index >= 0) {
	            System.out.println("Product Found: " + products[index]);
	        } else {
	            System.out.println("Product with ID " + searchId + " not found.");
	        }
	    }
	}


