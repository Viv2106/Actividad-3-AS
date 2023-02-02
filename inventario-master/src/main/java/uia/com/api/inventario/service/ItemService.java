package uia.com.api.inventario.service;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.api.inventario.dto.ItemDTO;
import uia.com.api.inventario.dto.ItemsDTO;
import uia.com.api.inventario.mapper.ApiMapper;
import uia.com.api.inventario.model.Proveedor;
import uia.com.api.inventario.model.Item;
import uia.com.api.inventario.repository.ItemRepository;
import uia.com.api.inventario.repository.ProveedorRepository;

import java.util.List;
import java.util.Set;

@Service
public class ItemService {
ItemRepository repositoryItems;
ProveedorRepository repositoryProveedor;

    Validator validator;

    @Autowired
    public ItemService(ItemRepository repositoryItems, ProveedorRepository repositoryProveedor, Validator validator) {
        this.repositoryItems = repositoryItems;
        this.repositoryProveedor = repositoryProveedor;
        this.validator = validator;
    }
    public ItemsDTO save(ItemsDTO item)
    {
        return saveInformation(item);
    }



    private ItemsDTO saveInformation(ItemsDTO itemsDTO)
    {
        ItemsDTO items_salvados = new ItemsDTO();

        if(itemsDTO.getItems().size() > 0)
        {
            for(int i = 0; i< itemsDTO.getItems().size(); i++)
            {
                List<Proveedor> embalajes = this.repositoryProveedor.findByName(itemsDTO.getItems().get(i).getNameProveedor());
                System.out.println(embalajes);

                //-- se asigna el embalaje encontrado
                if (embalajes.size() == 1)
                {
                    Item entity = ApiMapper.INSTANCE.DTOToEntity(itemsDTO.getItems().get(i));
                    entity.setProveedor(embalajes.get(0));
                    //embalajes.get(0).getItems().add(entity);  //--usado para la relacion de regreso
                    //this.repositoryProveedor.save(embalajes.get(0));   //--usado para la relacion de regreso

                    Set<ConstraintViolation<Item>> violations = validator.validate(entity);
                    if (!violations.isEmpty()) {
                        throw new ConstraintViolationException(violations);
                    }
                    Item savedEntity = repositoryItems.save(entity);
                    items_salvados.getItems().add(ApiMapper.INSTANCE.entityToDTO(savedEntity));
                }
            }
        }
        return items_salvados;
    }

}
