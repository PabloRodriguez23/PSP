/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pablo
 */
@Entity
@Table(name = "Empresario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresario.findAll", query = "SELECT e FROM Empresario e")
    , @NamedQuery(name = "Empresario.findByDni", query = "SELECT e FROM Empresario e WHERE e.dni = :dni")
    , @NamedQuery(name = "Empresario.findByNombre", query = "SELECT e FROM Empresario e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empresario.findByApellido", query = "SELECT e FROM Empresario e WHERE e.apellido = :apellido")
    , @NamedQuery(name = "Empresario.findByFechaNacimiento", query = "SELECT e FROM Empresario e WHERE e.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Empresario.findByDineroBanco", query = "SELECT e FROM Empresario e WHERE e.dineroBanco = :dineroBanco")})
public class Empresario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dni")
    private Integer dni;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "dinero_banco")
    private BigDecimal dineroBanco;
    @JoinColumn(name = "nif_empresa", referencedColumnName = "nif")
    @ManyToOne(optional = false)
    private Empresa nifEmpresa;
    @OneToMany(mappedBy = "dniEmpresario")
    private Collection<Cuenta> cuentaCollection;

    public Empresario() {
    }

    public Empresario(Integer dni) {
        this.dni = dni;
    }

    public Empresario(Integer dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Empresario(int dni, String nombre, String apellido, java.sql.Date date, BigDecimal bigDecimal) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = date;
        this.dineroBanco = bigDecimal;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public BigDecimal getDineroBanco() {
        return dineroBanco;
    }

    public void setDineroBanco(BigDecimal dineroBanco) {
        this.dineroBanco = dineroBanco;
    }

    public Empresa getNifEmpresa() {
        return nifEmpresa;
    }

    public void setNifEmpresa(Empresa nifEmpresa) {
        this.nifEmpresa = nifEmpresa;
    }

    @XmlTransient
    public Collection<Cuenta> getCuentaCollection() {
        return cuentaCollection;
    }

    public void setCuentaCollection(Collection<Cuenta> cuentaCollection) {
        this.cuentaCollection = cuentaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dni != null ? dni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresario)) {
            return false;
        }
        Empresario other = (Empresario) object;
        if ((this.dni == null && other.dni != null) || (this.dni != null && !this.dni.equals(other.dni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Empresario[ dni=" + dni + " ]";
    }
    
}
