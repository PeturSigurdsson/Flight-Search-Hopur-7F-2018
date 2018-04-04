/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import containers.Flights;
import datastructures.Flight;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import utils.Utilities;

/**
 *
 * @author greta
 */
class SearchView extends javax.swing.JPanel {
    private final Main parent;                      //Parent holding all views.
    private JTable currentTable;                //Current table holding searched flights
    private Flights currentFlights;             //Current list of flights in table
    private boolean flightsDateOrderAsc = true; //Current date order of flights.
    private final SimpleDateFormat df;                //Object to format and read dates.
    private int selectedRow = -1;               //Currently selected row in table
    
    /**
     * Creates new form SearchView
     */
    SearchView(Main main) {
        initComponents();
        this.parent = main;
        currentTable = null;
        df = new SimpleDateFormat("dd/MM/yyyy");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jOriginTextField = new javax.swing.JTextField();
        jDestinationTextField = new javax.swing.JTextField();
        jOriginLabel = new javax.swing.JLabel();
        jDestinationLabel = new javax.swing.JLabel();
        jSubmitSearch = new javax.swing.JButton();
        jDateField2 = new javax.swing.JFormattedTextField();
        jDateField1 = new javax.swing.JFormattedTextField();
        jTableContainerScroll = new javax.swing.JScrollPane();
        jTableContainer = new javax.swing.JPanel();
        jDateLabel1 = new javax.swing.JLabel();
        jDateLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setBackground(new java.awt.Color(255, 255, 255));

        jOriginLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jOriginLabel.setText("Brottfararstaður:");

        jDestinationLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jDestinationLabel.setText("Áfangastaður:");

        jSubmitSearch.setBackground(new java.awt.Color(204, 204, 255));
        jSubmitSearch.setFont(new java.awt.Font("Courier New", 1, 11)); // NOI18N
        jSubmitSearch.setText("Leita");
        jSubmitSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search(evt);
            }
        });

        jDateField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jDateField2.setText("31/12/2018");
        jDateField2.setToolTipText("dd/MM/yyyy");

        jDateField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jDateField1.setText("01/01/2018");
        jDateField1.setToolTipText("dd/MM/yyyy");

        jTableContainerScroll.setBackground(new java.awt.Color(255, 255, 255));
        jTableContainerScroll.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableContainerScroll.setMaximumSize(new java.awt.Dimension(780, 400));
        jTableContainerScroll.setMinimumSize(new java.awt.Dimension(780, 400));

        jTableContainer.setBackground(new java.awt.Color(255, 255, 255));
        jTableContainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableContainer.setAutoscrolls(true);
        jTableContainer.setLayout(new java.awt.BorderLayout());
        jTableContainerScroll.setViewportView(jTableContainer);

        jDateLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jDateLabel1.setText("Frá:");

        jDateLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jDateLabel2.setText("Til:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jOriginLabel)
                            .addComponent(jDestinationLabel)
                            .addComponent(jDateLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jOriginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDateField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jDestinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jSubmitSearch)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTableContainerScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOriginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOriginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDestinationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDestinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSubmitSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTableContainerScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Event handler for when a flight is searched.
     * @param evt 
     */
    private void search(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search
        try {
            if (!validateDate()) return;
            
            String origin = jOriginTextField.getText();
            String destination = jDestinationTextField.getText();
            Date d1 = df.parse(jDateField1.getText());
            Date d2 = df.parse(jDateField2.getText());
              
            Flights search = Flights.getFlightsToFromBetweenDates(origin, destination, d1, d2);
            if (search != null) {
                currentFlights = search;
                flightsDateOrderAsc = true;
                renderTable();
            }
        } catch (ParseException ex) {
            Logger.getLogger(SearchView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search

    /**
     * Checks if date input matches the right format
     * @return 
     */
    private boolean validateDate() {
        boolean isOk = true;
        String dateFormat = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        if (!jDateField1.getText().matches(dateFormat)) {
            jDateField1.setBackground(new Color(1f, 0.f, 0.f, 0.2f));
            isOk = false;
        } else {
            jDateField1.setBackground(new Color(255, 255, 255));
        }
        
        if (!jDateField2.getText().matches(dateFormat)) {
            jDateField2.setBackground(new Color(1f, 0.f, 0.f, 0.2f));
            isOk = false;
        } else {
            jDateField2.setBackground(new Color(255, 255, 255));
        }
        
        return isOk;
    }
    
   
    /**
     * Loads flight view after selecting a flight in table.
     * @param flight 
     */
    private void goToFlightInfoView(Flight flight) {
        this.parent.loadFlightInfoView(flight);
    }
    
    /**
     * Renders table of flights onto jTableContainer
     */
    private void renderTable() {
        if (currentTable != null) {
            jTableContainer.remove(currentTable.getTableHeader());
            jTableContainer.remove(currentTable);
        }
        
        currentTable = Utilities.tableFromFlights(currentFlights);
        jTableContainer.add(currentTable.getTableHeader(), BorderLayout.NORTH);
        jTableContainer.add(currentTable, BorderLayout.CENTER);
        setHeaderEvents();
        setTableEvents();
        selectedRow = -1;
        this.revalidate();
    }
    
    /**
     * Attaches the sorting events to the table headers.
     */
    private void setHeaderEvents() {
        currentTable.getTableHeader().addMouseListener(new MouseAdapter() {
            /**
             * If a flights is selected twice in a row, calls to load
             * a new FlightInfoView holding the information about the
             * chosen flight.
             * @param e 
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                int col = currentTable.columnAtPoint(e.getPoint());
                switch(col) {
                    case 0:
                    case 1:
                        flightsDateOrderAsc = !flightsDateOrderAsc;
                        currentFlights.sortFlightsByDate(flightsDateOrderAsc);
                        break;
                    case 4:
                        currentFlights.sortByPrice();
                        renderTable();
                        break;
                }
            }
            
        });
    }
    
    /**
     * Attaches event handlers to JTable holding the list of flights
     * that was last searched.
     */
    private void setTableEvents() {
        currentTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickedRow = currentTable.getSelectedRow();
                if(selectedRow == clickedRow) {
                    if (clickedRow == -1) return;
                    goToFlightInfoView(currentFlights.getFlights().get(clickedRow));
                } else {
                    selectedRow = clickedRow;
                }
                super.mouseClicked(e);
                
            }
            
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jDateField1;
    private javax.swing.JFormattedTextField jDateField2;
    private javax.swing.JLabel jDateLabel1;
    private javax.swing.JLabel jDateLabel2;
    private javax.swing.JLabel jDestinationLabel;
    private javax.swing.JTextField jDestinationTextField;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel jOriginLabel;
    private javax.swing.JTextField jOriginTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSubmitSearch;
    private javax.swing.JPanel jTableContainer;
    private javax.swing.JScrollPane jTableContainerScroll;
    // End of variables declaration//GEN-END:variables
}
