package br.com.users.controller;

import br.com.users.dto.UserDTO;
import br.com.users.service.UserSvc;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    private UserSvc userSvc;

    public UserController (UserSvc userSvc) {
        this.userSvc = userSvc;
    }

    @GetMapping("/{email}")
    public UserDTO getUserAddressByEmail(
            @PathVariable String email,
            @RequestParam(required = false, defaultValue = "1") int size) {

        return userSvc.getUserAddress(email, size);
    }
}
