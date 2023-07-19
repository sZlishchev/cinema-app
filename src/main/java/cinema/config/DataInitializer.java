package cinema.config;

import cinema.model.User;
import java.util.Set;
import javax.annotation.PostConstruct;
import cinema.model.Role;
import cinema.service.RoleService;
import cinema.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ROLE_ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.ROLE_USER);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin@gmail.com");
        admin.setPassword("admin123");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);
    }
}
