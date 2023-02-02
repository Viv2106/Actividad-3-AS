package uia.com.api.inventario.model;


import org.springframework.data.neo4j.core.schema.*;

import java.util.ArrayList;
import java.util.List;

@Node("Proveedor")
public class Proveedor{
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
    private String nameLote;
    @Relationship(type = "ENTREGADO")
    private Lote lote;

    public Proveedor(Long id,  String name,  String descripcion, String estatus, String clase, String nameLote)
    {
        this.name = name;
        this.estatus = estatus;
        this.clase = clase;
        this.descripcion = descripcion;
        this.nameLote = nameLote;
    }

    public Proveedor() {
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

    public String getNameLote() {
        return nameLote;
    }

    public void setNameLote(String nameLote) {
        this.nameLote = nameLote;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
}
