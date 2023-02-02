package uia.com.api.inventario.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.data.neo4j.core.schema.*;
import reactor.core.publisher.Mono;
import uia.com.api.inventario.MiNeo4JDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Node("Item")
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    @Property("name")
    private String name;
    @Property("partida")
    private String partida;
    @Property("subpartida")
    private String subpartida;
    @Property("categoria")
    private String categoria;
    @Property("estatus")
    private String estatus;
    private String nameProveedor;
    @Relationship(type = "provisto_por")
    private Proveedor proveedor;

    public Item(Long id, String name, String partida, String subpartida,  String categoria,
                String estatus, String nameProveedor)
    {
        this.name = name;
        this.estatus = categoria;
        this.partida = partida;
        this.subpartida = subpartida;
        this.categoria = categoria;
        this.nameProveedor = nameProveedor;


        //MiNeo4JDriver.neo4jClient.query();
        //this.proveedor = proveedor;

        String ubicP = String.valueOf(Integer.parseInt(partida)/100);
        char ubicS = (char) (65 + (Integer.parseInt(subpartida)/100)/10);
        String ubicC = String.valueOf((Integer.parseInt(categoria)-Integer.parseInt(subpartida)));
    }



    public Item() {
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

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getSubpartida() {
        return subpartida;
    }

    public void setSubpartida(String subpartida) {
        this.subpartida = subpartida;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getNameProveedor() {
        return nameProveedor;
    }

    public void setNameProveedor(String nameProveedor) {
        this.nameProveedor = nameProveedor;
    }
}
