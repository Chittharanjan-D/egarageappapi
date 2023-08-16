package com.example.metal_prices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetalPricesServiceImpl implements MetalPricesService {
    private final MetalPricesRepository metalPricesRepository;

    @Autowired
    public MetalPricesServiceImpl(MetalPricesRepository metalPricesRepository) {
        this.metalPricesRepository = metalPricesRepository;
    }

    @Override
    public List<MetalPrices> getAllMetalPrices() {
        return (List<MetalPrices>) metalPricesRepository.findAll();
    }
    @Override
    public MetalPrices getMetalPriceById(Long id) {
        Optional<MetalPrices> optionalMetalPrice = metalPricesRepository.findById(id);
        return optionalMetalPrice.orElse(null);
    }

    @Override
    public MetalPrices createMetalPrice(MetalPrices metalPrices) {
        return metalPricesRepository.save(metalPrices);
    }

    @Override
    public MetalPrices updateMetalPrice(Long id, MetalPrices updatedMetalPrices) {
        Optional<MetalPrices> optionalMetalPrice = metalPricesRepository.findById(id);
        if (optionalMetalPrice.isPresent()) {
            // Replace the existing record with the updated one
            return metalPricesRepository.save(updatedMetalPrices);
        } else {
            return null;
        }
    }

    @Override
    public void deleteMetalPrice(Long id) {
        metalPricesRepository.deleteById(id);
    }
}
