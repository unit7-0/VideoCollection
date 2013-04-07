/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.components;

import com.unit7.videocollection.entities.Rental;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * Да-да, знаю, что не соответствует.
 * Лень писать.
 * @author unit7
 */
public class DebtorTable extends EntityTable<Rental> {
   public DebtorTable() {
       super(Rental.class);
       setEnabled(true);
   }

    @Override
    protected void init() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("User");
        model.addColumn("Film");
        model.addColumn("Date");
        setModel(model);
    }
    
    @Override
    public void refresh() {
        init();
        super.refresh();
        
        TableModel model = getModel();
        Collection<Rental> result = new ArrayList<Rental>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        
        for (Rental rental : entities) {
            if (rental.getTargetDate().getTime() < calendar.getTimeInMillis())
                result.add(rental);
        }
        
        int i = 0;
        ((DefaultTableModel) model).setNumRows(result.size());
        for (Rental rental : result) {
            model.setValueAt(new ObjectWrapper(rental.getRentUser().getFirstName() + " " +
                             rental.getRentUser().getLastName(), rental.getRentUser().getId()) {
                                 @Override
                                 public String toString() {
                                     return objects[0].toString();
                                 }
                             }, i, 0);
            model.setValueAt(rental.getRentDate().toString(), i, 2);
            model.setValueAt(rental.getFilm().getTitle(), i, 1);
            i += 1;
        }
        
        setModel(model);
    }
}
