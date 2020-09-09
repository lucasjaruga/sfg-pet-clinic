package pl.jarugalucas.sfgpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

// it sets up this class as a base class for JPA, it means that JPA knows that other classes will inherit from this one
@MappedSuperclass
public class BaseEntity implements Serializable {

    //id could be long but Hibernate recommends to use Wrappers, because they can be null
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
