package com.example.abproject_api.repository;

import com.example.abproject_api.model.TotalAmount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalAmountRepository extends JpaRepository<TotalAmount, Long> {
}
