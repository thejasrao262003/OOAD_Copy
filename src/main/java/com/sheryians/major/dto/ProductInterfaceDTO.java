package com.sheryians.major.dto;


import com.sheryians.major.dto.ProductDTO;
import com.sheryians.major.model.Product;

public interface ProductInterfaceDTO {
    ProductDTO convertToDTO(Product product);
}
