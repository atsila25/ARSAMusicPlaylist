/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import control.MpView;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laudz
 */
public class PagePlaylist extends javax.swing.JFrame {

    private static PagePlaylist instance;
    MpView show = new MpView();
    private DefaultTableModel defaultTableModel; // Gunakan model bawaan
    Icon addS = new javax.swing.ImageIcon(getClass().getResource("/Icon/plus.png"));
    public static PagePlaylist getInstance() {
        return instance;
    }

    public PagePlaylist() {
        initComponents();
        setLocationRelativeTo(this);
        initTableModel(); // Inisialisasi model DefaultTableModel untuk JTable
        populateTableFromDatabase();
        instance = this;
        show.setPlaylist(this); // 
    }

    private void initTableModel() {
        defaultTableModel = (DefaultTableModel) yourQueue.getModel(); // Dapatkan model dari JTable

        // Set nama kolom jika perlu
        defaultTableModel.setColumnIdentifiers(new String[]{"Song Title"});
    }

    private void populateTableFromDatabase() {
        DefaultTableModel model = (DefaultTableModel) SongRepo.getModel(); // Dapatkan model dari JTable

        try {
            Connection con = DataBase.ConnectionProvider.getCon(); // Ambil koneksi dari kelas ConnectionProvider
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM musik"); // Eksekusi query

            // Bersihkan tabel sebelum menambahkan data baru
            model.setRowCount(0);

            // Loop melalui hasil dan tambahkan setiap baris ke model tabel
            while (rs.next()) {
                String judul = rs.getString("judul");
                String artis = rs.getString("artis");
                model.addRow(new Object[]{judul, artis});
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public DefaultTableModel getDefaultTableModel() {
        return defaultTableModel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlaylistName = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        yourQueue = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        SongRepo = new javax.swing.JTable();
        dequeue = new javax.swing.JButton();
        queue = new javax.swing.JButton();
        CurrentMusic = new javax.swing.JButton();
        Previous = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlaylistName.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        PlaylistName.setForeground(new java.awt.Color(240, 166, 186));
        PlaylistName.setText("Create Playlist");
        PlaylistName.setBorder(null);
        PlaylistName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaylistNameActionPerformed(evt);
            }
        });
        getContentPane().add(PlaylistName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 310, 60));

        yourQueue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yourQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Song Playlist"
            }
        ));
        yourQueue.setToolTipText("");
        yourQueue.setGridColor(new java.awt.Color(240, 166, 186));
        yourQueue.setRowSelectionAllowed(false);
        yourQueue.setShowGrid(false);
        jScrollPane1.setViewportView(yourQueue);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 410, 240));

        SongRepo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Judul", "Artis"
            }
        ));
        jScrollPane2.setViewportView(SongRepo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 100, 450, 290));

        dequeue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dequeue.png"))); // NOI18N
        dequeue.setBorder(null);
        dequeue.setBorderPainted(false);
        dequeue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dequeueActionPerformed(evt);
            }
        });
        getContentPane().add(dequeue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 250, -1));

        queue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Add to queue.png"))); // NOI18N
        queue.setBorder(null);
        queue.setBorderPainted(false);
        queue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queueActionPerformed(evt);
            }
        });
        getContentPane().add(queue, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 170, -1));

        CurrentMusic.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        CurrentMusic.setForeground(new java.awt.Color(240, 166, 186));
        CurrentMusic.setText(" Current Music");
        CurrentMusic.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CurrentMusic.setBorderPainted(false);
        CurrentMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentMusicActionPerformed(evt);
            }
        });
        getContentPane().add(CurrentMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 840, 80));

        Previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Prev.png"))); // NOI18N
        Previous.setActionCommand("Prev");
        Previous.setBorder(null);
        Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousActionPerformed(evt);
            }
        });
        getContentPane().add(Previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, -1, -1));

        Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Next.png"))); // NOI18N
        Next.setActionCommand("Next");
        Next.setBorder(null);
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        getContentPane().add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 680, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ListMusicPage.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaylistNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaylistNameActionPerformed
        show.createPlaylist();
        PlaylistName.setText(show.getPlaylist());
        int selectedRow = SongRepo.getSelectedRow();
        if (selectedRow != -1) {
            String selectedSong = SongRepo.getValueAt(selectedRow, 0).toString();
            show.queue(selectedSong);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a song to add to the playlist.", "Playlist successfully created!\nNow let's add song's!", JOptionPane.INFORMATION_MESSAGE, addS);
        }

    }//GEN-LAST:event_PlaylistNameActionPerformed

    private void dequeueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dequeueActionPerformed
        show.dequeue();
        defaultTableModel.removeRow(0);
        show.displayAll();
    }//GEN-LAST:event_dequeueActionPerformed

    private void queueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queueActionPerformed
        DefaultTableModel model2 = (DefaultTableModel) SongRepo.getModel();

        int selectedRow = SongRepo.getSelectedRow();
        if (selectedRow != -1) {
            String selectedSong = SongRepo.getValueAt(selectedRow, 0).toString();

            show.queue(selectedSong);

            // Memanggil displayAll setelah menambahkan lagu ke repositori
            show.displayAll();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a song to add to the playlist.");
        }

    }//GEN-LAST:event_queueActionPerformed

    private void CurrentMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentMusicActionPerformed
        String currentSong = show.current(); // Mengambil judul lagu yang sedang diputar
        if (currentSong != null) {
            CurrentMusic.setText(currentSong); // Mengatur teks tombol sesuai dengan judul lagu
        }
    }//GEN-LAST:event_CurrentMusicActionPerformed

    private void PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousActionPerformed
        show.previous();
        CurrentMusic.setText(show.current());
    }//GEN-LAST:event_PreviousActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        show.next();
        CurrentMusic.setText(show.current());
    }//GEN-LAST:event_NextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagePlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new PagePlaylist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CurrentMusic;
    private javax.swing.JButton Next;
    private javax.swing.JButton PlaylistName;
    private javax.swing.JButton Previous;
    private javax.swing.JTable SongRepo;
    private javax.swing.JButton dequeue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton queue;
    private javax.swing.JTable yourQueue;
    // End of variables declaration//GEN-END:variables
}
