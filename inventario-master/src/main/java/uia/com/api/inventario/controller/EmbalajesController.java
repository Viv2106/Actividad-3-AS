package uia.com.api.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uia.com.api.inventario.dto.EmbalajesDTO;
import uia.com.api.inventario.dto.ProveedoresDTO;
import uia.com.api.inventario.service.EmbalajeService;
import uia.com.api.inventario.service.ProveedorService;

@RestController
@RequestMapping("/Embalajes")
public class EmbalajesController {

    private EmbalajeService embalajeService;

    @Autowired
    public EmbalajesController(EmbalajeService embalajeService) {
        this.embalajeService = embalajeService;
    }


    @PostMapping
    public ResponseEntity<EmbalajesDTO> save(@RequestBody EmbalajesDTO embalajesDTO)
    {
        EmbalajesDTO response = embalajeService.save(embalajesDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
