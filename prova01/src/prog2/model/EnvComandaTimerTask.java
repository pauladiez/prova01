/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.model;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class EnvComandaTimerTask extends TimerTask {    
    private Comanda comanda;
    
    public EnvComandaTimerTask(Comanda comanda){
        this.comanda = comanda;
    }
    
    public void run(){
        if(!this.comanda.getCancelada()){
            this.comanda.setEnviada(true);
            JOptionPane.showMessageDialog(null, "Comanda Enviada: " + this.comanda);
            boolean daemon = true;
            Timer timer = new Timer(daemon); // Create timer with a daemon thread to avoid blocking program termination
            long tempsRebudaMilisegs = this.comanda.tempsRebuda() * 1000;
            timer.schedule(new RebComandaTimerTask(this.comanda), tempsRebudaMilisegs);
        }
    }
}
