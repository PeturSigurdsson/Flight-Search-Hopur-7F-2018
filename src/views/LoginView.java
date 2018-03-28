/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import containers.Bookings;
import datastructures.User;
import java.awt.Color;
import database.DatabaseQueries;
import datastructures.Flight;

/**
 *
 * @author gudmu
 */
public class LoginView extends javax.swing.JPanel {
    private final Main parent;          //Parent JFrame
    private final Flight flight;
    private final String prevOn;
    private final String buttonStatus;
    /**
     * Creates new form loginView
     * @param main
     * @param flight
     * @param prevOn
     * @param buttonStatus
     */
    public LoginView(Main main, Flight flight, String prevOn, String buttonStatus) {
        initComponents();
        this.parent = main;
        this.flight = flight;
        this.prevOn = prevOn;
        this.buttonStatus = buttonStatus;
        jRegister.setText(buttonStatus); // hvort það sé inn- eða nýskráning

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUsernameTextField = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jRegister = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jGoToPrevPanel = new javax.swing.JButton();
        kennitala = new javax.swing.JLabel();
        jKennitalaTextField = new javax.swing.JTextField();
        jErrorMessage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jUsernameTextField.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jUsernameTextField.setToolTipText("Vinsamlegast skráðu alvöru nafn");
        jUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsernameTextFieldActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        username.setText("Notendanafn");

        password.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        password.setText("Lykilorð");

        jRegister.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jRegister.setText("Nýskráning");
        jRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterActionPerformed(evt);
            }
        });

        jPassword.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPassword.setToolTipText("Lengra en 5 stafir");
        jPassword.setName(""); // NOI18N

        jGoToPrevPanel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jGoToPrevPanel.setText("<-");
        jGoToPrevPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGoToPrevPanelActionPerformed(evt);
            }
        });

        kennitala.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        kennitala.setText("Kennitala");

        jKennitalaTextField.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jKennitalaTextField.setToolTipText("Form: 123456-1234");

        jErrorMessage.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jGoToPrevPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRegister, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(username)
                                        .addComponent(kennitala))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jKennitalaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(162, 162, 162)
                            .addComponent(password)
                            .addGap(18, 18, 18)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jErrorMessage)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jGoToPrevPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kennitala)
                    .addComponent(jKennitalaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addGap(18, 18, 18)
                .addComponent(jRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jErrorMessage)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsernameTextFieldActionPerformed

    private void jRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterActionPerformed
        boolean nameValidated = validateName();
        boolean ssnValidated = validateSSN();
        boolean passwordValidated = validatePassword();
        
        if (!nameValidated || !ssnValidated || !passwordValidated) return;        
        
        String usernameInput = jUsernameTextField.getText();
        String passwordInput = new String(jPassword.getPassword());
        String ssnInput = jKennitalaTextField.getText().replace("-", "");

        if ("Innskráning".equals(buttonStatus)) {
            User loggedIn = DatabaseQueries.getUser(ssnInput, usernameInput, passwordInput);
            this.parent.setLoggedInUser(loggedIn);
            if(loggedIn == null) {
                jErrorMessage.setText("Innskráning mistókst");
                return;
            } else {
                jErrorMessage.setText("");
                Bookings existingBookings = new Bookings(DatabaseQueries.getUserBookings(loggedIn.getSsn()));
                this.parent.setMyBookings(existingBookings);
            }
        }
        if ("Nýskráning".equals(buttonStatus)) {
            int err = DatabaseQueries.newUser(ssnInput, usernameInput, passwordInput); 
            if(err == -1) {
                jErrorMessage.setText("Þessi kennitala er nú þegar í notkun");
                return;
            } else {
                jErrorMessage.setText("");
                User newUser = new User(ssnInput, usernameInput, passwordInput);
                this.parent.setLoggedInUser(newUser);
            }  
            
        }
        goToPrevPanel();
    }//GEN-LAST:event_jRegisterActionPerformed

    private void jGoToPrevPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGoToPrevPanelActionPerformed
        goToPrevPanel();
    }//GEN-LAST:event_jGoToPrevPanelActionPerformed

    
    /**
     * 
     */
    private void goToPrevPanel() {

    switch (prevOn) {
        case "booking":
            this.parent.loadBookingsView(flight);
            break;
        case "info":
            this.parent.loadFlightInfoView(flight);
            break;
        case "myBookings":
            this.parent.loadMyBookingsView();
            break;
        default:
            this.parent.loadSearchView();
            break;
        }        
    }
    /**
     * Skoðar hvort nafn sé gilt.
     * @return 
     */
    private boolean validateName() {
        boolean validated = jUsernameTextField.getText().length() > 2;
        if(!validated) jUsernameTextField.setBackground(new Color(1, 0, 0, 0.2f));
        else jUsernameTextField.setBackground(new Color(255, 255, 255));
        return validated; 
    }
    
     /**
     * Skoðar hvort Password sé gilt.
     * @return 
     */
    private boolean validatePassword() {
        boolean validated = jPassword.getPassword().length > 5;
        if (!validated) jPassword.setBackground(new Color(1, 0, 0, 0.2f));
        else jPassword.setBackground(new Color(255, 255, 255));
        return validated;
    } 
    
    /**
     * Skoðar hvort SSN sé gilt.
     * @return 
     */
    private boolean validateSSN() {
        String regex = "[0-9]{6}-[0-9]{4}";
        boolean matches = jKennitalaTextField.getText().matches(regex);
        if(!matches) jKennitalaTextField.setBackground(new Color(1, 0, 0, 0.2f));
        else jKennitalaTextField.setBackground(new Color(255, 255, 255));
        return matches;
    }
    
    public String getButtonStatus(){
        return buttonStatus;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jErrorMessage;
    private javax.swing.JButton jGoToPrevPanel;
    private javax.swing.JTextField jKennitalaTextField;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jRegister;
    private javax.swing.JTextField jUsernameTextField;
    private javax.swing.JLabel kennitala;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
