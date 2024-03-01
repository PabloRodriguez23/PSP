/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Pablo
 */
@Entity
@Table(name = "SECCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seccion.findAll", query = "SELECT s FROM Seccion s")
    , @NamedQuery(name = "Seccion.findById", query = "SELECT s FROM Seccion s WHERE s.id = :id")
    , @NamedQuery(name = "Seccion.findByDescripcion", query = "SELECT s FROM Seccion s WHERE s.descripcion = :descripcion")
    , @NamedQuery(name = "Seccion.findByContrase\u00f1a", query = "SELECT s FROM Seccion s WHERE s.contrase\u00f1a = :contrase\u00f1a")
    , @NamedQuery(name = "Seccion.findByPrecioTotalProductos", query = "SELECT s FROM Seccion s WHERE s.precioTotalProductos = :precioTotalProductos")})
public class Seccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ID")
    private String id;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 100)
    @Column(name = "CONTRASE\u00d1A")
    private String contraseña;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO_TOTAL_PRODUCTOS")
    private BigDecimal precioTotalProductos;
    @OneToMany(mappedBy = "idSeccion")
    private Collection<Producto> productoCollection;

    public Seccion() {
    }

    public Seccion(String id, String descripcion, String contraseña, BigDecimal precioTotalProductos) {
        this.id = id;
        this.descripcion = descripcion;
        this.contraseña = contraseña;
        this.precioTotalProductos = precioTotalProductos;
    }
    
    

    public Seccion(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public BigDecimal getPrecioTotalProductos() {
        return precioTotalProductos;
    }

    public void setPrecioTotalProductos(BigDecimal precioTotalProductos) {
        this.precioTotalProductos = precioTotalProductos;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seccion)) {
            return false;
        }
        Seccion other = (Seccion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Seccion[ id=" + id + " ]";
    }
    
}
