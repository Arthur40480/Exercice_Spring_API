package fr.fms.apitrainings.web;

import fr.fms.apitrainings.business.IBusinessImpl;
import fr.fms.apitrainings.entities.User;
import fr.fms.apitrainings.entities.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
/*@CrossOrigin("http://localhost:4200/")*/
@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    IBusinessImpl iBusiness;

    @GetMapping("/users")
    public List<User> allUsers() { return iBusiness.getUsers(); }

    @GetMapping("/userRole/{id}")
    public List<UserRole> allUserRoles(@PathVariable("id") Long id) { return iBusiness.getAllUserRole(id); }
}
