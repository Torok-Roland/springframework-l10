package springframeworkL10.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springframeworkL10.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(String name) {
        productRepository.addProduct(name);
    }
}
