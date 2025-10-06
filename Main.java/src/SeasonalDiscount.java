public class SeasonalDiscount implements Discountable{
        private double discountPercentage;

        public SeasonalDiscount(double discountPercentage) {
            this.discountPercentage = discountPercentage;
        }

        @Override
        public double applyDiscount(Product p) {
            return p.getPrice() * (1 - discountPercentage / 100);
        }
}