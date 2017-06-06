package com.company;

import java.util.ArrayList;


public class Train {
    int numberTrain;
    private ArrayList<Wagon> wagons;

    public Train() {
        wagons = new ArrayList<>();
    }

    public Train(ArrayList<Wagon> wagons) {
        this.wagons = wagons;
    }

    public ArrayList<Wagon> getWagons(){
        return wagons;
    }


}

