package elasticsearchexample.demo.controller;

import elasticsearchexample.demo.model.Employee;
import elasticsearchexample.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/es")
@RestController
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("")
    public Iterable<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @PostMapping("/post")
    public Employee save(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @PostMapping("update")
    public Employee update(@RequestBody Employee employee) throws Exception {
        return employeeRepository.save(employee);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable("id") String id){
        employeeRepository.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
}