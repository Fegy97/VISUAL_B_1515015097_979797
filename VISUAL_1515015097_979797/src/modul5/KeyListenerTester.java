/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author ASUS.DX
 */
import static com.sun.glass.ui.Cursor.setVisible;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.*;
import java.awt.event.*;
public class KeyListenerTester extends Frame implements KeyListener {
    TextField t1;
    Label l1;
    
    public KeyListenerTester(String s){
        super(s);
            Panel p = new Panel();
            l1 = new Label ("Key Listener!");
            p.add(l1);
            add(p);
            addKeyListenerTester (this);
            setSize (200,100);
            setVisible(true);
            addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e) 
                {
                    System.exit(0);
                }
            });
        
    }

    private void add(Panel p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addKeyListenerTester(KeyListenerTester aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void keyTyped (keyEvent e){
        l1.setText("Key Typed");
    }
    public void keyPressed (keyEvent e){
        
        l1.setText("Key Pressed");
    }
    public void keyReleased(keyEvent e){
        l1.setText("keyReleased");
    }
    public static void main (String[]args){
        new KeyListenerTester ("Key Listener Tester");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class keyEvent {

        public keyEvent() {
        }
    }

    private static class viod {

        public viod() {
        }
    }
    
}
