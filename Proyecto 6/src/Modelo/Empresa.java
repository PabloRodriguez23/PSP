/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pablo
 */
@Entity
@Table(name = "Empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")
    , @NamedQuery(name = "Empresa.findByNif", query = "SELECT e FROM Empresa e WHERE e.nif = :nif")
    , @NamedQuery(name = "Empresa.findByFundacion", query = "SELECT e FROM Empresa e WHERE e.fundacion = :fundacion")
    , @NamedQuery(name = "Empresa.findByNumsocios", query = "SELECT e FROM Empresa e WHERE e.numsocios = :numsocios")
    , @NamedQuery(name = "Empresa.findByContrasena", query = "SELECT e FROM Empresa e WHERE e.contrasena = :contrasena")
    , @NamedQuery(name = "Empresa.findByFoto", query = "SELECT e FROM Empresa e WHERE e.foto = :foto")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nif")
    private Integer nif;
    @Column(name = "fundacion")
    @Temporal(TemporalType.DATE)
    private Date fundacion;
    @Column(name = "numsocios")
    private Integer numsocios;
    @Column(name = "contrasena")
    private Integer contrasena;
    @Column(name = "foto")
    private String foto;

    public Empresa() {
    }

    public Empresa(Integer nif) {
        this.nif = nif;
    }

    public Integer getNif() {
        return nif;
    }

    public void setNif(Integer nif) {
        this.nif = nif;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }

    public Integer getNumsocios() {
        return numsocios;
    }

    public void setNumsocios(Integer numsocios) {
        this.numsocios = numsocios;
    }

    public Integer getContrasena() {
        return contrasena;
    }

    public void setContrasena(Integer contrasena) {
        this.contrasena = contrasena;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nif != null ? nif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.nif == null && other.nif != null) || (this.nif != null && !this.nif.equals(other.nif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nif=" + nif + ", fundacion=" + fundacion + ", numsocios=" + numsocios + ", contrasena=" + contrasena + ", foto=" + foto + '}';
    }

    
    
}
