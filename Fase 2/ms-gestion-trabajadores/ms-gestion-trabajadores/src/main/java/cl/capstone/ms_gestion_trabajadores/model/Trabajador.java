package cl.capstone.ms_gestion_trabajadores.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TRABAJADOR")
public class Trabajador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_trabajador;

    @Column(nullable = false)
    private String primero_nombre;

    @Column(nullable = false)
    private String segundo_nombre;

    @Column(nullable = false)
    private String primer_apellido;

    @Column(nullable = false)
    private String segundo_apellido;

    @Column(nullable = false)
    private String run;

    @Column(nullable = false)
    private LocalDate fecha_nacimiento;

    @Column(nullable = false)
    private LocalDate fecha_contratacion;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String telefono;

    private String email;

    @Column(nullable = false)
    private String cargo;

    public Trabajador() {
    }

    // Constructor con parámetros
    public Trabajador(Long id_trabajador, String primero_nombre, String segundo_nombre,
            String primer_apellido, String segundo_apellido, String run,
            LocalDate fecha_nacimiento, LocalDate fecha_contratacion,
            String direccion, String telefono, String email, String cargo) {
        this.id_trabajador = id_trabajador;
        this.primero_nombre = primero_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.run = run;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_contratacion = fecha_contratacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.cargo = cargo;
    }

}
