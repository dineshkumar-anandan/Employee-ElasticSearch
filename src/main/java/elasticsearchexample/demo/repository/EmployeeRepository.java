package elasticsearchexample.demo.repository;

import elasticsearchexample.demo.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EmployeeRepository extends ElasticsearchRepository<Employee,String> {
}
