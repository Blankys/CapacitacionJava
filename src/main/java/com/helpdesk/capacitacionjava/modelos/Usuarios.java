package com.helpdesk.capacitacionjava.modelos;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "usuarios",
         schema = "public"
)
public class Usuarios implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tbusuarios_idusuario_seq")
    @javax.persistence.SequenceGenerator(
            name = "tbusuarios_idusuario_seq",
            sequenceName = "tbusuarios_idusuario_seq",
            allocationSize = 1
    )
    @Column(name = "id_usuario", unique = true, nullable = false)
    private Integer idUsuario;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rol_id")
    private Roles roles;
    
    @Column(name = "usuario_contrasenia", nullable = false, length = 50)
    private String usuarioContrasenia;
    
    @Column(name = "usuario_correo", length = 75)
    private String usuarioCorreo;
    
    @Column(name = "usuario_estado")
    private Boolean usuarioEstado;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "usuario_fecha", length = 13)
    private Date usuarioFecha;
    
    @Column(name = "usuario_nombre", nullable = false, length = 75)
    private String usuarioNombre;
    
    @Column(name = "usuario_telefono", length = 16)
    private String usuarioTelefono;

    public Usuarios() {
    }
}