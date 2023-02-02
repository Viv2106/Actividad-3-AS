package uia.com.api.inventario.service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.api.inventario.dto.ProveedoresDTO;
import uia.com.api.inventario.dto.ProveedorDTO;
import uia.com.api.inventario.dto.ProveedoresDTO;
import uia.com.api.inventario.mapper.ApiMapper;
import uia.com.api.inventario.mapper.ApiMapperProveedor;
import uia.com.api.inventario.mapper.ApiMapperProveedor;
import uia.com.api.inventario.model.Lote;
import uia.com.api.inventario.model.Proveedor;
import uia.com.api.inventario.model.Proveedor;
import uia.com.api.inventario.repository.LoteRepository;
import uia.com.api.inventario.repository.ProveedorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class ProveedorService {
    ProveedorRepository repositoryProveedores;
    LoteRepository repositoryLote;
    Validator validator;

    @Autowired
    public ProveedorService(ProveedorRepository repositoryProveedores, LoteRepository repositoryLote, Validator validator) {
        this.repositoryProveedores = repositoryProveedores;
        this.repositoryLote = repositoryLote;
        this.validator = validator;
    }
    public ProveedorDTO save(ProveedorDTO item)
    {
        return saveInformation(item);
    }

    public ProveedoresDTO save(ProveedoresDTO item)
    {
        return saveInformation(item);
    }

    public ProveedoresDTO update(ProveedoresDTO item) {
        return saveInformation(item);
    }

    private ProveedorDTO saveInformation(ProveedorDTO item)
    {
        Proveedor entity = ApiMapper.INSTANCE.DTOToEntity(item);

        Set<ConstraintViolation<Proveedor>> violations = validator.validate(entity);
        if(!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }

        Proveedor savedEntity = repositoryProveedores.save(entity);
        return ApiMapper.INSTANCE.entityToDTO(savedEntity);
    }

    private ProveedoresDTO saveInformation(ProveedoresDTO proveedoresDTO) {
        ProveedoresDTO proveedores_salvados = new ProveedoresDTO();

        if (proveedoresDTO.getProveedores().size() > 0) {
            for (int i = 0; i < proveedoresDTO.getProveedores().size(); i++) {
                List<Lote> lotes = this.repositoryLote.findByName(proveedoresDTO.getProveedores().get(i).getNameLote());
                System.out.println(lotes);

                //-- se asigna el embalaje encontrado
                if (lotes.size() == 1) {
                    Proveedor entity = ApiMapperProveedor.INSTANCE.DTOToEntity(proveedoresDTO.getProveedores().get(i));
                    entity.setLote(lotes.get(0));
                    //lotes.get(0).getProveedores().add(entity);  //--usado para la relacion de regreso
                    //this.repositoryLote.save(lotes.get(0));   //--usado para la relacion de regreso

                    Set<ConstraintViolation<Proveedor>> violations = validator.validate(entity);
                    if (!violations.isEmpty()) {
                        throw new ConstraintViolationException(violations);
                    }
                    Proveedor savedEntity = repositoryProveedores.save(entity);
                    proveedores_salvados.getProveedores().add(ApiMapperProveedor.INSTANCE.entityToDTO(savedEntity));
                }
            }
        }
        return proveedores_salvados;
    }
}
