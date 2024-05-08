package id.ac.ui.cs.advprog.paymentservice.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long custId;


    @Column(name = "custBalance")
    private Integer custBalance;

    public Balance(){
    }


}
