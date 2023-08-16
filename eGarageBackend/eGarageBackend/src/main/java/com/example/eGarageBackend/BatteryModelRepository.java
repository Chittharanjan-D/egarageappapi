package com.example.eGarageBackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatteryModelRepository extends JpaRepository <BatteryModel, Long> {
}
