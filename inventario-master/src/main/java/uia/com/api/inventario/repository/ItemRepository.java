package uia.com.api.inventario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import uia.com.api.inventario.model.Item;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long>, QueryByExampleExecutor<Item> {
    List<Item> findByName(String name);
}
