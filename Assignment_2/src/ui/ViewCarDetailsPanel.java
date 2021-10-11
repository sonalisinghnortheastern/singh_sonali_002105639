/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.UberCars;
public class ViewCarDetailsPanel extends javax.swing.JPanel {
    List<Car> cars;
    UberCars uberCar;
    int value=0;
    public ViewCarDetailsPanel(List<Car> cars,UberCars uberCar) {
        initComponents();
        this.cars=cars;
        this.uberCar=uberCar;
        displayInfo(this.cars);
        fleetCatalogue(uberCar);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jRegisteredCarsTable = new javax.swing.JTable();
        btnViewCarDetails = new javax.swing.JButton();
        btnDeleteCarDetails = new javax.swing.JButton();
        lblCarName = new javax.swing.JLabel();
        lblPassengerCar = new javax.swing.JLabel();
        lblCarAvailablity = new javax.swing.JLabel();
        lblManufacturerName = new javax.swing.JLabel();
        lbllManufacturingYear = new javax.swing.JLabel();
        lblMinimumNumberOfSeats = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        lblModelName = new javax.swing.JLabel();
        lblAvailableCity = new javax.swing.JLabel();
        lblMaintenanceCertificateDate = new javax.swing.JLabel();
        txtCarName = new javax.swing.JTextField();
        radiobtnYes = new javax.swing.JRadioButton();
        radiobtnNo = new javax.swing.JRadioButton();
        radiobtnAvailableYes = new javax.swing.JRadioButton();
        radiobtnAvailableNo = new javax.swing.JRadioButton();
        cmbManufacturerName = new javax.swing.JComboBox<>();
        txtSerialNumber = new javax.swing.JTextField();
        comboModelName = new javax.swing.JComboBox<>();
        chckBoxCityDelhi = new javax.swing.JCheckBox();
        chckBoxCityBangalore = new javax.swing.JCheckBox();
        chckBoxCityMumbai = new javax.swing.JCheckBox();
        datechooserCertificateDate = new com.toedter.calendar.JDateChooser();
        btnUpdateCarDetails = new javax.swing.JButton();
        dateManufacturingYear = new com.toedter.calendar.JYearChooser();
        txtLastUpdatedDate = new javax.swing.JTextField();
        sliderMinimumSeat = new javax.swing.JSlider();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Cars");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jRegisteredCarsTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jRegisteredCarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jRegisteredCarsTable);

        btnViewCarDetails.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnViewCarDetails.setText("View");
        btnViewCarDetails.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewCarDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCarDetailsActionPerformed(evt);
            }
        });

        btnDeleteCarDetails.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDeleteCarDetails.setText("Delete");
        btnDeleteCarDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCarDetailsActionPerformed(evt);
            }
        });

        lblCarName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCarName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarName.setText("Car Name :");
        lblCarName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblPassengerCar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPassengerCar.setText("Is this a passenger car ? :");

        lblCarAvailablity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCarAvailablity.setText("Is car currently available ? :");

        lblManufacturerName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblManufacturerName.setText("Manufacturer Name :");

        lbllManufacturingYear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbllManufacturingYear.setText("Manufacturing Year :");

        lblMinimumNumberOfSeats.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMinimumNumberOfSeats.setText("Number Of Seats :");

        lblSerialNumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSerialNumber.setText("Serial Number :");

        lblModelName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblModelName.setText("Model Name :");

        lblAvailableCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAvailableCity.setText("Available City :");

        lblMaintenanceCertificateDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMaintenanceCertificateDate.setText("Maintainence Certificate Date :");

        buttonGroup1.add(radiobtnYes);
        radiobtnYes.setText("Yes");

        buttonGroup1.add(radiobtnNo);
        radiobtnNo.setText("No");

        buttonGroup2.add(radiobtnAvailableYes);
        radiobtnAvailableYes.setText("Yes");

        radiobtnAvailableNo.setText("No");

        cmbManufacturerName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "BMW", "Bentley", "Toyota", " " }));

        txtSerialNumber.setEditable(false);

        comboModelName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A-Class", "A3", "A4", "Blazer", "Compass" }));

        chckBoxCityDelhi.setText("Delhi");

        chckBoxCityBangalore.setText("Bangalore");

        chckBoxCityMumbai.setText("Mumbai");

        btnUpdateCarDetails.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdateCarDetails.setText("Update");
        btnUpdateCarDetails.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateCarDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCarDetailsActionPerformed(evt);
            }
        });

        txtLastUpdatedDate.setText("jTextField1");
        txtLastUpdatedDate.setEnabled(false);

        sliderMinimumSeat.setMajorTickSpacing(1);
        sliderMinimumSeat.setMaximum(10);
        sliderMinimumSeat.setMinimum(1);
        sliderMinimumSeat.setPaintLabels(true);
        sliderMinimumSeat.setPaintTicks(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLastUpdatedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewCarDetails)
                .addGap(29, 29, 29)
                .addComponent(btnDeleteCarDetails)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSerialNumber)
                    .addComponent(lblModelName)
                    .addComponent(lblAvailableCity)
                    .addComponent(lblMaintenanceCertificateDate)
                    .addComponent(lblManufacturerName)
                    .addComponent(lbllManufacturingYear)
                    .addComponent(lblMinimumNumberOfSeats)
                    .addComponent(lblCarAvailablity)
                    .addComponent(lblPassengerCar)
                    .addComponent(lblCarName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(datechooserCertificateDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radiobtnYes)
                                        .addComponent(radiobtnAvailableYes))
                                    .addGap(61, 61, 61)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radiobtnAvailableNo)
                                        .addComponent(radiobtnNo)))
                                .addComponent(cmbManufacturerName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboModelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chckBoxCityDelhi)
                                .addGap(58, 58, 58)
                                .addComponent(chckBoxCityBangalore))
                            .addComponent(btnUpdateCarDetails))
                        .addGap(52, 52, 52)
                        .addComponent(chckBoxCityMumbai))
                    .addComponent(txtCarName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(322, 322, 322)
                    .addComponent(sliderMinimumSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(365, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtLastUpdatedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewCarDetails)
                    .addComponent(btnDeleteCarDetails))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarName)
                    .addComponent(txtCarName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiobtnYes)
                            .addComponent(radiobtnNo))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiobtnAvailableYes)
                            .addComponent(radiobtnAvailableNo))
                        .addGap(18, 18, 18)
                        .addComponent(cmbManufacturerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(dateManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chckBoxCityDelhi)
                                    .addComponent(chckBoxCityBangalore)
                                    .addComponent(chckBoxCityMumbai)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboModelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(datechooserCertificateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPassengerCar)
                        .addGap(30, 30, 30)
                        .addComponent(lblCarAvailablity)
                        .addGap(30, 30, 30)
                        .addComponent(lblManufacturerName)
                        .addGap(30, 30, 30)
                        .addComponent(lbllManufacturingYear)
                        .addGap(30, 30, 30)
                        .addComponent(lblMinimumNumberOfSeats)
                        .addGap(30, 30, 30)
                        .addComponent(lblSerialNumber)
                        .addGap(30, 30, 30)
                        .addComponent(lblModelName)
                        .addGap(30, 30, 30)
                        .addComponent(lblAvailableCity)
                        .addGap(30, 30, 30)
                        .addComponent(lblMaintenanceCertificateDate)))
                .addGap(42, 42, 42)
                .addComponent(btnUpdateCarDetails)
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(472, Short.MAX_VALUE)
                    .addComponent(sliderMinimumSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(419, 419, 419)))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteCarDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCarDetailsActionPerformed

    int rowIndex=jRegisteredCarsTable.getSelectedRow();
    if(rowIndex<0)
    {
        JOptionPane.showMessageDialog(this,"Please select the row you wish to delete");
    }
    else{
        cars.remove(rowIndex);
        displayInfo(cars);
    }
    }//GEN-LAST:event_btnDeleteCarDetailsActionPerformed

    private void btnViewCarDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCarDetailsActionPerformed
        int rowIndex=jRegisteredCarsTable.getSelectedRow();
    if(rowIndex<0)
    {
        JOptionPane.showMessageDialog(this,"Please select the row you wish to view");
    }
    else{
        Car car=cars.get(rowIndex);
        txtCarName.setText(car.getCarName());
        if(car.getIsPassengerCar())
        {
            radiobtnYes.setSelected(true);
        }
        else{
            radiobtnNo.setSelected(true);
        }
        if(car.getIsCarAvailable())
        {
            radiobtnAvailableYes.setSelected(true);
        }
        else{
            radiobtnAvailableNo.setSelected(true);
        }
        cmbManufacturerName.setSelectedItem(car.getManufacturerName());
        sliderMinimumSeat.setValue(car.getNoOfSeats());
        txtSerialNumber.setText(Long.toString(car.getSerialNumber()));
        comboModelName.setSelectedItem(car.getModelNumber());
        dateManufacturingYear.setYear(car.getManufacturingYear());
        for( String city : car.getAvailableCity())
        {
            if(city == "Delhi")
            {
                chckBoxCityDelhi.setSelected(true);
            }
            if(city == "Bangalore")
            {
                chckBoxCityBangalore.setSelected(true);
            }
            if(city == "Mumbai"){
                chckBoxCityMumbai.setSelected(true);
            }
        }
        datechooserCertificateDate.setDate(car.getMaintenanceCertificateDate());
        
    }
    }//GEN-LAST:event_btnViewCarDetailsActionPerformed

    private void btnUpdateCarDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCarDetailsActionPerformed
        int count=0;
         if(NullandEmptyValidation()==1)
            {
                JOptionPane.showMessageDialog(this,"Field Validation Failed Please hover over the red filed to know more.");
                value=0;
                return;
            }
        if(txtSerialNumber.getText()!=null && !txtSerialNumber.getText().trim().isEmpty())
        {
            for (Car car : cars) {
                if(txtSerialNumber.getText().equals(Long.toString(car.getSerialNumber())))
                {
                    cars.set(count,getNewFields());
                    JOptionPane.showMessageDialog(this,"Car details updated successfully");
                    displayInfo(cars);
                    count=0;
                    uberCar.setFleetCatalogueUpdate(new java.util.Date());
                    txtLastUpdatedDate.setText("Last Updated Date is: "+uberCar.getFleetCatalogueUpdate().toString());
                    return;
                }
                else{
                    count++;
                }
                
            }
            if(count>0)
            {
                JOptionPane.showMessageDialog(this,"Car with this serial number does not exist");
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"please select a row in the table to update");
        }
    }//GEN-LAST:event_btnUpdateCarDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCarDetails;
    private javax.swing.JButton btnUpdateCarDetails;
    private javax.swing.JButton btnViewCarDetails;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chckBoxCityBangalore;
    private javax.swing.JCheckBox chckBoxCityDelhi;
    private javax.swing.JCheckBox chckBoxCityMumbai;
    private javax.swing.JComboBox<String> cmbManufacturerName;
    private javax.swing.JComboBox<String> comboModelName;
    private com.toedter.calendar.JYearChooser dateManufacturingYear;
    private com.toedter.calendar.JDateChooser datechooserCertificateDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jRegisteredCarsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAvailableCity;
    private javax.swing.JLabel lblCarAvailablity;
    private javax.swing.JLabel lblCarName;
    private javax.swing.JLabel lblMaintenanceCertificateDate;
    private javax.swing.JLabel lblManufacturerName;
    private javax.swing.JLabel lblMinimumNumberOfSeats;
    private javax.swing.JLabel lblModelName;
    private javax.swing.JLabel lblPassengerCar;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lbllManufacturingYear;
    private javax.swing.JRadioButton radiobtnAvailableNo;
    private javax.swing.JRadioButton radiobtnAvailableYes;
    private javax.swing.JRadioButton radiobtnNo;
    private javax.swing.JRadioButton radiobtnYes;
    private javax.swing.JSlider sliderMinimumSeat;
    private javax.swing.JTextField txtCarName;
    private javax.swing.JTextField txtLastUpdatedDate;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables

    private void displayInfo(List<Car> cars) {
    try{
    DefaultTableModel model = new DefaultTableModel(new Object[]{ "Car Name", "Passenger Car", "Availablity", "Manufacturer Name ",
                    "Manufacturing Year", "Seat", "Serial Number", "Model Name" ,"City","Maintainence Date"}, 0);
    if(cars!=null && !cars.isEmpty())
    {
    cars.forEach(car -> {
        model.addRow(new Object[]
        {car.getCarName(),car.getIsPassengerCar(),car.getIsCarAvailable(),car.getManufacturerName(),car.getManufacturingYear(),
            car.getNoOfSeats(),car.getSerialNumber(),car.getModelNumber(),car.getAvailableCity(),car.getMaintenanceCertificateDate()});
            });
        jRegisteredCarsTable.setModel(model);
    }
    else{
         JOptionPane.showMessageDialog(this,"Please enter data before viewing");
    }
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(this,"Please enter data before viewing");
    }
        
    }

    private Car getNewFields() {
    Car updatedCarDetails=new Car();
    updatedCarDetails.setCarName(txtCarName.getText());
       if(radiobtnYes.isSelected())
       {
           updatedCarDetails.setIsPassengerCar(true);
       }
       else{
           updatedCarDetails.setIsPassengerCar(false);
       }
       if(radiobtnAvailableYes.isSelected())
       {
           updatedCarDetails.setIsCarAvailable(true);
       }
       else{
           updatedCarDetails.setIsCarAvailable(false);
       }
       updatedCarDetails.setManufacturerName(cmbManufacturerName.getSelectedItem().toString());      
       updatedCarDetails.setManufacturingYear(dateManufacturingYear.getYear());
       updatedCarDetails.setNoOfSeats(sliderMinimumSeat.getValue());
       updatedCarDetails.setSerialNumber(Long.parseLong(txtSerialNumber.getText()));
       updatedCarDetails.setModelNumber(comboModelName.getSelectedItem().toString());
       List<String> availableCity=new ArrayList<>();  
       if(chckBoxCityDelhi.isSelected()){  
            availableCity.add("Delhi");
        }  
        if(chckBoxCityBangalore.isSelected()){  
            availableCity.add("Bangalore"); 
        }  
        if(chckBoxCityMumbai.isSelected()){  
           availableCity.add("Mumbai"); 
        }  
        
       updatedCarDetails.setAvailableCity(availableCity);
       updatedCarDetails.setMaintenanceCertificateDate(datechooserCertificateDate.getDate());
    return updatedCarDetails;
    }
    private void fleetCatalogue(UberCars uberCar) {
        if(uberCar.getFleetCatalogueUpdate()!=null)
        {
            txtLastUpdatedDate.setVisible(true);
            txtLastUpdatedDate.setText("Last Updated Fleet Catalogue Time is: "+uberCar.getFleetCatalogueUpdate().toString());
        }
        else{
            txtLastUpdatedDate.setVisible(false);
        }
    }
    private int NullandEmptyValidation(){
    if(txtCarName.getText().equals(null) || txtCarName.getText().equals("") || txtCarName.getText().trim().equals(""))
    {
        txtCarName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        txtCarName.setToolTipText("Field Cannot be left empty");
        value=1;
    }
    if(txtCarName.getText() != null && !txtCarName.getText().trim().isEmpty())
    {
        txtCarName.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
    }
     if(txtSerialNumber.getText()== null || txtSerialNumber.getText().trim().isEmpty())
    {
        txtSerialNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        txtSerialNumber.setToolTipText("Field Cannot be left empty");
        value=1;
    }
    if(txtSerialNumber.getText() != null && !txtSerialNumber.getText().trim().isEmpty())
    {
        txtSerialNumber.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
    }
     if(datechooserCertificateDate.getDate()==null)
    {
        txtSerialNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        txtSerialNumber.setToolTipText("Field Cannot be left empty");
        value=1;
    }
    if(datechooserCertificateDate.getDate() != null)
    {
        txtSerialNumber.setBorder(null);
    }
    if(!txtSerialNumber.getText().matches("\\b\\d+\\b"))
    {
        txtSerialNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        txtSerialNumber.setToolTipText("Pleae enter only numbers");
        value=1;
    }
    if(txtSerialNumber.getText().matches("\\b\\d+\\b"))
    {
        txtSerialNumber.setBorder(null);
    }
    if(radiobtnYes.isSelected()==false && radiobtnNo.isSelected()==false)
    {
       radiobtnYes.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
       radiobtnYes.setToolTipText("Field Cannot be left empty");
       radiobtnNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
       radiobtnNo.setToolTipText("Field Cannot be left empty");
       value=1;
    }
    if(radiobtnYes.isSelected()==true || radiobtnNo.isSelected()==true)
    {
       radiobtnYes.setBorder(null);
       radiobtnNo.setBorder(null);
    }
    if(radiobtnAvailableYes.isSelected()==false && radiobtnAvailableNo.isSelected()==false)
    {
       radiobtnAvailableYes.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
       radiobtnAvailableYes.setToolTipText("Field Cannot be left empty");
       radiobtnAvailableNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
       radiobtnAvailableNo.setToolTipText("Field Cannot be left empty");
       value=1;
    }
     if(radiobtnAvailableYes.isSelected()==true || radiobtnAvailableNo.isSelected()==true)
    {
        radiobtnAvailableYes.setBorder(null);
       radiobtnAvailableNo.setBorder(null);
    }
    if(chckBoxCityDelhi.isSelected()==false && chckBoxCityBangalore.isSelected()==false && chckBoxCityMumbai.isSelected()==false)
    {
        chckBoxCityDelhi.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
       chckBoxCityDelhi.setToolTipText("Field Cannot be left empty");
       value=1;
    }
    return value;
}
}
