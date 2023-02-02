package uia.com.api.inventario.service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.api.inventario.dto.EmbalajeDTO;
import uia.com.api.inventario.dto.EmbalajesDTO;
import uia.com.api.inventario.mapper.ApiMapper;
import uia.com.api.inventario.mapper.ApiMapperEmbalaje;
import uia.com.api.inventario.model.Embalaje;
import uia.com.api.inventario.repository.EmbalajeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class EmbalajeService {
    EmbalajeRepository repository;
    Validator validator;

    @Autowired
    public EmbalajeService(EmbalajeRepository repository, Validator validator) {
        this.repository = repository;
        this.validator = validator;
    }
    public EmbalajeDTO save(EmbalajeDTO embalaje)
    {
        return saveInformation(embalaje);
    }

    public EmbalajesDTO save(EmbalajesDTO embalaje)
    {
        return saveInformation(embalaje);
    }

    public EmbalajesDTO update(EmbalajesDTO embalaje) {
        return saveInformation(embalaje);
    }

    private EmbalajeDTO saveInformation(EmbalajeDTO embalaje)
    {
        Embalaje entity = ApiMapperEmbalaje.INSTANCE.DTOToEntity(embalaje);

        Set<ConstraintViolation<Embalaje>> violations = validator.validate(entity);
        if(!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }

        Embalaje savedEntity = repository.save(entity);
        return ApiMapperEmbalaje.INSTANCE.entityToDTO(savedEntity);
    }

    private EmbalajesDTO saveInformation(EmbalajesDTO embalajes)
    {
        List<Embalaje> entities = ApiMapperEmbalaje.INSTANCE.DTOToEntities(embalajes.getEmbalajes());
        List<EmbalajeDTO> entitiesDTO = new ArrayList<EmbalajeDTO>();
        EmbalajesDTO result = new EmbalajesDTO();

        for(int i=0; i< entities.size(); i++)
        {
            Set<ConstraintViolation<Embalaje>> violations = validator.validate(entities.get(i));
            if(!violations.isEmpty()) {
                throw new ConstraintViolationException(violations);
            }

            Embalaje savedEntity = repository.save(entities.get(i));
            entitiesDTO.add(ApiMapperEmbalaje.INSTANCE.entityToDTO(savedEntity));
        }

        result.setEmbalajes(entitiesDTO);
        return result;
    }
}
