

package userinterface.DeliveryManRole;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.WorkQueue.PlaceOrderWorkRequest;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author  raunak
 */
public class ManageDeliveryOrderJPanel extends javax.swing.JPanel {

    
   private final EcoSystem system;
   private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ManageDeliveryOrderJPanel(EcoSystem system) {
        initComponents();
        this.system=system;
        populateOrder();
        
    }
    
       /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        txtRestaurantAddress = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerAddress = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblMobileNumber = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        btnUpdateRestaurantProfile = new javax.swing.JButton();
        lblUsername1 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        lblUsername2 = new javax.swing.JLabel();
        txtCustomerMessage = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(240, 178, 62));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDER");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        txtRestaurantName.setEditable(false);
        txtRestaurantName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtRestaurantAddress.setEditable(false);
        txtRestaurantAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCustomerName.setEditable(false);
        txtCustomerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCustomerAddress.setEditable(false);
        txtCustomerAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("RESTAURANT NAME :");
        lblName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblMobileNumber.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMobileNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblMobileNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMobileNumber.setText("CUSTOMER NAME :");
        lblMobileNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblUsername.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("CUSTOMER ADDRESS :");
        lblUsername.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAddress.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress.setText("RESTAURANT ADDRESS :");
        lblAddress.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnUpdateRestaurantProfile.setBackground(new java.awt.Color(240, 178, 62));
        btnUpdateRestaurantProfile.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnUpdateRestaurantProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateRestaurantProfile.setText("UPDATE ");
        btnUpdateRestaurantProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateRestaurantProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRestaurantProfileActionPerformed(evt);
            }
        });

        lblUsername1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblUsername1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername1.setText("STATUS");
        lblUsername1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assigned", "Delivered" }));

        lblUsername2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblUsername2.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername2.setText("CUSTOMER MESSAGE :");
        lblUsername2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtCustomerMessage.setEditable(false);
        txtCustomerMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRestaurantName)
                            .addComponent(txtRestaurantAddress))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUsername1)
                                    .addComponent(lblUsername)
                                    .addComponent(lblUsername2))))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomerMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 92, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnUpdateRestaurantProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnUpdateRestaurantProfile)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void populateOrder(){
       try{
           populateStatusComboBox();
        //int uniqueId=system.getLogInUser().getLogInId();
        int uniqueId=123;
       for(PlaceOrderWorkRequest workRequest:system.getWorkQueue().getWorkRequestList())
       {
           if(!workRequest.getStatus().equals("ASSIGNED"))
           {
               
           }
           else{
           if(workRequest.getDeliverMan().getUniqueId()==uniqueId)
           {
               txtRestaurantName.setText(workRequest.getRestaurant().getName());
               txtRestaurantAddress.setText(workRequest.getRestaurant().getAddress());
               txtCustomerName.setText(workRequest.getCustomer().getName());
               txtCustomerAddress.setText(workRequest.getCustomer().getAddress());
               cmbStatus.setSelectedItem(workRequest.getStatus());
               txtCustomerMessage.setText(workRequest.getMessage());
           }
           }
       }
       }
       catch(Exception ex)
       {
           throw ex;
       }
   }

    private void btnUpdateRestaurantProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRestaurantProfileActionPerformed
        try {
            if(cmbStatus.getSelectedItem().equals("Delivered"))
            {
                //int uniqueId=system.getLogInUser().getLogInId();
                int uniqueId=123;
                for(PlaceOrderWorkRequest workRequest:system.getWorkQueue().getWorkRequestList())
               {
                   if(workRequest.getDeliverMan()==null)
                   {
                       return;
                   }
                   if(workRequest.getDeliverMan().getUniqueId()==uniqueId)
                   {
                       workRequest.setStatus("Delivered");
                       workRequest.setResolveDate(new Date());
                       DeliveryMan deliveryMan=workRequest.getDeliverMan();
                       deliveryMan.setIsDeliveryPersonAvailable(true);
                       workRequest.setDeliverMan(deliveryMan);
                   }
                }
                dB4OUtil.storeSystem(system);
                JOptionPane.showMessageDialog(null, "Order Status Updated");
                reset();
            }
        } catch (Exception e) {
            throw  e;
        }

    }//GEN-LAST:event_btnUpdateRestaurantProfileActionPerformed
private void populateStatusComboBox()
    {
        try {
         DefaultComboBoxModel model = (DefaultComboBoxModel) cmbStatus.getModel();
         model.removeAllElements();
         model.addElement("Delivered");
        } catch (Exception e) {
        }
    }
     private void reset() {
            txtRestaurantName.setText("");
            txtRestaurantAddress.setText("");
            txtCustomerName.setText("");
            txtCustomerAddress.setText("");
            cmbStatus.setSelectedIndex(0);
            txtCustomerMessage.setText("");
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateRestaurantProfile;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblMobileNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerMessage;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtRestaurantAddress;
    private javax.swing.JTextField txtRestaurantName;
    // End of variables declaration//GEN-END:variables
    
}
