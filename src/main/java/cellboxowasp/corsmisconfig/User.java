package cellboxowasp.corsmisconfig;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.common.aliasing.qual.Unique;
import org.hibernate.annotations.GenericGenerator;
import org.jetbrains.annotations.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "phone"),
                @UniqueConstraint(columnNames = "email")
        })
public class User {

    @Nullable
    public String firstName;
    @Nullable
    public String lastName;

    public String userProfileName;
    @Size(max = 50)
    @Email
    @Unique
    public String email;
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false, unique = true)
    private UUID id;
    private boolean TowStepIsOn = false;
    private boolean isPhoneVerified = false;
    private boolean isEmailVerified = false;
    private String SecretKey;

    @NotBlank
    @Size(max = 120)
    private String password;
    @Unique
    private String profileUsername;

    @Column(nullable = true)
    private String phone;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String family;
    @Column(nullable = true)
    private Date lastLogin;
    @Column(nullable = true)
    private String image;
    @Column(name = "created_at", nullable = true)

    private Timestamp createdAt;
    private Timestamp updatedAt;


}
