package be.thomasmore.bookserver.repositories;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import be.thomasmore.bookserver.model.dto.Shop;

public interface ShopRepository extends CrudRepository<Shop, Integer>{

    List<Shop> findAll();

    List<Shop> findByNameContainingIgnoreCase(String nameKeyWord);
}
