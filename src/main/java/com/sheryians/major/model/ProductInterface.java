package com.sheryians.major.model;
import com.sheryians.major.dto.ProductDTO;
import com.sheryians.major.model.Product;

public interface ProductInterface {
    Product convertToEntity(ProductDTO productDTO);
}