package com.example.virtualteamtech.repository;
import com.example.virtualteamtech.models.entity.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

    @Query(value = "SELECT item FROM Item item WHERE item.id = :code")
    Item findByCode(Long code);
}
