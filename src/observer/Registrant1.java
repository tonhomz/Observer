/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author sarun
 */
public class Registrant1 implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println("Live Result : " +((HeadQuater)o).getSomeData());
   }
}
