package com.bootcoding.collection;

import com.bootcoding.oops.encapsulation.Marker2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MarkerCollection {


    Map<Long, Marker2> markerStore=new HashMap<>();
    public void addMarker (Marker2 m){
        markerStore.put(m.getId(),m);
    }
    public void printMarkers(){
        for (Marker2 m : markerStore.values()){
            System.out.println(" Id " + m.getId());
            System.out.println(" Company " + m.getCompany());
            System.out.println(" Colour " + m.getColour());
            System.out.println(" Type " + m.getType());
            System.out.println(" Price " + m.getPrice());
        }
    }


    public static void main(String[] args) {
        int randomColour;
        MarkerCollection MarkerCollection = new MarkerCollection();

            Random random = new Random();



        for (int i=1;i<10;i++){

            String [] Colours={"BLACK","BLUE","RED","GREEN"};
            randomColour = random.nextInt(Colours.length);

            Marker2 m= new Marker2();
            m.setId(i);
            m.setCompany("Camlin" + i);
            m.setType("White" + i);
            m.setColour(Colours[randomColour]);
            m.setPrice((i+100)*2.5);
            MarkerCollection.addMarker(m);

        }
        MarkerCollection.printMarkers();

    }
}
