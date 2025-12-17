
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

public class NewfileEntity {

    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank(message="no blank allowed")
    @Email(messange="Invalid format")
    private String email;
}