/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouseui;

import manager.modifyInventory;

/**
 *
 * @author Xianming
 */
public class InventoryModifyPopup extends javax.swing.JPanel {

    /**
     * Creates new form InventoryModifyPopup
     */
    public InventoryModifyPopup() {
        newModify = new modifyInventory();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTextfield = new javax.swing.JTextField();
        quantityTextfield = new javax.swing.JTextField();
        priceTextfield = new javax.swing.JTextField();
        categoryTextfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numberTextfield = new javax.swing.JTextField();
        descriptionTextfield = new javax.swing.JTextField();
        locationTextfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

  //      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Quantity");

        jLabel3.setText("Price");

        jLabel4.setText("Category");

        jLabel5.setText("Product Number");

        jLabel6.setText("Description");

        jLabel7.setText("Location");

        jButton1.setText("Search");

        jButton2.setText("Confirm");

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search(evt);
            }
        });   
        
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm(evt);
            }
        });
        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(jLabel4)
                    .add(layout.createSequentialGroup()
                        .add(jButton1)
                        .add(18, 18, 18)
                        .add(jButton2))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel1))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(categoryTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(priceTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jLabel7))
                                    .add(layout.createSequentialGroup()
                                        .add(nameTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jLabel5))
                                    .add(layout.createSequentialGroup()
                                        .add(quantityTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jLabel6)))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(numberTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(descriptionTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(locationTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(nameTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5)
                    .add(numberTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(quantityTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6)
                    .add(descriptionTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(priceTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7)
                    .add(locationTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(categoryTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 33, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2))
                .addContainerGap())
        );
        
        


    }// </editor-fold>                        

    private void search(java.awt.event.ActionEvent evt){
        
        if(nameTextfield.getText().compareTo("")!=0){
            int ProductNumber = newModify.getProductNumber(nameTextfield.getText());
             quantityTextfield.setText(String.valueOf(newModify.getProductQuantity(ProductNumber)));
             priceTextfield.setText(String.valueOf(newModify.getProductPrice(ProductNumber)));
             categoryTextfield.setText(String.valueOf(newModify.getProductCategory(ProductNumber)));
             numberTextfield.setText(String.valueOf(ProductNumber));
             descriptionTextfield.setText(newModify.getProductDescription(ProductNumber));
             locationTextfield.setText(String.valueOf(newModify.getLocation(ProductNumber)));
        }
        else if(numberTextfield.getText().compareTo("")!=0){           
             int ProductNumber = Integer.parseInt(numberTextfield.getText());
             nameTextfield.setText(newModify.getProductName(ProductNumber));
             quantityTextfield.setText(String.valueOf(newModify.getProductQuantity(ProductNumber)));
             priceTextfield.setText(String.valueOf(newModify.getProductPrice(ProductNumber)));
             categoryTextfield.setText(String.valueOf(newModify.getProductCategory(ProductNumber)));
             numberTextfield.setText(String.valueOf(ProductNumber));
             descriptionTextfield.setText(newModify.getProductDescription(ProductNumber));
             locationTextfield.setText(String.valueOf(newModify.getLocation(ProductNumber)));
        }

//        nameTextfield.setText("1");
//        quantityTextfield.setText("2");
//        priceTextfield.setText("3");
//        categoryTextfield.setText("4");
//        numberTextfield.setText("5");
//        descriptionTextfield.setText("6");
//        locationTextfield.setText("7");
    }
    
    
    private void confirm(java.awt.event.ActionEvent evt){
        newModify.setProductName(nameTextfield.getText(), Integer.parseInt(numberTextfield.getText()));
        newModify.setProductQuantity(Integer.parseInt(quantityTextfield.getText()), Integer.parseInt(numberTextfield.getText()));
        newModify.setProductPrice(Integer.parseInt(priceTextfield.getText()), Integer.parseInt(numberTextfield.getText()));
        newModify.setCategory(Integer.parseInt(categoryTextfield.getText()), Integer.parseInt(numberTextfield.getText()));
        newModify.setProductDescription(descriptionTextfield.getText(), Integer.parseInt(numberTextfield.getText()));
        newModify.setLocation(Integer.parseInt(locationTextfield.getText()), Integer.parseInt(numberTextfield.getText()));
    }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InventoryModifyPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryModifyPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryModifyPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryModifyPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryModifyPopup().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameTextfield;
    private javax.swing.JTextField quantityTextfield;
    private javax.swing.JTextField priceTextfield;
    private javax.swing.JTextField categoryTextfield;
    private javax.swing.JTextField numberTextfield;
    private javax.swing.JTextField descriptionTextfield;
    private javax.swing.JTextField locationTextfield;
    private modifyInventory newModify;
    // End of variables declaration                   
}