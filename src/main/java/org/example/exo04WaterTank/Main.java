package org.example.exo04WaterTank;

public class Main {
    public static void main(String[] args) {
        WaterTank waterTank1 = new WaterTank(200, 500);
        WaterTank waterTank2 = new WaterTank(250, 650);

        System.out.println(waterTank1);
        System.out.println(waterTank2);

        System.out.println("Volume total des WaterTank au départ :"+ WaterTank.getTotalFillLevel());
        System.out.println("WaterTank 1 volume de départ "+ waterTank1.getFillLevel());
        System.out.println("WaterTank 2 volume de départ "+waterTank2.getFillLevel());

        System.out.println("Volume total des WaterTank :"+ WaterTank.getTotalFillLevel());

    }
}
