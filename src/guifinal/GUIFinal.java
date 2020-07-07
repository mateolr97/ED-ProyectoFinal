package guifinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.event.EventHandler;

public class GUIFinal extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        
    }

    public static void main(String[] args) {
        launch(args);
        //Persistencia
        
            
            //////////////////////////////////Pruebas/////////////////////////////////////////////////
            //juego.agregarHeroe("Mago", "Megumin");
            //juego.agregarHeroe("Guerrero", "Varyan");
            //juego.agregarHeroe("Sacerdote", "Uribe");
            //juego.ordenarHeroesxTurno();
            //System.out.println(juego.buscarHeroexNombre("Megumin").getNombre());
            //System.out.println(juego.nombresH());
            //System.out.println(juego.nombresH());
            //juego.getHeroes()[0].setAsesinatos(1);
            
            ////////////////////////////////////////////////////////////////////////////////////////////
            
                
                
                
                
                
    }
    
}
