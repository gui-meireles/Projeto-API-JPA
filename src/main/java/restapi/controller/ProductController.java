package restapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import restapi.model.Product;
import restapi.service.ProductService;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        service.saveOrUpdate(product);
        return product;
    }

    @GetMapping("/list")
    public List<Product> list() {
        return service.getAllProduct();
    }

    @GetMapping("/list/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct (@PathVariable (value = "id") Long id) {
        service.deleteProduct(id);
        return "Deleted Sucessfully id = " + id;
    }
}
