package me.bezgerts.dbfillerpostgres.repositories;

import jakarta.transaction.Transactional;

import me.bezgerts.dbfillerpostgres.entities.postgres.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, UUID> {
}
