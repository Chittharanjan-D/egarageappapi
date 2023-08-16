package com.example.metal_prices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metal_prices")
public class MetalPricesController {
    private final MetalPricesService metalPricesService;

    @Autowired
    public MetalPricesController(MetalPricesService metalPricesService) {
        this.metalPricesService = metalPricesService;
    }

    @GetMapping
    public List<MetalPrices> getAllMetalPrices() {
        return metalPricesService.getAllMetalPrices();
    }

    @GetMapping("/{id}")
    public MetalPrices getMetalPriceById(@PathVariable Long id) {
        return metalPricesService.getMetalPriceById(id);
    }

    @PostMapping
    public MetalPrices createMetalPrice(@RequestBody MetalPrices metalPrices) {
        return metalPricesService.createMetalPrice(metalPrices);
    }

    @PutMapping("/{id}")
    public MetalPrices updateMetalPrice(@PathVariable Long id, @RequestBody MetalPrices metalPrices) {
        return metalPricesService.updateMetalPrice(id, metalPrices);
    }

    @DeleteMapping("/{id}")
    public void deleteMetalPrice(@PathVariable Long id) {
        metalPricesService.deleteMetalPrice(id);
    }

}
