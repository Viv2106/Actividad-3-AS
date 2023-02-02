package uia.com.api.inventario.dto;


import java.util.ArrayList;
import java.util.List;

public class ItemsDTO {
        
        private List<ItemDTO> items = new ArrayList<ItemDTO>();

        public ItemsDTO() {
        }

        public ItemsDTO(List<ItemDTO> items) {
            this.items = items;
        }

    public List<ItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }
}
