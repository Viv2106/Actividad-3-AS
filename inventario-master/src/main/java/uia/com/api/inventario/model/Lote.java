package uia.com.api.inventario.model;

import org.springframework.data.neo4j.core.schema.*;

import java.util.ArrayList;
import java.util.List;

@Node("Lote")
public class Lote{
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
    @Property("fechaIngreso")
    private String fechaIngreso;
    private String nameEmbalaje;
    @Relationship(type = "EMPACADO_CON")
    private Embalaje embalaje;

    public Lote(Long id,  String name,  String descripcion, String estatus, String clase, String fechaIngreso, String nameEmbalaje)
    {
        this.name = name;
        this.estatus = estatus;
        this.clase = clase;
        this.descripcion = descripcion;
        this.fechaIngreso = fechaIngreso;
        this.nameEmbalaje = nameEmbalaje;
    }

    public Lote() {
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Embalaje getEmbalaje() {
        return embalaje;
    }

    public void setEmbalaje(Embalaje embalaje) {
        this.embalaje = embalaje;
    }

    public String getNameEmbalaje() {
        return nameEmbalaje;
    }

    public void setNameEmbalaje(String nameEmbalaje) {
        this.nameEmbalaje = nameEmbalaje;
    }


}
