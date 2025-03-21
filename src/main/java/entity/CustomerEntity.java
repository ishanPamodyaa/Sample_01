package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    private String id;
    private  String name;
    private  String address;
    private  Double salary;
}
