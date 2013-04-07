/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unit7.videocollection.utils.components;

import com.unit7.videocollection.entities.Message;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author unit7
 */
public class MessageTable extends EntityTable<Message> {
    public MessageTable() {
        super(Message.class);
    }
    
    @Override
    protected void init() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("To user");
        model.addColumn("Date");
        model.addColumn("Description");
        setModel(model);
    }
    
    @Override
    public void refresh() {
        init();
        super.refresh();
        
        TableModel model = getModel();
        ((DefaultTableModel) model).setNumRows(entities.size());
        
        int i = 0;
        for (Message message : entities) {
            model.setValueAt(message.getMessUser().getFirstName() + " " +
                             message.getMessUser().getLastName(), i, 0);
            model.setValueAt(message.getMessDate(), i, 1);
            model.setValueAt(message.getDescription(), i, 2);
        }
        
        setModel(model);
    }
}
