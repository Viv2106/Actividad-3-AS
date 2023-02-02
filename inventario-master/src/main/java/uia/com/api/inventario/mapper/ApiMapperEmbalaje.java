package uia.com.api.inventario.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uia.com.api.inventario.dto.EmbalajeDTO;
import uia.com.api.inventario.model.Embalaje;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ApiMapperEmbalaje {

    ApiMapperEmbalaje INSTANCE = Mappers.getMapper( ApiMapperEmbalaje.class );


    EmbalajeDTO entityToDTO(Embalaje embalaje);
    Embalaje DTOToEntity(EmbalajeDTO embalaje);

    List<Embalaje> DTOToEntities(List<EmbalajeDTO> embalajes);
}
