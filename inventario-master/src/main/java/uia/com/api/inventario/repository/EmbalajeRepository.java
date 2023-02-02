package uia.com.api.inventario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import uia.com.api.inventario.model.Embalaje;
import uia.com.api.inventario.model.Embalaje;

import java.util.List;

public interface EmbalajeRepository extends CrudRepository<Embalaje, Long>, QueryByExampleExecutor<Embalaje> {
    List<Embalaje> findByName(String name);
}
