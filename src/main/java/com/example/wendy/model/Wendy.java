
package com.example.wendy.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Wendy {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 Long id;
 String nombreCompleto;
 String documento;
 String email;
 String telefono;
 String ciudad;
 String pais;
 LocalDate fechaNacimiento;
 @Column(length=500)
 String descripcion;

 public Wendy(){}
 public Long getId(){return id;}
 public void setId(Long id){this.id=id;}
 public String getNombreCompleto(){return nombreCompleto;}
 public void setNombreCompleto(String n){this.nombreCompleto=n;}
 public String getDocumento(){return documento;}
 public void setDocumento(String d){this.documento=d;}
 public String getEmail(){return email;}
 public void setEmail(String e){this.email=e;}
 public String getTelefono(){return telefono;}
 public void setTelefono(String t){this.telefono=t;}
 public String getCiudad(){return ciudad;}
 public void setCiudad(String c){this.ciudad=c;}
 public String getPais(){return pais;}
 public void setPais(String p){this.pais=p;}
 public LocalDate getFechaNacimiento(){return fechaNacimiento;}
 public void setFechaNacimiento(LocalDate f){this.fechaNacimiento=f;}
 public String getDescripcion(){return descripcion;}
 public void setDescripcion(String d){this.descripcion=d;}
}
