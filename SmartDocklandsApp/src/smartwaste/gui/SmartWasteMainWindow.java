package smartwaste.gui;

import javax.swing.JOptionPane;
import smartwaste.adt.*;
import smartwaste.model.*;

/**
 * SmartWasteMainWindow - Main GUI window for the Smart Waste Bin Collection
 * System
 */
public class SmartWasteMainWindow extends javax.swing.JFrame {

    // =========================================================
    // CLASS-LEVEL ADT DECLARATIONS
    // These are the 3 ADTs used throughout the application
    // =========================================================
    private SinglyLinkedList<SmartWaste> route = new SinglyLinkedList<>();
    private Queue<SmartWaste> collectionQueue = new Queue<>();
    private Stack<String> maintenanceStack = new Stack<>();

    private int currentBinIndex = 0; // for tracking which bin are being viewed in maintenance tab

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SmartWasteMainWindow.class.getName());

    public SmartWasteMainWindow() {
        initComponents();

        // refresh and display first bin record in maintenance tab when clicked
        jTabbedPane2.addChangeListener(e -> {
            if (jTabbedPane2.getSelectedIndex() == 2) {
                showCurrentBin();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBinID = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtFillLevel = new javax.swing.JTextField();
        comboType = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBins = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblCollectionQueue = new javax.swing.JLabel();
        btnEnqueue = new javax.swing.JButton();
        btnDequeue = new javax.swing.JButton();
        btnPeek = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblQueueBins = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQueueOutput = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblCurrentBin = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMaintenanceNote = new javax.swing.JTextField();
        btnStackPush = new javax.swing.JButton();
        btnStackPop = new javax.swing.JButton();
        btnStackPeek = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtStackOutput = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btnGenerateReport = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtReport = new javax.swing.JTextArea();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bin ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Location:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Type:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Fill Level (%):");

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Recycling", " " }));

        btnAdd.setBackground(new java.awt.Color(0, 153, 51));
        btnAdd.setText("Add Bin");
        btnAdd.addActionListener(this::btnAddActionPerformed);

        btnUpdate.setBackground(new java.awt.Color(204, 204, 0));
        btnUpdate.setText("Update Bin");
        btnUpdate.addActionListener(this::btnUpdateActionPerformed);

        btnDelete.setBackground(new java.awt.Color(255, 51, 0));
        btnDelete.setText("Delete Bin");
        btnDelete.addActionListener(this::btnDeleteActionPerformed);

        tblBins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBins);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(446, 446, 446))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtFillLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBinID, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                                            .addComponent(txtLocation)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBinID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtFillLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Bins", jPanel2);

        lblCollectionQueue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCollectionQueue.setText("Collection Queue");

        btnEnqueue.setText("Enqueue Bin");
        btnEnqueue.addActionListener(this::btnEnqueueActionPerformed);

        btnDequeue.setText("Dequeue Bin");
        btnDequeue.addActionListener(this::btnDequeueActionPerformed);

        btnPeek.setText("Peek Next");
        btnPeek.addActionListener(this::btnPeekActionPerformed);

        tblQueueBins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblQueueBins);

        txtQueueOutput.setColumns(20);
        txtQueueOutput.setRows(5);
        jScrollPane2.setViewportView(txtQueueOutput);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                    .addComponent(lblCollectionQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEnqueue, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDequeue, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblCollectionQueue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnqueue)
                    .addComponent(btnDequeue)
                    .addComponent(btnPeek))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Collection Queue", jPanel3);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Current Bin:");

        lblCurrentBin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCurrentBin.setText("No bins available");

        btnPrevious.setText("Previous Bin");
        btnPrevious.addActionListener(this::btnPreviousActionPerformed);

        btnNext.setText("Next Bin");
        btnNext.addActionListener(this::btnNextActionPerformed);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Maintenance Note: ");

        txtMaintenanceNote.addActionListener(this::txtMaintenanceNoteActionPerformed);

        btnStackPush.setText("Add Note");
        btnStackPush.addActionListener(this::btnStackPushActionPerformed);

        btnStackPop.setText("Remove Note");
        btnStackPop.addActionListener(this::btnStackPopActionPerformed);

        btnStackPeek.setText("View Latest");
        btnStackPeek.addActionListener(this::btnStackPeekActionPerformed);

        btnViewAll.setText("View All Records");
        btnViewAll.addActionListener(this::btnViewAllActionPerformed);

        txtStackOutput.setColumns(20);
        txtStackOutput.setRows(5);
        jScrollPane4.setViewportView(txtStackOutput);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnStackPush, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStackPop, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStackPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewAll))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentBin, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtMaintenanceNote))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCurrentBin)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaintenanceNote, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStackPush)
                    .addComponent(btnStackPop)
                    .addComponent(btnStackPeek)
                    .addComponent(btnViewAll))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Maintenance", jPanel4);

        btnGenerateReport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerateReport.setText("Generate Report");
        btnGenerateReport.addActionListener(this::btnGenerateReportActionPerformed);

        txtReport.setColumns(20);
        txtReport.setRows(5);
        jScrollPane5.setViewportView(txtReport);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnGenerateReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Reports", jPanel5);

        label1.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(248, 249, 250));
        label1.setText("Smart Waste - Bin Collection Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // =========================================================
    // BINS TAB - CRUD operations on SinglyLinkedList
    // =========================================================
    /**
     * Add Bin button - validate input, creates a SmartWaste object and storeing
     * it into the SinglyLinkedList
     */

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String id = txtBinID.getText();
        String location = txtLocation.getText();

        // validate input before parsing
        if (id.isEmpty() || location.isEmpty() || txtFillLevel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields");
            return;
        }

        // Check for duplicate Bin ID or duplicate Location
        for (int i = 0; i < route.size(); i++) {
            SmartWaste existing = route.get(i);

            if (existing.getBinID().equalsIgnoreCase(id)) {
                JOptionPane.showMessageDialog(this,
                        "Bin ID '" + id + "' already exists. Please use a unique ID.");
                return;
            }
        }

        try {
            int fill = Integer.parseInt(txtFillLevel.getText());
            if (fill < 0 || fill > 100) {
                JOptionPane.showMessageDialog(this, "Fill Level must be between 0 and 100");
                return;
            }
            String type = comboType.getSelectedItem().toString();
            SmartWaste bin;

            // Polymorphism - creating here either GeneralWasteBin or RecyclingBin
            if (type.equals("General")) {
                bin = new GeneralWasteBin(id, location, fill, "Active", "Mixed");
            } else {
                bin = new RecyclingBin(id, location, fill, "Active", "Paper & Plastic");
            }
            route.add(bin); // for storing object into the SinglyLinkedList
            refreshTable(); //update both bin tables on Bin and Queue tabs
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Fill Level must be a number");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * Delete Bin button - removes selected bin from the SinglyLinkedList
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int row = tblBins.getSelectedRow();
        if (row >= 0) {
            route.remove(row);
            refreshTable();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a bin to delete");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * Update Bin button - removes selected bin and add again with new values
     */
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        int row = tblBins.getSelectedRow();
        if (row >= 0) {
            route.remove(row);
            btnAddActionPerformed(evt); // reusing add btn logic
            refreshTable();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a bin to update");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    // =========================================================
    // COLLECTION QUEUE TAB - CRUD operations on Queue
    // =========================================================
    /**
     * Enqueue button - adding selected bin from the table into the Queue
     */

    private void btnEnqueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnqueueActionPerformed

        int row = tblQueueBins.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Please select a bin from the table above");
            return;
        }

        SmartWaste selectedBin = route.get(row);

        // Check if this bin is already in the queue
        Queue<SmartWaste> temp = new Queue<>();
        boolean alreadyInQueue = false;

        while (!collectionQueue.isEmpty()) {
            SmartWaste bin = collectionQueue.dequeue();
            if (bin.getBinID().equalsIgnoreCase(selectedBin.getBinID())) {
                alreadyInQueue = true;
            }
            temp.enqueue(bin);
        }

        // Restore the real queue
        while (!temp.isEmpty()) {
            collectionQueue.enqueue(temp.dequeue());
        }

        if (alreadyInQueue) {
            JOptionPane.showMessageDialog(this,
                    "Bin '" + selectedBin.getBinID() + "' is already in the queue.");
            return;
        }

        collectionQueue.enqueue(selectedBin);
        refreshQueueDisplay();
    }//GEN-LAST:event_btnEnqueueActionPerformed

    /**
     * Dequeue button - removing and processing the first bin in the Queue
     * (FIFO)
     */

    private void btnDequeueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDequeueActionPerformed

        // Check if queue has anything in it first item
        if (collectionQueue.isEmpty()) {
            txtQueueOutput.setText("Queue is empty - no bins to process");
            return;
        }

        // Remove and return the first bin in the queue (FIFO)
        SmartWaste bin = collectionQueue.dequeue();

        // Show what was processed so far
        txtQueueOutput.setText("Processed and removed from queue:\n"
                + bin.toString()
                + "\n\n  Remaining Queue  \n");

        //Show what is left in the queue
        refreshQueueDisplay();
    }//GEN-LAST:event_btnDequeueActionPerformed

    /**
     * Peek button - shows the next bin in the Queue without removing it
     */

    private void btnPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekActionPerformed
        // Check if queue has anything in it first tiem
        if (collectionQueue.isEmpty()) {
            txtQueueOutput.setText("Queue is empty - nothing to peek");
            return;
        }

        // Look at the next bin
        SmartWaste bin = collectionQueue.peek();

        txtQueueOutput.setText("Next bin to be collected:\n"
                + bin.toString()
                + "\n\nQueue size: " + collectionQueue.size() + " items pending");
    }//GEN-LAST:event_btnPeekActionPerformed

    // =========================================================
    // MAINTENANCE TAB - Stack operations
    // =========================================================
    /**
     * Showing the currently selected bin in the maintenance tab
     */
    private void showCurrentBin() {
        if (route.isEmpty()) {
            lblCurrentBin.setText("No bins available - add bins first");
            return;
        }

        if (currentBinIndex >= route.size()) {
            currentBinIndex = 0;
        }
        if (currentBinIndex < 0) {
            currentBinIndex = route.size() - 1;
        }

        SmartWaste bin = route.get(currentBinIndex);
        lblCurrentBin.setText(bin.toString()
                + "  [" + (currentBinIndex + 1) + " of " + route.size() + "]");
    }

    /**
     * Previous Bin button - going back to previous bin in the singly linked
     * list
     */

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        currentBinIndex--;
        if (currentBinIndex < 0) {
            currentBinIndex = route.size() - 1;
        }
        showCurrentBin();
        txtMaintenanceNote.setText(""); // cleari note field when switching bin
        txtStackOutput.setText("");
    }//GEN-LAST:event_btnPreviousActionPerformed

    /**
     * Next Bin button - going to the next bin in the singly linked list
     */

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        currentBinIndex++;
        if (currentBinIndex >= route.size()) {
            currentBinIndex = 0;
        }
        showCurrentBin();
        txtMaintenanceNote.setText("");
        txtStackOutput.setText("");
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtMaintenanceNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaintenanceNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaintenanceNoteActionPerformed

    /**
     * Push (Add Note btn) - creating a maintenance record and pushing it to the
     * Stack
     */

    private void btnStackPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStackPushActionPerformed
        if (route.isEmpty()) {
            txtStackOutput.setText("No bins available - add bins first");
            return;
        }

        String note = txtMaintenanceNote.getText().trim();
        if (note.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please enter a maintenance note first");
            return;
        }

        // Get current bin details and combine with note
        SmartWaste bin = route.get(currentBinIndex);
        String record = bin.getBinID() + " - " + note + " ["
                + java.time.LocalDate.now() + "]";

        maintenanceStack.push(record);
        txtMaintenanceNote.setText(""); // clear the field after saving
        txtStackOutput.setText("Record saved:\n" + record
                + "\n\nTotal records: " + maintenanceStack.size());
    }//GEN-LAST:event_btnStackPushActionPerformed

    /**
     * Pop (Remove Note btn) - Removing and showing most recent record form
     * stack
     */

    private void btnStackPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStackPopActionPerformed
        if (maintenanceStack.isEmpty()) {
            txtStackOutput.setText("No maintenance records yet");
            return;
        }
        String record = maintenanceStack.pop();
        txtStackOutput.setText("Removed latest record:\n" + record
                + "\n\nRecords remaining: " + maintenanceStack.size());
    }//GEN-LAST:event_btnStackPopActionPerformed

    /**
     * Peek (View Latest) btn - showing most recent record
     */

    private void btnStackPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStackPeekActionPerformed
        if (maintenanceStack.isEmpty()) {
            txtStackOutput.setText("No maintenance records yet");
            return;
        }
        String record = maintenanceStack.peek();
        txtStackOutput.setText("Latest record:\n" + record
                + "\n\nTotal records: " + maintenanceStack.size());
    }//GEN-LAST:event_btnStackPeekActionPerformed

    /**
     * View All Records btn - displaying every item in the Stack - top to bottom
     */

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        if (maintenanceStack.isEmpty()) {
            txtStackOutput.setText("No maintenance records yet");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("All Maintenance Records:\n");
        sb.append("─────────────────────────────\n");

        Stack<String> temp = new Stack<>();
        int count = 1;

        while (!maintenanceStack.isEmpty()) {
            String record = maintenanceStack.pop();
            sb.append(count++).append(". ").append(record).append("\n");
            temp.push(record);
        }

        // Restore the real stack
        while (!temp.isEmpty()) {
            maintenanceStack.push(temp.pop());
        }

        sb.append("─────────────────────────────\n");
        sb.append("Total records: ").append(maintenanceStack.size());

        txtStackOutput.setText(sb.toString());
    }//GEN-LAST:event_btnViewAllActionPerformed

    // =========================================================
    // Report tab
    // =========================================================
    /**
     * Generate Report button - builds a full summary of all 3 ADTs
     */

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed
        StringBuilder report = new StringBuilder();
        report.append("==========================================\n");
        report.append("       SmartWaste System Report\n");
        report.append("       Generated: ").append(java.time.LocalDate.now()).append("\n");
        report.append("==========================================\n\n");
        report.append("--- Registered Bins in Docklands Area: ")
                .append(route.size()).append(" ---\n");
        if (route.isEmpty()) {
            report.append("No bins registered yet.\n");
        } else {
            for (int i = 0; i < route.size(); i++) {
                report.append(i + 1).append(". ")
                        .append(route.get(i).toString()).append("\n");
            }
        }

        report.append("\n--- Collection Queue: --- ")
                .append(collectionQueue.size()).append(" ---\n");
        if (collectionQueue.isEmpty()) {
            report.append("No bins currently in the queue.\n");
        } else {
            Queue<SmartWaste> temp = new Queue<>();
            int position = 1;

            while (!collectionQueue.isEmpty()) {
                SmartWaste bin = collectionQueue.dequeue();
                report.append(position++).append(". ").append(bin.toString()).append("\n");
                temp.enqueue(bin);
            }
            while (!temp.isEmpty()) {
                collectionQueue.enqueue(temp.dequeue());
            }
        }
        report.append("\n--- Maintenance Records - Total: ")
                .append(maintenanceStack.size()).append(" ---\n");

        if (maintenanceStack.isEmpty()) {
            report.append("No maintenance records yet.\n");
        } else {
            Stack<String> temp = new Stack<>();
            int count = 1;

            while (!maintenanceStack.isEmpty()) {
                String record = maintenanceStack.pop();
                report.append(count++).append(". ").append(record).append("\n");
                temp.push(record);
            }
            while (!temp.isEmpty()) {
                maintenanceStack.push(temp.pop());
            }
        }

        //Footer
        report.append("\n==========================================\n");
        report.append("       End of Report\n");
        report.append("==========================================\n");

        txtReport.setText(report.toString());
    }//GEN-LAST:event_btnGenerateReportActionPerformed

    // =========================================================
    // REFRESH METHODS
    // =========================================================
    /**
     * Refreshes the Queue text area to show all current items in the Queue
     */
    private void refreshQueueDisplay() {
        // If queue is empty print message
        if (collectionQueue.isEmpty()) {
            txtQueueOutput.setText("Queue is empty");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Current Queue (").append(collectionQueue.size()).append(" items):\n\n");

        // Temp queue to read all items without modifying real queue
        Queue<SmartWaste> temp = new Queue<>();
        int i = 1;

        while (!collectionQueue.isEmpty()) {
            SmartWaste bin = collectionQueue.dequeue();
            sb.append(i++).append(". ").append(bin.toString()).append("\n");
            temp.enqueue(bin);
        }

        // Put everything back into the real queue
        while (!temp.isEmpty()) {
            collectionQueue.enqueue(temp.dequeue());
        }

        txtQueueOutput.setText(sb.toString());
    }

    /**
     * Refreshing both bin tables (Bins tab and Queue tab)
     */
    private void refreshTable() {

        String[] columns = {"Bin ID", "Location", "Fill Level", "Type", "Priority"};
        String[][] data = new String[route.size()][5];
        for (int i = 0; i < route.size(); i++) {
            SmartWaste b = route.get(i);
            data[i][0] = b.getBinID();
            data[i][1] = b.getLocation();
            data[i][2] = b.getFillLevel() + " %";
            data[i][3] = b.getClass().getSimpleName()
                    .replace("GeneralWasteBin", "General Waste")
                    .replace("RecyclingBin", "Recycling");
            data[i][4] = String.valueOf(b.getCollectionPriority());
        }

        // refresh both Bin tables in Bins tab and Collection tab
        tblBins.setModel(
                new javax.swing.table.DefaultTableModel(data, columns));
        tblQueueBins.setModel(
                new javax.swing.table.DefaultTableModel(data, columns));

    }

    // =========================================================
    // APPLICATION ENTRY POINT
    // =========================================================
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SmartWasteMainWindow().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDequeue;
    private javax.swing.JButton btnEnqueue;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPeek;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnStackPeek;
    private javax.swing.JButton btnStackPop;
    private javax.swing.JButton btnStackPush;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private java.awt.Label label1;
    private javax.swing.JLabel lblCollectionQueue;
    private javax.swing.JLabel lblCurrentBin;
    private javax.swing.JTable tblBins;
    private javax.swing.JTable tblQueueBins;
    private javax.swing.JTextField txtBinID;
    private javax.swing.JTextField txtFillLevel;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMaintenanceNote;
    private javax.swing.JTextArea txtQueueOutput;
    private javax.swing.JTextArea txtReport;
    private javax.swing.JTextArea txtStackOutput;
    // End of variables declaration//GEN-END:variables
}
