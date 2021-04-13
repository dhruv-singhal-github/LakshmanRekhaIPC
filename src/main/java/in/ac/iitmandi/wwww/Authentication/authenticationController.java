package in.ac.iitmandi.wwww.Authentication;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class authenticationController {

    @Autowired
    userRepository userRepo;


    @GetMapping("/authenticate/{email}/{pwd}")
    public int show(@PathVariable String email,@PathVariable String pwd){
       
        user a= userRepo.findByEmail(email);
        		if(a==null)
        		{
        			return 1;
        		}
        return a.getPwd().compareTo(pwd);
        
    }
    @PostMapping("/post")
    public String  add(@RequestBody user use) {
        user used= userRepo.save(use);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(used.getId())
                .toUri();
         ResponseEntity.created(location).build();
         return used.getEmail();
    }

 


}