package com.example.abproject_api.service;

import com.example.abproject_api.model.TotalAmount;
import com.example.abproject_api.repository.TotalAmountRepository;
import org.springframework.stereotype.Service;

@Service
public class TotalAmountService {

    private final TotalAmountRepository totalAmountRepository;

    public TotalAmountService(TotalAmountRepository totalAmountRepository) {
        this.totalAmountRepository = totalAmountRepository;
    }

    public TotalAmount getTotalAmount() {
        return totalAmountRepository.findById(1L).orElse(null); // Assuming only one record
    }

    public TotalAmount updateTotalAmount(Double amount) {
        TotalAmount totalAmount = getTotalAmount();
        if (totalAmount == null) {
            totalAmount = new TotalAmount();
        }
        totalAmount.setTotalAmount(amount);
        return totalAmountRepository.save(totalAmount);
    }
}
