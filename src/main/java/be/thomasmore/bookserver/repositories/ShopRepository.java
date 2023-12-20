package be.thomasmore.bookserver.repositories;

import org.springframework.data.repository.CrudRepository;

import be.thomasmore.bookserver.model.Shop;

import java.util.List;

public interface ShopRepository extends CrudRepository<Shop, Integer>{

    List<Shop> findAll();

    List<Shop> findByNameContainingIgnoreCase(String nameKeyWord);
}
