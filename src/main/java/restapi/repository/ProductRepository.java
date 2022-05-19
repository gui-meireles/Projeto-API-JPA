package restapi.repository;

import org.springframework.data.repository.CrudRepository;
import restapi.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
