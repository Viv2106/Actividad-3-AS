package uia.com.api.inventario.dto;


import java.util.ArrayList;
import java.util.List;

public class ProveedoresDTO {
        
        private List<ProveedorDTO> proveedores = new ArrayList<ProveedorDTO>();

        public ProveedoresDTO() {
        }

        public ProveedoresDTO(List<ProveedorDTO> proveeedores) {
            this.proveedores = proveedores;
        }

    public List<ProveedorDTO> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<ProveedorDTO> proveedores) {
        this.proveedores = proveedores;
    }
}
