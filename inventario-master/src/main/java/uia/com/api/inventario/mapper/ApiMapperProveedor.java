package uia.com.api.inventario.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uia.com.api.inventario.dto.ProveedorDTO;
import uia.com.api.inventario.model.Proveedor;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ApiMapperProveedor {

    ApiMapperProveedor INSTANCE = Mappers.getMapper( ApiMapperProveedor.class );

    ProveedorDTO entityToDTO(Proveedor proveedor);
    Proveedor DTOToEntity(ProveedorDTO proveedor);


    //@Mapping(target="proveedores", ignore = true)
    List<Proveedor> entityToDTO(Iterable<ProveedorDTO> proveedor);
    List<Proveedor> DTOToEntities(List<ProveedorDTO> proveedores);
}
