public class CategoryDiscount implements Discountable{
    private String category;
    private double discountPercentage;

    public CategoryDiscount(String category, double discountPercentage){
        this.category = category;
        this.discountPercentage = discountPercentage;
    }


    @Override
    public double applyDiscount(Product product){
        if (product.getCategory().equalsIgnoreCase(category)) {
            return product.getPrice() * (1 - discountPercentage / 100);
        } else {
            return product.getPrice();
        }
    }
}
