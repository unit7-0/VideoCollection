/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author unit7
 */
@Entity
@Table(name = "MESSAGE")
@NamedQueries({
    @NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m"),
    @NamedQuery(name = "Message.findById", query = "SELECT m FROM Message m WHERE m.id = :id"),
    @NamedQuery(name = "Message.findByMessDate", query = "SELECT m FROM Message m WHERE m.messDate = :messDate"),
    @NamedQuery(name = "Message.findByDescription", query = "SELECT m FROM Message m WHERE m.description = :description")})
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "MESS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date messDate;
    @Column(name = "DESCRIPTION")
    private String description;
    @JoinColumn(name = "MESS_USER", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Users messUser;

    public Message() {
    }

    public Message(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getMessDate() {
        return messDate;
    }

    public void setMessDate(Date messDate) {
        this.messDate = messDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Users getMessUser() {
        return messUser;
    }

    public void setMessUser(Users messUser) {
        this.messUser = messUser;
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
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unit7.videocollection.entities.Message[ id=" + id + " ]";
    }
    
}
