package uia.com.api.inventario.dto;


import java.util.ArrayList;
import java.util.List;

public class LotesDTO {

        private List<LoteDTO> lotes = new ArrayList<LoteDTO>();

        public LotesDTO() {
        }

        public LotesDTO(List<LoteDTO> proveeedores) {
            this.lotes = lotes;
        }

    public List<LoteDTO> getLotes() {
        return lotes;
    }

    public void setLotes(List<LoteDTO> lotes) {
        this.lotes = lotes;
    }
}
