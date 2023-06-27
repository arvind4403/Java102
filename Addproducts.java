import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String productId;
    private String productName;
    private String description;
    private String manufacturer;
    private int warrantyPeriod;

    public Product(String productId, String productName, String description, String manufacturer, int warrantyPeriod){
        this.productId=productId;
        this.productName=productName;
        this.description=description;
        this.manufacturer=manufacturer;
        this.warrantyPeriod=warrantyPeriod;
    }
    public String getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public String getDescription(){
        return description;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }
}

class ProductRegistrationSystem{
    private List products;

    public ProductRegistrationSystem(){
        products=new ArrayList<>();
    }
    public void registrationProduct(Product product){
        products.add(product);
    }
    public void displayAllProducts(){
        for (Product product : products){
            if (product.getProductId().equals(productId)){
                System.out.println("Product ID: " + product.getProductId());
                System.out.println("Product Name: " + product.getProductName());
                System.out.println("Description: " + product.getDescription());
                System.out.println("Manufacturer: " + product.getManufacturer());
                System.out.println("Warranty Period (months): " + product.getWarrantyPeriod());
                return;
            }
        }
        System.out.println("Product not found!");
    }
    public void generateReport(){
        int totalProduct=products.size();
        int expireWarrantyProducts=0;

        for (Product product:products){
            if (product.getWarrantyPeriod() <= 0) {
                expireWarrantyProducts++;
            }
        }
        System.out.println("Total product registered : "+totalProduct);
        System.out.println("Expired warranty product : "+expireWarrantyProducts);
        System.out.println("Active Warranty products: "+(totalProduct-expireWarrantyProducts));

    }

}
public class Addproducts{
    public static void main(String[] args){
        ProductRegistrationSystem registrationSystem=new ProductRegistrationSystem();
        Scanner scanner=new Scanner(System.in);

        boolean running=true;
        while (running){
            System.out.println("Product registration system");
            System.out.println("1. Register a Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter Product ID: ");
                    String productId = scanner.nextLine();

                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();

                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter Manufacturer: ");
                    String manufacturer = scanner.nextLine();

                    System.out.print("Enter Warranty Period in months: ");
                    int warrantyPeriod = scanner.nextInt();
                    scanner.nextLine();

                    Product product = new Product(productId, productName, description, manufacturer, warrantyPeriod);
                    registrationSystem.registerProduct(product);
                    System.out.println("Product Registered Successfully!");
                    break;

                case 2:
                    registrationSystem.displayAllProducts();
                    break;

                case 3:
                    System.out.print("Enter Product ID to search: ");
                    String searchProductId = scanner.nextLine();
                    registrationSystem.searchProductById(searchProductId);
                    break;

                case 4:
                    registrationSystem.generateReport();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");

            }
            System.out.println();
        }
        scanner.close();
    }
}
