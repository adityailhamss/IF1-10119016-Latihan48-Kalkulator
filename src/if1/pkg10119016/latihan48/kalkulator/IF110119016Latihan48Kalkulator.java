
package if1.pkg10119016.latihan48.kalkulator;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program 
 * kalkulator menggunakan getter setter
 */
public class IF110119016Latihan48Kalkulator {

    public static void main(String[] args) {
    Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7.0);
        kalkulator.setValue2(5.0);
        double value1 = kalkulator.getValue1();
        double value2 = kalkulator.getValue2();
        System.out.println("VALUE 1 = " + value1);
        System.out.println("VALUE 2 = " + value2);
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        double add = kalkulator.add(value1, value2);
        double minus = kalkulator.minus(value1, value2);
        double multiplication = kalkulator.multiplication(value1, value2);
        double division = kalkulator.division(value1, value2);
        System.out.println("Result Add is = " + add);
        System.out.println("Result Minus is = " + minus);
        System.out.println("Result Multiple is = " + multiplication);
        System.out.println("Result Division is = " + division);
    }
    
}
