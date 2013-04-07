/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.entities;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
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
import javax.persistence.Transient;

/**
 *
 * @author unit7
 */
@Entity
@Table(name = "FILM")
@NamedQueries({
    @NamedQuery(name = "Film.findAll", query = "SELECT f FROM Film f"),
    @NamedQuery(name = "Film.findById", query = "SELECT f FROM Film f WHERE f.id = :id"),
    @NamedQuery(name = "Film.findByTitle", query = "SELECT f FROM Film f WHERE f.title = :title"),
    @NamedQuery(name = "Film.findByDescription", query = "SELECT f FROM Film f WHERE f.description = :description")})
public class Film implements Serializable {
    @OneToMany(mappedBy = "film")
    private Collection<Rental> rentalCollection;
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @JoinColumn(name = "STUDIO", referencedColumnName = "ID")
    @ManyToOne
    private Studio studio;
    @JoinColumn(name = "GENRE", referencedColumnName = "ID")
    @ManyToOne
    private Genre genre;
    @JoinColumn(name = "DIRECTOR", referencedColumnName = "ID")
    @ManyToOne
    private Director director;

    public Film() {
    }

    public Film(BigDecimal id) {
        this.id = id;
    }

    public Film(BigDecimal id, String title) {
        this.id = id;
        this.title = title;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        BigDecimal oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        String oldTitle = this.title;
        this.title = title;
        changeSupport.firePropertyChange("title", oldTitle, title);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        Studio oldStudio = this.studio;
        this.studio = studio;
        changeSupport.firePropertyChange("studio", oldStudio, studio);
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        Genre oldGenre = this.genre;
        this.genre = genre;
        changeSupport.firePropertyChange("genre", oldGenre, genre);
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        Director oldDirector = this.director;
        this.director = director;
        changeSupport.firePropertyChange("director", oldDirector, director);
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
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unit7.Film[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public Collection<Rental> getRentalCollection() {
        return rentalCollection;
    }

    public void setRentalCollection(Collection<Rental> rentalCollection) {
        this.rentalCollection = rentalCollection;
    }
    
}
