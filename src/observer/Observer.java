/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;
/**
 *
 * @author user
 */
import java.util.Scanner;
public class Observer {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        HeadQuater obj = new HeadQuater();
        Registrant1 obj1 = new Registrant1();
        Registrant2 obj2 = new Registrant2();
        
        obj.register(obj1);
        obj.register(obj2);
        
        boolean b = true;
        while(b) {
            System.out.print("Enter Score " );
            String str = sc.nextLine();
            if(str.equals("")) {
                break;
            }
            obj.setSomeData(str);
        }
    }
}