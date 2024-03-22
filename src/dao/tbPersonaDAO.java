package dao;

import controller.TbpersonaJpaController;
import controller.exceptions.NonexistentEntityException;
import entity.Tbpersona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class tbPersonaDAO {

    private TbpersonaJpaController tjc = new TbpersonaJpaController();
    private Tbpersona persona = new Tbpersona();
    private String mensaje = "";

    //creamos tres metodos
    //insertear , actualizar y eliminar
    public String insertarPersona(String nombres, String apellidos, int edad, String telefono) {
        try {
            persona.setIdtbPersona(Integer.BYTES);//se autoincrementa
            persona.setNombres(nombres);
            persona.setApellidos(apellidos);
            persona.setEdad(edad);
            persona.setTelefono(telefono);

            tjc.create(persona);
            mensaje = "guardado correctamente";

        } catch (Exception e) {
            System.out.println(e.getMessage());
            mensaje = "No se pudo guardar la informacion";

        }

        return mensaje;

    }

    public String actualizarPersona(int id, String nombres, String apellidos, int edad, String telefono) {
        try {
            persona.setIdtbPersona(id);
            persona.setNombres(nombres);
            persona.setApellidos(apellidos);
            persona.setEdad(edad);
            persona.setTelefono(telefono);

            tjc.edit(persona);
            mensaje = "Actualizado correctamente";

        } catch (Exception e) {
            System.out.println(e.getMessage());
            mensaje = "No se pudo actualizar la informacion";

        }

        return mensaje;

    }

    public String eliminarPersona(int id) {

        try {
            tjc.destroy(id);
            mensaje = "Eliminado correctamente";
        } catch (NonexistentEntityException e) {
            mensaje = "No se pudo eliminar la informacion";
            System.out.println(e.getMessage());
        }

        return mensaje;
    }

    public void listarPersonas(JTable table, String nombres) {

        DefaultTableModel model;
        String[] titulo = {"ID", "NOMBRES", "APELLIDOS", "EDAD", "TELEFONO"};//NOMBRES DE LAS COLUMNAS

        model = new DefaultTableModel(null, titulo);//no pasamos la data pero si las columnas

        List<Tbpersona> datos = buscarPersona(nombres);//hace un recorrido de nuestras entidades

        String[] datosPersona = new String[5];

        for (Tbpersona tbp : datos) {

            datosPersona[0] = tbp.getIdtbPersona() + "";
            datosPersona[1] = tbp.getNombres() + "";
            datosPersona[2] = tbp.getApellidos() + "";
            datosPersona[3] = tbp.getEdad() + "";
            datosPersona[4] = tbp.getTelefono() + "";

            model.addRow(datosPersona);

        }

        table.setModel(model);

    }

    private List<Tbpersona> buscarPersona(String nombres) {

        Tbpersona tbp;
        EntityManager em = tjc.getEntityManager();//nos conectamos para hacer las sentencias
        Query query = em.createQuery("SELECT p FROM Tbpersona p WHERE p.nombres LIKE :nombres");//hacemos la sentencia
        query.setParameter("nombres", nombres + "%");//asignamos el parametro
        List<Tbpersona> lista = query.getResultList();//agregamos los resultados en una lista

        return lista;//la lista es retornada  a la tabla

    }

    public Tbpersona buscarPersonaId(int id) {

        String mensaje = "";
        Tbpersona tbp = new Tbpersona();
        EntityManager em = tjc.getEntityManager();//nos conectamos para hacer las sentencias
        try {

            Query query = em.createQuery("SELECT p FROM Tbpersona p WHERE p.idtbPersona = :idtbPersona");
            query.setParameter("idtbPersona", id);
            tbp = (Tbpersona) query.getSingleResult();
            JOptionPane.showMessageDialog(null, "Busqueda exitosa");

        } catch (Exception e) {
            if (tjc.findTbpersona(id) == null) {
                mensaje = "El id " + id + " No existe";
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }

        return tbp;
    }

    public String idIncrementable() {

        EntityManager em = tjc.getEntityManager();//nos conectamos para hacer las sentencias
        //aqui no se puede utilizar jpql por que este trabaja con solo objetos y sql trabaja directamente con nuestra base de datos
        Query query = em.createNativeQuery("SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='empleado' AND TABLE_NAME = 'tbpersona'");
        List id = query.getResultList();
        String idIncrement = id.toString();
        return idIncrement.replace("[", "").replace("]", "");
    }

}
