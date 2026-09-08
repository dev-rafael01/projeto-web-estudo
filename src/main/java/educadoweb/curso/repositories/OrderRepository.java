package educadoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import educadoweb.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> 
{

    
}
