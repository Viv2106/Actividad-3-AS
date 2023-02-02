package uia.com.api.inventario.dto;

import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;
import uia.com.api.inventario.model.Embalaje;
import uia.com.api.inventario.model.Item;

import java.util.ArrayList;
import java.util.List;

public class LoteDTO {
        private Long id;
        private String name;
        private String descripcion;
        private String estatus;
        private String clase;
        private String fechaIngreso;
        private String nameEmbalaje;

        public LoteDTO() {
        }

        public LoteDTO(Long id, String name, String descripcion, String estatus, String clase, String nameEmbalaje, String fechaIngreso) {
            this.id = id;
            this.name = name;
            this.descripcion = descripcion;
            this.estatus = estatus;
            this.clase = clase;
            this.fechaIngreso = fechaIngreso;
            this.nameEmbalaje = nameEmbalaje;
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

    public String getNameEmbalaje() {
        return nameEmbalaje;
    }

    public void setNameEmbalaje(String nameEmbalaje) {
        this.nameEmbalaje = nameEmbalaje;
    }
}
