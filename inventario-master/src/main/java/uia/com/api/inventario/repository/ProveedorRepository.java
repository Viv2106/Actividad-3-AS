package uia.com.api.inventario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import uia.com.api.inventario.model.Proveedor;

import java.util.List;

public interface ProveedorRepository extends CrudRepository<Proveedor, Long>, QueryByExampleExecutor<Proveedor> {
    List<Proveedor> findByName(String name);
}
