package countries.cricket.controller;

import countries.cricket.model.user;
import countries.cricket.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class apicontroller {

    @Autowired
    private UserRepo userRepo;
    @GetMapping(value="/users")
    public List<user> getUsers(){

        return userRepo.findAll();
    }
    @PostMapping(value = "/save")
    public String saveUser(@RequestBody user user){
        userRepo.save(user);
        return "Saved...";

    }
    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody user user){
        user updatedUser=userRepo.findById(id).get();
        updatedUser.setCountname((user.getCountname()));
        updatedUser.setJerseyno((user.getJerseyno()));
        updatedUser.setPlayername((user.getPlayername()));
        userRepo.save(updatedUser);
        return "updated...";
    }

    public  String deleteuser(@PathVariable long id){
        user deleteuser=userRepo.findById(id).get();
        userRepo.delete(deleteuser);
        return "Deleted user with id:" +id;
    }




}

