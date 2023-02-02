package uia.com.api.inventario.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uia.com.api.inventario.dto.LoteDTO;
import uia.com.api.inventario.model.Lote;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ApiMapperLote {

    ApiMapperLote INSTANCE = Mappers.getMapper( ApiMapperLote.class );

    LoteDTO entityToDTO(Lote lote);
    Lote DTOToEntity(LoteDTO loteDTO);


    //@Mapping(target="lotes", ignore = true)
    List<Lote> entityToDTO(Iterable<LoteDTO> lote);
    List<Lote> DTOToEntities(List<LoteDTO> lotes);
}
