package com.example.landmarkbook;
import java.io.Serializable;
public class Landmark implements Serializable{
    public String name;
    String country;
    int image;

    //Constructor burada başlıyor

    public Landmark( String name, String country, int image) {
        this.name= name;
        this.country= country;
        this.image= image;
    }
}
