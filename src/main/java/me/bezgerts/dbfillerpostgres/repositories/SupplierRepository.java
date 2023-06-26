package me.bezgerts.dbfillerpostgres.repositories;

import jakarta.transaction.Transactional;
import me.bezgerts.dbfillerpostgres.entities.postgres.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Transactional
public interface SupplierRepository extends JpaRepository<Supplier, UUID> {
}
