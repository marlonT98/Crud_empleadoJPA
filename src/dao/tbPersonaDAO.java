package dao;

import controller.TbpersonaJpaController;
import controller.exceptions.NonexistentEntityException;
import entity.Tbpersona;

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

    public String actualizarPersona(int id  , String nombres, String apellidos, int edad, String telefono) {
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
            mensaje = "No se pudo actulizar la informacion";

        }

        return mensaje;

    }

    public String eliminarPersona( int id) {
        
        try {
            tjc.destroy(id);
             mensaje = "Eliminado correctamente";
        } catch (NonexistentEntityException e) {
            mensaje = "No se pudo eliminar la informacion";
            System.out.println(e.getMessage());
        }

        return mensaje;
    }

}
