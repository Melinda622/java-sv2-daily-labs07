package day01;

import java.time.LocalDate;

public class Human {

    private String name;

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    private int yearOfBirth;

    public Human(String name,int yearOfBirth){
        this.name=name;
        if(LocalDate.now().getYear()-yearOfBirth<=120) {
            this.yearOfBirth = yearOfBirth;
        }else{
             throw new IllegalArgumentException("You cannot be older than 120 years old!");
            }
        }
}
