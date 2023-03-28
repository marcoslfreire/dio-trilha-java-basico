public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudaCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentaCanal(){
        canal++;
    }
    public void diminuiCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
    }


    public void diminuiVolume(){
        volume--;
    }

    public void ligar(){
        ligada = true;
    }

    public void ligada(){
        ligada = false;
    }
}

