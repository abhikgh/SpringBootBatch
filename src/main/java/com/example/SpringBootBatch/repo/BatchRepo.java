package com.example.SpringBootBatch.repo;

import com.example.SpringBootBatch.entity.Voltage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepo extends JpaRepository<Voltage, Integer> {
}
