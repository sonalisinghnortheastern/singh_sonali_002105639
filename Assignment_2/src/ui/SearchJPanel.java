/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.UberCars;
public class SearchJPanel extends javax.swing.JPanel {
    List<Car> cars;
    UberCars uberCar;
    public SearchJPanel(List<Car> cars,UberCars uberCar) {
       initComponents();
        this.cars=cars;
        this.uberCar=uberCar;
        visiblity(false);
        displayInfo(this.cars);
        fleetCatalogue(uberCar);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jRegisteredCarsTable = new javax.swing.JTable();
        cmbBasicFilter = new javax.swing.JComboBox<>();
        btnBasicSearch = new javax.swing.JButton();
        btnAdvanceFilter = new javax.swing.JButton();
        lblManufacturingName = new javax.swing.JLabel();
        cmbManufacturerName = new javax.swing.JComboBox<>();
        btnAdvanceManufacturerName = new javax.swing.JButton();
        lblManufacturingYear = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        lblSeats = new javax.swing.JLabel();
        btnAdvanceManufacturingYear = new javax.swing.JButton();
        btnAdvanceNumberOfSeats = new javax.swing.JButton();
        lblSerialNumber = new javax.swing.JLabel();
        txtManufacturingYear = new javax.swing.JTextField();
        btnAdvanceSerialNumber = new javax.swing.JButton();
        lblModelName = new javax.swing.JLabel();
        btnAdvanceModelName = new javax.swing.JButton();
        comboModelName = new javax.swing.JComboBox<>();
        lblAvailableCity = new javax.swing.JLabel();
        chckboxDelhi = new javax.swing.JCheckBox();
        chckboxMumbai = new javax.swing.JCheckBox();
        chckBoxBangalore = new javax.swing.JCheckBox();
        btnAdvanceAvailableCity = new javax.swing.JButton();
        lblAdvanceFilter = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        txtTotalCount = new javax.swing.JTextField();
        txtLastUpdatedDate = new javax.swing.JTextField();
        cmbMinimumNumberOfSeats = new javax.swing.JComboBox<>();
        cmbMaximumNumberOfSeats = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jRegisteredCarsTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jRegisteredCarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car Name", "Passenger Car", "Availablity", "Manufacturer Name", "Manufacturing Year", "Seats", "Serial Number", "Model Name", "City", "Maintainence Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jRegisteredCarsTable.setEnabled(false);
        jRegisteredCarsTable.setGridColor(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(jRegisteredCarsTable);

        cmbBasicFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First available passenger car", "Cars currently available ", "Cars currently not available", "Cars that have expired maintenance certificate", "Car manufacturers used by Uber" }));

        btnBasicSearch.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnBasicSearch.setText("Search");
        btnBasicSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBasicSearchActionPerformed(evt);
            }
        });

        btnAdvanceFilter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdvanceFilter.setForeground(new java.awt.Color(153, 0, 0));
        btnAdvanceFilter.setText("+ Advance Filters");
        btnAdvanceFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvanceFilterActionPerformed(evt);
            }
        });

        lblManufacturingName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblManufacturingName.setText("Manufacturer Name :");

        cmbManufacturerName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Audi", "BMW", "Bentley", "Toyota", " " }));

        btnAdvanceManufacturerName.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnAdvanceManufacturerName.setText("Search");
        btnAdvanceManufacturerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvanceManufacturerNameActionPerformed(evt);
            }
        });

        lblManufacturingYear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblManufacturingYear.setText("Manufacturing Year :");

        lblSeats.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSeats.setText("Number Of Seats :");

        btnAdvanceManufacturingYear.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnAdvanceManufacturingYear.setText("Search");
        btnAdvanceManufacturingYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvanceManufacturingYearActionPerformed(evt);
            }
        });

        btnAdvanceNumberOfSeats.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnAdvanceNumberOfSeats.setText("Search");
        btnAdvanceNumberOfSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvanceNumberOfSeatsActionPerformed(evt);
            }
        });

        lblSerialNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSerialNumber.setText("Serial Number :");

        btnAdvanceSerialNumber.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnAdvanceSerialNumber.setText("Search");
        btnAdvanceSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvanceSerialNumberActionPerformed(evt);
            }
        });

        lblModelName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblModelName.setText("Model Name :");

        btnAdvanceModelName.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnAdvanceModelName.setText("Search");
        btnAdvanceModelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvanceModelNameActionPerformed(evt);
            }
        });

        comboModelName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "A-Class", "A3", "A4", "Blazer", "Compass" }));

        lblAvailableCity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAvailableCity.setText("Available City :");

        chckboxDelhi.setText("Delhi");

        chckboxMumbai.setText("Mumbai");

        chckBoxBangalore.setText("Bangalore");

        btnAdvanceAvailableCity.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnAdvanceAvailableCity.setText("Search");
        btnAdvanceAvailableCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvanceAvailableCityActionPerformed(evt);
            }
        });

        lblAdvanceFilter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAdvanceFilter.setForeground(new java.awt.Color(102, 0, 0));
        lblAdvanceFilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdvanceFilter.setText("Advance Filter");
        lblAdvanceFilter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setEnabled(false);

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane3.setViewportView(jTextArea);

        txtTotalCount.setEditable(false);
        txtTotalCount.setText("jTextField1");

        txtLastUpdatedDate.setText("jTextField1");

        cmbMinimumNumberOfSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        cmbMaximumNumberOfSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "9", "8", "7", "6", "5", "4", "3", "2" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblModelName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAvailableCity, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(chckboxDelhi)
                                    .addGap(18, 18, 18)
                                    .addComponent(chckboxMumbai)
                                    .addGap(29, 29, 29)
                                    .addComponent(chckBoxBangalore))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboModelName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbManufacturerName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmbMinimumNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(84, 84, 84)
                                            .addComponent(cmbMaximumNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(10, 10, 10))))
                        .addComponent(lblSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblManufacturingYear))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblManufacturingName)
                        .addGap(310, 310, 310)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdvanceSerialNumber)
                    .addComponent(btnAdvanceManufacturerName)
                    .addComponent(btnAdvanceNumberOfSeats)
                    .addComponent(btnAdvanceManufacturingYear)
                    .addComponent(btnAdvanceModelName)
                    .addComponent(btnAdvanceAvailableCity))
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdvanceFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnBasicSearch)
                .addGap(26, 26, 26)
                .addComponent(cmbBasicFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtLastUpdatedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTotalCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdvanceFilter)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbBasicFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBasicSearch))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(txtLastUpdatedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdvanceFilter)
                    .addComponent(txtTotalCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(lblAdvanceFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManufacturingName)
                            .addComponent(cmbManufacturerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdvanceManufacturerName))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManufacturingYear)
                            .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAdvanceManufacturingYear, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeats, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdvanceNumberOfSeats)
                        .addComponent(cmbMinimumNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbMaximumNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdvanceSerialNumber))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelName)
                    .addComponent(comboModelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdvanceModelName))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailableCity)
                    .addComponent(chckboxDelhi)
                    .addComponent(chckboxMumbai)
                    .addComponent(chckBoxBangalore)
                    .addComponent(btnAdvanceAvailableCity))
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBasicSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBasicSearchActionPerformed
        visiblity(false);
        int selectedIndex=cmbBasicFilter.getSelectedIndex();
        List<Car>filteredCar=new ArrayList<>();
        if(selectedIndex==0)
        {
            for(Car car:cars)
            {
                if(car.getIsPassengerCar())
                {
                    filteredCar.add(car);
                    displayInfo(filteredCar);
                    return;
                }
            }
        }
        if(selectedIndex==1)
        {
            cars.stream().filter(car -> (car.getIsCarAvailable())).forEachOrdered(car -> {
                filteredCar.add(car);
            });
            txtTotalCount.setText("");
            txtTotalCount.setText("Total Count: "+String.valueOf(filteredCar.size()));
            txtTotalCount.setVisible(true);
        }
        if(selectedIndex == 2)
        {
            cars.stream().filter(car -> (!car.getIsCarAvailable())).forEachOrdered(car -> {
                filteredCar.add(car);
            });
            txtTotalCount.setText("");
            txtTotalCount.setText("Total Count: "+String.valueOf(filteredCar.size()));
            txtTotalCount.setVisible(true);
        }
        if(selectedIndex == 3)
        {
            cars.stream().filter(car -> (car.getMaintenanceCertificateDate().before(Calendar.getInstance().getTime()))).forEachOrdered(car -> {
                filteredCar.add(car);
            });
        }
        if(selectedIndex == 4)
        {
            List<String> manufacturerNames=new ArrayList<>();
            cars.forEach(car -> {
                manufacturerNames.add(car.getManufacturerName());
            });
             Set<String> set = new LinkedHashSet<>(manufacturerNames);
            manufacturerNames.clear();
            manufacturerNames.addAll(set);
             
            manufacturerNames.forEach(manufacturerName -> {
                jTextArea.append(" "+manufacturerName);
            });
            jTextArea.setVisible(true);
            return;
        }
       
        displayInfo(filteredCar);
    }//GEN-LAST:event_btnBasicSearchActionPerformed

    private void btnAdvanceFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvanceFilterActionPerformed
       visiblity(true);
       jTextArea.setVisible(false);
       txtTotalCount.setVisible(false);
    }//GEN-LAST:event_btnAdvanceFilterActionPerformed

    private void btnAdvanceManufacturerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvanceManufacturerNameActionPerformed

        List<Car>filteredAudi=new ArrayList<>();
        List<Car>filteredBmw=new ArrayList<>();
        List<Car>filteredBentley=new ArrayList<>();
        List<Car>filteredToyota=new ArrayList<>();
        cars.stream().map(car -> {
            if(car.getManufacturerName().toLowerCase().equals("audi"))
            {
                filteredAudi.add(car);
            }
            return car;
        }).map(car -> {
            if(car.getManufacturerName().toLowerCase().equals("bmw"))
            {
                filteredBmw.add(car);
            }
            return car;
        }).map(car -> {
            if(car.getManufacturerName().toLowerCase().equals("bentley"))
            {
                filteredBentley.add(car);
            }
            return car;
        }).filter(car -> (car.getManufacturerName().toLowerCase().equals("toyota"))).forEachOrdered(car -> {
            filteredToyota.add(car);
        });
        int selectedIndex=cmbManufacturerName.getSelectedIndex();
        if(selectedIndex == 0)
        {
            displayInfo(cars);
        }
        if(selectedIndex == 1)
        {
        displayInfo(filteredAudi);
        }
        if(selectedIndex == 2)
        {
        displayInfo(filteredBmw);
        }
        if(selectedIndex == 3)
        {
        displayInfo(filteredBentley);
        }
        if(selectedIndex == 4)
        {
        displayInfo(filteredToyota);
        }
    }//GEN-LAST:event_btnAdvanceManufacturerNameActionPerformed

    private void btnAdvanceManufacturingYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvanceManufacturingYearActionPerformed
        List<Car> filteredCar=new ArrayList<>();
        cars.stream().filter(car -> (String.valueOf(car.getManufacturingYear()).equals(txtManufacturingYear.getText()))).forEachOrdered(car -> {
            filteredCar.add(car);
        });
         displayInfo(filteredCar);
    }//GEN-LAST:event_btnAdvanceManufacturingYearActionPerformed

    private void btnAdvanceSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvanceSerialNumberActionPerformed
        List<Car> filteredCar=new ArrayList<>();
        cars.stream().filter(car -> (String.valueOf(car.getSerialNumber()).equals(txtSerialNumber.getText()))).forEachOrdered(car -> {
            filteredCar.add(car);
        });
         displayInfo(filteredCar);
    }//GEN-LAST:event_btnAdvanceSerialNumberActionPerformed

    private void btnAdvanceModelNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvanceModelNameActionPerformed
       List<Car>filteredAClass=new ArrayList<>();
        List<Car>filteredA3=new ArrayList<>();
        List<Car>filteredA4=new ArrayList<>();
        List<Car>Blazer=new ArrayList<>();
        List<Car>Compass=new ArrayList<>();
        cars.stream().map(car -> {
            if(car.getModelNumber().toLowerCase().equals("a-class"))
            {
                filteredAClass.add(car);
            }
            return car;
        }).map(car -> {
            if(car.getModelNumber().toLowerCase().equals("a3"))
            {
                filteredA3.add(car);
            }
            return car;
        }).map(car -> {
            if(car.getModelNumber().toLowerCase().equals("a4"))
            {
                filteredA4.add(car);
            }
            return car;
        }).map(car -> {
            if(car.getModelNumber().toLowerCase().equals("blazer"))
            {
                Blazer.add(car);
            }
            return car;
        }).filter(car -> (car.getModelNumber().toLowerCase().equals("compass"))).forEachOrdered(car -> {
            Compass.add(car);
        });
        int selectedIndex=comboModelName.getSelectedIndex();
        if(selectedIndex == 0)
        {
            displayInfo(cars);
        }
        if(selectedIndex == 1)
        {
        displayInfo(filteredAClass);
        }
        if(selectedIndex == 2)
        {
        displayInfo(filteredA3);
        }
        if(selectedIndex == 3)
        {
        displayInfo(filteredA4);
        }
        if(selectedIndex == 4)
        {
        displayInfo(Blazer);
        }
        if(selectedIndex == 5)
        {
        displayInfo(Compass);
        }
    }//GEN-LAST:event_btnAdvanceModelNameActionPerformed

    private void btnAdvanceAvailableCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvanceAvailableCityActionPerformed
        List<Car> filteredCar=new ArrayList<>();
        List<Car> filteredDelhi=new ArrayList<>();
        List<Car> filteredBangalore=new ArrayList<>();
        List<Car> filteredMumbai=new ArrayList<>();
        for(Car car : cars)
        {
            car.getAvailableCity().stream().map(city -> {
                if(city.toLowerCase().equals("delhi"))
                {
                    filteredDelhi.add(car);
                }
                return city;
            }).map(city -> {
                if(city.toLowerCase().equals("bangalore"))
                {
                    filteredBangalore.add(car);
                }
                return city;
            }).filter(city -> (city.toLowerCase().equals("mumbai"))).forEachOrdered(_item -> {
                filteredMumbai.add(car);
            });
        }
        if(chckboxDelhi.isSelected())
        {
            filteredCar.addAll(filteredDelhi);
        }
        if(chckboxMumbai.isSelected())
        {
            filteredCar.addAll(filteredMumbai);
        }
        if(chckBoxBangalore.isSelected())
        {
            filteredCar.addAll(filteredBangalore);
        }
        Set<Car> set = new LinkedHashSet<>(filteredCar);
        filteredCar.clear();
        filteredCar.addAll(set);
        displayInfo(filteredCar);
    }//GEN-LAST:event_btnAdvanceAvailableCityActionPerformed

    private void btnAdvanceNumberOfSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvanceNumberOfSeatsActionPerformed
        List<Car> filteredCar=new ArrayList<>();
        var minimumSeats=Integer.parseInt(cmbMinimumNumberOfSeats.getSelectedItem().toString());
        var maximumSeats=Integer.parseInt(cmbMaximumNumberOfSeats.getSelectedItem().toString());
        for(Car car :cars)
        {
            if(car.getNoOfSeats()>=minimumSeats && car.getNoOfSeats()< maximumSeats)
            {
                filteredCar.add(car);
            }
        }
        displayInfo(filteredCar);
    }//GEN-LAST:event_btnAdvanceNumberOfSeatsActionPerformed

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
        DefaultTableModel model1 = new DefaultTableModel(new Object[]{ "Car Name", "Passenger Car", "Availablity", "Manufacturer Name ",
                    "Manufacturing Year", "Seat", "Serial Number", "Model Name" ,"City","Maintainence Date"}, 0);
        jRegisteredCarsTable.setModel(model1);
         JOptionPane.showMessageDialog(this,"No Data Available To Show");
    }
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(this,"Please enter data before searching");
    }
        
    }
