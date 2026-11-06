package org.example;

class RoundTable {
    private double diameter;
    private String material;
    private int count;
    public RoundTable(double diameter, String material, int count){
        this(diameter,material);
        this.count = count;
    }
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }
    public RoundTable(double diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    public double area() {
        return Math.PI * (diameter / 2) * (diameter / 2);
    }

    public double getDiameter() {
        return diameter;
    }

    public String getMaterial() {
        return material;
    }
}
