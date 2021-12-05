package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> products=new ArrayList<>();

    public void addProducts(Product p){
        if(p.getDateOfSales().isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Date of sales cannot be in the future");
        }else{
            products.add(p);
        }
    }

    public void writeFile(int month){

        Path path = Paths.get("src/main/resources/"+month+"products.csv");
        List<String> data=new ArrayList<>();
        for(Product p: products) {
            if (p.getDateOfSales().getMonthValue() == month) {
                String output = p.getName() + ";" + p.getDateOfSales() + ";" + p.getPrice();
                data.add(output);
            }
        }
            try{
                Files.write(path,data);
            }catch (IOException ioe) {
                throw new IllegalStateException("Can not write file.", ioe);
            }
    }

    public static void main(String[] args) {

        Store store = new Store();
        store.addProducts(new Product("christmas tree",LocalDate.of(2021,12,1),3000));
        store.addProducts(new Product("fogkefe",LocalDate.of(2021,4,30),300));
        store.addProducts(new Product("Playstation",LocalDate.of(2021,5,6),50000));
        store.addProducts(new Product("XBox",LocalDate.of(2021,12,3),60000));

        store.writeFile(12);
    }
}
