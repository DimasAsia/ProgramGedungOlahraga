/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lapangan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;


/**
 *
 * @author User
 */
public class futsal extends javax.swing.JFrame {
    int x =0;
     
    DefaultTableModel tabel = new DefaultTableModel();
    
    public ArrayList lpgn = new ArrayList();
    public ArrayList tgl = new ArrayList();
    public ArrayList wkt = new ArrayList();
    public ArrayList name = new ArrayList();
    public ArrayList nomor = new ArrayList();
    public ArrayList pilih = new ArrayList();
    
    /**
     * Creates new form futsal
     */
    
    public futsal(int pilihan){
        initComponents();
        
        if(pilihan == 1){
            lapangan.removeAllItems();
            lapangan.addItem("");
            lapangan.addItem("futsal01");
            lapangan.addItem("futsal02");
            lapangan.addItem("futsal03");
            pilih.add("Futsal");
        }else if(pilihan == 2){
            lapangan.removeAllItems();
            lapangan.addItem("");
            lapangan.addItem("badminton01");
            lapangan.addItem("badminton02");
            pilih.add("Badminton");
        }else if(pilihan == 3){
            lapangan.removeAllItems();
            lapangan.addItem("");
            lapangan.addItem("basket01");
            lapangan.addItem("basket02");
            lapangan.addItem("basket03");
            pilih.add("Basket");
        }
    }
   
    private void setTanggal(){
        for (int a=1; a<=31; a++){
            tanggal.addItem(a);
        } // tanggal
        
        bulan.addItem("Januari");
        bulan.addItem("Februari"); // bulan 
        bulan.addItem("Maret");
        bulan.addItem("April");
        bulan.addItem("Mei");
        bulan.addItem("Juni");
        bulan.addItem("Juli");
        bulan.addItem("Agustus");
        bulan.addItem("September");
        bulan.addItem("Oktober");  
        bulan.addItem("November");
        bulan.addItem("Desember");
        
        for (int b=2021; b<=2030; b++){
            tahun.addItem(b);        // tahun
        }
    }
    
    private void setMulai(){
        mulai.addItem("08.00");
        mulai.addItem("09.00");
        mulai.addItem("10.00");
        mulai.addItem("11.00");
        mulai.addItem("12.00");
        mulai.addItem("13.00");
        mulai.addItem("14.00");
        mulai.addItem("15.00");
        mulai.addItem("16.00");
        mulai.addItem("17.00");
        mulai.addItem("18.00");
        mulai.addItem("19.00");
        mulai.addItem("20.00");
        mulai.addItem("21.00");
        
    }
    
    private void setWaktu(){
        int pilihan = mulai.getSelectedIndex();
        if(pilihan == 1){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("09.00");
            selesai.addItem("10.00");
            selesai.addItem("11.00");
            selesai.addItem("12.00");
            selesai.addItem("13.00");
            selesai.addItem("14.00");
            selesai.addItem("15.00");
            selesai.addItem("16.00");
            selesai.addItem("17.00");
            selesai.addItem("18.00");
            selesai.addItem("19.00");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 2){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("10.00");
            selesai.addItem("11.00");
            selesai.addItem("12.00");
            selesai.addItem("13.00");
            selesai.addItem("14.00");
            selesai.addItem("15.00");
            selesai.addItem("16.00");
            selesai.addItem("17.00");
            selesai.addItem("18.00");
            selesai.addItem("19.00");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 3){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("11.00");
            selesai.addItem("12.00");
            selesai.addItem("13.00");
            selesai.addItem("14.00");
            selesai.addItem("15.00");
            selesai.addItem("16.00");
            selesai.addItem("17.00");
            selesai.addItem("18.00");
            selesai.addItem("19.00");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 4){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("12.00");
            selesai.addItem("13.00");
            selesai.addItem("14.00");
            selesai.addItem("15.00");
            selesai.addItem("16.00");
            selesai.addItem("17.00");
            selesai.addItem("18.00");
            selesai.addItem("19.00");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 5){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("13.00");
            selesai.addItem("14.00");
            selesai.addItem("15.00");
            selesai.addItem("16.00");
            selesai.addItem("17.00");
            selesai.addItem("18.00");
            selesai.addItem("19.00");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 6){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("14.00");
            selesai.addItem("15.00");
            selesai.addItem("16.00");
            selesai.addItem("17.00");
            selesai.addItem("18.00");
            selesai.addItem("19.00");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 7){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("15.00");
            selesai.addItem("16.00");
            selesai.addItem("17.00");
            selesai.addItem("18.00");
            selesai.addItem("19.00");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 8){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("16.00");
            selesai.addItem("17.00");
            selesai.addItem("18.00");
            selesai.addItem("19.00");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 9){
            selesai.removeAllItems();
            selesai.addItem("17.00");
            selesai.addItem("18.00");
            selesai.addItem("19.00");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 10){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("18.00");
            selesai.addItem("19.00");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 11){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("19.00");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 12){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("20.00");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 13){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("21.00");
            selesai.addItem("22.00");
        }else if(pilihan == 14){
            selesai.removeAllItems();
            selesai.addItem("Selesai");
            selesai.addItem("22.00");
        }
    }
    
