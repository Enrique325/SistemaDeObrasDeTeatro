/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AdministradorDeUsuario;
import static Modelo.AdministradorDeUsuario.listaUsuarios;
import Modelo.ManejoDeArchivos;
import Modelo.ObraTeatral;
import Modelo.Usuario;
import Modelo.AdministradorDeObrasTeatrales;
import static Modelo.AdministradorDeObrasTeatrales.listaObras;
import Vista.Login;
import Vista.MenuTeatro;
import Vista.Registro;
import Vista.RegistroObrasTeatrales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author EnriqueChim
 */
public class Controlador implements ActionListener{
    ManejoDeArchivos manejo=new ManejoDeArchivos();
    Login login=new Login();
    Registro registro=new Registro();
    MenuTeatro menuteatro=new MenuTeatro();
    RegistroObrasTeatrales registroObrasTeatrales= new RegistroObrasTeatrales();

    public Controlador( Login login, Registro registro, MenuTeatro menuteatro, RegistroObrasTeatrales registrOobrasTeatrales) {
        this.login=login;
        this.menuteatro=menuteatro;
        this.registro=registro;
        this.registro.Bt_RegistroUsuario.addActionListener(this);
        this.registro.Bt_RegistroIniciarSesionUsuario.addActionListener(this);
        this.registro.btn_RegistroCerrar.addActionListener(this);
        this.login.IniciarSesionUsuario.addActionListener(this);
        this.login.RegistrarUsuario.addActionListener(this);
        this.registroObrasTeatrales.btn_GuardarObra.addActionListener(this);
      
    }
  
    public void iniciarSesionUsuario(){
        String nombre=login.LoginNombreUsuario.getText();
        String contrasenia=login.LoginContraseñaUsuario.getText();
        try {
            if(ManejoDeArchivos.lecturaArchivo(nombre, contrasenia)==true){
                new MenuTeatro().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void registrarUsuario(){
        try{
            String nombreUsuario=registro.RegistroNombreUsuario.getText();
            String apellidoUsuario=registro.RegistroApellidoUsuario.getText();
            String curpUsuario=registro.RegistroCurpUsuario.getText();
            String contraseñaUsuario=registro.RegistroContraseñaUsuario.getText();
            Usuario usuario=new Usuario(nombreUsuario,apellidoUsuario,curpUsuario,contraseñaUsuario);
            AdministradorDeUsuario.listaUsuarios.add(usuario);
            ManejoDeArchivos.escribirArchivo(listaUsuarios);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR EN EL REGISTRO");
        }
        
    }
    
    public void escribirObraTeatral(){
        try{
            String nombreObra=registroObrasTeatrales.txt_nombreObra.getText();
            String generoObra= registroObrasTeatrales.txt_generoObra.getText();
            String resumenObra = registroObrasTeatrales.txt_resumenObra.getText();
            String actorPrincipalObra= registroObrasTeatrales.txt_actorPrincipalObra.getText();
            String actorSecundarioObra= registroObrasTeatrales.txt_actorSecundarioObra.getText();
            double precioBoletoObra= Double.parseDouble(registroObrasTeatrales.txt_precioBoleto.getText());
            ObraTeatral obraTeatral= new ObraTeatral(nombreObra,generoObra,resumenObra,actorPrincipalObra,actorSecundarioObra,precioBoletoObra);
            AdministradorDeObrasTeatrales.listaObras.add(obraTeatral);
            ManejoDeArchivos.escribirObraTeatral(listaObras);
        }catch(Exception ex2){
            JOptionPane.showMessageDialog(null, "Error al guardar obra");
        }
    }
    
    public void escribirFuncionTeatral(){
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
                
        if(e.getSource()==login.IniciarSesionUsuario){
            iniciarSesionUsuario();
            System.out.println("Hizo el primer if(Se logueó)");
            System.out.println(e.getSource());
            login.dispose();
       
        }
        if(e.getSource()==login.RegistrarUsuario){
           
            new Registro().setVisible(true);
            System.out.println("Hizo el segundo if (desplegar registro)");
            System.out.println(e.getSource());
            login.dispose();
        }

        if(e.getSource()==registro.Bt_RegistroUsuario){
            System.out.println(e.getSource());
            System.out.println("Entró al registro usuario");
            registrarUsuario();
            registro.dispose();
         }
        
         if(e.getSource()==registro.Bt_RegistroIniciarSesionUsuario){
                new Login().setVisible(true);
                System.out.println("Cuarto Inicio Sesión");
                registro.dispose();
            } 
        }

   
}
