package warehouseui;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import manager.manageProduct;
import receiver.receiveOrder;

/**
 *
 * @author Xianming
 */
public class ReceiverUI extends javax.swing.JPanel {

    private JLabel lacationLabel;
    private JTextField locationTextField;

    /**
     * Creates new form ReceiverUI
     */
    public ReceiverUI() {
        newOrder = new receiveOrder();
        initComponents();
    }

    ReceiverUI(int i) {
        newOrder = new receiveOrder();
        newProduct = new manageProduct();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {


        nameTextField = new javax.swing.JTextField();
        orderNumberTextField = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        priceTextField = new javax.swing.JTextField();
        sizeTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        locationTextField = new javax.swing.JTextField();
           
        nameLabel = new javax.swing.JLabel();
        itemNumberLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        sizeLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        lacationLabel = new javax.swing.JLabel();  // for location
       
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        nameLabel.setText("Name");

        itemNumberLabel.setText("Item Number");

        quantityLabel.setText("Quantity");

        categoryLabel.setText("Category");

        priceLabel.setText("Price");

        sizeLabel.setText("Size");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(newOrder.getCategoryList()));

        descriptionLabel.setText("Description");

        weightLabel.setText("Weight");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmReceive(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1)
                .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(itemNumberLabel)
                .add(quantityLabel)
                .add(nameLabel))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(nameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(categoryLabel))
                .add(layout.createSequentialGroup()
                .add(orderNumberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(priceLabel))
                .add(layout.createSequentialGroup()
                .add(quantityTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(sizeLabel)))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(sizeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(descriptionLabel))
                .add(layout.createSequentialGroup()
                .add(priceTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(weightLabel)))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(weightTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(descriptionTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .add(jPanel1)
                .add(layout.createSequentialGroup()
                .add(jButton1)
                .add(18, 18, 18)
                .add(jButton2)))
                .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(nameLabel)
                .add(nameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(categoryLabel)
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(descriptionLabel)
                .add(descriptionTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(itemNumberLabel)
                .add(orderNumberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(priceLabel)
                .add(priceTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(weightLabel)
                .add(weightTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(quantityLabel)
                .add(quantityTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(sizeLabel)
                .add(sizeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 440, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton1)
                .add(jButton2))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        nameTextField.getAccessibleContext().setAccessibleName("");
        add(locationTextField);

        // set a border for this panel
        setBorder(BorderFactory.createLineBorder(Color.white));
    }

    private void confirmReceive(java.awt.event.ActionEvent evt) {
        if (nameTextField.getText().compareTo("") != 0
                && quantityTextField.getText().compareTo("") != 0
                && priceTextField.getText().compareTo("") != 0
                && sizeTextField.getText().compareTo("") != 0
                && descriptionTextField.getText().compareTo("") != 0
                && weightTextField.getText().compareTo("") != 0) {
            if (this.function == 0) {
                newOrder.setItemName(nameTextField.getText());
                newOrder.setItemQuantity(Integer.valueOf(quantityTextField.getText()));
                newOrder.setPrice(Float.valueOf(priceTextField.getText()));
                newOrder.setSize(Float.valueOf(sizeTextField.getText()));
                newOrder.setDescription(descriptionTextField.getText());
                newOrder.setItemCategory(jComboBox1.getSelectedIndex() + 1);
                newOrder.setWeight(Float.valueOf(weightTextField.getText()));
                newOrder.createOrder();

                // Check if order number is empty.
                // If user input order number, add the product into exist order
                // If order number is not empty, create a new order


                int newOrderNumber = -1;
                if (orderNumberTextField.getText().compareTo("") != 0) {
                    newOrder.setOrderID(Integer.valueOf(orderNumberTextField.getText()));
                    newOrder.addItemsToOrder();
                } else {
                    newOrderNumber = newOrder.addProduct();
                }

                new ConfirmPopup("Item has been recorded").setVisible(true);

                nameTextField.setText("");
                quantityTextField.setText("");
                priceTextField.setText("");
                sizeTextField.setText("");
                descriptionTextField.setText("");
                weightTextField.setText("");

                if (newOrderNumber != -1) {
                    orderNumberTextField.setText(String.valueOf(newOrderNumber));
                }

            } // end if function =0

        }
    }

    private void cancel(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }
    // Variables declaration - do not modify
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel itemNumberLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField orderNumberTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JTextField sizeTextField;
    private javax.swing.JTextField weightTextField;
    private receiveOrder newOrder;
    private int function = 0;  // function for UI. 0 for receiver, 1 for add product list,2 for edit product 
    private manageProduct newProduct;
    // End of variables declaration
}
