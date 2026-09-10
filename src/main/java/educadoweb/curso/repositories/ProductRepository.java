package educadoweb.curso.repositories;


import educadoweb.curso.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> 
{

   

    
}
