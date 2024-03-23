package dao;

import controller.UsuariosJpaController;
import entity.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class UsuariosDAO {

    private Usuarios user = new Usuarios();
    private UsuariosJpaController ujc = new UsuariosJpaController();

    public boolean login(String usuario, String contrasenia) {

        EntityManager em = ujc.getEntityManager();//conexion
        boolean valor;
        
        try {

            Query query = em.createQuery("SELECT u.usuario, u.contrasenia FROM Usuarios u WHERE u.usuario = :usuario and u.contrasenia=:contrasenia");
            query.setParameter("usuario", usuario);
            query.setParameter("contrasenia", contrasenia);
            List resultado = query.getResultList();
            if (!resultado.isEmpty()) {
                valor = true;//si hay un dato es verdad
            } else {
                valor = false;//si no es falso
            }

        } catch (Exception e) {
            valor = false;
            

        }

        return valor;

    }

}
