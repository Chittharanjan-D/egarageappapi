package com.example.metal_prices;

import java.util.List;

public interface MetalPricesService {
    List<MetalPrices> getAllMetalPrices();
    MetalPrices getMetalPriceById(Long id);
    MetalPrices createMetalPrice(MetalPrices metalPrices);
    MetalPrices updateMetalPrice(Long id, MetalPrices metalPrices);
    void deleteMetalPrice(Long id);
}
