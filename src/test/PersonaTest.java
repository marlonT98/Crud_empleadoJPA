package test;

import dao.tbPersonaDAO;

public class PersonaTest {

    public static void main(String[] args) {
        
        tbPersonaDAO pdao = new tbPersonaDAO();
        
        
        //probando la creacion de una persona
        //  System.out.println(pdao.insertarPersona("marlon", "tarrillo", 23, "45563434") );
        
       //actulizando una persona
       //System.out.println(pdao.actualizarPersona(19, "jose", "ruiz", 12, "12121212"));
        
       //elimando
        System.out.println(pdao.eliminarPersona(49));

    }

}
