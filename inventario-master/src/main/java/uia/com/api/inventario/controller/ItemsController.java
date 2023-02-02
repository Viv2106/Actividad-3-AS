package uia.com.api.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uia.com.api.inventario.dto.ItemDTO;
import uia.com.api.inventario.dto.ItemsDTO;
import uia.com.api.inventario.service.ItemService;



@RestController
@RequestMapping("/Items")
public class ItemsController {

    private ItemService itemService;

    @Autowired
    public ItemsController(ItemService itemService) {
        this.itemService = itemService;
    }


    @PostMapping
    public ResponseEntity<ItemsDTO> save(@RequestBody ItemsDTO itemsDTO)
    {
        ItemsDTO response = itemService.save(itemsDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
