package com.sheryians.major.adapter;

import com.sheryians.major.dto.ProductDTO;
import com.sheryians.major.dto.ProductInterfaceDTO;
import com.sheryians.major.model.Category;
import com.sheryians.major.model.Product;
import com.sheryians.major.model.ProductInterface;
import org.springframework.stereotype.Component;

@Component
public class ProductAdapter implements ProductInterface, ProductInterfaceDTO {

    @Override
    public ProductDTO convertToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setCategoryId(product.getCategory().getId());
        productDTO.setPrice(product.getPrice());
        productDTO.setWeight(product.getWeight());
        productDTO.setDescription(product.getDescription());
        productDTO.setImageName(product.getImageName());
        return productDTO;
    }

    @Override
    public Product convertToEntity(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        Category category = new Category();
        category.setId(productDTO.getCategoryId());
        product.setCategory(category);
        product.setPrice(productDTO.getPrice());
        product.setWeight(productDTO.getWeight());
        product.setDescription(productDTO.getDescription());
        product.setImageName(productDTO.getImageName());
        return product;
    }
}
