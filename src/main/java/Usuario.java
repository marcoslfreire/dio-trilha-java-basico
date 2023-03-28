import com.sun.media.sound.SimpleSoundbank;
import com.sun.org.apache.xerces.internal.impl.xs.util.XSInputSource;

import javax.xml.transform.stream.StreamSource;

public class Usuario {
    public static void main(String[] args) {
        System.out.println("==================================================");
       SmartTV smartTV = new SmartTV();
       smartTV.mudaCanal(7);
       smartTV.aumentaCanal();
       smartTV.aumentaCanal();
       smartTV.aumentaCanal();
       smartTV.diminuiCanal();
       System.out.println("Canal: " + smartTV.canal);
       smartTV.aumentarVolume();
       smartTV.aumentarVolume();
       smartTV.aumentarVolume();
       smartTV.aumentarVolume();
       smartTV.aumentarVolume();
       System.out.println("Volume Atual ? " + smartTV.volume);
       System.out.println("Tv ligada ? " + smartTV.ligada);
       System.out.println("Canal Atual ? " + smartTV.canal);
       System.out.println("Volume Atual ? " + smartTV.volume);
       smartTV.ligar();
       System.out.println("novo Tv ligada ? " + smartTV.ligada);
       smartTV.ligada();
       System.out.println("novo Tv ligada ? " + smartTV.ligada);
       System.out.println("==================================================");
    }
    }

