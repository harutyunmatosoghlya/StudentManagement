package am.itspace.studentmanagement.entitiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    @ManyToOne
    private Lesson lesson;
    @Enumerated(EnumType.STRING)
    @Column(name = "user_type")
    private UserType userType;
}