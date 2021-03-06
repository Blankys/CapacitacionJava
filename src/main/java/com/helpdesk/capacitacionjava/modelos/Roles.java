package com.helpdesk.capacitacionjava.modelos;
// Generated 13-ene-2020 16:42:31 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Roles generated by hbm2java
 */
@Setter
@Getter
@Entity
@Table(name = "roles",
         schema = "public"
)
public class Roles implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tbRoles_idRoles_seq")
    @javax.persistence.SequenceGenerator(
            name = "tbRoles_idRoles_seq",
            sequenceName = "tbRoles_idRoles_seq",
            allocationSize = 1
    )
    @Column(name = "rol_id", unique = true, nullable = false)
    private Integer rolId;
    
    @Column(name = "rol_descripcion", length = 500)
    private String rolDescripcion;
    
    @Column(name = "rol_nombre", nullable = false, length = 50)
    private String rolNombre;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "roles")
    private Set<Usuarios> usuarioses = new HashSet<Usuarios>(0);

    public Roles() {
    }

}
