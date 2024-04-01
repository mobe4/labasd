
import java.util.Arrays;

public class ProductMgmtApp {
    public static void main(String[] args) {
        Product[] products = {
                new Product(3128874119L, "Banana", "2023-01-24", 124, 0.55),
                new Product(2927458265L, "Apple", "2022-12-09", 18, 1.09),
                new Product(9189927460L, "Carrot", "2023-03-31", 89, 2.99)
        };

        printProducts(products);
    }

    private static void printProducts(Product[] products) {
        // Sorting the products by name
        Arrays.sort(products, (p1, p2) -> p1.getName().compareTo(p2.getName()));

        // JSON output
        System.out.println("JSON-formatted list of all Products:");
        for (Product product : products) {
            System.out.println("{ \"productId\": " + product.getProductId() +
                    ", \"name\": \"" + product.getName() +
                    "\", \"dateSupplied\": \"" + product.getDateSupplied() +
                    "\", \"quantityInStock\": " + product.getQuantityInStock() +
                    ", \"unitPrice\": " + product.getUnitPrice() + " },");
        }

        // XML output
        System.out.println("\nXML-formatted list of all Products:");
        for (Product product : products) {
            System.out.println("<product>" +
                    "<productId>" + product.getProductId() + "</productId>" +
                    "<name>" + product.getName() + "</name>" +
                    "<dateSupplied>" + product.getDateSupplied() + "</dateSupplied>" +
                    "<quantityInStock>" + product.getQuantityInStock() + "</quantityInStock>" +
                    "<unitPrice>" + product.getUnitPrice() + "</unitPrice>" +
                    "</product>");
        }

        // CSV output
        System.out.println("\nCSV-formatted list of all Products:");
        System.out.println("productId,name,dateSupplied,quantityInStock,unitPrice");
        for (Product product : products) {
            System.out.println(product.getProductId() + "," +
                    product.getName() + "," +
                    product.getDateSupplied() + "," +
                    product.getQuantityInStock() + "," +
                    product.getUnitPrice());
        }
    }
}
