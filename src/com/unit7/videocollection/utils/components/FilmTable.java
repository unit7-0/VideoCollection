/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.components;

import com.unit7.videocollection.entities.Film;
import com.unit7.videocollection.entities.Director;
import com.unit7.videocollection.entities.Genre;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author unit7
 */
public class FilmTable extends EntityTable<Film> {
    public FilmTable() {
        super(Film.class);
        setEnabled(false);
    }
    
    @Override
    protected void init() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Title");
        model.addColumn("Genre");
        model.addColumn("Director");
        model.addColumn("Description");
        setModel(model);
    }
    
    public void refresh() {
        super.refresh();
        
        init();
        TableModel model = getModel();
        Object[] entitiesArr = entities.toArray();
        ((DefaultTableModel) model).setNumRows(entities.size());
        
        for (int i = 0; i < entitiesArr.length; ++i) {
            Genre genre = ((Film) entitiesArr[i]).getGenre();
            Director director = ((Film) entitiesArr[i]).getDirector();
            
            model.setValueAt(((Film) entitiesArr[i]).getTitle(), i, 0);
            model.setValueAt(genre.getName(), i, 1);
            model.setValueAt(director.getName(), i, 2);
            model.setValueAt(((Film) entitiesArr[i]).getDescription(), i, 3);
        }
        
        setModel(model);
    }
}
