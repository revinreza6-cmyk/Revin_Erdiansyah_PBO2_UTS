/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyfactory;

/**
 *
 * @author Vin
 */
public class PesawatStrategy implements PricingStrategy {
    public double calculatePrice(int distance) {
        return distance * 3000;
    }  
}
