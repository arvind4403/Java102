import java.util.ArrayList;
import java.util.List;

public class MyCart{
    public static class Product{
        private String productId;
        private String productName;
        private double price;
        private int quantity;

        public Product(String productId, String productName,double price, int quantity){
            this.productId=productId;
            this.productName=productName;
            this.price=price;
            this.quantity=quantity;
        }
        public String getProductId(){
            return productId;
        }
        public String getProductName(){
            return productName;
        }
        public double getPrice(){
            return price;
        }
        public int getQuantity(){
            return this.quantity;
        }
    }

    public static class Cart{
        private List cartItems;

        public Cart(){
            cartItems=new ArrayList<>();
        }

        public void AddToCart(Product product){
            cartItems.add(product);
            System.out.println("Product added to cart : " +product.getProductName());
        }
        public void RemoveFromCart(Product product){
            cartItems.remove(product);
            System.out.println("Product Removed from the cart : " + product.getProductName());
        }

        public void UpdateQuantity(Product product,int quantity){
            product.getQuantity();
            System.out.println("quantity update : " + product.getProductName() + ": "+quantity );
        }

        public void viewCart(){
            if (cartItems.isEmpty()){
                System.out.println("Sorry, your cart is empty ");
            }else {
                System.out.println("Cart Item ");
                for (Object item:cartItems){
                    if (item instanceof Product){
                        Product product=(Product) item;
                        System.out.println("Product: " + product.getProductName() +
                                ", Quantity: " + product.getQuantity() +
                                ", Price: " + product.getPrice());
                    }
                }
            }
        }
        public void checkOut(){
            if (cartItems.isEmpty()){
                System.out.println("Your cart is empty ");
            }else {
                System.out.println("Lets go for checkout ");
                double totalPrice=0.0;
                for (Object item :cartItems){
                    if (item instanceof Product){
                        Product product=(Product) item;
                        totalPrice+=product.getPrice() * product.getQuantity();
                    }
                }
                System.out.println("Total price: "+totalPrice);
            }
        }
    }
    public static void main(String[] args){
        Product product1=new Product("ind12","dress",500,2);
        Product product2=new Product("br122","jeans",300,2);

        Cart cart=new Cart();
        cart.AddToCart(product1);
        cart.AddToCart(product2);

        cart.viewCart();
        cart.UpdateQuantity(product1,4);
        cart.RemoveFromCart(product2);

        cart.viewCart();
        cart.checkOut();

    }

}





