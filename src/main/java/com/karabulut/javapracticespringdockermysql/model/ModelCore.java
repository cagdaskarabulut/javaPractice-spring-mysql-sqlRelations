package com.karabulut.javapracticespringdockermysql.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@MappedSuperclass
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ModelCore {
    @EqualsAndHashCode.Include
    @ToString.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Version
    private Long version;
    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;
    protected String createdBy;
    @UpdateTimestamp
    private Timestamp updatedDate;
    protected String updatedBy;

    @PrePersist
    protected void onBaseCreate() {
        setCreatedBy("ADMIN");
        setUpdatedBy("ADMIN");
    }

    @PreUpdate
    protected void onBaseUpdate() {
        setUpdatedBy("ADMIN");
    }

}
