package uia.com.api.inventario.dto;

import uia.com.api.inventario.model.Item;
import uia.com.api.inventario.model.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class ItemDTO {
    private Long id;
    private String name;
    private String partida;
    private String subpartida;
    private String categoria;
    private String estatus;
    private String nameProveedor;

    public ItemDTO() {
    }

    public ItemDTO(Long id, String clase, String name, String partida, String subpartida, String categoria, String estatus, String nameProveedor) {
        this.id = id;
        this.name = name;
        this.partida = partida;
        this.subpartida = subpartida;
        this.categoria = categoria;
        this.estatus = estatus;
        this.nameProveedor = nameProveedor;
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

    public String getNameProveedor() {
        return nameProveedor;
    }

    public void setNameProveedor(String nameProveedor) {
        this.nameProveedor = nameProveedor;
    }
}

