package baitaplabbb;
import java.util.Vector;
import javax.swing.table.*;

public class table extends javax.swing.JFrame {
    Vector vtcData = new Vector();
    Vector vtcHeader = new Vector();
    public table() {
        initComponents();
        vtcHeader.add("MSSV");vtcHeader.add(" Name");vtcHeader.add("Add");vtcHeader.add("Lớp");
        Vector vtcRow1 = new Vector();
        vtcRow1.add("20198164");
        vtcRow1.add("Ninh Duy Đăng ");
        vtcRow1.add("Hưng Yên");
        vtcRow1.add("IT-GINP");
        vtcData.add(vtcRow1);
        Vector vtcRow2 = new Vector();
        vtcRow2.add("20198195");
        vtcRow2.add("Đoàn Long Vũ");
        vtcRow2.add("Hà Nội");
        vtcRow2.add("IT-GINP");
        vtcData.add(vtcRow2);
        Vector vtcRow3 = new Vector();
        vtcRow3.add("20198176");
        vtcRow3.add("Chu Văn Hoàng");
        vtcRow3.add("Hà Nội");
        vtcRow3.add("IT-GINP");
        vtcData.add(vtcRow3);
        Vector vtcRow4 = new Vector();
        vtcRow4.add("20198160");
        vtcRow4.add(" Hoàng Anh");
        vtcRow4.add("Hà Nội");
        vtcRow4.add("IT-GINP");
        vtcData.add(vtcRow4);
        Vector vtcRow5 = new Vector();
        vtcRow5.add("20198162");
        vtcRow5.add("Trần Quang Anh");
        vtcRow5.add("Hà Nội");
        vtcRow5.add("IT-GINP");
        vtcData.add(vtcRow5);
        tbListUser.setModel(new DefaultTableModel(vtcData, vtcHeader));
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbListUser = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbListUser.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbListUser);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("DANH SÁCH SINH VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbListUser;
    // End of variables declaration                   
}
