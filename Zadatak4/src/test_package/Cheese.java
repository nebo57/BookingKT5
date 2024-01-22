package test_package;

import com.company.Product;

public class Cheese extends Product {
    public Cheese(String name, String barCode, double basePrice) {
        super(name, barCode, basePrice);
    }

    @Override
    public double calculatePriceWithTax() {
        return 0;
    }
}
