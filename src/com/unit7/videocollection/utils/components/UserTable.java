/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.components;

import com.unit7.videocollection.entities.Users;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author unit7
 */
public class UserTable extends EntityTable<Users> {
    public UserTable() {
        super(Users.class);
        setEnabled(true);
    }
    
    @Override
    protected void init() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Street");
        model.addColumn("House");
        model.addColumn("Phone");
        setModel(model);
    }
    
    @Override
    public void refresh() {
        init();
        super.refresh();
        
        TableModel model = getModel();
        ((DefaultTableModel) model).setNumRows(entities.size());
        
        int i = 0;
        for (Users user : entities) {
            model.setValueAt(new ObjectWrapper(user.getFirstName() + " " + user.getLastName(), user.getId()) {
                @Override
                public String toString() {
                    return objects[0].toString();
                }
            }, i, 0);
            model.setValueAt(user.getStreet().getName(), i, 1);
            model.setValueAt(user.getHouse(), i, 2);
            model.setValueAt(user.getPhone(), i, 3);
            i += 1;
        }
        
        setModel(model);
    }
}
