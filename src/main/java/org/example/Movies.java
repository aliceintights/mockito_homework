package org.example;

public class Movies {
    public static void main(String[] args) {

        String[] titles = {
                "BloodShot",
                "Onwards",
                "Hotel Belgrad",
                "The Gentlemens",
                "Invisible Man",
                "Trolls. World Tour",
                "Number One"
        };

        String newTitle = "Lord of the Rings";

        String[] tmp = new String[titles.length + 1];
        for (int i = 0; i < titles.length; i++) {
            tmp[i] = titles[i];
        }
        tmp[tmp.length - 1] = newTitle;
        titles = tmp;
    }
}