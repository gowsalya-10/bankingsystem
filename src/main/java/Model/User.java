package task.com.banking.system;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class spam {
     @GetMapping("/display/{string}")

       public String getuser(@PathVariable String string) {
        return string;
    }

}