package uia.com.api.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uia.com.api.inventario.dto.ProveedoresDTO;
import uia.com.api.inventario.service.ProveedorService;

@RestController
@RequestMapping("/Proveedores")
public class ProveedoresController {

    private ProveedorService proveedorService;

    @Autowired
    public ProveedoresController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }


    @PostMapping
    public ResponseEntity<ProveedoresDTO> save(@RequestBody ProveedoresDTO proveedoresDTO)
    {
        ProveedoresDTO response = proveedorService.save(proveedoresDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
