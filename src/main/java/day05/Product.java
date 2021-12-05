package day05;

import java.time.LocalDate;

public class Product {

    private String name;
    private LocalDate dateOfSales;
    private int price;

    public Product(String name, LocalDate dateOfSales, int price) {
        this.name = name;
        this.dateOfSales = dateOfSales;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfSales() {
        return dateOfSales;
    }

    public int getPrice() {
        return price;
    }
}
