/*
 * VideoCollectionView.java
 */

package com.unit7.videocollection;

import com.unit7.videocollection.forms.FilmListForm;
import com.unit7.videocollection.forms.MessageListForm;
import com.unit7.videocollection.forms.UserListForm;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;

/**
 * The application's main frame.
 */
public class VideoCollectionView extends FrameView {

    public VideoCollectionView(SingleFrameApplication app) {
        super(app);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainControl = new javax.swing.JPanel();
        filmsButton = new javax.swing.JButton();
        usersButton = new javax.swing.JButton();
        messagesButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();

        mainPanel.setName("mainPanel"); // NOI18N

        mainControl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mainControl.setName("mainControl"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.unit7.videocollection.VideoCollectionApp.class).getContext().getResourceMap(VideoCollectionView.class);
        filmsButton.setText(resourceMap.getString("filmsButton.text")); // NOI18N
        filmsButton.setName("filmsButton"); // NOI18N
        filmsButton.setPreferredSize(new java.awt.Dimension(105, 23));
        filmsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmsButtonActionPerformed(evt);
            }
        });

        usersButton.setText(resourceMap.getString("usersButton.text")); // NOI18N
        usersButton.setName("usersButton"); // NOI18N
        usersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersButtonActionPerformed(evt);
            }
        });

        messagesButton.setText(resourceMap.getString("messagesButton.text")); // NOI18N
        messagesButton.setName("messagesButton"); // NOI18N
        messagesButton.setPreferredSize(new java.awt.Dimension(105, 23));
        messagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainControlLayout = new javax.swing.GroupLayout(mainControl);
        mainControl.setLayout(mainControlLayout);
        mainControlLayout.setHorizontalGroup(
            mainControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainControlLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(mainControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messagesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usersButton)
                    .addComponent(filmsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );
        mainControlLayout.setVerticalGroup(
            mainControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filmsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messagesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(com.unit7.videocollection.VideoCollectionApp.class).getContext().getActionMap(VideoCollectionView.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N
        menuBar.add(helpMenu);

        setComponent(mainPanel);
        setMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents

private void filmsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmsButtonActionPerformed
    FilmListForm.main(null);
}//GEN-LAST:event_filmsButtonActionPerformed

private void usersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersButtonActionPerformed
    UserListForm.main(null);
}//GEN-LAST:event_usersButtonActionPerformed

private void messagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagesButtonActionPerformed
    MessageListForm.main(null);
}//GEN-LAST:event_messagesButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton filmsButton;
    private javax.swing.JPanel mainControl;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton messagesButton;
    private javax.swing.JButton usersButton;
    // End of variables declaration//GEN-END:variables

}