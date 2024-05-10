package fr.fms.apitrainings.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean active;

    @OneToMany(mappedBy = "user")
    @ToString.Exclude
    private List<UserRole> userRoles;

    public User(String username, String password, boolean active) {
        this.username = username;
        this.password= password;
        this.active = active;
    }
}
