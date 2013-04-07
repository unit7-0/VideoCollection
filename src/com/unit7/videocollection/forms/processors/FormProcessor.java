/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.forms.processors;

import com.unit7.videocollection.entities.Director;
import com.unit7.videocollection.entities.Genre;
import com.unit7.videocollection.entities.Street;
import com.unit7.videocollection.entities.Studio;
import com.unit7.videocollection.forms.FilmAddForm;
import com.unit7.videocollection.forms.UserAddForm;
import com.unit7.videocollection.utils.GetStatusForm;
import com.unit7.videocollection.utils.HibernateUtil;
import com.unit7.videocollection.utils.impl.DirectorFieldGetterImpl;
import com.unit7.videocollection.utils.impl.DirectorFieldSetterImpl;
import com.unit7.videocollection.utils.impl.GenreFieldGetterImpl;
import com.unit7.videocollection.utils.impl.GenreFieldSetterImpl;
import com.unit7.videocollection.utils.impl.StreetFieldGetterImpl;
import com.unit7.videocollection.utils.impl.StreetFieldSetterImpl;
import com.unit7.videocollection.utils.impl.StudioFieldGetterImpl;
import com.unit7.videocollection.utils.impl.StudioFieldSetterImpl;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author unit7
 */
public class FormProcessor {
    public static Object[] getInfo(FilmAddForm form) {     
        int status = GetStatusForm.WAITING;
        while (status == GetStatusForm.WAITING) {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(FilmAddForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            status = form.getStatus();
        }
        
        if (status == GetStatusForm.OK) {
            Object[] result = new Object[5];
            result[0] = form.getTitleField();
            result[4] = form.getDescription();
            
            Genre genre = null;
            Object[] ans = form.getGenre();
            if (!ans[1].equals("")) {
                genre = new Genre();
                genre.setName((String) ans[1]);
                HibernateUtil.insertEntity(genre, new GenreFieldSetterImpl(), new GenreFieldGetterImpl());
            } else {
                genre = (Genre) ans[0];
            }
            
            Director director = null;
            ans = form.getDirector();
            if (!ans[1].equals("")) {
                director = new Director();
                director.setName((String) ans[1]);
                HibernateUtil.insertEntity(director, new DirectorFieldSetterImpl(), new DirectorFieldGetterImpl());
            } else {
                director = (Director) ans[0];
            }
            
            Studio studio = null;
            ans = form.getStudio();
            if (!ans[1].equals("")) {
                studio = new Studio();
                studio.setName((String) ans[1]);
                HibernateUtil.insertEntity(studio, new StudioFieldSetterImpl(), new StudioFieldGetterImpl());
            } else {
                studio = (Studio) ans[0];
            }
            
            result[1] = genre;
            result[2] = director;
            result[3] = studio;
            
            return result;
        }
        
        return null;
    }
    
    public static Object[] getInfo(UserAddForm form) {
        int status = GetStatusForm.WAITING;
        while (status == GetStatusForm.WAITING) {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(FilmAddForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            status = form.getStatus();
        }
        
        if (status == GetStatusForm.OK) {
            Object[] result = new Object[5];
            result[0] = form.getFirstName();
            result[1] = form.getLastName();
            result[2] = form.getPhone();
            result[3] = form.getHouse();
            
            Street street = null;
            Object[] ans = form.getStreet();
            if (!ans[1].equals("")) {
                street = new Street();
                street.setName((String) ans[1]);
                HibernateUtil.insertEntity(street, new StreetFieldSetterImpl(), new StreetFieldGetterImpl());
            } else
                street = (Street) ans[0];
            
            result[4] = street;
            
            return result;
        }
        
        return null;
    }
}
