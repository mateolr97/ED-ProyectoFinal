package guifinal;
import java.util.Random;

public class Juego {
    //Hay dos árboles AVL de enemigos, uno los ordena por vida y el otro por nombre
    private TablaHash enemigos;
    public Tienda tienda;
    public Heroe[] heroes;
    private Cola turnos;
    private int nivel;
    

    
    //Constructor del juego, recibe el número de heroes
    public Juego(int k) {
        this.enemigos=new TablaHash();
        this.tienda=new Tienda();
        this.heroes=new Heroe[k];
        this.turnos=new Cola();
        this.nivel=1;
    }
    
    //Cambiar tamaño arreglo héroes
    public void resizeHeroes(int size){
        Heroe[] temp=new Heroe[size];
        this.heroes=temp;    
    }

    //Getters y Setters

    public TablaHash getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(TablaHash enemigos) {
        this.enemigos = enemigos;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Heroe[] getHeroes() {
        return heroes;
    }

    public void setHeroes(Heroe[] heroes) {
        this.heroes = heroes;
    }

    public Cola getTurnos() {
        return turnos;
    }

    public void setTurnos(Cola turnos) {
        this.turnos = turnos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
    
    //Métodos del juego
    
    public void ordenar(){
        Heroe aux=new Heroe();
        for(int i=0;i<heroes.length-1;i++){
            for(int j=0;j<heroes.length-1;j++){
                if(heroes[j].getTurno()>heroes[j+1].getTurno()){
                    aux=heroes[j];
                    heroes[j]=heroes[j+1];
                    heroes[j+1]=aux;
                }
            }
        }
        //Guarda en la cola los nombres de los heroes segun el turno (juegan primero los que sacaron menos)
        
        for(Heroe h: this.heroes){
            this.turnos.enqueue(h.getNombre());
        }
    }
    
    public void ordenarHeroesxTurno(){
        this.asignarTurnos();
        Heroe aux=new Heroe();
        for(int i=0;i<heroes.length-1;i++){
            for(int j=0;j<heroes.length-1;j++){
                if(heroes[j].getTurno()>heroes[j+1].getTurno()){
                    aux=heroes[j];
                    heroes[j]=heroes[j+1];
                    heroes[j+1]=aux;
                }
            }
        }
        //Guarda en la cola los nombres de los heroes segun el turno (juegan primero los que sacaron menos)
        
        for(Heroe h: this.heroes){
            this.turnos.enqueue(h.getNombre());
        }
    }
    
    public String listaNombreHeroes(){
        String salida="";
        for(int i=0;i<heroes.length;i++){
            salida=salida+heroes[i].getNombre()+"\n";
        }
        return salida;
    }
    
    public void asignarTurnos(){
            int numero =0;
            for(int i=0;i<this.heroes.length;i++){
                numero=(int) (Math.random() * 10000);
                heroes[i].setTurno(numero);
            }        
    }
    
    public void añadirObjetoTienda(String nombre,int aumento,String info,int costo){
        this.tienda.addObjeto(nombre,aumento, info, costo);
    }
    
    public Objeto buscarObjetoXNombre(String nombre){
        Objeto o=new Objeto();
        
        for (Objeto objeto : this.tienda.getObjetos()) {
            if (objeto.getNombre().equals(nombre)) {
                o = objeto;
                break;
            }
        }
        
        if(o.getCosto()!=0){
            return o;
        }else{
            return null;
        }
    }
    
    public boolean comprarObjeto(String nombreHeroe,String nombreObjeto){
        int i=0;
        Heroe h=new Heroe();
        h=this.buscarHeroexNombre(nombreHeroe);
        Objeto o=new Objeto();
        o=this.buscarObjetoXNombre(nombreObjeto);
        if(h.getOro()>=o.getCosto()){
            while(h.getInventario()[i]!=null){
                i++;
            }
            h.getInventario()[i]=o;
            //Reduce el oro del heroe un total del costo del objeto
            h.setOro(h.getOro()-o.getCosto());
            if("Magia".equals(o.getInfo())){
                h.setMagia(h.getMagia()+o.getAumento());
            }else if("Fuerza".equals(o.getInfo())){
                h.setFuerza(h.getFuerza()+o.getAumento());
            }
            return true;
        }else{
            return false;
        }
        
    }
    
    public void agregarEnemigo(String nombre,int vida,int fuerza,int defensa){
        Enemigo e=new Enemigo(nombre,vida,fuerza,defensa);
        this.enemigos.insert(e);
    }
    
    //Elimina enemigo de la tabla hash de enemigos
    public void eliminarEnemigo(Enemigo e){
        this.enemigos.delete(e);
    }
    
    public void agregarHeroe(String clase,String nombre){
        int i=0;
        while(heroes[i]!=null){
            i++;
        }
        if(clase=="Guerrero"){
            Guerrero h=new Guerrero(nombre);
            heroes[i]=h;
        }else if(clase=="Mago"){
            Mago h=new Mago(nombre);
            heroes[i]=h;
        }else if(clase=="Sacerdote"){
            Sacerdote h=new Sacerdote(nombre);
            heroes[i]=h;
        }      
    }
    
    public void addHeroe(Heroe h){
        for(int i=0;i<this.heroes.length;i++){
            if(this.heroes[i]==null){
                this.heroes[i]=h;
                break;
            }
        }
    }
    
    public Heroe buscarHeroexNombre(String nombre){
        Heroe h=new Heroe();
        //Encuentro al heroe
        for(Heroe hh: heroes){
            if(hh.getNombre().equals(nombre)){
                h=hh;
                break;
            }
        }
        if(h.getVida()!=0){
            return h;
        }else{
            return null;
        }
    }
    
    public void aumentarOro(int oro){   
        for(Heroe h: heroes){
            h.setOro(h.getOro()+oro);
        }
    }
    
public void generarEnemigos(){
        int numero=0,numero1=0,a1=0,a2=0;
        Random r=new Random();
        String[] nombres1=new String[4];
        nombres1[0]="Dragón";
        nombres1[1]="Hechicero";
        nombres1[2]="Orco";
        nombres1[3]="No-muerto";
        String[] nombres2=new String[4];
        nombres2[0]="uribista";
        nombres2[1]="oscuro";
        nombres2[2]="supremo";
        nombres2[3]="mortal";
        
        String nombre="";
        for(int i=0;i<heroes.length;i++){
            a1=r.nextInt(3);
            a2=r.nextInt(3);
            nombre=nombres1[a1]+" "+nombres2[a2];
            numero=(int) (Math.random() *this.nivel *200)+100*this.nivel;
            numero1=(int) (Math.random() *this.nivel *20)+10*this.nivel;
            this.agregarEnemigo(nombre, numero, numero1, numero1-(numero1/3));
        }
    }

    
 public void atacar(String nombreEnemigo,String hechizo){
        String nombreHeroe="";
        nombreHeroe=this.turnos.dequeue();
        this.turnos.enqueue(nombreHeroe);
        int dmgHeroe=-1,dmgEnemigo=-1,vidao=0,recompensa=0;
        Heroe h=new Heroe();
        Enemigo e=new Enemigo();
        
        //Encuentro al heroe
        for(Heroe hh: heroes){
            if(hh.getNombre().equals(nombreHeroe)){
                h=hh;
                break;
            }
        }
        //Encuentro al enemigo
        e=this.enemigos.find(nombreEnemigo);
        
        
        //Que tipo de heroe es y que hechizo va a usar
        if(h instanceof Guerrero && h.getVidas()>0){
            if("Golpe mortal".equals(hechizo)){
                dmgHeroe=((Guerrero) h).golpeMortal();
            }else if("Golpe heroico".equals(hechizo)){
                dmgHeroe=((Guerrero) h).golpeHeroico();
            }
        }else if(h instanceof Mago && h.getVidas()>0){
            if("Bola de fuego".equals(hechizo)){
                dmgHeroe=((Mago) h).bolaDeFuego();
            }else if("Lanza de hielo".equals(hechizo)){
                dmgHeroe=((Mago) h).LanzaDeHielo();
            }
        }else if(h instanceof Sacerdote && h.getVidas()>0){
            if("Rezar".equals(hechizo)){
                ((Sacerdote) h).rezar();
            }else if("Curar".equals(hechizo)){
                dmgHeroe=(-1)*(((Sacerdote) h).curar());
            }
        }
        
        //Guardo vida original enemigo(para la recompensa)
        vidao=e.getVida();
        
        if(dmgHeroe>=0){
            //Ataca heroe
            e.setVida(e.getVida()-dmgHeroe+e.getDefensa());
            if(e.getVida()>0){
                //Enemigo ataca si no ha muerto
                h.setVida(h.getVida()-(e.getAtaque()*2)+h.getDefensa());
                if(h.getVida()<=0){
                    h.setVidas(h.getVidas()-1);
                }
            }else{
                //Si el enemigo muere, los heroes obtienen oro y se suma un asesinato
                e.setVida(0);
                recompensa=vidao/2;
                this.aumentarOro(recompensa);
                h.setAsesinatos(h.getAsesinatos()+1);
                this.eliminarEnemigo(this.enemigos.find(nombreEnemigo));
            }
        }else{
            //El sacerdote cura al aliado con menos vida
            Heroe min=new Heroe();
            min=heroes[0];
            int j=0;
            for(int i=0;i<this.heroes.length;i++){
                if(heroes[i].getVida()<min.getVida()){
                    min=heroes[i];
                    j=i;
                }
            }
            heroes[j].setVida(heroes[j].getVida()-dmgHeroe);
        }
    }
    
   
    /*
    public Enemigo[] enemigos(Node n){
        Enemigo[] e=new Enemigo[this.enemigos.getSize()];
        Enemigo h=new Enemigo();
        Node y=new Node();
        int i=0;
        
        Queue q=new Queue();
        q.enqueue(n);
        
        while(q.isEmpty()==false){
            i=0;
            y=q.dequeue();
            h=y.getKey();
            while(e[i]!=null){
                i++;
            }
            e[i]=h;
            if(y.getLeft()!=null){
                q.enqueue(y.getLeft());
            }
            if(y.getRight()!=null){
                q.enqueue(y.getRight());
            }
        }
        return e;
    }
    */
    
    public Enemigo[] enemigos(){
        int indice=0;
        Enemigo[] e=new Enemigo[this.enemigos.getNumElementos()];
        for(int i=0;i<this.enemigos.getTabla().length;i++){
            if(this.enemigos.getTabla()[i]!=null){
                for(int j=0;j<this.enemigos.getTabla()[i].getSize();j++){
                    e[indice]=this.enemigos.getTabla()[i].getN(j).getDato();
                    indice++;
                }   
            }
           
        }
        return e;
    }
    
    public boolean noEnemigos(){
        if(this.enemigos.getNumElementos()==0){
            return true;
        }else{
            return false;
        }
    }
    
    public void aumentarNivel(){
        this.nivel++;
    }
    
    public String nombresH(){
        String salida="";
        for(Heroe hh: heroes){
            salida+=hh.getNombre()+"\n";
        }
        return salida;
    }
    
}
