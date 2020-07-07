package guifinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import java.util.Scanner;
import javafx.scene.layout.Pane;

public class FXMLDocumentController implements Initializable {
    
@FXML private Label NumPlayersLabel;
@FXML private Label ErrorJugadores;
@FXML private Label HeroeNum;
@FXML private Label Clase;
@FXML private Label LabelNumHeroe;
@FXML private Label LabelNombre;
@FXML private Label LabelClase;
@FXML private Label LabelFuerza;
@FXML private Label LabelVida;
@FXML private Label LabelMagia;
@FXML private Label LabelDefensa;
@FXML private Label E1;
@FXML private Label E1Vida;
@FXML private Label E1Fuerza;
@FXML private Label E1Defensa;
@FXML private Label E2;
@FXML private Label E2Vida;
@FXML private Label E2Fuerza;
@FXML private Label E2Defensa;
@FXML private Label E3;
@FXML private Label E3Vida;
@FXML private Label E3Fuerza;
@FXML private Label E3Defensa;
@FXML private Label E4;
@FXML private Label E4Vida;
@FXML private Label E4Fuerza;
@FXML private Label E4Defensa;
@FXML private Label E5;
@FXML private Label E5Vida;
@FXML private Label E5Fuerza;
@FXML private Label E5Defensa;
@FXML private Label Nivel;
@FXML private Label VidaG;
@FXML private Label FuerzaG;
@FXML private Label DefensaG;
@FXML private Label MagiaG;
@FXML private Label mAsesinatos;
@FXML private Label mOro;
@FXML private Label mObjetos;
@FXML private Label NombreObjeto;
@FXML private Label InfoObjeto;
@FXML private Label PrecioObjeto;
@FXML private Label OroRestante;
@FXML private Label ErrorCompra;
@FXML private Label JugadorAtacando;
@FXML private Label VidaJugador;
@FXML private Label RecursoJugador;
@FXML private Label VEnemigo1;
@FXML private Label VEnemigo2;
@FXML private Label VEnemigo3;
@FXML private Label VEnemigo4;
@FXML private Label VEnemigo5;
@FXML private Label ErrorAtacando;
@FXML private Button ConfirmarButton;
@FXML private Button CrearPersonaje;
@FXML private Button RegresarPersonaje;
@FXML private Button GrupoButton;
@FXML private Button EstadisticasButton;
@FXML private Button TiendaButton;
@FXML private Button RegresarButton;
@FXML private Button RegresarButton1;
@FXML private TextField NumPlayers;
@FXML private TextField NombreHeroe;
@FXML private RadioButton GuerreroButton;
@FXML private RadioButton MagoButton;
@FXML private RadioButton SacerdoteButton;
@FXML private RadioButton Enemigo1;
@FXML private RadioButton Enemigo2;
@FXML private RadioButton Enemigo3;
@FXML private RadioButton Enemigo4;
@FXML private RadioButton Enemigo5;
@FXML private RadioButton Spell1;
@FXML private RadioButton Spell2;
@FXML private AnchorPane CreacionPersonaje;
@FXML private AnchorPane ConfirmarPersonaje;
@FXML private AnchorPane MainMenu;
@FXML private AnchorPane GroupMenu;
@FXML private AnchorPane StatsMenu;
@FXML private AnchorPane TiendaMenu;
@FXML private AnchorPane ConfirmacionCompra;
@FXML private AnchorPane CombateMenu;
@FXML private ComboBox SeleccionarHeroe;
@FXML private ComboBox SeleccionarObjeto;
@FXML private ComboBox Grupo;
@FXML private ImageView Warrior;
@FXML private ImageView Mage;
@FXML private ImageView Priest;
@FXML private ImageView Logo;
@FXML private ImageView Spell1Image;
@FXML private ImageView Spell2Image;
@FXML private Pane NivelPane;
private ToggleGroup ClassToggleGroup;
private ToggleGroup SpellToggleGroup;
private ToggleGroup EnemiesToggleGroup;


  
//Inicio de Partida
Juego juego;
String NumJugadores;
String texto = "";
int jugadores = 0;
int NumHeroe = 0;
int nivel = 1;

//Creacion Personajes

String nombre = "";
String clase = "";
int n = 0;
int contador = 0;
int numerador = 1;
Image WarriorIcon;
Image MageIcon;
Image PriestIcon;
Image DLogo;

//Generar Enemigos Menu principal

Enemigo[] enemigo;
int v1 = 0;
int f1 = 0;
int d1 = 0;
int v2 = 0;
int f2 = 0;
int d2 = 0;
int v3 = 0;
int f3 = 0;
int d3 = 0;
int v4 = 0;
int f4 = 0;
int d4 = 0;
int v5 = 0;
int f5 = 0;
int d5 = 0;

//Menu Grupo

String v;
String f;
String m;
String d;
String x;
String s;
Objeto[] inv;
int t;
int j = 0;

//Menu Estadísticas

int a = 0;
int o = 0;
int ob = 0;
int k = 0;

//Menu Tienda

String obj;
String h;
int tamano;
int l = 0;
int p;
int oro;
int oroR;
Objeto item;
Heroe hero;

//Combate

Enemigo atacado;
String atacando;
Heroe atacante;
Image GolpeMortalIcon;
Image GolpeHeroicoIcon;
Image BolaDeFuegoIcon;
Image LanzaDeHieloIcon;
Image RezarIcon;
Image CurarIcon;
int vmaxJugador = 0;
int vmax1 = 0;
int vmax2 = 0;
int vmax3 = 0;
int vmax4 = 0;
int vmax5 = 0;
int furia = 0;
int mana = 160;
int fe = 0;
   
    
public void ConfirmarButtonPushed(){
    texto = ConfirmarButton.getText();
    if(texto.equalsIgnoreCase("Iniciar Juego")){
        NumJugadores = NumPlayers.getText();
        if(!NumJugadores.isEmpty()){
            jugadores = Integer.parseInt(NumJugadores);
        }
        if(jugadores >= 1 && jugadores <= 5){  
            try{
            File file1 = new File("Docs\\heroes.txt");
            Scanner ss=new Scanner(file1);
            if(ss.hasNext()){
                    
                    //Heroes y nivel
                    int x=0,aumento=0,costo=0,vida=0,oro=0,asesinatos=0,numObjetos=0,turno=0;
                    String clase="",name="",nombreObjeto="",info="";
                    // Número de héroes
                    x=ss.nextInt();
                    ss.nextLine();
                    juego.resizeHeroes(x);
                    Heroe hh=new Heroe();
                    for(int j=0;j<x;j++){
     
                        //Agrego héroes a juego
                       name=ss.nextLine();
                        
                       //ss.nextLine();
                       clase=ss.nextLine();
                       //ss.nextLine();
                       

                       if("Guerrero".equals(clase)){
                            Guerrero h=new Guerrero(name);
                            
                            hh=h;
                        }else if("Mago".equals(clase)){
                            Mago h=new Mago(name);   
                            
                            hh=h;
                        }else if("Sacerdote".equals(clase)){
                            Sacerdote h=new Sacerdote(name);
                            
                            hh=h;
                        } 
                        
                       //Vida
                       vida=ss.nextInt();
                       hh.setVida(vida);
                       //Oro
                       oro=ss.nextInt();
                       hh.setOro(oro);
                       //Asesinatos
                       asesinatos=ss.nextInt();
                       hh.setAsesinatos(asesinatos);
                       //Turno
                       turno=ss.nextInt();
                       hh.setTurno(turno);
                       //Objetos
                       numObjetos=ss.nextInt();
                       ss.nextLine();
                       //Agrego objetos y aumento atributos héroe
                       for(int k=0;k<numObjetos;k++){
                           nombreObjeto=ss.nextLine();
                           aumento=ss.nextInt();
                           ss.nextLine();
                           info=ss.nextLine();
                           costo=ss.nextInt();
                           Objeto o=new Objeto(nombreObjeto,aumento,info,costo);
                           hh.agregarObjeto(o);        
                       }
                       
                       juego.addHeroe(hh);
                       
                       
                    }
                    //Cambiar nivel del juego
                    x=ss.nextInt();
                    juego.setNivel(x);
                    //juego.ordenar();
                    ss.close();
                    MainMenu.setVisible(true);
                    ConfirmarButton.setVisible(false);
        juego.ordenarHeroesxTurno();
        atacando = juego.getTurnos().peek();
        juego.setNivel(nivel);
        juego.generarEnemigos();
        ConfirmarPersonaje.setVisible(false);
        MainMenu.setVisible(true);
        Nivel.setText("Nivel " + String.valueOf(juego.getNivel()));
        enemigo = juego.enemigos();
        if(juego.heroes.length != 0){
            if(juego.heroes.length == 1){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                E2Vida.setText("");
                E2Fuerza.setText("");
                E2Defensa.setText("");
                E3Vida.setText("");
                E3Fuerza.setText("");
                E3Defensa.setText("");
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 2){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                E3Vida.setText("");
                E3Fuerza.setText("");
                E3Defensa.setText("");
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 3){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 4){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                v4 = enemigo[3].getVida();
                f4 = enemigo[3].getAtaque();
                d4 = enemigo[3].getDefensa();
                E4.setText(enemigo[3].getNombre());
                E4Vida.setText("Vida: " + String.valueOf(v4));
                E4Fuerza.setText("Fuerza: " + String.valueOf(f4));
                E4Defensa.setText("Defensa: " + String.valueOf(d4));
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 5){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                v4 = enemigo[3].getVida();
                f4 = enemigo[3].getAtaque();
                d4 = enemigo[3].getDefensa();
                E4.setText(enemigo[3].getNombre());
                E4Vida.setText("Vida: " + String.valueOf(v4));
                E4Fuerza.setText("Fuerza: " + String.valueOf(f4));
                E4Defensa.setText("Defensa: " + String.valueOf(d4));
                v5 = enemigo[4].getVida();
                f5 = enemigo[4].getAtaque();
                d5 = enemigo[4].getDefensa();
                E5.setText(enemigo[4].getNombre());
                E5Vida.setText("Vida: " + String.valueOf(v5));
                E5Fuerza.setText("Fuerza: " + String.valueOf(f5));
                E5Defensa.setText("Defensa: " + String.valueOf(d5));
            }
        }
                }else{
            juego.resizeHeroes(jugadores);
            CreacionPersonaje.setVisible(true);
            ConfirmarButton.setText("Crear Personaje");
            }
            }catch (FileNotFoundException ex) {
                Logger.getLogger(GUIFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
            juego.añadirObjetoTienda("Daga", 5, "Fuerza", 10);
            juego.añadirObjetoTienda("Varita", 5, "Magia", 10);
            juego.añadirObjetoTienda("Espada", 10, "Fuerza", 50);
            juego.añadirObjetoTienda("Grimorio", 10, "Magia", 50);
            juego.añadirObjetoTienda("Hacha", 20, "Fuerza", 100);
            juego.añadirObjetoTienda("Báculo", 20, "Magia", 100);
            if(juego.heroes[0] == null){
                for(int i = 0; i < jugadores; i++){
                    NumHeroe = i+1;
                    juego.heroes[i] = new Heroe("Jugador " + NumHeroe);
                }
            }
            Logo.setVisible(false);
            NumPlayersLabel.setVisible(false);
            NumPlayers.setVisible(false);
            ErrorJugadores.setVisible(false);
            texto = ConfirmarButton.getText();
            HeroeNum.setText("Heroe #" + numerador);
            }else{
                ErrorJugadores.setVisible(true);
            }
    }else if(texto.equalsIgnoreCase("Iniciar")){
            try{
            File file1 = new File("Docs\\heroes.txt");
            Scanner ss=new Scanner(file1);
            if(ss.hasNext()){
                    
                    //Heroes y nivel
                    int x=0,aumento=0,costo=0,vida=0,oro=0,asesinatos=0,numObjetos=0,turno=0;
                    String clase="",name="",nombreObjeto="",info="";
                    // Número de héroes
                    x=ss.nextInt();
                    ss.nextLine();
                    juego.resizeHeroes(x);
                    Heroe hh=new Heroe();
                    for(int j=0;j<x;j++){
     
                        //Agrego héroes a juego
                       name=ss.nextLine();
                        
                       //ss.nextLine();
                       clase=ss.nextLine();
                       //ss.nextLine();
                       

                       if("Guerrero".equals(clase)){
                            Guerrero h=new Guerrero(name);
                            
                            hh=h;
                        }else if("Mago".equals(clase)){
                            Mago h=new Mago(name);   
                            
                            hh=h;
                        }else if("Sacerdote".equals(clase)){
                            Sacerdote h=new Sacerdote(name);
                            
                            hh=h;
                        } 
                        
                       //Vida
                       vida=ss.nextInt();
                       hh.setVida(vida);
                       //Oro
                       oro=ss.nextInt();
                       hh.setOro(oro);
                       //Asesinatos
                       asesinatos=ss.nextInt();
                       hh.setAsesinatos(asesinatos);
                       //Turno
                       turno=ss.nextInt();
                       hh.setTurno(turno);
                       //Objetos
                       numObjetos=ss.nextInt();
                       ss.nextLine();
                       //Agrego objetos y aumento atributos héroe
                       for(int k=0;k<numObjetos;k++){
                           nombreObjeto=ss.nextLine();
                           aumento=ss.nextInt();
                           ss.nextLine();
                           info=ss.nextLine();
                           costo=ss.nextInt();
                           Objeto o=new Objeto(nombreObjeto,aumento,info,costo);
                           hh.agregarObjeto(o);        
                       }
                       
                       juego.addHeroe(hh);
                       
                       
                    }
                    //Cambiar nivel del juego
                    x=ss.nextInt();
                    juego.setNivel(x);
                    //juego.ordenar();
                    ss.close();
                    MainMenu.setVisible(true);
                    ConfirmarButton.setVisible(false);
        juego.ordenarHeroesxTurno();
        atacando = juego.getTurnos().peek();
        juego.setNivel(nivel);
        juego.generarEnemigos();
        ConfirmarPersonaje.setVisible(false);
        Logo.setVisible(false);
        ConfirmarButton.setVisible(false);
        MainMenu.setVisible(true);
        Nivel.setText("Nivel " + String.valueOf(juego.getNivel()));
        enemigo = juego.enemigos();
        if(juego.heroes.length != 0){
            if(juego.heroes.length == 1){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                E2Vida.setText("");
                E2Fuerza.setText("");
                E2Defensa.setText("");
                E3Vida.setText("");
                E3Fuerza.setText("");
                E3Defensa.setText("");
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 2){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                E3Vida.setText("");
                E3Fuerza.setText("");
                E3Defensa.setText("");
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 3){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 4){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                v4 = enemigo[3].getVida();
                f4 = enemigo[3].getAtaque();
                d4 = enemigo[3].getDefensa();
                E4.setText(enemigo[3].getNombre());
                E4Vida.setText("Vida: " + String.valueOf(v4));
                E4Fuerza.setText("Fuerza: " + String.valueOf(f4));
                E4Defensa.setText("Defensa: " + String.valueOf(d4));
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 5){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                v4 = enemigo[3].getVida();
                f4 = enemigo[3].getAtaque();
                d4 = enemigo[3].getDefensa();
                E4.setText(enemigo[3].getNombre());
                E4Vida.setText("Vida: " + String.valueOf(v4));
                E4Fuerza.setText("Fuerza: " + String.valueOf(f4));
                E4Defensa.setText("Defensa: " + String.valueOf(d4));
                v5 = enemigo[4].getVida();
                f5 = enemigo[4].getAtaque();
                d5 = enemigo[4].getDefensa();
                E5.setText(enemigo[4].getNombre());
                E5Vida.setText("Vida: " + String.valueOf(v5));
                E5Fuerza.setText("Fuerza: " + String.valueOf(f5));
                E5Defensa.setText("Defensa: " + String.valueOf(d5));
            }
        }
                }else{
            juego.resizeHeroes(jugadores);
            NumPlayers.setVisible(true);
            NumPlayersLabel.setVisible(true);
            ConfirmarButton.setText("Iniciar Juego");
            }
            }catch (FileNotFoundException ex) {
                Logger.getLogger(GUIFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else if(texto.equalsIgnoreCase("Crear Personaje")){
        nombre = NombreHeroe.getText();
        if(!nombre.isEmpty()){
            if(contador < juego.heroes.length){
                nombre = NombreHeroe.getText();
                if(contador != juego.heroes.length){
                    if(GuerreroButton.isSelected()){
                        CreacionPersonaje.setVisible(false);
                        ConfirmarPersonaje.setVisible(true);
                        clase = "Guerrero";
                        ConfirmarButton.setVisible(false);
                        LabelNumHeroe.setText(String.valueOf(numerador));
                        LabelNombre.setText(nombre);
                        LabelClase.setText(clase);
                        LabelFuerza.setText("Fuerza: " + String.valueOf(20));
                        LabelVida.setText("Vida: " + String.valueOf(400));
                        LabelMagia.setText("Magia: " + String.valueOf(20));
                        LabelDefensa.setText("Defensa: " + String.valueOf(5));
                    }else if(MagoButton.isSelected()){
                        CreacionPersonaje.setVisible(false);
                        ConfirmarPersonaje.setVisible(true);
                        clase = "Mago";
                        ConfirmarButton.setVisible(false);
                        LabelNumHeroe.setText(String.valueOf(numerador));
                        LabelNombre.setText(nombre);
                        LabelClase.setText(clase);
                        LabelFuerza.setText("Fuerza: " + String.valueOf(1));
                        LabelVida.setText("Vida: " + String.valueOf(200));
                        LabelMagia.setText("Magia: " + String.valueOf(10));
                        LabelDefensa.setText("Defensa: " + String.valueOf(20));
                    }else if(SacerdoteButton.isSelected()){
                        CreacionPersonaje.setVisible(false);
                        ConfirmarPersonaje.setVisible(true);
                        clase = "Sacerdote";
                        ConfirmarButton.setVisible(false);
                        LabelNumHeroe.setText(String.valueOf(numerador));
                        LabelNombre.setText(nombre);
                        LabelClase.setText(clase);
                        LabelFuerza.setText("Fuerza: " + String.valueOf(1));
                        LabelVida.setText("Vida: " + String.valueOf(300));
                        LabelMagia.setText("Magia: " + String.valueOf(10));
                        LabelDefensa.setText("Defensa: " + String.valueOf(15));
                    }else{
                        Clase.setText("Por favor Seleccione Nombre y Clase");
                        Clase.setTextFill(Color.RED);
                    }
                }
            }
        }else{
            Clase.setText("Por favor Seleccione Nombre y Clase");
            Clase.setTextFill(Color.RED);
        }
    }
}
    
public void CrearPersonajePushed(){
    juego.heroes[contador].setNombre(nombre);
    if(clase.equalsIgnoreCase("Guerrero")){
        juego.heroes[contador] = new Guerrero(nombre);
    }else if(clase.equalsIgnoreCase("Mago")){
        juego.heroes[contador] = new Mago(nombre);
    }else if(clase.equalsIgnoreCase("Sacerdote")){
        juego.heroes[contador] = new Sacerdote(nombre);  
    }
    contador++;
    numerador++;
    ClassToggleGroup.selectToggle(null);
    if(contador < juego.heroes.length){
        ConfirmarPersonaje.setVisible(false);
        CreacionPersonaje.setVisible(true);
        ConfirmarButton.setVisible(true);
        NumHeroe = contador;
        NombreHeroe.setText("");
        HeroeNum.setText("Heroe #" + numerador);
    }else if (contador == juego.heroes.length){
        juego.ordenarHeroesxTurno();
        atacando = juego.getTurnos().peek();
        juego.setNivel(nivel);
        juego.generarEnemigos();
        ConfirmarPersonaje.setVisible(false);
        MainMenu.setVisible(true);
        Nivel.setText("Nivel " + String.valueOf(juego.getNivel()));
        enemigo = juego.enemigos();
        if(juego.heroes.length != 0){
            if(juego.heroes.length == 1){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                E2Vida.setText("");
                E2Fuerza.setText("");
                E2Defensa.setText("");
                E3Vida.setText("");
                E3Fuerza.setText("");
                E3Defensa.setText("");
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 2){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                E3Vida.setText("");
                E3Fuerza.setText("");
                E3Defensa.setText("");
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 3){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 4){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                v4 = enemigo[3].getVida();
                f4 = enemigo[3].getAtaque();
                d4 = enemigo[3].getDefensa();
                E4.setText(enemigo[3].getNombre());
                E4Vida.setText("Vida: " + String.valueOf(v4));
                E4Fuerza.setText("Fuerza: " + String.valueOf(f4));
                E4Defensa.setText("Defensa: " + String.valueOf(d4));
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 5){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                v4 = enemigo[3].getVida();
                f4 = enemigo[3].getAtaque();
                d4 = enemigo[3].getDefensa();
                E4.setText(enemigo[3].getNombre());
                E4Vida.setText("Vida: " + String.valueOf(v4));
                E4Fuerza.setText("Fuerza: " + String.valueOf(f4));
                E4Defensa.setText("Defensa: " + String.valueOf(d4));
                v5 = enemigo[4].getVida();
                f5 = enemigo[4].getAtaque();
                d5 = enemigo[4].getDefensa();
                E5.setText(enemigo[4].getNombre());
                E5Vida.setText("Vida: " + String.valueOf(v5));
                E5Fuerza.setText("Fuerza: " + String.valueOf(f5));
                E5Defensa.setText("Defensa: " + String.valueOf(d5));
            }
        }
    }
}

public void RegresarPersonajePushed(){
    ConfirmarPersonaje.setVisible(false);
    CreacionPersonaje.setVisible(true);
    ConfirmarButton.setVisible(true);
}
    
public void GrupoButtonPushed(){
    for(int i = 0; i < juego.heroes.length; i++){
        SeleccionarHeroe.getItems().add(juego.heroes[i].getNombre());
    }
    MainMenu.setVisible(false);
    GroupMenu.setVisible(true);
}

public void EstadisticasButtonPushed(){
    MainMenu.setVisible(false);
    StatsMenu.setVisible(true);
    a = juego.heroes[0].getAsesinatos();
    o = juego.heroes[0].getOro();
    for (int i = 1; i < juego.heroes.length; i++){
        if(a < juego.heroes[i].getAsesinatos()){
            a = juego.heroes[i].getAsesinatos();
        }
        if(o < juego.heroes[i].getOro()){
            o = juego.heroes[i].getOro();
        }
    }
    mAsesinatos.setText("  " + String.valueOf(a));
    mOro.setText("  " + String.valueOf(o));
    mObjetos.setText("  " + String.valueOf(ob));
}

public void TiendaButtonPushed(){
    MainMenu.setVisible(false);
    TiendaMenu.setVisible(true);
        for(int i = 0; i < juego.getTienda().objetos.length; i++){
            SeleccionarObjeto.getItems().add(juego.getTienda().objetos[i].getNombre());
        }
        for(int i = 0; i < juego.heroes.length; i++){
            Grupo.getItems().add(juego.heroes[i].getNombre());
        }
    a = juego.heroes[0].getAsesinatos();
    o = juego.heroes[0].getOro();
    for (int i = 1; i < juego.heroes.length; i++){
        if(a < juego.heroes[i].getAsesinatos()){
            a = juego.heroes[i].getAsesinatos();
        }
        if(o < juego.heroes[i].getOro()){
            o = juego.heroes[i].getOro();
        }
    }
    mAsesinatos.setText("  " + String.valueOf(a));
    mOro.setText("  " + String.valueOf(o));
    mObjetos.setText("  " + String.valueOf(ob));
}

public void GuardarProgresoPushed(){
    try{
            File file1 = new File("Docs\\heroes.txt");
                    PrintStream flujoSalida1=new PrintStream(file1);
                    if(juego.getHeroes().length>0){
                        flujoSalida1.println(juego.getHeroes().length);
                        for(int i=0;i<juego.getHeroes().length;i++){
                            flujoSalida1.println(juego.getHeroes()[i].getNombre());

                            if(juego.getHeroes()[i] instanceof Guerrero){
                                flujoSalida1.println("Guerrero");
                            }else if(juego.getHeroes()[i] instanceof Mago){
                                flujoSalida1.println("Mago");
                            }else if(juego.getHeroes()[i] instanceof Sacerdote){
                                flujoSalida1.println("Sacerdote");
                            }
                            flujoSalida1.println(juego.getHeroes()[i].getVida());
                            flujoSalida1.println(juego.getHeroes()[i].getOro());
                            flujoSalida1.println(juego.getHeroes()[i].getAsesinatos());
                            flujoSalida1.println(juego.getHeroes()[i].getTurno());
                            flujoSalida1.println(juego.getHeroes()[i].getNumObjetos());
                            
                            for(int j=0;j<juego.getHeroes()[i].getNumObjetos();j++){
                                if(juego.getHeroes()[i].getInventario()[j]!=null){
                                    flujoSalida1.println(juego.getHeroes()[i].getInventario()[j].getNombre());
                                    flujoSalida1.println(juego.getHeroes()[i].getInventario()[j].getAumento());
                                    flujoSalida1.println(juego.getHeroes()[i].getInventario()[j].getInfo());
                                    flujoSalida1.println(juego.getHeroes()[i].getInventario()[j].getCosto());
                                }
                            }

                        }
                        flujoSalida1.println(juego.getNivel());
                        flujoSalida1.flush();
                        flujoSalida1.close();
                    }else{
                        flujoSalida1.print("");
                    }
                }catch (FileNotFoundException ex) {
                    Logger.getLogger(GUIFinal.class.getName()).log(Level.SEVERE, null, ex);
            }
}

public void SeleccionarHeroeButtonPushed(){
    t = juego.heroes.length;
    s = SeleccionarHeroe.getValue().toString();
        if (t == 1){
            if(s.equals(juego.heroes[0].getNombre())){
                v = String.valueOf(juego.heroes[0].getVida());
                f = String.valueOf(juego.heroes[0].getFuerza());
                d = String.valueOf(juego.heroes[0].getDefensa());
                m = String.valueOf(juego.heroes[0].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
        }
        if (t == 2){
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[0].getNombre())){
                v = String.valueOf(juego.heroes[0].getVida());
                f = String.valueOf(juego.heroes[0].getFuerza());
                d = String.valueOf(juego.heroes[0].getDefensa());
                m = String.valueOf(juego.heroes[0].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
                }
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[1].getNombre())){
                v = String.valueOf(juego.heroes[1].getVida());
                f = String.valueOf(juego.heroes[1].getFuerza());
                d = String.valueOf(juego.heroes[1].getDefensa());
                m = String.valueOf(juego.heroes[1].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
        }
        if(t == 3){
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[0].getNombre())){
                v = String.valueOf(juego.heroes[0].getVida());
                f = String.valueOf(juego.heroes[0].getFuerza());
                d = String.valueOf(juego.heroes[0].getDefensa());
                m = String.valueOf(juego.heroes[0].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[1].getNombre())){
                v = String.valueOf(juego.heroes[1].getVida());
                f = String.valueOf(juego.heroes[1].getFuerza());
                d = String.valueOf(juego.heroes[1].getDefensa());
                m = String.valueOf(juego.heroes[1].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
    s = SeleccionarHeroe.getValue().toString();
            }
            if(s.equals(juego.heroes[2].getNombre())){
                v = String.valueOf(juego.heroes[2].getVida());
                f = String.valueOf(juego.heroes[2].getFuerza());
                d = String.valueOf(juego.heroes[2].getDefensa());
                m = String.valueOf(juego.heroes[2].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
        }
        if (t == 4){
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[0].getNombre())){
                v = String.valueOf(juego.heroes[0].getVida());
                f = String.valueOf(juego.heroes[0].getFuerza());
                d = String.valueOf(juego.heroes[0].getDefensa());
                m = String.valueOf(juego.heroes[0].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[1].getNombre())){
                v = String.valueOf(juego.heroes[1].getVida());
                f = String.valueOf(juego.heroes[1].getFuerza());
                d = String.valueOf(juego.heroes[1].getDefensa());
                m = String.valueOf(juego.heroes[1].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[2].getNombre())){
                v = String.valueOf(juego.heroes[2].getVida());
                f = String.valueOf(juego.heroes[2].getFuerza());
                d = String.valueOf(juego.heroes[2].getDefensa());
                m = String.valueOf(juego.heroes[2].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[3].getNombre())){
                v = String.valueOf(juego.heroes[3].getVida());
                f = String.valueOf(juego.heroes[3].getFuerza());
                d = String.valueOf(juego.heroes[3].getDefensa());
                m = String.valueOf(juego.heroes[3].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
    s = SeleccionarHeroe.getValue().toString();
        }
        if (t == 5){
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[0].getNombre())){
                v = String.valueOf(juego.heroes[0].getVida());
                f = String.valueOf(juego.heroes[0].getFuerza());
                d = String.valueOf(juego.heroes[0].getDefensa());
                m = String.valueOf(juego.heroes[0].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[1].getNombre())){
                v = String.valueOf(juego.heroes[1].getVida());
                f = String.valueOf(juego.heroes[1].getFuerza());
                d = String.valueOf(juego.heroes[1].getDefensa());
                m = String.valueOf(juego.heroes[1].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[2].getNombre())){
                v = String.valueOf(juego.heroes[2].getVida());
                f = String.valueOf(juego.heroes[2].getFuerza());
                d = String.valueOf(juego.heroes[2].getDefensa());
                m = String.valueOf(juego.heroes[2].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[3].getNombre())){
                v = String.valueOf(juego.heroes[3].getVida());
                f = String.valueOf(juego.heroes[3].getFuerza());
                d = String.valueOf(juego.heroes[3].getDefensa());
                m = String.valueOf(juego.heroes[3].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
    s = SeleccionarHeroe.getValue().toString();
            if(s.equals(juego.heroes[4].getNombre())){
                v = String.valueOf(juego.heroes[4].getVida());
                f = String.valueOf(juego.heroes[4].getFuerza());
                d = String.valueOf(juego.heroes[4].getDefensa());
                m = String.valueOf(juego.heroes[4].getMagia());
                VidaG.setText(v);
                FuerzaG.setText(f);
                DefensaG.setText(d);
                MagiaG.setText(m);
            }
    s = SeleccionarHeroe.getValue().toString();
        }
    s = SeleccionarHeroe.getValue().toString();
}

public void ComprarButton(){
    obj = String.valueOf(SeleccionarObjeto.getValue());
        h = String.valueOf(Grupo.getValue());
        if(obj.equals("Daga")){
            NombreObjeto.setText(juego.getTienda().objetos[0].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[0].getInfo() + " +" + juego.getTienda().objetos[0].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[0].getCosto()));
            p = juego.getTienda().objetos[0].getCosto();
            item = juego.getTienda().objetos[0];
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Varita")){
            NombreObjeto.setText(juego.getTienda().objetos[1].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[1].getInfo() + " +" + juego.getTienda().objetos[1].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[1].getCosto()));
            p = juego.getTienda().objetos[1].getCosto();
            item = juego.getTienda().objetos[1];
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Espada")){
            NombreObjeto.setText(juego.getTienda().objetos[2].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[2].getInfo() + " +" + juego.getTienda().objetos[2].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[2].getCosto()));
            p = juego.getTienda().objetos[2].getCosto();
            item = juego.getTienda().objetos[2];
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Grimorio")){
            NombreObjeto.setText(juego.getTienda().objetos[3].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[3].getInfo() + " +" + juego.getTienda().objetos[3].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[3].getCosto()));
            p = juego.getTienda().objetos[3].getCosto();
            item = juego.getTienda().objetos[3];
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Hacha")){
            NombreObjeto.setText(juego.getTienda().objetos[4].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[4].getInfo() + " +" + juego.getTienda().objetos[4].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[4].getCosto()));
            p = juego.getTienda().objetos[4].getCosto();
            item = juego.getTienda().objetos[4];
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Báculo")){
            NombreObjeto.setText(juego.getTienda().objetos[5].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[5].getInfo() + " +" + juego.getTienda().objetos[5].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[5].getCosto()));
            p = juego.getTienda().objetos[5].getCosto();
            item = juego.getTienda().objetos[5];
        }
    obj = String.valueOf(SeleccionarObjeto.getValue());
        h = String.valueOf(Grupo.getValue());
        tamano = juego.heroes.length;
        if(tamano == 1){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 2){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 3){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }else if(h.equals(juego.heroes[2].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[2].getOro();
                hero = juego.heroes[2];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 4){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }else if(h.equals(juego.heroes[2].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[2].getOro();
                hero = juego.heroes[2];
            }else if(h.equals(juego.heroes[3].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[3].getOro();
                hero = juego.heroes[3];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 5){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }else if(h.equals(juego.heroes[2].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[2].getOro();
                hero = juego.heroes[2];
            }else if(h.equals(juego.heroes[3].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[3].getOro();
                hero = juego.heroes[3];
            }else if(h.equals(juego.heroes[4].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[4].getOro();
                hero = juego.heroes[4];
            }
        }
        oroR = oro - p;
        OroRestante.setText(String.valueOf(oroR));
        if(!h.isEmpty() && !obj.isEmpty() && oroR >= 0){
            TiendaMenu.setVisible(false);
            ConfirmacionCompra.setVisible(true);
        }else{
            ErrorCompra.setVisible(true);
        }
}

public void SeleccionarObjetoAction(){
    obj = String.valueOf(SeleccionarObjeto.getValue());
        h = String.valueOf(Grupo.getValue());
        if(obj.equals("Daga")){
            NombreObjeto.setText(juego.getTienda().objetos[0].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[0].getInfo() + " +" + juego.getTienda().objetos[0].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[0].getCosto()));
            p = juego.getTienda().objetos[0].getCosto();
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Varita")){
            NombreObjeto.setText(juego.getTienda().objetos[1].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[1].getInfo() + " +" + juego.getTienda().objetos[1].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[1].getCosto()));
            p = juego.getTienda().objetos[1].getCosto();
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Espada")){
            NombreObjeto.setText(juego.getTienda().objetos[2].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[2].getInfo() + " +" + juego.getTienda().objetos[2].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[2].getCosto()));
            p = juego.getTienda().objetos[2].getCosto();
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Grimorio")){
            NombreObjeto.setText(juego.getTienda().objetos[3].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[3].getInfo() + " +" + juego.getTienda().objetos[3].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[3].getCosto()));
            p = juego.getTienda().objetos[3].getCosto();
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Hacha")){
            NombreObjeto.setText(juego.getTienda().objetos[4].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[4].getInfo() + " +" + juego.getTienda().objetos[4].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[4].getCosto()));
            p = juego.getTienda().objetos[4].getCosto();
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Báculo")){
            NombreObjeto.setText(juego.getTienda().objetos[5].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[5].getInfo() + " +" + juego.getTienda().objetos[5].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[5].getCosto()));
            p = juego.getTienda().objetos[5].getCosto();
        }
    obj = String.valueOf(SeleccionarObjeto.getValue());
        h = String.valueOf(Grupo.getValue());
        tamano = juego.heroes.length;
        if(tamano == 1){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 2){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 3){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }else if(h.equals(juego.heroes[2].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[2].getOro();
                hero = juego.heroes[2];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 4){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }else if(h.equals(juego.heroes[2].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[2].getOro();
                hero = juego.heroes[2];
            }else if(h.equals(juego.heroes[3].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[3].getOro();
                hero = juego.heroes[3];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 5){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }else if(h.equals(juego.heroes[2].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[2].getOro();
                hero = juego.heroes[2];
            }else if(h.equals(juego.heroes[3].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[3].getOro();
                hero = juego.heroes[3];
            }else if(h.equals(juego.heroes[4].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[4].getOro();
                hero = juego.heroes[4];
            }
        }
        oroR = o - p;
        if(!h.equalsIgnoreCase("Seleccionar Héroe")){
            OroRestante.setText(String.valueOf(oroR));
        }else{
            OroRestante.setText("");
        }
}

public void GrupoAction(){
    obj = String.valueOf(SeleccionarObjeto.getValue());
        h = String.valueOf(Grupo.getValue());
        if(obj.equals("Daga")){
            NombreObjeto.setText(juego.getTienda().objetos[0].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[0].getInfo() + " +" + juego.getTienda().objetos[0].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[0].getCosto()));
            p = juego.getTienda().objetos[0].getCosto();
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Varita")){
            NombreObjeto.setText(juego.getTienda().objetos[1].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[1].getInfo() + " +" + juego.getTienda().objetos[1].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[1].getCosto()));
            p = juego.getTienda().objetos[1].getCosto();
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Espada")){
            NombreObjeto.setText(juego.getTienda().objetos[2].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[2].getInfo() + " +" + juego.getTienda().objetos[2].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[2].getCosto()));
            p = juego.getTienda().objetos[2].getCosto();
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Grimorio")){
            NombreObjeto.setText(juego.getTienda().objetos[3].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[3].getInfo() + " +" + juego.getTienda().objetos[3].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[3].getCosto()));
            p = juego.getTienda().objetos[3].getCosto();
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Hacha")){
            NombreObjeto.setText(juego.getTienda().objetos[4].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[4].getInfo() + " +" + juego.getTienda().objetos[4].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[4].getCosto()));
            p = juego.getTienda().objetos[4].getCosto();
        }                                       
    obj = String.valueOf(SeleccionarObjeto.getValue());
        if(obj.equals("Báculo")){
            NombreObjeto.setText(juego.getTienda().objetos[5].getNombre());
            InfoObjeto.setText("Aumenta " + juego.getTienda().objetos[5].getInfo() + " +" + juego.getTienda().objetos[5].getAumento());
            PrecioObjeto.setText(String.valueOf(juego.getTienda().objetos[5].getCosto()));
            p = juego.getTienda().objetos[5].getCosto();
        }
    obj = String.valueOf(SeleccionarObjeto.getValue());
        h = String.valueOf(Grupo.getValue());
        tamano = juego.heroes.length;
        if(tamano == 1){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 2){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 3){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }else if(h.equals(juego.heroes[2].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[2].getOro();
                hero = juego.heroes[2];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 4){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }else if(h.equals(juego.heroes[2].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[2].getOro();
                hero = juego.heroes[2];
            }else if(h.equals(juego.heroes[3].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[3].getOro();
                hero = juego.heroes[3];
            }
        }
        h = String.valueOf(Grupo.getValue());
        if(tamano == 5){
            if(h.equals(juego.heroes[0].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[0].getOro();
                hero = juego.heroes[0];
            }else if(h.equals(juego.heroes[1].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
            oro = juego.heroes[1].getOro();
            hero = juego.heroes[1];
            }else if(h.equals(juego.heroes[2].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[2].getOro();
                hero = juego.heroes[2];
            }else if(h.equals(juego.heroes[3].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[3].getOro();
                hero = juego.heroes[3];
            }else if(h.equals(juego.heroes[4].getNombre()) && !h.equalsIgnoreCase("Seleccionar Héroe")){
                oro = juego.heroes[4].getOro();
                hero = juego.heroes[4];
            }
        }
        oroR = o - p;
        if(!h.equalsIgnoreCase("Seleccionar Héroe")){
            OroRestante.setText(String.valueOf(oroR));
        }else{
            OroRestante.setText("");
        }
    
}

public void RegresarButton2Pushed(){
    TiendaMenu.setVisible(false);
    MainMenu.setVisible(true);
    Grupo.getItems().clear();
}

public void RegresarButton1Pushed(){
    StatsMenu.setVisible(false);
    MainMenu.setVisible(true);
}

public void RegresarButtonPushed(){
    GroupMenu.setVisible(false);
    MainMenu.setVisible(true);
    SeleccionarHeroe.getItems().clear();
    VidaG.setText("");
    FuerzaG.setText("");
    DefensaG.setText("");
    MagiaG.setText("");
}

public void ConfirmarCompraPushed(){
    obj = String.valueOf(SeleccionarObjeto.getValue());
    h = String.valueOf(Grupo.getValue());
    juego.comprarObjeto(h, obj);
    ConfirmacionCompra.setVisible(false);
    TiendaMenu.setVisible(true);
}

public void CancelarCompraPushed(){
    ConfirmacionCompra.setVisible(false);
    TiendaMenu.setVisible(true);
}

public void IniciarCombateButtonPushed(){
    MainMenu.setVisible(false);
    CombateMenu.setVisible(true);
    if(enemigo.length == 1){
        atacado = enemigo[0];
        Enemigo1.setText(atacado.getNombre());
        vmax1 = atacado.getVida();
        VEnemigo1.setText("Vida: " + atacado.getVida() + "/" + vmax1 );
        Enemigo2.setVisible(false);
        Enemigo2.setText("");
        VEnemigo2.setText("");
        Enemigo3.setVisible(false);
        Enemigo3.setText("");
        VEnemigo3.setText("");
        Enemigo4.setVisible(false);
        Enemigo4.setText("");
        VEnemigo4.setText("");
        Enemigo5.setVisible(false);
        Enemigo5.setText("");
        VEnemigo5.setText("");
    }else if(enemigo.length == 2){
        atacado = enemigo[0];
        Enemigo1.setText(atacado.getNombre());
        vmax1 = atacado.getVida();
        VEnemigo1.setText("Vida: " + atacado.getVida() + "/" + vmax1 );
        atacado = enemigo[1];
        Enemigo2.setText(atacado.getNombre());
        vmax2 = atacado.getVida();
        VEnemigo2.setText("Vida: " + atacado.getVida() + "/" + vmax2 );
        Enemigo3.setVisible(false);
        Enemigo3.setText("");
        VEnemigo3.setText("");
        Enemigo4.setVisible(false);
        Enemigo4.setText("");
        VEnemigo4.setText("");
        Enemigo5.setVisible(false);
        Enemigo5.setText("");
        VEnemigo5.setText("");
    }else if(enemigo.length == 3){
        atacado = enemigo[0];
        Enemigo1.setText(atacado.getNombre());
        vmax1 = atacado.getVida();
        VEnemigo1.setText("Vida: " + atacado.getVida() + "/" + vmax1 );
        atacado = enemigo[1];
        Enemigo2.setText(atacado.getNombre());
        vmax2 = atacado.getVida();
        VEnemigo2.setText("Vida: " + atacado.getVida() + "/" + vmax2 );
        atacado = enemigo[2];
        Enemigo3.setText(atacado.getNombre());
        vmax3 = atacado.getVida();
        VEnemigo3.setText("Vida: " + atacado.getVida() + "/" + vmax3 );
        Enemigo4.setVisible(false);
        Enemigo4.setText("");
        VEnemigo4.setText("");
        Enemigo5.setVisible(false);
        Enemigo5.setText("");
        VEnemigo5.setText("");
    }else if(enemigo.length == 4){
        atacado = enemigo[0];
        Enemigo1.setText(atacado.getNombre());
        vmax1 = atacado.getVida();
        VEnemigo1.setText("Vida: " + atacado.getVida() + "/" + vmax1 );
        atacado = enemigo[1];
        Enemigo2.setText(atacado.getNombre());
        vmax2 = atacado.getVida();
        VEnemigo2.setText("Vida: " + atacado.getVida() + "/" + vmax2 );
        atacado = enemigo[2];
        Enemigo3.setText(atacado.getNombre());
        vmax3 = atacado.getVida();
        VEnemigo3.setText("Vida: " + atacado.getVida() + "/" + vmax3 );
        atacado = enemigo[3];
        Enemigo4.setText(atacado.getNombre());
        vmax4 = atacado.getVida();
        Enemigo5.setVisible(false);
        Enemigo5.setText("");
        VEnemigo5.setText("");
        VEnemigo4.setText("Vida: " + atacado.getVida() + "/" + vmax4 );
    }else if(enemigo.length == 5){
        atacado = enemigo[0];
        Enemigo1.setText(atacado.getNombre());
        vmax1 = atacado.getVida();
        VEnemigo1.setText("Vida: " + atacado.getVida() + "/" + vmax1 );
        atacado = enemigo[1];
        Enemigo2.setText(atacado.getNombre());
        vmax2 = atacado.getVida();
        VEnemigo2.setText("Vida: " + atacado.getVida() + "/" + vmax2 );
        atacado = enemigo[2];
        Enemigo3.setText(atacado.getNombre());
        vmax3 = atacado.getVida();
        VEnemigo3.setText("Vida: " + atacado.getVida() + "/" + vmax3 );
        atacado = enemigo[3];
        Enemigo4.setText(atacado.getNombre());
        vmax4 = atacado.getVida();
        VEnemigo4.setText("Vida: " + atacado.getVida() + "/" + vmax4 );
        atacado = enemigo[4];
        Enemigo5.setText(atacado.getNombre());
        vmax5 = atacado.getVida();
        VEnemigo5.setText("Vida: " + atacado.getVida() + "/" + vmax5 );
    }
    JugadorAtacando.setText(atacando);
    atacante = juego.buscarHeroexNombre(atacando);
    VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
    if(atacante instanceof Guerrero){
        Spell1.setText("Golpe mortal");
        Spell2.setText("Golpe heroico");
        Spell1Image.setImage(GolpeMortalIcon);
        Spell2Image.setImage(GolpeHeroicoIcon);
        RecursoJugador.setText("Furia: " + furia);
    }
    if(atacante instanceof Mago){
        Spell1.setText("Bola de fuego");
        Spell2.setText("Lanza de hielo");
        Spell1Image.setImage(BolaDeFuegoIcon);
        Spell2Image.setImage(LanzaDeHieloIcon);
        RecursoJugador.setText("Maná: " + mana);
    }
    if(atacante instanceof Sacerdote){
        Spell1.setText("Rezar");
        Spell2.setText("Curar");
        Spell1Image.setImage(RezarIcon);
        Spell2Image.setImage(CurarIcon);
        RecursoJugador.setText("Fe: " + fe);
    }
}

public void AtacarButtonPushed(){
    if(!juego.noEnemigos()){
            if(Spell1.isSelected()){
                if(juego.heroes.length == 1){
                    if(Enemigo1.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo1.getText());
                        juego.atacar(atacado.getNombre(), Spell1.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo1.setText("Vida: " + atacado.getVida() + "/" + vmax1);
                        if(Spell1.getText().equalsIgnoreCase("Golpe mortal")){
                            furia = furia + 4;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Bola de fuego")){
                            mana = mana - 15;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Rezar")){
                            fe = fe + 20;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else{
                        ErrorAtacando.setVisible(true);
                    }
                }else if(juego.heroes.length == 2){
                    SpellToggleGroup.selectToggle(null);
                    if(Enemigo1.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo1.getText());
                        juego.atacar(atacado.getNombre(), Spell1.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo1.setText("Vida: " + atacado.getVida() + "/" + vmax1);
                        if(Spell1.getText().equalsIgnoreCase("Golpe mortal")){
                            furia = furia + 4;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Bola de fuego")){
                            mana = mana - 15;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Rezar")){
                            fe = fe + 20;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else if(Enemigo2.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo2.getText());
                        juego.atacar(atacado.getNombre(), Spell1.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo2.setText("Vida: " + atacado.getVida() + "/" + vmax2);
                        if(Spell1.getText().equalsIgnoreCase("Golpe mortal")){
                            furia = furia + 4;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Bola de fuego")){
                            mana = mana - 15;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Rezar")){
                            fe = fe + 20;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else{
                        ErrorAtacando.setVisible(true);
                    }
                }else if(juego.heroes.length == 3){
                    SpellToggleGroup.selectToggle(null);
                    if(Enemigo1.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo1.getText());
                        juego.atacar(atacado.getNombre(), Spell1.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo1.setText("Vida: " + atacado.getVida() + "/" + vmax1);
                        if(Spell1.getText().equalsIgnoreCase("Golpe mortal")){
                            furia = furia + 4;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Bola de fuego")){
                            mana = mana - 15;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Rezar")){
                            fe = fe + 20;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else if(Enemigo2.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo2.getText());
                        juego.atacar(atacado.getNombre(), Spell1.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo2.setText("Vida: " + atacado.getVida() + "/" + vmax2);
                        if(Spell1.getText().equalsIgnoreCase("Golpe mortal")){
                            furia = furia + 4;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Bola de fuego")){
                            mana = mana - 15;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Rezar")){
                            fe = fe + 20;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else if(Enemigo3.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo3.getText());
                        juego.atacar(atacado.getNombre(), Spell1.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo3.setText("Vida: " + atacado.getVida() + "/" + vmax3);
                        if(Spell1.getText().equalsIgnoreCase("Golpe mortal")){
                            furia = furia + 4;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Bola de fuego")){
                            mana = mana - 15;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell1.getText().equalsIgnoreCase("Rezar")){
                            fe = fe + 20;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else{
                        ErrorAtacando.setVisible(true);
                    }
                }
            }else if(Spell2.isSelected()){
                if(juego.heroes.length == 1){
                    if(Enemigo1.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo1.getText());
                        juego.atacar(atacado.getNombre(), Spell2.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo1.setText("Vida: " + atacado.getVida() + "/" + vmax1);
                        if(Spell2.getText().equalsIgnoreCase("Golpe Heroico")){
                            furia = furia - 20;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Lanza de Hielo")){
                            mana = mana - 5;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Curar")){
                            fe = fe - 5;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else{
                        ErrorAtacando.setVisible(true);
                    }
                }else if(juego.heroes.length == 2){
                    SpellToggleGroup.selectToggle(null);
                    if(Enemigo1.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo1.getText());
                        juego.atacar(atacado.getNombre(), Spell2.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo1.setText("Vida: " + atacado.getVida() + "/" + vmax1);
                        if(Spell2.getText().equalsIgnoreCase("Golpe Heroico")){
                            furia = furia - 20;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Lanza de Hielo")){
                            mana = mana - 5;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Curar")){
                            fe = fe - 5;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else if(Enemigo2.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo2.getText());
                        juego.atacar(atacado.getNombre(), Spell2.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo2.setText("Vida: " + atacado.getVida() + "/" + vmax2);
                        if(Spell2.getText().equalsIgnoreCase("Golpe Heroico")){
                            furia = furia - 20;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Lanza de Hielo")){
                            mana = mana - 5;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Curar")){
                            fe = fe - 5;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else{
                        ErrorAtacando.setVisible(true);
                    }
                }else if(juego.heroes.length == 3){
                    SpellToggleGroup.selectToggle(null);                    
                    if(Enemigo1.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo1.getText());
                        juego.atacar(atacado.getNombre(), Spell2.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo1.setText("Vida: " + atacado.getVida() + "/" + vmax1);
                        if(Spell2.getText().equalsIgnoreCase("Golpe Heroico")){
                            furia = furia - 20;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Lanza de Hielo")){
                            mana = mana - 5;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Curar")){
                            fe = fe - 5;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else if(Enemigo2.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo2.getText());
                        juego.atacar(atacado.getNombre(), Spell2.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo2.setText("Vida: " + atacado.getVida() + "/" + vmax2);
                        if(Spell2.getText().equalsIgnoreCase("Golpe Heroico")){
                            furia = furia - 20;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Lanza de Hielo")){
                            mana = mana - 5;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Curar")){
                            fe = fe - 5;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else if(Enemigo3.isSelected()){
                        atacado = juego.getEnemigos().find(Enemigo3.getText());
                        juego.atacar(atacado.getNombre(), Spell2.getText());
                        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
                        VEnemigo3.setText("Vida: " + atacado.getVida() + "/" + vmax3);
                        if(Spell2.getText().equalsIgnoreCase("Golpe Heroico")){
                            furia = furia - 20;
                            RecursoJugador.setText("Furia: " + furia);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Lanza de Hielo")){
                            mana = mana - 5;
                            RecursoJugador.setText("Mana; " + mana);
                        }
                        if(Spell2.getText().equalsIgnoreCase("Curar")){
                            fe = fe - 5;
                            RecursoJugador.setText("Fe; " + fe);
                        }
                        if(ErrorAtacando.isVisible()){
                            ErrorAtacando.setVisible(false);
                        }
                    }else{
                        ErrorAtacando.setVisible(true);
                    }
                }
            }else{
                ErrorAtacando.setVisible(true);
                if(ErrorAtacando.getText().equalsIgnoreCase("El combate no ha terminado")){
                        ErrorAtacando.setText("Por favor seleccione una habilidad y un enemigo");
            }
        }
        atacando = juego.getTurnos().peek();
        JugadorAtacando.setText(atacando);
        atacante = juego.buscarHeroexNombre(atacando);
        VidaJugador.setText("Vida: " + juego.buscarHeroexNombre(atacando).getVida());
        if(atacante instanceof Guerrero){
            Spell1.setText("Golpe mortal");
            Spell2.setText("Golpe heroico");
            RecursoJugador.setText("Furia: " + furia);
            Spell1Image.setImage(GolpeMortalIcon);
            Spell2Image.setImage(GolpeHeroicoIcon);
        }
        if(atacante instanceof Mago){
            Spell1.setText("Bola de fuego");
            Spell2.setText("Lanza de hielo");
            RecursoJugador.setText("Maná: " + mana);
            Spell1Image.setImage(BolaDeFuegoIcon);
            Spell2Image.setImage(LanzaDeHieloIcon);
        }
        if(atacante instanceof Sacerdote){
            Spell1.setText("Rezar");
            Spell2.setText("Curar");
            RecursoJugador.setText("Fe: " + fe);
            Spell1Image.setImage(RezarIcon);
            Spell2Image.setImage(CurarIcon);
        }
    }
}

public void TerminarCombateButtonPushed(){
    if(juego.noEnemigos() == true){
        if(ErrorAtacando.isVisible()){
            ErrorAtacando.setVisible(false);
            ErrorAtacando.setText("Por favor seleccione una habilidad y un enemigo");
        }
        juego.aumentarNivel();
        juego.generarEnemigos();
        for(int i = 0; i < juego.heroes.length; i++){
            juego.heroes[i].setVida(juego.heroes[i].getVida()+500);
            if(juego.heroes[i] instanceof Mago){
                mana = juego.heroes[i].getMagia()*8;
            }
        }
        CombateMenu.setVisible(false);
        atacando = juego.getTurnos().peek();
        enemigo = juego.enemigos();
        Nivel.setText("Nivel " + String.valueOf(juego.getNivel()));
        if(juego.heroes.length != 0){
            if(juego.heroes.length == 1){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                E2Vida.setText("");
                E2Fuerza.setText("");
                E2Defensa.setText("");
                E3Vida.setText("");
                E3Fuerza.setText("");
                E3Defensa.setText("");
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 2){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                E3Vida.setText("");
                E3Fuerza.setText("");
                E3Defensa.setText("");
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 3){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                E4Vida.setText("");
                E4Fuerza.setText("");
                E4Defensa.setText("");
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 4){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                v4 = enemigo[3].getVida();
                f4 = enemigo[3].getAtaque();
                d4 = enemigo[3].getDefensa();
                E4.setText(enemigo[3].getNombre());
                E4Vida.setText("Vida: " + String.valueOf(v4));
                E4Fuerza.setText("Fuerza: " + String.valueOf(f4));
                E4Defensa.setText("Defensa: " + String.valueOf(d4));
                E5Vida.setText("");
                E5Fuerza.setText("");
                E5Defensa.setText("");
            }else if(juego.heroes.length == 5){
                v1 = enemigo[0].getVida();
                f1 = enemigo[0].getAtaque();
                d1 = enemigo[0].getDefensa();
                E1.setText(enemigo[0].getNombre());
                E1Vida.setText("Vida: " + String.valueOf(v1));
                E1Fuerza.setText("Fuerza: " + String.valueOf(f1));
                E1Defensa.setText("Defensa: " + String.valueOf(d1));
                v2 = enemigo[1].getVida();
                f2 = enemigo[1].getAtaque();
                d2 = enemigo[1].getDefensa();
                E2.setText(enemigo[1].getNombre());
                E2Vida.setText("Vida: " + String.valueOf(v2));
                E2Fuerza.setText("Fuerza: " + String.valueOf(f2));
                E2Defensa.setText("Defensa: " + String.valueOf(d2));
                v3 = enemigo[2].getVida();
                f3 = enemigo[2].getAtaque();
                d3 = enemigo[2].getDefensa();
                E3.setText(enemigo[2].getNombre());
                E3Vida.setText("Vida: " + String.valueOf(v3));
                E3Fuerza.setText("Fuerza: " + String.valueOf(f3));
                E3Defensa.setText("Defensa: " + String.valueOf(d3));
                v4 = enemigo[3].getVida();
                f4 = enemigo[3].getAtaque();
                d4 = enemigo[3].getDefensa();
                E4.setText(enemigo[3].getNombre());
                E4Vida.setText("Vida: " + String.valueOf(v4));
                E4Fuerza.setText("Fuerza: " + String.valueOf(f4));
                E4Defensa.setText("Defensa: " + String.valueOf(d4));
                v5 = enemigo[4].getVida();
                f5 = enemigo[4].getAtaque();
                d5 = enemigo[4].getDefensa();
                E5.setText(enemigo[4].getNombre());
                E5Vida.setText("Vida: " + String.valueOf(v5));
                E5Fuerza.setText("Fuerza: " + String.valueOf(f5));
                E5Defensa.setText("Defensa: " + String.valueOf(d5));
            }
        }
        EnemiesToggleGroup.selectToggle(null);
        MainMenu.setVisible(true);
    }else{
        ErrorAtacando.setVisible(true);
        ErrorAtacando.setText("El combate no ha terminado");
    }
}

    @Override
    public void initialize(URL url, ResourceBundle rb){
        nivel = 1;
        ClassToggleGroup = new ToggleGroup();
        this.GuerreroButton.setToggleGroup(ClassToggleGroup);
        this.MagoButton.setToggleGroup(ClassToggleGroup);
        this.SacerdoteButton.setToggleGroup(ClassToggleGroup);
        SpellToggleGroup = new ToggleGroup();
        this.Spell1.setToggleGroup(SpellToggleGroup);
        this.Spell2.setToggleGroup(SpellToggleGroup);
        EnemiesToggleGroup = new ToggleGroup();
        this.Enemigo1.setToggleGroup(EnemiesToggleGroup);
        this.Enemigo2.setToggleGroup(EnemiesToggleGroup);
        this.Enemigo3.setToggleGroup(EnemiesToggleGroup);
        this.Enemigo4.setToggleGroup(EnemiesToggleGroup);
        this.Enemigo5.setToggleGroup(EnemiesToggleGroup);
        WarriorIcon = new Image("WarriorIcon.png");
        MageIcon = new Image("MageIcon.png");
        PriestIcon = new Image("PriestIcon.png");
        DLogo = new Image("D&DLogo.png");
        GolpeMortalIcon = new Image("GolpeMortalIcon.png");
        GolpeHeroicoIcon = new Image("GolpeHeroicoIcon.png");
        BolaDeFuegoIcon = new Image("BolaDeFuegoIcon.png");
        LanzaDeHieloIcon = new Image("LanzaDeHieloIcon.png");
        RezarIcon = new Image("RezarIcon.png");
        CurarIcon = new Image("CurarIcon.png");
        Warrior.setImage(WarriorIcon);
        Mage.setImage(MageIcon);
        Priest.setImage(PriestIcon);
        Logo.setImage(DLogo);
        juego = new Juego(0);
        Logo.setVisible(true);
        ConfirmarButton.setVisible(true);
    }
    
}