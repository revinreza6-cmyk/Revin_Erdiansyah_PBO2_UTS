/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyfactory;

/**
 *
 * @author Vin
 */
public class Tiket {
    private String jenis;
    private int jarak;
    private PricingStrategy strategy;

    public Tiket(String jenis, int jarak, PricingStrategy strategy) {
        this.jenis = jenis;
        this.jarak = jarak;
        this.strategy = strategy;
    }

    public double getPrice() {
        return strategy.calculatePrice(jarak);
    }

    public void display() {
        System.out.println("Jenis Tiket : " + jenis);
        System.out.println("Jarak       : " + jarak + " km");
        System.out.println("Harga       : Rp " + getPrice());
    }
}
