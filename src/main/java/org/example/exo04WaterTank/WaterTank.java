package org.example.exo04WaterTank;

public class WaterTank {
    private int weight = 0;
    private int max;
    private int fillLevel;
    private static int totalFillLevel = 0;

    public WaterTank(int weight, int max, int fillLevel) {
        this.weight = weight;
        this.max = max;
        this.fillLevel = fillLevel;
    }

    public WaterTank(int weight, int max) {
        this.weight = weight;
        this.max = max;
        this.fillLevel = 0;
    }

    public WaterTank() {

    }

    public void fill(int qt) {
        if (fillLevel + qt > max) {
            System.out.println("Impossible de rajouter, la citerne va déborder");
        } else {
            fillLevel += qt;
            totalFillLevel += qt;
        }
    }

    public void clean(int qt) {
        if (qt <= fillLevel) {
            System.out.println("Vous souhaitez retirer plus que possible !!!");
        } else {
            fillLevel -= qt;
            totalFillLevel -= qt;
        }
    }

    public static int getTotalFillLevel() {
        return totalFillLevel;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFillLevel() {
        return fillLevel;
    }

    public void setFillLevel(int fillLevel) {
        this.fillLevel = fillLevel;
    }

    @Override
    public String toString() {
        return "WaterTank {" + "Poid à vide: " +
                getWeight() +
                ", Capacite max: " +
                getMax() +
                ", Volume de remplissage: " +
                getFillLevel()
                + " }";

    }

}