private void visiblity(boolean value)
{
     lblAdvanceFilter.setVisible(value);
     lblManufacturingName.setVisible(value);
     cmbManufacturerName.setVisible(value);
     btnAdvanceManufacturerName.setVisible(value);
     lblManufacturingYear.setVisible(value);
     txtManufacturingYear.setVisible(value);
     btnAdvanceManufacturingYear.setVisible(value);
     lblSeats.setVisible(value);
     cmbMinimumNumberOfSeats.setVisible(value);
     cmbMaximumNumberOfSeats.setVisible(value);
     btnAdvanceNumberOfSeats.setVisible(value);
     lblSerialNumber.setVisible(value);
     txtSerialNumber.setVisible(value);
     btnAdvanceSerialNumber.setVisible(value);
     lblModelName.setVisible(value);
     comboModelName.setVisible(value);
     btnAdvanceModelName.setVisible(value);
     lblAvailableCity.setVisible(value);
     chckboxDelhi.setVisible(value);
     chckboxMumbai.setVisible(value);
     chckBoxBangalore.setVisible(value);
     btnAdvanceAvailableCity.setVisible(value);
     jTextArea.setVisible(value);
     txtTotalCount.setVisible(value);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdvanceAvailableCity;
    private javax.swing.JButton btnAdvanceFilter;
    private javax.swing.JButton btnAdvanceManufacturerName;
    private javax.swing.JButton btnAdvanceManufacturingYear;
    private javax.swing.JButton btnAdvanceModelName;
    private javax.swing.JButton btnAdvanceNumberOfSeats;
    private javax.swing.JButton btnAdvanceSerialNumber;
    private javax.swing.JButton btnBasicSearch;
    private javax.swing.JCheckBox chckBoxBangalore;
    private javax.swing.JCheckBox chckboxDelhi;
    private javax.swing.JCheckBox chckboxMumbai;
    private javax.swing.JComboBox<String> cmbBasicFilter;
    private javax.swing.JComboBox<String> cmbManufacturerName;
    private javax.swing.JComboBox<String> cmbMaximumNumberOfSeats;
    private javax.swing.JComboBox<String> cmbMinimumNumberOfSeats;
    private javax.swing.JComboBox<String> comboModelName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jRegisteredCarsTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JLabel lblAdvanceFilter;
    private javax.swing.JLabel lblAvailableCity;
    private javax.swing.JLabel lblManufacturingName;
    private javax.swing.JLabel lblManufacturingYear;
    private javax.swing.JLabel lblModelName;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JTextField txtLastUpdatedDate;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtTotalCount;
    // End of variables declaration//GEN-END:variables

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
}

