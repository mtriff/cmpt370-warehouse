/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouseui;

import database.gui.GuiDB;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import org.jdesktop.layout.GroupLayout;

/**
 *
 * @author Xianming
 */
public class MainUI extends javax.swing.JFrame {

    // Variables declaration - do not modify                     
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JMenu jMenu1;
    private JMenu editMenu;
    private JMenuBar jMenuBar1;
    private JPanel jPanel1;
    private MainUI.WarehouseMap jPanel2;
    private JMenuItem menuItem_add;
    private static int hightlightX;
    private static int hightlightY;

    // End of variables declaration     
    /**
     * Creates new form MainUI
     */
    public MainUI()
    {
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

        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jPanel1 = new JPanel();
        jPanel2 = new MainUI.WarehouseMap();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        editMenu = new JMenu();
        menuItem_add = new JMenuItem("Locate");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Stock");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                openStockUI(evt);
            }
        });

        jButton2.setText("Shipping");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                openShippingUI(evt);
            }
        });

        jButton3.setText("Receiver");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                openReceiverUI(evt);
            }
        });

        jButton4.setText("Manager");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                openManagerUI(evt);
            }
        });

        jPanel2.setBackground(new Color(186, 186, 186));

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.LEADING)
                .add(jPanel2Layout.createSequentialGroup()
                .add(190, 190, 190)
                .addContainerGap(193, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.LEADING)
                .add(jPanel2Layout.createSequentialGroup()
                .add(155, 155, 155)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.LEADING)
                .add(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.LEADING)
                .add(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        menuItem_add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //new LocateBinPopup().setVisible(true);
                LocateBinPopup temp = new LocateBinPopup(jPanel2);
                temp.setVisible(true);
            }
        });
        editMenu.setText("Search");
        editMenu.add(menuItem_add);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                .add(GroupLayout.TRAILING, jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(GroupLayout.TRAILING, jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(GroupLayout.TRAILING, jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(GroupLayout.TRAILING, jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(GroupLayout.LEADING)
                .add(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createSequentialGroup()
                .add(jButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton4)
                .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap()));

        pack();
    }// </editor-fold>                        

    /**
     * Open stock UI window
     *
     * @param evt
     */
    private void openStockUI(ActionEvent evt) {
        // TODO add your handling code here:
        StockUI stockWindow = new StockUI();
        stockWindow.setVisible(true);
    }

    /**
     * Open shipping UI window
     *
     * @param evt
     */
    private void openShippingUI(ActionEvent evt) {
        // TODO add your handling code here:
        ShippingUI shippingWindow = new ShippingUI();
        shippingWindow.setVisible(true);
    }

    /**
     * Open receiver UI window
     *
     * @param evt
     */
    private void openReceiverUI(ActionEvent evt) {
        // TODO add your handling code here:
        ReceiverUI receiverWindow = new ReceiverUI();
        receiverWindow.setVisible(true);
    }

    /**
     * Open manager UI window
     *
     * @param evt
     */
    private void openManagerUI(ActionEvent evt) {
        // TODO add your handling code here:
        ManagerUI managerWindow = new ManagerUI();
        managerWindow.setVisible(true);
    }

    private void openBillPopup(ActionEvent evt) {
        BillPopup billPopup = new BillPopup();
        billPopup.setVisible(true);
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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);

            }
        });
    }

    private class Bin {
        // ----- Instance Variables -----

        boolean isExist;
        boolean isHightlighted;

        // ----- Class Methods -----
        Bin() {
            isExist = false;
            isHightlighted = false;
        }
    }
    static MainUI.Bin[][] bins;
                WarehouseMap temp = new WarehouseMap();

    static void highlightBin(int X, int Y) {
        if (bins[Y - 1][X - 1].isExist == true) {
            bins[Y - 1][X - 1].isHightlighted = true;
        }
    }

    class WarehouseMap extends JPanel {

        // ----- Instance Variables -----
        Dimension dim = new Dimension(930, 630); // size of the map
        final int NUM_BIN_X = 30;
        final int NUM_BIN_Y = 20;
        int mouseX; // current location of mouse in x-axis
        int mouseY; // current location of mouse in y-axis
        int draggedX; // location of dragged bin in x-axis
        int draggedY; // location of dragged bin in y-axis
        int preDraggedX; // the original location of dragged bin in x-axis
        int preDraggedY; // the original locaiton of dragged bin in y-axis
        boolean isDragged = false; // whether a bin is dragged
        Rectangle rectX = new Rectangle(); // coordinate rectangle for x-axis
        Rectangle rectY = new Rectangle(); // coordinate rectangle for y-axis
        boolean onDragged = false; // whether mouse is dragging a bin
        boolean isConflict = false; // whether there is conflict when moving a bin
        private GuiDB database;
        
        
        // ----- Class Methods -----
        public WarehouseMap() {
            bins = new MainUI.Bin[NUM_BIN_Y][NUM_BIN_X];
            for (int i = 0; i < NUM_BIN_Y; i++) {
                for (int j = 0; j < NUM_BIN_X; j++) {
                    bins[i][j] = new MainUI.Bin();
                }
            }
            addMouseMotionListener(new MainUI.WarehouseMap.MyMouseAdapter());
            addMouseListener(new MainUI.WarehouseMap.MyMouseAdapter());
            database=new GuiDB();
            reloadBins();
        }

        @Override
        public Dimension getPreferredSize() {
            return dim;
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.white);
            drawLine(g);
            drawCoordinate(g);
            drawRect(g);
            // if the user is dragging the bin, draw the coordinate rectangle
            if (isDragged) {
                rectX.setBounds(31, draggedY * 30 + 1, 900, 29);
                rectY.setBounds(draggedX * 30 + 1, 31, 29, 600);
                Graphics2D g2d = (Graphics2D) g;
                if (!isConflict) {
                    // set rectangle to green
                    g2d.setColor(new Color(0, 255, 126));
                } else {
                    // set rectangle to red
                    g2d.setColor(new Color(255, 98, 94));
                }
                g2d.fill(rectX);
                g2d.fill(rectY);
            }
        }

        /**
         * Draw the grid for the map system
         *
         * @param g
         */
        private void drawLine(Graphics g) {
            // draw horizontal line
            for (int i = 0; i <= 630; i += 30) {
                g.drawLine(0, i, 930, i);
            }

            // draw vertical line
            for (int i = 0; i <= 930; i += 30) {
                g.drawLine(i, 0, i, 630);
            }
        }

        /**
         * Draw the coordinate model for the map system
         *
         * @param g
         */
        private void drawCoordinate(Graphics g) {
            // draw horizontal coordinate
            int number = 0;
            for (int i = 10; i < 930; i += 30) {
                g.drawString(String.valueOf(number), i, 20);
                number++;
            }
            // draw vertical line
            number = 1;
            for (int i = 50; i < 630; i += 30) {
                g.drawString(String.valueOf(number), 10, i);
                number++;
            }
        }

        /**
         * Draw the bin by filling up the cell according to the bins array
         *
         * @param g
         */
        private void drawRect(Graphics g) {
            for (int i = 0; i < NUM_BIN_Y; i++) {
                for (int j = 0; j < NUM_BIN_X; j++) {
                    if (bins[i][j].isExist == true && bins[i][j].isHightlighted == false) {
                        g.setColor(new Color(0, 150, 255)); // set the color as blue
                        g.fillRect((j + 1) * 30 + 1, (i + 1) * 30 + 1, 29, 29);
                    } else if (bins[i][j].isExist == true && bins[i][j].isHightlighted == true) {
                        g.setColor(new Color(0, 255, 126)); // set the color as green
                        g.fillRect((j + 1) * 30 + 1, (i + 1) * 30 + 1, 29, 29);
                    }
                }
            }
        }

        private void reloadBins() {            
            String[] currentBins = database.getBinLocations();
            for (int i = 0; i < currentBins.length; i++) {
                String currBin = currentBins[i];
                bins[Integer.parseInt(currBin.split(" ")[0]) - 1][Integer.parseInt(currBin.split(" ")[1]) - 1].isExist = true;
            }
        }

        /**
         * Draw the bin by setting the bin element to be true and repaint the
         * component
         *
         * @param X location of bin in x-axis
         * @param Y location of bin in y-axis
         */
        private void drawOnClickBin(int X, int Y) {
            if (bins[Y - 1][X - 1].isExist == false) {
                bins[Y - 1][X - 1].isExist = true;
                database.createBin(Y, X);
            }
            repaint();
        }

        private class MyMouseAdapter extends MouseAdapter {

            /**
             * For delete the cell
             */
            int deletedX;
            int deletedY;

            /**
             * delete the cell according to the recorded deletedX and deletedY
             */
            void deleteCell() {
                bins[deletedY - 1][deletedX - 1].isExist = false;
                database.removeBin(deletedY, deletedX);
                repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                int X = mouseX / 30;
                int Y = mouseY / 30;

                // check if mouse event is right click
                if ((X > 0 && Y > 0) && (X <= 30 && Y <= 20)
                        && (bins[Y - 1][X - 1].isExist)
                        && SwingUtilities.isRightMouseButton(e)) {
                    deletedX = X;
                    deletedY = Y;
                    MainUI.WarehouseMap.MyMouseAdapter.PopupMenu popupMenu = new MainUI.WarehouseMap.MyMouseAdapter.PopupMenu();
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                    return;
                }

                // double click for showing the product info if the cell is
                // already existed
                if ((X > 0 && Y > 0) && (X <= 30 && Y <= 20)
                        && (bins[Y - 1][X - 1].isExist)
                        && e.getClickCount() == 2) {
                    // show up the product details
                    ProductPopup productPopup = new ProductPopup();
                    productPopup.setVisible(true);
                    return;
                }

                // double click for adding a cell
                if ((X > 0 && Y > 0) && (X <= 30 && Y <= 20)
                        && e.getClickCount() == 2) {
                    drawOnClickBin(X, Y);
                }
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                draggedX = mouseX / 30;
                draggedY = mouseY / 30;
                if ((draggedX > 0 && draggedY > 0)
                        && (draggedX <= 30 && draggedY <= 20)) {
                    if (bins[draggedY - 1][draggedX - 1].isExist && !onDragged) {
                        preDraggedX = draggedX;
                        preDraggedY = draggedY;
                        bins[draggedY - 1][draggedX - 1].isExist = false;
                        onDragged = true;
                        isDragged = true;
                    }
                    if (bins[draggedY - 1][draggedX - 1].isExist) {
                        isConflict = true;
                    } else {
                        isConflict = false;
                    }
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                int X = mouseX / 30;
                int Y = mouseY / 30;
                if ((X > 0 && Y > 0) && (X <= 30 && Y <= 20) && isDragged) {
                    if (!bins[Y - 1][X - 1].isExist) {
                        drawOnClickBin(X, Y);
                    } else {
                        drawOnClickBin(preDraggedX, preDraggedY);
                    }
                    isDragged = false;
                    onDragged = false;
                    repaint();
                }
            }

            private class PopupMenu extends JPopupMenu {

                JMenuItem info;
                JMenuItem delete;

                PopupMenu() {
                    info = new JMenuItem("Info");
                    delete = new JMenuItem("Delete");
                    info.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            // show up the product details
                            ProductPopup productPopup = new ProductPopup();
                            productPopup.setVisible(true);
                        }
                    });
                    delete.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            deleteCell();
                        }
                    });
                    add(info);
                    add(delete);
                }
            }
        }
    }
}
