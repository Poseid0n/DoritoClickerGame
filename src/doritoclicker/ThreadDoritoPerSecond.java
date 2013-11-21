/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doritoclicker;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Poseidon
 */
public class ThreadDoritoPerSecond implements Runnable {

    DoritoClicker _d;

    public ThreadDoritoPerSecond(DoritoClicker d) {
        _d = d;
    }

    public void run() {
        while (true == true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDoritoPerSecond.class.getName()).log(Level.SEVERE, null, ex);
            }
            _d.doritos.addDoritos(_d.doritos.getDps());
            _d.refreshDoritoCount();
        }
    }
}
