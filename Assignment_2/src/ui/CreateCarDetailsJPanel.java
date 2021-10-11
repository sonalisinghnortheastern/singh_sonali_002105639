package ui;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Car;
import model.UberCars;
public class CreateCarDetailsJPanel extends javax.swing.JPanel {
    UberCars uberCar;
    int value=0;
    int fileuploadValue=0;
    public CreateCarDetailsJPanel(UberCars uberCar) {
        this.uberCar=uberCar;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblAddDetails = new javax.swing.JLabel();
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
        sliderMinimumSeat = new javax.swing.JSlider();
        txtSerialNumber = new javax.swing.JTextField();
        comboModelName = new javax.swing.JComboBox<>();
        chckBoxCityDelhi = new javax.swing.JCheckBox();
        chckBoxCityBangalore = new javax.swing.JCheckBox();
        chckBoxCityMumbai = new javax.swing.JCheckBox();
        datechooserCertificateDate = new com.toedter.calendar.JDateChooser();
        btnSave = new javax.swing.JButton();
        dateManufacturingYear = new com.toedter.calendar.JYearChooser();
        lblOr = new javax.swing.JLabel();
        lblUploadFile = new javax.swing.JLabel();
        btnUploadFile = new javax.swing.JButton();
        btnUploadUI = new javax.swing.JButton();

        lblAddDetails.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblAddDetails.setForeground(new java.awt.Color(153, 0, 51));
        lblAddDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddDetails.setText("Add Car Details");
        lblAddDetails.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblCarName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCarName.setText("Car Name :");

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

        buttonGroup2.add(radiobtnAvailableNo);
        radiobtnAvailableNo.setText("No");

        cmbManufacturerName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "BMW", "Bentley", "Toyota" }));

        sliderMinimumSeat.setMajorTickSpacing(1);
        sliderMinimumSeat.setMaximum(10);
        sliderMinimumSeat.setMinimum(1);
        sliderMinimumSeat.setPaintLabels(true);
        sliderMinimumSeat.setPaintTicks(true);

        comboModelName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A-Class", "A3", "A4", "Blazer", "Compass" }));

        chckBoxCityDelhi.setText("Delhi");

        chckBoxCityBangalore.setText("Bangalore");

        chckBoxCityMumbai.setText("Mumbai");

        btnSave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblOr.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblOr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOr.setText("OR");
        lblOr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblUploadFile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUploadFile.setText("Upload Through File :");

        btnUploadFile.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUploadFile.setText("Browse");
        btnUploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadFileActionPerformed(evt);
            }
        });

        btnUploadUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnUploadUI.setText("Upload");
        btnUploadUI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUploadUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadUIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblOr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUploadFile)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarName)
                            .addComponent(lblPassengerCar)
                            .addComponent(lblCarAvailablity)
                            .addComponent(lblManufacturerName)
                            .addComponent(lbllManufacturingYear)
                            .addComponent(lblMinimumNumberOfSeats)
                            .addComponent(lblSerialNumber)
                            .addComponent(lblModelName)
                            .addComponent(lblAvailableCity)
                            .addComponent(lblMaintenanceCertificateDate))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chckBoxCityDelhi)
                                        .addGap(58, 58, 58)
                                        .addComponent(chckBoxCityBangalore)
                                        .addGap(55, 55, 55)
                                        .addComponent(chckBoxCityMumbai))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnUploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnSave)
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
                                                    .addComponent(txtCarName, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cmbManufacturerName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(comboModelName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(49, 49, 49)
                                        .addComponent(btnUploadUI)))
                                .addContainerGap(138, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sliderMinimumSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAvailableCity, lblCarAvailablity, lblCarName, lblMaintenanceCertificateDate, lblManufacturerName, lblMinimumNumberOfSeats, lblModelName, lblPassengerCar, lblSerialNumber, lbllManufacturingYear});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblAddDetails)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarName)
                    .addComponent(txtCarName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassengerCar)
                    .addComponent(radiobtnYes)
                    .addComponent(radiobtnNo))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarAvailablity)
                    .addComponent(radiobtnAvailableYes)
                    .addComponent(radiobtnAvailableNo))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturerName)
                    .addComponent(cmbManufacturerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbllManufacturingYear)
                    .addComponent(dateManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMinimumNumberOfSeats)
                    .addComponent(sliderMinimumSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelName)
                    .addComponent(comboModelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailableCity)
                    .addComponent(chckBoxCityDelhi)
                    .addComponent(chckBoxCityBangalore)
                    .addComponent(chckBoxCityMumbai))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaintenanceCertificateDate)
                    .addComponent(datechooserCertificateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnSave)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUploadUI))
                        .addGap(154, 154, 154))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblOr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(lblUploadFile)
                        .addGap(156, 156, 156))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAddDetails, lblAvailableCity, lblCarAvailablity, lblCarName, lblMaintenanceCertificateDate, lblManufacturerName, lblMinimumNumberOfSeats, lblModelName, lblPassengerCar, lblSerialNumber, lbllManufacturingYear});

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try
        {
            if(NullandEmptyValidation()==1)
            {
                JOptionPane.showMessageDialog(this,"Field Validation Failed Please hover over the red filed to know more.");
                value=0;
                return;
            }
           for(Car car : uberCar.getCars())
           {
               if(txtSerialNumber.getText().equals(Long.toString(car.getSerialNumber())))
               {
                   JOptionPane.showMessageDialog(this,"Car with this serial number already exist."
                           + "Please enter diffrent Serial number or if you wish to add by same number then please delete first.");
                   return;
               }
           }
        var car=uberCar.addNewCar();
        car.setCarName(txtCarName.getText());
       if(radiobtnYes.isSelected())
       {
           car.setIsPassengerCar(true);
       }
       else{
           car.setIsPassengerCar(false);
       }
       if(radiobtnAvailableYes.isSelected())
       {
           car.setIsCarAvailable(true);
       }
       else{
           car.setIsCarAvailable(false);
       }
       car.setManufacturerName(cmbManufacturerName.getSelectedItem().toString());      
       car.setManufacturingYear(dateManufacturingYear.getYear());
       car.setNoOfSeats(sliderMinimumSeat.getValue());
       if(!txtSerialNumber.getText().equals(""))
       {
           car.setSerialNumber(Long.parseLong(txtSerialNumber.getText()));
       }
       car.setModelNumber(comboModelName.getSelectedItem().toString());
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
       car.setAvailableCity(availableCity);
       car.setMaintenanceCertificateDate(datechooserCertificateDate.getDate());
       uberCar.setFleetCatalogueUpdate(new java.util.Date());
       if(value==0)
            {
                JOptionPane.showMessageDialog(this,"Record Saved Successfully");
                value=0;
                EmptyAfterUpload();
            }
        else
        {
            JOptionPane.showMessageDialog(this,"Field Validation Failed Please hover over the red filed to know more.");
            value=0;
            var x=uberCar.getCars();
            uberCar.getCars().remove(uberCar.getCars().size() - 1);
        }
       }
       catch(Exception ex)
       {          
           value=0;
           JOptionPane.showMessageDialog(this,"Record Could Not Be Saved");
           var x=uberCar.getCars();
           uberCar.getCars().remove(uberCar.getCars().size() - 1);
       }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadFileActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
        File selectedFile = file.getSelectedFile();
        uberCar.setFilePath(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_btnUploadFileActionPerformed

    private void btnUploadUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadUIActionPerformed

        try (BufferedReader br = Files.newBufferedReader(Paths.get(uberCar.getFilePath()),
                StandardCharsets.US_ASCII))
        {
            String line = br.readLine();
            while (line != null){
                String[] attributes = line.split("//");
                if(attributes.length==10)
                {
                createCarDetail(attributes);
                if(fileuploadValue==1)
                {
                    JOptionPane.showMessageDialog(this,"Some error occured reading the file.");
                    uberCar.getCars().remove(uberCar.getCars().size() - 1);
                    return;
                }
                line = br.readLine();
                }
                else{
                    JOptionPane.showMessageDialog(this,"Some entries in the file missing");
                }
            }
            JOptionPane.showMessageDialog(this,"File Uploaded");
        }   catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Some error occured reading the file.");
            }
          
    }//GEN-LAST:event_btnUploadUIActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUploadFile;
    private javax.swing.JButton btnUploadUI;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox chckBoxCityBangalore;
    private javax.swing.JCheckBox chckBoxCityDelhi;
    private javax.swing.JCheckBox chckBoxCityMumbai;
    private javax.swing.JComboBox<String> cmbManufacturerName;
    private javax.swing.JComboBox<String> comboModelName;
    private com.toedter.calendar.JYearChooser dateManufacturingYear;
    private com.toedter.calendar.JDateChooser datechooserCertificateDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddDetails;
    private javax.swing.JLabel lblAvailableCity;
    private javax.swing.JLabel lblCarAvailablity;
    private javax.swing.JLabel lblCarName;
    private javax.swing.JLabel lblMaintenanceCertificateDate;
    private javax.swing.JLabel lblManufacturerName;
    private javax.swing.JLabel lblMinimumNumberOfSeats;
    private javax.swing.JLabel lblModelName;
    private javax.swing.JLabel lblOr;
    private javax.swing.JLabel lblPassengerCar;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblUploadFile;
    private javax.swing.JLabel lbllManufacturingYear;
    private javax.swing.JRadioButton radiobtnAvailableNo;
    private javax.swing.JRadioButton radiobtnAvailableYes;
    private javax.swing.JRadioButton radiobtnNo;
    private javax.swing.JRadioButton radiobtnYes;
    private javax.swing.JSlider sliderMinimumSeat;
    private javax.swing.JTextField txtCarName;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables

    private int createCarDetail(String[] attributes) throws ParseException {
        if(!attributes[6].trim().matches("\\b\\d+\\b"))
        {
             JOptionPane.showMessageDialog(this,"Serial Number Can only be number." );
            fileuploadValue=1;
            return fileuploadValue;
        }
       for(Car car : uberCar.getCars())
        {
            if(car.getSerialNumber() == Long.parseLong(attributes[6].trim()))
            {
                JOptionPane.showMessageDialog(this,"Entry with "+Long.parseLong(attributes[6].trim())+" serial number already exist." );
            fileuploadValue=1;
                return fileuploadValue ;
            }
        }
       var car=uberCar.addNewCar();
       car.setCarName(attributes[0].trim());
       if(attributes[1].toLowerCase().trim().equals("yes"))
       {
           car.setIsPassengerCar(true);
       }
       else
       {
            car.setIsPassengerCar(false);
       }
       if(attributes[2].toLowerCase().trim().equals("yes"))
       {
           car.setIsCarAvailable(true);
       }
       else
       {
            car.setIsCarAvailable(false);
       }
       car.setManufacturerName(attributes[3].trim());
       car.setManufacturingYear(Integer.valueOf(attributes[4].trim()));
       if(Integer.parseInt(attributes[5].trim())>0 && Integer.parseInt(attributes[5].trim())<10)
       {
           car.setNoOfSeats(Integer.parseInt(attributes[5].trim()));
       }
       else{
           JOptionPane.showMessageDialog(this,"Seats can only be between 1-10");
           fileuploadValue=1;
           return fileuploadValue;
       }
       car.setSerialNumber(Long.parseLong(attributes[6].trim()));
       car.setModelNumber(attributes[7].trim());
       var cities=attributes[8].split(",");
      List<String>Cities=new ArrayList<>();
      for(String city : cities)
      {
          if((city.trim().toLowerCase().equals("delhi")) || (city.trim().toLowerCase().equals("mumbai")) || (city.trim().toLowerCase().equals("bangalore" )))
          {
              Cities.add(city.trim());
          }
          else{
              JOptionPane.showMessageDialog(this,"City can only be Delhi,Bangalore and  Mumbai");
              fileuploadValue=1;
              return fileuploadValue;
          }
          
      }
      car.setAvailableCity(Cities);
      car.setMaintenanceCertificateDate(new Date(attributes[9].trim()));
      return fileuploadValue;
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
    public void EmptyAfterUpload()
{
    txtCarName.setText("");
    radiobtnYes.setText("");
    radiobtnNo.setText("");
    radiobtnAvailableYes.setText("");
    radiobtnAvailableNo.setText("");
    cmbManufacturerName.setSelectedItem("Audi");
    sliderMinimumSeat.setValue(10);
    txtSerialNumber.setText("");
    dateManufacturingYear.setYear(2021);
    comboModelName.setSelectedItem("A-Class");
    chckBoxCityDelhi.setSelected(false);
    chckBoxCityBangalore.setSelected(false);
    chckBoxCityMumbai.setSelected(false);
    
}

    
}
