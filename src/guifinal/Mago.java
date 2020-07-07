package guifinal;

public class Mago extends Heroe{
    
    
    private int mana;
    
    public Mago(String nombre) {
        super(nombre);
        this.fuerza=1;
        this.vida=200;
        this.defensa=10;
        this.magia=20;
        this.mana=(this.magia*8);      
    }
 
    
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
    public int bolaDeFuego(){
        if(this.mana>=15){
            this.mana = mana - 15;
            return 4*(this.magia);
        }else{
            return 0;
        }
        
    }
    
    public int LanzaDeHielo(){
        if(this.mana>=5){
            this.mana = mana - 5;
            return 2*(this.magia);
        }else{
            return 0;
        }
        
    }
}
