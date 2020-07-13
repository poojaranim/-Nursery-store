package project;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static project.MainPage.total;


public class AdminPanel extends javax.swing.JFrame {

    boolean imageChooser = false;
    String path;
    
    public AdminPanel() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        checkStockButton = new javax.swing.JButton();
        billingButton = new javax.swing.JButton();
        cardAdminParentLayout = new javax.swing.JPanel();
        updatePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        mid = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mQty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mPhotoPath = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mCat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        mDescription = new javax.swing.JTextArea();
        selectedPhoto = new javax.swing.JLabel();
        photoSelection = new javax.swing.JButton();
        mPrice = new javax.swing.JTextField();
        LogInButton = new javax.swing.JButton();
        checkStockPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        checkStockTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        stockUpdateModel = new javax.swing.JTextField();
        stockStatusCat = new javax.swing.JComboBox<>();
        updateStockButton = new javax.swing.JButton();
        delEntry = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        delEntryModel = new javax.swing.JTextField();
        delUpdateCat = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        stockUpdateSetQty = new javax.swing.JTextField();
        billingPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        billingTable = new javax.swing.JTable();
        delEntry1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(1199, 699));
        jPanel3.setPreferredSize(new java.awt.Dimension(1199, 699));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 238, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 72));

        jLabel1.setBackground(new java.awt.Color(8, 232, 64));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrator Panel");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jPanel4.setBackground(new java.awt.Color(0, 255, 0));

        updateButton.setBackground(new java.awt.Color(0, 255, 0));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("New Entry");
        updateButton.setToolTipText("Enter new product");
        updateButton.setBorderPainted(false);
        updateButton.setContentAreaFilled(false);
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.setOpaque(true);
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateButtonMouseReleased(evt);
            }
        });
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        checkStockButton.setBackground(new java.awt.Color(0, 255, 0));
        checkStockButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkStockButton.setForeground(new java.awt.Color(255, 255, 255));
        checkStockButton.setText("Check Stock");
        checkStockButton.setToolTipText("Stock status");
        checkStockButton.setBorderPainted(false);
        checkStockButton.setContentAreaFilled(false);
        checkStockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkStockButton.setOpaque(true);
        checkStockButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkStockButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkStockButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkStockButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkStockButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                checkStockButtonMouseReleased(evt);
            }
        });
        checkStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkStockButtonActionPerformed(evt);
            }
        });

        billingButton.setBackground(new java.awt.Color(0, 255, 0));
        billingButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        billingButton.setForeground(new java.awt.Color(255, 255, 255));
        billingButton.setText("Invoice");
        billingButton.setToolTipText("Total billings ");
        billingButton.setBorderPainted(false);
        billingButton.setContentAreaFilled(false);
        billingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        billingButton.setOpaque(true);
        billingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billingButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                billingButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                billingButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                billingButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                billingButtonMouseReleased(evt);
            }
        });
        billingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(730, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(billingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 50));

        cardAdminParentLayout.setBackground(new java.awt.Color(255, 255, 255));
        cardAdminParentLayout.setLayout(new java.awt.CardLayout());

        updatePanel.setBackground(new java.awt.Color(255, 255, 255));
        updatePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Product Details");
        updatePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator1.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 1));
        updatePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 51, 200, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("ID:");
        updatePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 104, -1));

        mid.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mid.setForeground(new java.awt.Color(0, 77, 64));
        mid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        mid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midActionPerformed(evt);
            }
        });
        updatePanel.add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 362, -1));

        mname.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mname.setForeground(new java.awt.Color(0, 77, 64));
        mname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });
        updatePanel.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 362, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Product Name:");
        updatePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 104, -1));

        mQty.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mQty.setForeground(new java.awt.Color(0, 77, 64));
        mQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        mQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mQtyActionPerformed(evt);
            }
        });
        updatePanel.add(mQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 110, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Category:");
        updatePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 104, -1));

        mPhotoPath.setEditable(false);
        mPhotoPath.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mPhotoPath.setText("Choose photo:");
        mPhotoPath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        mPhotoPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPhotoPathActionPerformed(evt);
            }
        });
        updatePanel.add(mPhotoPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 210, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Price:");
        updatePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 104, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Quantity:");
        updatePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 104, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Product Description:");
        updatePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, -1));

        mCat.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plants", "Accessories", "Essentials" }));
        mCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCatActionPerformed(evt);
            }
        });
        updatePanel.add(mCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        mDescription.setColumns(20);
        mDescription.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mDescription.setLineWrap(true);
        mDescription.setRows(5);
        mDescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 77, 64), 1, true));
        jScrollPane1.setViewportView(mDescription);

        updatePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 370, 190));

        selectedPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 77, 64), 1, true));
        selectedPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        updatePanel.add(selectedPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 230, 210));

        photoSelection.setBackground(new java.awt.Color(0, 255, 51));
        photoSelection.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        photoSelection.setForeground(new java.awt.Color(255, 255, 255));
        photoSelection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Camera_20px.png"))); // NOI18N
        photoSelection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        photoSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoSelectionActionPerformed(evt);
            }
        });
        updatePanel.add(photoSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 50, 30));

        mPrice.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mPrice.setForeground(new java.awt.Color(0, 77, 64));
        mPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        mPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPriceActionPerformed(evt);
            }
        });
        updatePanel.add(mPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 180, -1));

        LogInButton.setBackground(new java.awt.Color(0, 255, 51));
        LogInButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setText("Update");
        LogInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        updatePanel.add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, 130, 50));

        cardAdminParentLayout.add(updatePanel, "card3");

        checkStockPanel.setBackground(new java.awt.Color(255, 255, 255));

        checkStockTable.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        checkStockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Product Name", "Stock", "Category"
            }
        ));
        checkStockTable.setEnabled(false);
        checkStockTable.setRowHeight(20);
        jScrollPane3.setViewportView(checkStockTable);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 0));
        jLabel10.setText("Enter id:");

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 0));
        jLabel11.setText("Add to Stock:");

        stockUpdateModel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        stockUpdateModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockUpdateModelActionPerformed(evt);
            }
        });

        stockStatusCat.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        stockStatusCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plants", "Accessories", "Essentials" }));
        stockStatusCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockStatusCatActionPerformed(evt);
            }
        });

        updateStockButton.setBackground(new java.awt.Color(0, 255, 0));
        updateStockButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        updateStockButton.setForeground(new java.awt.Color(255, 255, 255));
        updateStockButton.setText("Update Stock");
        updateStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStockButtonActionPerformed(evt);
            }
        });

        delEntry.setBackground(new java.awt.Color(255, 0, 0));
        delEntry.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        delEntry.setForeground(new java.awt.Color(255, 255, 255));
        delEntry.setText("Delete Entry");
        delEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delEntryActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Delete Entry:");

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Enter id:");

        delEntryModel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        delEntryModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delEntryModelActionPerformed(evt);
            }
        });

        delUpdateCat.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        delUpdateCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plants", "Accessories", "Essentials" }));
        delUpdateCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delUpdateCatActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 0));
        jLabel14.setText("Set Quantity:");

        stockUpdateSetQty.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        stockUpdateSetQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockUpdateSetQtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout checkStockPanelLayout = new javax.swing.GroupLayout(checkStockPanel);
        checkStockPanel.setLayout(checkStockPanelLayout);
        checkStockPanelLayout.setHorizontalGroup(
            checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkStockPanelLayout.createSequentialGroup()
                .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkStockPanelLayout.createSequentialGroup()
                        .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(checkStockPanelLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkStockPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(checkStockPanelLayout.createSequentialGroup()
                                .addComponent(stockUpdateModel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(270, 270, 270)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(delEntryModel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(delUpdateCat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(checkStockPanelLayout.createSequentialGroup()
                                .addComponent(stockUpdateSetQty, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(stockStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(checkStockPanelLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(updateStockButton)
                        .addGap(383, 383, 383)
                        .addComponent(delEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(checkStockPanelLayout.createSequentialGroup()
                .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(419, 419, 419)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        checkStockPanelLayout.setVerticalGroup(
            checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkStockPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockUpdateModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delEntryModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delUpdateCat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockUpdateSetQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateStockButton)
                    .addComponent(delEntry))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        cardAdminParentLayout.add(checkStockPanel, "card4");

        billingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice no", "Username", "Mobileno", "Address", "pincode"
            }
        ));
        jScrollPane2.setViewportView(billingTable);
        if (billingTable.getColumnModel().getColumnCount() > 0) {
            billingTable.getColumnModel().getColumn(0).setResizable(false);
            billingTable.getColumnModel().getColumn(2).setResizable(false);
        }

        delEntry1.setBackground(new java.awt.Color(255, 0, 0));
        delEntry1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        delEntry1.setForeground(new java.awt.Color(255, 255, 255));
        delEntry1.setText("Delete Log");
        delEntry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delEntry1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billingPanelLayout = new javax.swing.GroupLayout(billingPanel);
        billingPanel.setLayout(billingPanelLayout);
        billingPanelLayout.setHorizontalGroup(
            billingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingPanelLayout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(delEntry1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billingPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        billingPanelLayout.setVerticalGroup(
            billingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(delEntry1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        cardAdminParentLayout.add(billingPanel, "card2");

        jPanel3.add(cardAdminParentLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingButtonActionPerformed
        // TODO add your handling code here:
            cardAdminParentLayout.removeAll();
            cardAdminParentLayout.add(billingPanel);
            cardAdminParentLayout.repaint();
            cardAdminParentLayout.revalidate();
            
            DefaultTableModel model =  (DefaultTableModel) billingTable.getModel();
            model.setRowCount(0);
         
            Object[] data = new Object[5];
            ArrayList<bill> list = new ArrayList<>();
            list = billdb.billling();
        
        for(int i=0; i<list.size(); i++){
            data[0] = i+1;
            data[1] = list.get(i).getUsername();
            data[2] = list.get(i).getMobilno();
            data[3] = list.get(i).getAddress();
             data[4] = list.get(i).getPin();
            
            
            model.addRow(data);
            billingTable.setRowHeight(20);
        }
  
    }//GEN-LAST:event_billingButtonActionPerformed

    private void billingButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseReleased
        // TODO add your handling code here:
        billingButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_billingButtonMouseReleased

    private void billingButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMousePressed
        // TODO add your handling code here:
        billingButton.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_billingButtonMousePressed

    private void billingButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseExited
        // TODO add your handling code here:
        billingButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_billingButtonMouseExited

    private void billingButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseEntered
        // TODO add your handling code here:
        billingButton.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_billingButtonMouseEntered

    private void billingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseClicked

    }//GEN-LAST:event_billingButtonMouseClicked

    private void checkStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkStockButtonActionPerformed
            cardAdminParentLayout.removeAll();
            cardAdminParentLayout.add(checkStockPanel);
            cardAdminParentLayout.repaint();
            cardAdminParentLayout.revalidate();
            
            DefaultTableModel model =  (DefaultTableModel) checkStockTable.getModel();
            model.setRowCount(0);
         
            ArrayList<ProductList> list = PlantsDB.checkStock();
        
            Object data[] = new Object[4];
        
        for(int i=0; i<list.size(); i++){
            data[0] = list.get(i).getid();
            data[1] = list.get(i).getname();
            data[2] = list.get(i).getQty();
            data[3] = "Plants";
            
            model.addRow(data);
        }
        
        list.clear();
        
        list = AccessoriesDB.checkStock();
        
        for(int i=0; i<list.size(); i++){
            data[0] = list.get(i).getid();
            data[1] = list.get(i).getname();
            data[2] = list.get(i).getQty();
            data[3] = "Accessories";
            
            model.addRow(data);
        }
        
        list.clear();
        
        list = EssentialsDB.checkStock();
        
        for(int i=0; i<list.size(); i++){
            data[0] = list.get(i).getid();
            data[1] = list.get(i).getname();
            data[2] = list.get(i).getQty();
            data[3] = "Essential";
            
            model.addRow(data);
        }
            
            
    }//GEN-LAST:event_checkStockButtonActionPerformed

    private void checkStockButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkStockButtonMouseReleased
        // TODO add your handling code here:
        checkStockButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_checkStockButtonMouseReleased

    private void checkStockButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkStockButtonMousePressed
        // TODO add your handling code here:
        checkStockButton.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_checkStockButtonMousePressed

    private void checkStockButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkStockButtonMouseExited
        // TODO add your handling code here:
        checkStockButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_checkStockButtonMouseExited

    private void checkStockButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkStockButtonMouseEntered
        // TODO add your handling code here:
        checkStockButton.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_checkStockButtonMouseEntered

    private void checkStockButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkStockButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_checkStockButtonMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
            cardAdminParentLayout.removeAll();
            cardAdminParentLayout.add(updatePanel);
            cardAdminParentLayout.repaint();
            cardAdminParentLayout.revalidate();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void updateButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseReleased
        // TODO add your handling code here:
        updateButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_updateButtonMouseReleased

    private void updateButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMousePressed
        // TODO add your handling code here:
        updateButton.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_updateButtonMousePressed

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
        // TODO add your handling code here:
        updateButton.setBackground(new Color(0, 150, 136));
    }//GEN-LAST:event_updateButtonMouseExited

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        // TODO add your handling code here:;
        updateButton.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void midActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midActionPerformed

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameActionPerformed

    private void mQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mQtyActionPerformed

    private void mPhotoPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPhotoPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPhotoPathActionPerformed

    private void photoSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoSelectionActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File selectedImage = fc.getSelectedFile();
        path = selectedImage.getName();
        
        try {
            Image img = ImageIO.read(selectedImage);
            mPhotoPath.setText(path);
            selectedPhoto.setIcon(new ImageIcon(img.getScaledInstance(selectedPhoto.getWidth(),
                    selectedPhoto.getHeight(), Image.SCALE_SMOOTH)));
        } catch (IOException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_photoSelectionActionPerformed

    private void mPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPriceActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here:
        try{
            if(mCat.getSelectedItem().equals("Accessories")){
            if(!path.equals(""))
                AccessoriesDB.insertIntoAccessoriesDB(mid.getText(), mname.getText(), Integer.parseInt(mPrice.getText()), 
                        Integer.parseInt(mQty.getText()), mDescription.getText(), path);
        }
        
        else if(mCat.getSelectedItem().equals("Plants")){
            if(!path.equals(""))
                PlantsDB.insertIntoPlantsDB(mid.getText(), mname.getText(), Integer.parseInt(mPrice.getText()), 
                        Integer.parseInt(mQty.getText()), mDescription.getText(), path);
        }
        else if(mCat.getSelectedItem().equals("Essentials")){
            if(!path.equals(""))
                EssentialsDB.insertIntoEssentialsDB(mid.getText(), mname.getText(), Integer.parseInt(mPrice.getText()), 
                        Integer.parseInt(mQty.getText()), mDescription.getText(), path);
        }
        
        mid.setText("");
        mname.setText("");
        mQty.setText("");
        mPrice.setText("");
        mDescription.setText("");
        mPhotoPath.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            mid.setText("");
            mname.setText("");
            mQty.setText("");
            mPrice.setText("");
            mDescription.setText("");
            mPhotoPath.setText("");
        }


    }//GEN-LAST:event_LogInButtonActionPerformed

    private void stockUpdateModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockUpdateModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockUpdateModelActionPerformed

    private void delEntryModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delEntryModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delEntryModelActionPerformed

    private void updateStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStockButtonActionPerformed
        // TODO add your handling code here:
       try{
            String model = stockUpdateModel.getText();
            int qty = Integer.parseInt(stockUpdateSetQty.getText());

            if(stockStatusCat.getSelectedItem().equals("Plants")){
                PlantsDB.flag = true;
                PlantsDB.updatePlantsDB(model, qty);
            }

            else if(stockStatusCat.getSelectedItem().equals("Accessories")){
                AccessoriesDB.flag = true;
                AccessoriesDB.updateAccessoriesDB(model, qty);
            }

            else if(stockStatusCat.getSelectedItem().equals("Essentials")){
                EssentialsDB.flag = true;
                EssentialsDB.updateEssentialsDB(model, qty);
            }
            
            stockUpdateModel.setText("");
            stockUpdateSetQty.setText("");
        
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
        
   
    }//GEN-LAST:event_updateStockButtonActionPerformed

    private void stockUpdateSetQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockUpdateSetQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockUpdateSetQtyActionPerformed

    private void delEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delEntryActionPerformed
        // TODO add your handling code here:
        try{
            String del = delEntryModel.getText();
        
        if(delUpdateCat.getSelectedItem().equals("Plants")){
            PlantsDB.delete(del);
        }
        else if(delUpdateCat.getSelectedItem().equals("Accessories")){
            AccessoriesDB.delete(del);
        }
        else if(delUpdateCat.getSelectedItem().equals("Essentials")){
            EssentialsDB.delete(del);
        }
        delEntryModel.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_delEntryActionPerformed

    private void delEntry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delEntry1ActionPerformed
        // TODO add your handling code here:
        deliveryDB.deletebilling();
    }//GEN-LAST:event_delEntry1ActionPerformed

    private void mCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mCatActionPerformed

    private void stockStatusCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockStatusCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockStatusCatActionPerformed

    private void delUpdateCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delUpdateCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delUpdateCatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogInButton;
    private javax.swing.JButton billingButton;
    private javax.swing.JPanel billingPanel;
    private javax.swing.JTable billingTable;
    private javax.swing.JPanel cardAdminParentLayout;
    private javax.swing.JButton checkStockButton;
    private javax.swing.JPanel checkStockPanel;
    private javax.swing.JTable checkStockTable;
    private javax.swing.JButton delEntry;
    private javax.swing.JButton delEntry1;
    private javax.swing.JTextField delEntryModel;
    private javax.swing.JComboBox<String> delUpdateCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> mCat;
    private javax.swing.JTextArea mDescription;
    private javax.swing.JTextField mPhotoPath;
    private javax.swing.JTextField mPrice;
    private javax.swing.JTextField mQty;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField mname;
    private javax.swing.JButton photoSelection;
    private javax.swing.JLabel selectedPhoto;
    private javax.swing.JComboBox<String> stockStatusCat;
    private javax.swing.JTextField stockUpdateModel;
    private javax.swing.JTextField stockUpdateSetQty;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JButton updateStockButton;
    // End of variables declaration//GEN-END:variables
}
