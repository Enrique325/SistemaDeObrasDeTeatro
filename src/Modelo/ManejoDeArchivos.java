package Modelo;

import Modelo.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ManejoDeArchivos {
   
    
    public static void escribirArchivo(ArrayList<Usuario> listaUsuarios){
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo=new File("Usuario.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir=new FileWriter(archivo,true);
                linea=new PrintWriter(escribir);
                linea.println(listaUsuarios.toString().replace("[","").replace("]", ""));
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(ManejoDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                escribir=new FileWriter(archivo,true);
                linea=new PrintWriter(escribir);
                linea.println(listaUsuarios.toString().replace("[","").replace("]", ""));
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(ManejoDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public static boolean lecturaArchivo(String usuario, String contrasenia) throws IOException{
        String record;
        FileReader filereader;
        boolean existeUsuarioyContrasenia=false;
        
        try{
            filereader=new FileReader("Usuario.txt");
            BufferedReader bufferedreader=new BufferedReader(filereader);
            
            while((record=bufferedreader.readLine())!=null){
                String[] palabras=record.split(" ");
                if(palabras[0].equalsIgnoreCase(usuario) && palabras[3].equalsIgnoreCase(contrasenia)){
                    return true;
                }
            }
            
            if(!existeUsuarioyContrasenia){
                return false;
            }
            
        }catch(Exception ex){
            
        }
        return true;
    }

    public static void escribirObraTeatral(ArrayList<ObraTeatral> listaObras) {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo=new File("Obra.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir=new FileWriter(archivo,true);
                linea=new PrintWriter(escribir);
                linea.println(listaObras.toString().replace("[","").replace("]", ""));
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(ManejoDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                escribir=new FileWriter(archivo,true);
                linea=new PrintWriter(escribir);
                linea.println(listaObras.toString().replace("[","").replace("]", ""));
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(ManejoDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    
    
}