    private void tabel(){
        tabel.addColumn("Lapangan");
        tabel.addColumn("Tanggal");
        tabel.addColumn("Waktu");
        tabel.addColumn("Nama");
        tabel.addColumn("HP");
        
        tabelhasil.setModel(tabel);
        
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
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lapangan = new javax.swing.JComboBox<>();
        tanggal = new javax.swing.JComboBox();
        bulan = new javax.swing.JComboBox<>();
        tahun = new javax.swing.JComboBox();
        nama = new javax.swing.JTextField();
        hp = new javax.swing.JTextField();
        mulai = new javax.swing.JComboBox<>();
        selesai = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        pesan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelhasil = new javax.swing.JTable();
        back = new javax.swing.JButton();
        cetak = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblBarang);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Program Booking Gedung Olah Raga");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Lapangan");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 89, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Tanggal Pemesanan");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 127, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Waktu");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 165, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Nama Pemesan");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 203, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("No Handphone");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 241, -1, -1));

        lapangan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lapangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        lapangan.setMinimumSize(new java.awt.Dimension(76, 20));
        lapangan.setPreferredSize(new java.awt.Dimension(76, 20));
        lapangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapanganActionPerformed(evt);
            }
        });
        getContentPane().add(lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 89, 245, -1));

        tanggal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tanggal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tanggal" }));
        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 128, 70, -1));

        bulan.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan" }));
        bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulanActionPerformed(evt);
            }
        });
        getContentPane().add(bulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 128, 70, -1));

        tahun.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tahun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tahun" }));
        tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahunActionPerformed(evt);
            }
        });
        getContentPane().add(tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 128, 70, -1));

        nama.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 203, 245, -1));

        hp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 241, 245, -1));

        mulai.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        mulai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mulai" }));
        mulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiActionPerformed(evt);
            }
        });
        getContentPane().add(mulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 166, 70, -1));

        selesai.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        selesai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selesai" }));
        selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiActionPerformed(evt);
            }
        });
        getContentPane().add(selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 166, 70, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("sampai");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 165, -1, -1));

        pesan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pesan.setText("Order");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });
        getContentPane().add(pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 289, -1, -1));

        hapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hapus.setText("Clear");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 289, -1, -1));

        tabelhasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Lapangan", "Tanggal", "Waktu", "Nama", "HP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelhasil);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 366, 561, 106));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 504, -1, -1));

        cetak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cetak.setText("Print");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        getContentPane().add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 289, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\futsal\\src\\main\\java\\com\\mycompany\\futsal\\wallpaper-1600-29.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed
        // TODO add your handling code here:
        String lapanganitem = lapangan.getSelectedItem().toString();
        String tanggalitem = (tanggal.getSelectedItem().toString() + " " + bulan.getSelectedItem().toString() + " " + tahun.getSelectedItem().toString());
        String waktuitem = (mulai.getSelectedItem().toString()+ " - " + selesai.getSelectedItem().toString() );
        if(tgl.isEmpty()==true){
            if(tanggal.getSelectedItem().toString().equals("Tanggal") || bulan.getSelectedItem().toString().equals("Bulan") || tahun.getSelectedItem().toString().equals("Tahun") || mulai.getSelectedItem().toString().equals("Mulai") || selesai.getSelectedItem().toString().equals("Selesai")){
                JOptionPane.showMessageDialog(null, "Pilihanmu sing bener gblg!");

            }else{
                lpgn.add(lapanganitem);
                tgl.add(tanggalitem);
                wkt.add(waktuitem);
                name.add(nama.getText());
                nomor.add(hp.getText());

                tabel();
                for(int n = 0; n<lpgn.size(); n++){
                    tabel.addRow(new Object[]{
                        lpgn.get(n),
                        tgl.get(n),
                        wkt.get(n),
                        name.get(n),
                        nomor.get(n),
                    });
                }
            }
        }else{
            for(int i=0; i<tgl.size(); i++){
                if(tgl.get(i).equals(tanggalitem)){
                    for(int j=0; j<tgl.size(); j++){
                        if(wkt.get(j).equals(waktuitem)){
                            JOptionPane.showMessageDialog(null, "Sudah ada yang Booking silahkan ganti waktu anda!");
                            
                            break;
                        }else if(mulai.getSelectedItem().toString().equals("Mulai") || selesai.getSelectedItem().toString().equals("Selesai")){
                            JOptionPane.showMessageDialog(null, "Pilih jam sing bener gblg!");

                            break;
                        }else{
                            lpgn.add(lapanganitem);
                            tgl.add(tanggalitem);
                            wkt.add(waktuitem);
                            name.add(nama.getText());
                            nomor.add(hp.getText());
                            for(int n = 0; n<lpgn.size(); n++){
                                if(wkt.get(n).equals(waktuitem)){
                                    tabel.addRow(new Object[]{
                                    lpgn.get(n),
                                    tgl.get(n),
                                    wkt.get(n),
                                    name.get(n),
                                    nomor.get(n),
                                    });
                                }
                            }
                            break;
                        }
                    }
                    break;
                }else if(tanggal.getSelectedItem().toString().equals("Tanggal") || bulan.getSelectedItem().toString().equals("Bulan") || tahun.getSelectedItem().toString().equals("Tahun")){
                    JOptionPane.showMessageDialog(null, "Pilih tanggal sing bener gblg!");
                            
                    break;
                }else{
                    lpgn.add(lapanganitem);
                    tgl.add(tanggalitem);
                    wkt.add(waktuitem);
                    name.add(nama.getText());
                    nomor.add(hp.getText());
                    
                    for(int n = 0; n<lpgn.size(); n++){
                        if(tgl.get(n).equals(tanggalitem)){
                            tabel.addRow(new Object[]{
                            lpgn.get(n),
                            tgl.get(n),
                            wkt.get(n),
                            name.get(n),
                            nomor.get(n),
                            });
                        }
                    }
                    break;
                }
            }
            
        }
        lapangan.setSelectedIndex(0);
        tanggal.setSelectedIndex(0);
        bulan.setSelectedIndex(0);
        tahun.setSelectedIndex(0);
        mulai.setSelectedIndex(0);
        selesai.setSelectedIndex(0);
        nama.setText("");
        hp.setText("");
        
    }//GEN-LAST:event_pesanActionPerformed

        
    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        // TODO add your handling code here:
        setMulai();
    }//GEN-LAST:event_tanggalActionPerformed

    private void bulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulanActionPerformed
        // TODO add your handling code here:
        setMulai();
    }//GEN-LAST:event_bulanActionPerformed

    private void tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahunActionPerformed
        // TODO add your handling code here:
        setMulai();
    }//GEN-LAST:event_tahunActionPerformed

    private void mulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulaiActionPerformed
        // TODO add your handling code here:
        setWaktu();
    }//GEN-LAST:event_mulaiActionPerformed

    private void selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selesaiActionPerformed

    private void lapanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapanganActionPerformed
        // TODO add your handling code here:
        setTanggal();
    }//GEN-LAST:event_lapanganActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        tabel.removeRow(tabelhasil.getSelectedRow());
    }//GEN-LAST:event_hapusActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new mainpage().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        // TODO add your handling code here:
        int i = tabelhasil.getSelectedRow();
        
       
        String gedung = pilih.get(0).toString();
        String lapang = tabelhasil.getValueAt(i, 0).toString();
        String tanggal = tabelhasil.getValueAt(i, 1).toString();
        String waktu = tabelhasil.getValueAt(i, 2).toString();
        String nama = tabelhasil.getValueAt(i, 3).toString();
        String hp = tabelhasil.getValueAt(i, 4).toString();
        
        try {
        File myObj = new File("Struct.txt");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        }else {
            System.out.println("File already exists.");
        }
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
         
        try {
            FileWriter myWriter = new FileWriter("Struck.txt");
            
            myWriter.write("=====================================\n");
            myWriter.write("   STRUK PEMBOOKINGAN GOR SIDOARJO\n");
            myWriter.write("=====================================\n\n");
            myWriter.write("\tGedung Olahraga Sidoarjo\n");
            
            myWriter.write("\nGedung \t\t\t : " + gedung);
            myWriter.write("\nLapangan \t\t : " + lapang);
            myWriter.write("\nTanggal Pemesanan \t : " + tanggal);
            myWriter.write("\nWaktu \t\t\t : " + waktu);
            myWriter.write("\nNama Pemesan \t\t : " + nama);
            myWriter.write("\nNo Handphone \t\t : " + hp);
            
            myWriter.write("\n\n=====================================\n");
            myWriter.write("\t   Terimakasih\n");
            myWriter.write("=====================================\n");
            myWriter.close();
            JOptionPane.showMessageDialog(null, "Data berhasil di cetak !");
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_cetakActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> bulan;
    private javax.swing.JButton cetak;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> lapangan;
    private javax.swing.JComboBox<String> mulai;
    private javax.swing.JTextField nama;
    private javax.swing.JButton pesan;
    private javax.swing.JComboBox<String> selesai;
    private javax.swing.JTable tabelhasil;
    private javax.swing.JComboBox tahun;
    private javax.swing.JComboBox tanggal;
    private javax.swing.JTable tblBarang;
    // End of variables declaration//GEN-END:variables


}
