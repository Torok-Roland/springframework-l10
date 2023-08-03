package springframeworkL10.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springframeworkL10.services.ProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping(path = "/addProduct/{name}")
    public void addProduct(@PathVariable String name){
        productService.addProduct(name);
    }
}
