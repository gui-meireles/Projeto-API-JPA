package restapi.service;

import restapi.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProduct();

    public Product getById(Long id);

    public void saveOrUpdate(Product product);

    public void deleteProduct(Long id);
}
