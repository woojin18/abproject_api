package com.example.abproject_api.controller;

import com.example.abproject_api.model.TotalAmount;
import com.example.abproject_api.service.TotalAmountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/totalAmount")
public class TotalAmountController {

    private final TotalAmountService totalAmountService;

    public TotalAmountController(TotalAmountService totalAmountService) {
        this.totalAmountService = totalAmountService;
    }

    @GetMapping
    public ResponseEntity<TotalAmount> getTotalAmount() {
        return ResponseEntity.ok(totalAmountService.getTotalAmount());
    }

    @PutMapping
    public ResponseEntity<TotalAmount> updateTotalAmount(@RequestBody Double amount) {
        return ResponseEntity.ok(totalAmountService.updateTotalAmount(amount));
    }
}
