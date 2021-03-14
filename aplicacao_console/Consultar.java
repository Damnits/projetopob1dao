package aplicacao_console;

import fachada.Fachada;
import modelo.Usuario;
import modelo.Video;

import java.util.List;

public class Consultar {
    public Consultar(){
        try {
            Fachada.inicializar();
            System.out.println("consultando...");
            
            System.out.println(Fachada.consultarVideoPorUsuario("Test3@ifpb.com"));


            System.out.println(Fachada.consultarUsuariosPorVideo("https://www.youtube.com/watch?v=5z0-WWjk_Jc"));



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            Fachada.finalizar();
            System.out.println("\nfim do programa");
        }


    }



    //=================================================
    public static void main(String[] args) {
        new Consultar();
    }
}