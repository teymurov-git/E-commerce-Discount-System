public interface Discountable {
    double applyDiscount(Product product);

    static boolean isExpensive(Product product){
        return product.getPrice() > 1000;
    }

    default void printDiscountInfo(Product product){
        double discountedPrice = applyDiscount(product);
        System.out.println("Product: " + product.getName());
        System.out.println("Original Price: " + product.getPrice());
        System.out.println("Discounted Price: " + discountedPrice);
        if (isExpensive(product)) {
            System.out.println("This product is expensive!");
        } else {
            System.out.println("This product is not expensive.");
        }
    }
}
