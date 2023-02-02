package uia.com.api.inventario.model;


import org.springframework.data.neo4j.core.schema.*;

import java.util.ArrayList;
import java.util.List;

@Node("Embalaje")
public class Embalaje {
    @Id
    @GeneratedValue
    private Long id;
    @Property("name")
    private String name;
    @Property("estatus")
    private String estatus;
    @Property("clase")
    private String clase;
    @Property("descripcion")
    private String descripcion;

    public Embalaje(Long id, String name, String descripcion, String estatus, String clase)
    {
        this.name = name;
        this.estatus = estatus;
        this.clase = clase;
        this.descripcion = descripcion;
    }

    public Embalaje() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
