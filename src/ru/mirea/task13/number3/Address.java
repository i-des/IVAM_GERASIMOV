package ru.mirea.task13.number3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String input) {
        // Разделитель - запятая
        String[] parts = input.split(",");
        if (parts.length >= 7) {
            country = parts[0].trim();
            region = parts[1].trim();
            city = parts[2].trim();
            street = parts[3].trim();
            house = parts[4].trim();
            building = parts[5].trim();
            apartment = parts[6].trim();
        }

        // Разделители - запятая, точка, точка с запятой
        StringTokenizer tokenizer = new StringTokenizer(input, ",;.");
        if (tokenizer.countTokens() >= 7) {
            country = tokenizer.nextToken().trim();
            region = tokenizer.nextToken().trim();
            city = tokenizer.nextToken().trim();
            street = tokenizer.nextToken().trim();
            house = tokenizer.nextToken().trim();
            building = tokenizer.nextToken().trim();
            apartment = tokenizer.nextToken().trim();
        }
    }

    public String toString() {
        return "Country: " + country + "\n" +
                "Region: " + region + "\n" +
                "City: " + city + "\n" +
                "Street: " + street + "\n" +
                "House: " + house + "\n" +
                "Building: " + building + "\n" +
                "Apartment: " + apartment;
    }

    public static void main(String[] args) {
        String addressString1 = "Russia, Moscow, Moscow City, Tverskaya, 10, 2, 45";
        String addressString2 = "USA; California; San Francisco; Market Street; 123; ; 567";

        Address address1 = new Address(addressString1);
        Address address2 = new Address(addressString2);

        System.out.println("Address 1:");
        System.out.println(address1);

        System.out.println("\nAddress 2:");
        System.out.println(address2);
    }
}

