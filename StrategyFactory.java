/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyfactory;

/**
 *
 * @author Vin
 */
public class StrategyFactory  {
    public static PricingStrategy create(String type) {
        switch (type.toLowerCase()) {
            case "bus":
                return new BusStrategy();
            case "kereta":
                return new KeretaStrategy();
            case "pesawat":
                return new PesawatStrategy();
            default:
                throw new IllegalArgumentException("Jenis tiket tidak valid");
        }
    }
}

