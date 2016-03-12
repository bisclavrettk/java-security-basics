package tko.backend.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by tomek on 12.03.16.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
