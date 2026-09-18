package task.com.banking.system;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping
    public List<Bank> getAll() {
        return bankService.findAll();
    }

    @GetMapping("/{id}")
    public Bank getById(@PathVariable Integer id) {
        return bankService.findById(id).orElse(null);
    }

    @PostMapping
    public Bank create(@RequestBody Bank bank) {
        return bankService.save(bank);
    }

    @PutMapping("/{id}")
    public Bank update(@PathVariable Integer id, @RequestBody Bank bank) {
        bank.setId(id);
        return bankService.save(bank);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        return bankService.delete(id);
    }
}