package elasticsearchexample.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "company")
public class Employee {

        @Id
        private String id;
        @Field(type = FieldType.Text)
        private String name;
        @Field(type = FieldType.Text)
        private String status;
}
