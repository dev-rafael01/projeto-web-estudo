package educadoweb.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import educadoweb.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll()
    {
        User  u = new User(1, "RAFAEL", "rafael@gmail.com", "11-98877-4565", "1234");
        return ResponseEntity.ok().body(u);
    }
    
}
