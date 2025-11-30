package com.example;

import java.util.List;

public class AlexTheLion extends Lion{

    public AlexTheLion(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() throws Exception {
        throw new Exception ("Алекс бесплодный(");
    }

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский Зоопарк";
    }
}
