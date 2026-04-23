/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategyfactory;

/**
 *
 * @author Vin
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Pemesanan Tiket ===");
        System.out.print("Masukkan jenis tiket (bus/kereta/pesawat): ");
        String jenis = input.nextLine();

        System.out.print("Masukkan jarak (km): ");
        int jarak = input.nextInt();

        try {
            PricingStrategy strategy = StrategyFactory.create(jenis);
            Tiket ticket = new Tiket(jenis, jarak, strategy);

            System.out.println("\n=== Detail Tiket ===");
            ticket.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
