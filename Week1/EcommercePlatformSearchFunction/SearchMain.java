import java.util.Arrays;

public class SearchMain {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Shirt", "Apparel")
        };

        System.out.println("🔍 Linear Search:");
        int index1 = SearchFunction.linearSearch(products, "Mobile");
        if (index1 != -1)
            System.out.println("Found at index: " + index1 + " → " + products[index1]);
        else
            System.out.println("Product not found");

        System.out.println("\n🔍 Binary Search (on sorted array):");
        Arrays.sort(products);  // Sort before binary search
        int index2 = SearchFunction.binarySearch(products, "Mobile");
        if (index2 != -1)
            System.out.println("Found at index: " + index2 + " → " + products[index2]);
        else
            System.out.println("Product not found");
    }
}
