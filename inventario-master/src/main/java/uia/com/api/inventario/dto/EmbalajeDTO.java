package uia.com.api.inventario.dto;

import uia.com.api.inventario.model.Item;

import java.util.ArrayList;
import java.util.List;

public class EmbalajeDTO {
        private Long id;
        private String name;
        private String descripcion;
        private String estatus;
        private String clase;

        public EmbalajeDTO() {
        }

        public EmbalajeDTO(Long id, String name, String descripcion, String estatus, String clase) {
            this.id = id;
            this.name = name;
            this.descripcion = descripcion;
            this.estatus = estatus;
            this.clase = clase;
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
