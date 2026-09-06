package educadoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import educadoweb.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> 
{

    
}
