package cellboxowasp.corsmisconfig.modules.users.model;

import cellboxowasp.corsmisconfig.modules.posts.model.Posts;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users_tbl")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Users implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String email;
    private String password;
    private String name;
    private String cover;

    private boolean enabled = true;

//    @ElementCollection(targetClass = Roles.class)
//    @CollectionTable(name = "authorities", joinColumns =
//    @JoinColumn(name = "email", referencedColumnName = "email"))
//    @Enumerated(EnumType.STRING)
//    private List<Roles> roles;

    @OneToMany(mappedBy = "users")
    private List<Posts> posts;

    @Transient
    @JsonIgnore
    private MultipartFile file;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;


    public Users() {
    }

    public Users(String email, String password, String name, String cover) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.cover = cover;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

//    public List<Roles> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<Roles> roles) {
//        this.roles = roles;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
