/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faraid.application;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WINDOWS
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    public calculator() {
        initComponents();
        setResizable(false);
        setTitle("Faraidh Application");
        txwarisan.setEditable(false);
        tableX.setModel(datax);
        datax.addColumn("No");
        datax.addColumn("Ahli waris");
        datax.addColumn("Bagian");
        datax.addColumn("Warisan diterima");
        txlakilaki.setEditable(true);
        txperempuan.setEditable(true);
        txsisa.setEditable(false);
    }
     private DefaultTableModel datax= new DefaultTableModel();
     private long harta;
     private long hutang;
     private long pengurusanjenazah;
     private long lainlain;
     private double warisanbersih;
     private double suami;
     private double istri;
     private double ayah;
     private double ibu;
     private double anaklaki;
     private double anakperempuan;
     private double sisa;
     private int jumlahanaklaki;
     private int jumlahanakperempuan;
     private String bagiansuami;
     private String bagianistri;
     private String bagianayah;
     private String bagianibu;
     private String bagiananaklaki;
     private String bagiananakperempuan;
     private int no =0;

    public String getBagiananaklaki() {
        return bagiananaklaki;
    }

    public void setBagiananaklaki(String bagiananaklaki) {
        this.bagiananaklaki = bagiananaklaki;
    }

    public String getBagiananakperempuan() {
        return bagiananakperempuan;
    }

    public void setBagiananakperempuan(String bagiananakperempuan) {
        this.bagiananakperempuan = bagiananakperempuan;
    }

    public String getBagianayah() {
        return bagianayah;
    }

    public void setBagianayah(String bagianayah) {
        this.bagianayah = bagianayah;
    }

    public String getBagianibu() {
        return bagianibu;
    }

    public void setBagianibu(String bagianibu) {
        this.bagianibu = bagianibu;
    }
     

    public String getBagianistri() {
        return bagianistri;
    }

    public void setBagianistri(String bagianistri) {
        this.bagianistri = bagianistri;
    }

    public String getBagiansuami() {
        return bagiansuami;
    }

    public void setBagiansuami(String bagiansuami) {
        this.bagiansuami = bagiansuami;
    }

    public long getJumlahanaklaki() {
        return jumlahanaklaki;
    }

    public void setJumlahanaklaki(int jumlahanaklaki) {
        this.jumlahanaklaki = jumlahanaklaki;
    }

    public long getJumlahanakperempuan() {
        return jumlahanakperempuan;
    }

    public void setJumlahanakperempuan(int jumlahanakperempuan) {
        this.jumlahanakperempuan = jumlahanakperempuan;
    }
     

    public double getSisa() {
        return sisa;
    }

    public void setSisa(double sisa) {
        this.sisa = sisa;
    }

    public double getSuami() {
        return suami;
    }

    public void setSuami(double hartawarisanbersih) {
        if(getJumlahanaklaki()==0&&getJumlahanakperempuan()==0){
            setBagiansuami("1/2");
            this.suami=hartawarisanbersih/2;
            double sisax=getSisa();
            sisax-=getSuami();
            setSisa( sisax);
            
        }else if(getJumlahanaklaki()!=0||getJumlahanakperempuan()!=0){
            setBagiansuami("1/4");
            this.suami=hartawarisanbersih/4;
            double sisax=getSisa();
            sisax-=getSuami();
            setSisa( sisax);
        }
    
    }

    public double getIstri() {
        return istri;
    }

    public void setIstri(double hartawarisanbersih) {
          if(getJumlahanaklaki()==0&&getJumlahanakperempuan()==0){
            setBagianistri("1/4");
            this.istri=hartawarisanbersih/4;
            double sisax=getSisa();
            sisax-=getIstri();
            setSisa( sisax);
        }else if(getJumlahanaklaki()!=0||getJumlahanakperempuan()!=0){
            setBagianistri("1/8");
            this.istri=hartawarisanbersih/8;
            double sisax=getSisa();
            sisax-=getIstri();
            setSisa( sisax);
        }
    }

    public double getAyah() {
        return ayah;
    }

    public void setAyah(double hartawarisanbersih) {
         if(getJumlahanaklaki()==0&&getJumlahanakperempuan()==0){
            setBagianayah("Asabah");
            this.ayah=getSisa();
            double sisax=getSisa();
            sisax-=getAyah();
            setSisa( sisax);
        }else if(getJumlahanaklaki()!=0||getJumlahanakperempuan()!=0){
            setBagianayah("1/6");
            this.ayah=hartawarisanbersih/6;
            double sisax=getSisa();
            sisax-=getAyah();
            setSisa( sisax);
        }
    }

    public double getIbu() {
        return ibu;
    }

    public void setIbu(double hartawarisanbersih) {
          if(getJumlahanaklaki()==0&&getJumlahanakperempuan()==0){
            setBagianibu("1/3");
            this.ibu=hartawarisanbersih/3;
            double sisax=getSisa();
            sisax-=getIbu();
            setSisa( sisax);
        }else if(getJumlahanaklaki()!=0||getJumlahanakperempuan()!=0){
            setBagianibu("1/6");
            this.ibu=hartawarisanbersih/6;
            double sisax=getSisa();
            sisax-=getIbu();
            setSisa( sisax);
        }
    }

    public double getAnaklaki() {
        return anaklaki;
    }

    public void setAnaklaki(double warisanbersih) {
        if(getJumlahanaklaki()==1&&getJumlahanakperempuan()==0){
            this.anaklaki = getSisa();
            setBagiananaklaki("Asabah");
            double sisax=getSisa();
            sisax-=getAnaklaki();
            setSisa( sisax);
        }else if(getJumlahanaklaki()>1&&getJumlahanakperempuan()==0){
            this.anaklaki=getSisa()/getJumlahanaklaki();
            double x=getAnaklaki()*getJumlahanaklaki();
            setBagiananaklaki("Asabah");
            double sisax=getSisa();
            sisax-=x;
            setSisa( sisax);
        }else if(getJumlahanaklaki()>=1&&getJumlahanakperempuan()>=1){
            setBagiananaklaki("Asabah");
            double sisabagian=getSisa()/((2*getJumlahanaklaki())+getJumlahanakperempuan());
            this.anaklaki=2*sisabagian;
            double sisax=getSisa();
            setSisa( sisax);
        }
        
    }

    public double getAnakperempuan() {
        return anakperempuan;
    }

    public void setAnakperempuan(double anakperempuan) {
       if(getJumlahanaklaki()==0&&getJumlahanakperempuan()==1){
           setBagiananakperempuan("1/2");
           this.anakperempuan=getWarisanbersih()/2;
           double sisax=getSisa();
           sisax-=getAnakperempuan();
           setSisa( sisax);
       }else if(getJumlahanaklaki()==0&&getJumlahanakperempuan()>1){
           setBagiananakperempuan("2/3");
           this.anakperempuan=((getWarisanbersih()*2)/3)/getJumlahanakperempuan();
           double sisax=getSisa();
           double x=getAnakperempuan()*jumlahanakperempuan;
           sisax-=x;
           setSisa( sisax);
       }else if(getJumlahanaklaki()>=1&&getJumlahanakperempuan()>=1){
           setBagiananakperempuan("Asabah");
           double sisabagian=getSisa()/((2*getJumlahanaklaki())+getJumlahanakperempuan());
           this.anakperempuan=sisabagian;
           double x=(getJumlahanaklaki()*getAnaklaki())+(getJumlahanakperempuan()*getAnakperempuan());
           double sisax=getSisa();
            sisax-=x;
            setSisa( sisax);
       }
    }
  
    public long getHutang() {
        return hutang;
    }

    public void setHutang(long hutang) {
        this.hutang = hutang;
    }
     

    public long getHarta() {
        return harta;
    }

    public void setHarta(long harta) {
        this.harta = harta;
    }

    public long getPengurusanjenazah() {
        return pengurusanjenazah;
    }

    public void setPengurusanjenazah(long pengurusanjenazah) {
        this.pengurusanjenazah = pengurusanjenazah;
    }

    public long getLainlain() {
        return lainlain;
    }

    public void setLainlain(long lainlain) {
        this.lainlain = lainlain;
    }

    public double getWarisanbersih() {
        return warisanbersih;
    }

    public void setWarisanbersih(long warisanbersih) {
        this.warisanbersih = warisanbersih;
    }
    
    public void reset1(){
      txharta.setText(null);
      txhutang.setText(null);
      txjenazah.setText(null);
      txlain.setText(null);
      txwarisan.setText(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        muwarrits = new javax.swing.ButtonGroup();
        pasangan = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txharta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txhutang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txlain = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txjenazah = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txwarisan = new javax.swing.JTextField();
        btnhitung1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableX = new javax.swing.JTable();
        btnreset1 = new javax.swing.JButton();
        rdperempuan = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        rdlaki = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rdsuami = new javax.swing.JRadioButton();
        rdistri = new javax.swing.JRadioButton();
        rdayah = new javax.swing.JRadioButton();
        rdibu = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnhitung2 = new javax.swing.JButton();
        txperempuan = new javax.swing.JTextField();
        txlakilaki = new javax.swing.JTextField();
        btnreset2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txsisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calculator");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(443, 443, 443))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ahli waris                   :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));
        jPanel1.add(txharta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 197, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Rp");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Jumlah hutang               :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("( Optional )");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Rp");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        txhutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txhutangActionPerformed(evt);
            }
        });
        jPanel1.add(txhutang, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 197, 28));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Pengurusan Jenazah    :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Rp");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        txlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txlainActionPerformed(evt);
            }
        });
        jPanel1.add(txlain, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 200, 28));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Lain  lain                         :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Rp");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        txjenazah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txjenazahActionPerformed(evt);
            }
        });
        jPanel1.add(txjenazah, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 200, 28));

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel11.setText("( Optional )");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Sisa        :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Rp");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 660, -1, -1));
        jPanel1.add(txwarisan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 200, 28));

        btnhitung1.setBackground(new java.awt.Color(0, 153, 51));
        btnhitung1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhitung1.setForeground(new java.awt.Color(255, 255, 255));
        btnhitung1.setText("Hitung");
        btnhitung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitung1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnhitung1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 104, 35));

        tableX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Ahli waris", "Bagian", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableX.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tableX.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(tableX);
        if (tableX.getColumnModel().getColumnCount() > 0) {
            tableX.getColumnModel().getColumn(0).setResizable(false);
            tableX.getColumnModel().getColumn(1).setResizable(false);
            tableX.getColumnModel().getColumn(2).setResizable(false);
            tableX.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 475, 1020, 160));

        btnreset1.setBackground(new java.awt.Color(0, 153, 51));
        btnreset1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnreset1.setForeground(new java.awt.Color(255, 255, 255));
        btnreset1.setText("Reset");
        btnreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 104, 35));

        muwarrits.add(rdperempuan);
        rdperempuan.setText("Perempuan");
        rdperempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdperempuanActionPerformed(evt);
            }
        });
        jPanel1.add(rdperempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Jumlah harta                  :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        muwarrits.add(rdlaki);
        rdlaki.setSelected(true);
        rdlaki.setText("Laki - laki");
        rdlaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlakiActionPerformed(evt);
            }
        });
        jPanel1.add(rdlaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel15.setText("( yang meinggal )");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Muwarrits                 :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 136, -1, -1));

        rdsuami.setText("Suami");
        rdsuami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdsuamiActionPerformed(evt);
            }
        });
        jPanel1.add(rdsuami, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 70, 30));

        rdistri.setText("Istri");
        rdistri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdistriActionPerformed(evt);
            }
        });
        jPanel1.add(rdistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 60, 30));

        rdayah.setText("Ayah");
        rdayah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdayahActionPerformed(evt);
            }
        });
        jPanel1.add(rdayah, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 50, 30));

        rdibu.setText("Ibu");
        jPanel1.add(rdibu, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 50, 30));

        jLabel17.setText("Anak Laki - laki ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, -1, -1));

        jLabel18.setText("Anak Perempuan");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, -1, -1));

        btnhitung2.setBackground(new java.awt.Color(0, 153, 51));
        btnhitung2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhitung2.setForeground(new java.awt.Color(255, 255, 255));
        btnhitung2.setText("Hitung");
        btnhitung2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitung2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnhitung2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 405, 104, 30));

        txperempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txperempuanActionPerformed(evt);
            }
        });
        jPanel1.add(txperempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, 160, 30));

        txlakilaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txlakilakiActionPerformed(evt);
            }
        });
        jPanel1.add(txlakilaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, 160, 30));

        btnreset2.setBackground(new java.awt.Color(0, 153, 51));
        btnreset2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnreset2.setForeground(new java.awt.Color(255, 255, 255));
        btnreset2.setText("Reset");
        btnreset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, 104, 35));

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel19.setText("( Optional )");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText(" Warisan bersih             :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Rp");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        txsisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txsisaActionPerformed(evt);
            }
        });
        jPanel1.add(txsisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 650, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1083, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhitung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitung1ActionPerformed
    try{
    
    
    setHarta(Integer.parseInt(txharta.getText()));
    if(!txhutang.getText().equals("")){
        setHutang(Integer.parseInt(txhutang.getText()));
    }else{
        setHutang(0);
    }
    if(!txjenazah.getText().equals("")){
        setPengurusanjenazah(Integer.parseInt(txjenazah.getText()));
    }else{
        setPengurusanjenazah(0);
    }
    if(!txlain.getText().equals("")){
        setLainlain(Integer.parseInt(txlain.getText()));
    }else{
        setLainlain(0);
    }
    
    long warisan=getHarta()-getHutang()-getPengurusanjenazah()-getLainlain();
    setWarisanbersih(warisan);
    txwarisan.setText(""+warisan);
    }catch(NumberFormatException ex){
        reset1();
        JOptionPane.showMessageDialog(null,"Mohon isi data dengan benar");
        
    }
    }//GEN-LAST:event_btnhitung1ActionPerformed

    private void btnreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset1ActionPerformed
      reset1();
        
    }//GEN-LAST:event_btnreset1ActionPerformed

    private void rdperempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdperempuanActionPerformed
       
    }//GEN-LAST:event_rdperempuanActionPerformed

    private void rdsuamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdsuamiActionPerformed
     
    }//GEN-LAST:event_rdsuamiActionPerformed

    private void rdlakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlakiActionPerformed
      
    }//GEN-LAST:event_rdlakiActionPerformed

    private void rdayahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdayahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdayahActionPerformed

    private void btnhitung2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitung2ActionPerformed
       try{
           
       if(!txwarisan.getText().equals("")){ 
           setSisa((long) getWarisanbersih());
       
           if(txlakilaki.getText().equals("")&&txperempuan.getText().equals("")){
              setJumlahanaklaki(0);
              setJumlahanakperempuan(0);
          }else if(!txlakilaki.getText().equals("")&&txperempuan.getText().equals("")){
              int a=Integer.parseInt(txlakilaki.getText());
              setJumlahanaklaki(a);
              setJumlahanakperempuan(0);
          }else if(txlakilaki.getText().equals("")&&!txperempuan.getText().equals("")){
               int a=Integer.parseInt(txperempuan.getText());
              setJumlahanaklaki(0);
              setJumlahanakperempuan(a);
          }else if (!txlakilaki.getText().equals("")&&!txperempuan.getText().equals("")){
              int a=Integer.parseInt(txlakilaki.getText());
              int b=Integer.parseInt(txperempuan.getText());
              setJumlahanaklaki(a);
              setJumlahanakperempuan(b);
          }
           
       if (rdsuami.isSelected()){
           
           setSuami((long) getWarisanbersih());
           no++;
           Object [] suamiobj = { no,"Suami",getBagiansuami(),getSuami()};
           datax.addRow(suamiobj);
       }else{
           this.suami=0;
       }
      
       if (rdistri.isSelected()){
           
           setIstri((long) getWarisanbersih());
           no++;
           Object [] istriobj = { no, " Istri", getBagianistri(),getIstri()};
           datax.addRow(istriobj);
           
       }else{
           this.istri=0;
       }
       
       if (rdibu.isSelected()){
           no++;
           setIbu((long) getWarisanbersih());
           Object [] ibuobj = {no,"Ibu",getBagianibu(),getIbu()};
           datax.addRow(ibuobj);
       }else{
           this.ibu=0;
       }
       
       if (rdayah.isSelected()){
        no++;
        setAyah((long) getWarisanbersih());
         Object [] ayahobj = {no, "Ayah",getBagianayah(),getAyah()};
         datax.addRow(ayahobj);
       }else{
           this.ayah=0;
       }
       
       
       if(txlakilaki.getText().equals("")){
           setJumlahanaklaki(0);
       }else{
           no++;
           setAnaklaki((long) warisanbersih);           
           Object [] anaklakiobj = {no,"Anak Laki-laki",getBagiananaklaki(),getAnaklaki()};
           for (int i = 0; i < getJumlahanaklaki(); i++) {
            datax.addRow(anaklakiobj);   
           }
           
          
       }
      
       if(txperempuan.getText().equals("")){
          setJumlahanakperempuan(0);
       }else{
           no++;
          setAnakperempuan(warisanbersih);
          Object [] anakperempuanobj={no,"Anak Perempuan",getBagiananakperempuan(),getAnakperempuan()};
          for (int i = 0; i < getJumlahanakperempuan(); i++) {
               datax.addRow(anakperempuanobj);
           }
          
           
       
       }
       
       
       }else{
           JOptionPane.showMessageDialog(null,"Silahkan isi data dengan lengkap");
       }
      
       
       
       btnhitung2.setEnabled(false);
       txsisa.setText(""+getSisa());
           setSisa(0);
           no=0;
       } catch (NumberFormatException ex){
           JOptionPane.showMessageDialog(null,"Mohon isi data dengan benar");
       }
       
    }//GEN-LAST:event_btnhitung2ActionPerformed

    private void rdistriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdistriActionPerformed
     
    }//GEN-LAST:event_rdistriActionPerformed

    private void txhutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txhutangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txhutangActionPerformed

    private void txlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txlainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txlainActionPerformed

    private void btnreset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset2ActionPerformed
        datax.setRowCount(0);
        txlakilaki.setText("");
        txperempuan.setText("");
        btnhitung2.setEnabled(true);
    }//GEN-LAST:event_btnreset2ActionPerformed

    private void txjenazahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txjenazahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txjenazahActionPerformed

    private void txperempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txperempuanActionPerformed
       if(!txperempuan.getText().equals("")){
        int x = Integer.parseInt(txperempuan.getText());
            setJumlahanakperempuan(x);
        }else{
            setJumlahanakperempuan(0);
        }
    }//GEN-LAST:event_txperempuanActionPerformed

    private void txlakilakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txlakilakiActionPerformed
        if(!txlakilaki.getText().equals("")){
        int x = Integer.parseInt(txlakilaki.getText());
            setJumlahanaklaki(x);
        }else{
            setJumlahanaklaki(0);
        }
    }//GEN-LAST:event_txlakilakiActionPerformed

    private void txsisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txsisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txsisaActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhitung1;
    private javax.swing.JButton btnhitung2;
    private javax.swing.JButton btnreset1;
    private javax.swing.JButton btnreset2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup muwarrits;
    private javax.swing.ButtonGroup pasangan;
    private javax.swing.JRadioButton rdayah;
    private javax.swing.JRadioButton rdibu;
    private javax.swing.JRadioButton rdistri;
    private javax.swing.JRadioButton rdlaki;
    private javax.swing.JRadioButton rdperempuan;
    private javax.swing.JRadioButton rdsuami;
    private javax.swing.JTable tableX;
    private javax.swing.JTextField txharta;
    private javax.swing.JTextField txhutang;
    private javax.swing.JTextField txjenazah;
    private javax.swing.JTextField txlain;
    private javax.swing.JTextField txlakilaki;
    private javax.swing.JTextField txperempuan;
    private javax.swing.JTextField txsisa;
    private javax.swing.JTextField txwarisan;
    // End of variables declaration//GEN-END:variables
}
