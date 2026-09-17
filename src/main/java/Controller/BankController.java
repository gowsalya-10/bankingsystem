package task.com.banking.system;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

public class BankController {

    @RestController
    public class BankController {
        @Autowired
        BankService bankService;

        @GetMapping("/user")
        public List<user> getUser();

        @PostMapping
        public String saveUser(@RequestBody User user) {
            return bankService.addUser(user);
        }
        @PutMapping
        public User updateUser(@PathVariable String id, @RequestBody User user) {
            return bankService.replaceUser(id, user);
        }
        @DeleteMapping
        public String deleteUser(@PathVariable String id) {
            return bankService.deleteUser(id);
        }

    }
}