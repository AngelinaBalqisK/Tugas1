/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angel.relasiclass.percobaan1;

//  @author USER
public class MainPercobaan1 {
    public static void main(String[] args){
        Processor p = new Processor("Intel i5", 3);;
        Laptop L = new Laptop("Thinkpad", p);
        L.info();
        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop L1 = new Laptop();
        L1.setMerk("Thikpad");
        L1.setProc(p1);
        L1.info();  
    }
}
