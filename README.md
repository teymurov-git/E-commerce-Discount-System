# E-commerce Discount System

A simple Java project demonstrating an e-commerce discount system using **interfaces, encapsulation, static/default methods, and polymorphism**. Products receive discounts based on their price and category.

## Features
- `Product` class with private fields (`name`, `price`, `category`) and getters/setters.
- `Discountable` interface with:
  - `applyDiscount(Product p)` – abstract method for calculating discounts.
  - `static isExpensive(Product p)` – checks if the product costs more than 1000 AZN.
  - `default printDiscountInfo(Product p)` – prints discount information.
- `SeasonalDiscount` and `CategoryDiscount` classes implementing different discount strategies.
- Polymorphic discount application to multiple products.

## Usage
```java
List<Product> products = new ArrayList<>();
products.add(new Product("Laptop", 1500, "electronics"));
products.add(new Product("Shoes", 200, "fashion"));

Discountable seasonal = new SeasonalDiscount("fashion", 10);
Discountable category = new CategoryDiscount("electronics", 15);

for (Product p : products) {
    seasonal.printDiscountInfo(p);
    category.printDiscountInfo(p);
}
