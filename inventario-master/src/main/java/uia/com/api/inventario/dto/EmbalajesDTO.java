package uia.com.api.inventario.dto;


import java.util.ArrayList;
import java.util.List;

public class EmbalajesDTO {

        private List<EmbalajeDTO> embalajes = new ArrayList<EmbalajeDTO>();

        public EmbalajesDTO() {
        }

        public EmbalajesDTO(List<EmbalajeDTO> proveeedores) {
            this.embalajes = embalajes;
        }

    public List<EmbalajeDTO> getEmbalajes() {
        return embalajes;
    }

    public void setEmbalajes(List<EmbalajeDTO> embalajes) {
        this.embalajes = embalajes;
    }
}
