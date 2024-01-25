/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pablo
 */
@Entity
@Table(name = "Cuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c")
    , @NamedQuery(name = "Cuenta.findByNumcuenta", query = "SELECT c FROM Cuenta c WHERE c.numcuenta = :numcuenta")
    , @NamedQuery(name = "Cuenta.findByDinero", query = "SELECT c FROM Cuenta c WHERE c.dinero = :dinero")})
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numcuenta")
    private Integer numcuenta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "dinero")
    private BigDecimal dinero;
    @JoinColumn(name = "dni_empresario", referencedColumnName = "dni")
    @ManyToOne
    private Empresario dniEmpresario;

    public Cuenta() {
    }

    public Cuenta(Integer numcuenta) {
        this.numcuenta = numcuenta;
    }

    public Integer getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(Integer numcuenta) {
        this.numcuenta = numcuenta;
    }

    public BigDecimal getDinero() {
        return dinero;
    }

    public void setDinero(BigDecimal dinero) {
        this.dinero = dinero;
    }

    public Empresario getDniEmpresario() {
        return dniEmpresario;
    }

    public void setDniEmpresario(Empresario dniEmpresario) {
        this.dniEmpresario = dniEmpresario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numcuenta != null ? numcuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.numcuenta == null && other.numcuenta != null) || (this.numcuenta != null && !this.numcuenta.equals(other.numcuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Cuenta[ numcuenta=" + numcuenta + " ]";
    }
    
}
