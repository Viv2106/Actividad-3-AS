package uia.com.api.inventario.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uia.com.api.inventario.dto.*;
import uia.com.api.inventario.model.Item;
import uia.com.api.inventario.model.Proveedor;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ApiMapper {

    ApiMapper INSTANCE = Mappers.getMapper( ApiMapper.class );


    ItemDTO entityToDTO(Item country);
    Item DTOToEntity(ItemDTO country);

    ProveedorDTO entityToDTO(Proveedor proveedor);
    Proveedor DTOToEntity(ProveedorDTO proveedor);


    //@Mapping(target="proveedores", ignore = true)
    List<Proveedor> entityToDTO(Iterable<ProveedorDTO> proveedor);

    List<Proveedor> DTOToEntities(List<EmbalajesDTO> proveedores);


}
