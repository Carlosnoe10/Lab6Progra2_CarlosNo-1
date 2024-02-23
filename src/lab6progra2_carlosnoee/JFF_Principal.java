/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab6progra2_carlosnoee;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author cd507
 */
public class JFF_Principal extends javax.swing.JFrame {

    public ArrayList<Equipos> ArrEquipos = new ArrayList();
    public ArrayList<Jugadores> ArrJugadoreLibres = new ArrayList();
    public int POS;

    public void LlenarList() {
        DefaultListModel Modelito = new DefaultListModel();
        for (int i = 0; i < ArrJugadoreLibres.size(); i++) {
            Modelito.add(i, ArrJugadoreLibres.get(i).getNombre());
        }
        JL_Jugadores.setModel(Modelito);
    }

    public JFF_Principal() {
        initComponents();
        LlenarCombox();
        JF_MenuPrincipal.setBounds(this.getBounds());
        JF_MenuPrincipal.setLocationRelativeTo(this);
        JF_MenuPrincipal.setVisible(true);
    }

    public void LlenarCombox() {
        JCBOX_Posicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Portero", "Defensa", "MedioCampista", "Delantero"}));
    }

    public void AjustarMod() {
        JD_MODJugadores.setLocationRelativeTo(this);
        JD_MODJugadores.setVisible(true);
        JT_MODNombreJugador.setText(ArrJugadoreLibres.get(POS).getNombre());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JF_CrearEquipos = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JT_NombreDelEquipo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JT_Cuidad = new javax.swing.JTextField();
        JT_PaisDelEquipo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JT_Estadio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BT_AgregarEquipos = new javax.swing.JButton();
        JB_AtrasEquipos = new javax.swing.JButton();
        JF_CrearJugadores = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JT_NombreJugador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JSP_Edad = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        JCBOX_Posicion = new javax.swing.JComboBox<>();
        BT_AgregarJugadores = new javax.swing.JButton();
        JB_AtrasJugadores = new javax.swing.JButton();
        JF_Transferencias = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTree_Equipos = new javax.swing.JTree();
        JB_TransferenciasJugadores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JL_Jugadores = new javax.swing.JList<>();
        JB_AtrasTransferencias = new javax.swing.JButton();
        JF_MenuPrincipal = new javax.swing.JFrame();
        jToolBar = new javax.swing.JToolBar();
        JB_CrearEquipos = new javax.swing.JButton();
        JB_CrearJugadores = new javax.swing.JButton();
        JB_Transferencias = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        JMB_Principal = new javax.swing.JMenuBar();
        JM_OpcionesP = new javax.swing.JMenu();
        JMI_CrearEquipos1 = new javax.swing.JMenuItem();
        JMI_CrearJugadores1 = new javax.swing.JMenuItem();
        JMI_Transferencias1 = new javax.swing.JMenuItem();
        JM_AyudaP = new javax.swing.JMenu();
        JPOP_MenuJugadores = new javax.swing.JPopupMenu();
        JPOP_ModJugadores = new javax.swing.JMenuItem();
        JPOP_DELJugadores = new javax.swing.JMenuItem();
        JD_MODJugadores = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        JT_MODNombreJugador = new javax.swing.JTextField();
        JSP_MODEdad = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JCBOX_MODPosicion = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        JB_MODJUG = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        JF_CrearEquipos.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Crear Equipos");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cuidad");

        JT_NombreDelEquipo.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        JT_NombreDelEquipo.setForeground(new java.awt.Color(153, 0, 153));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nombre del equipo");

        JT_Cuidad.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        JT_Cuidad.setForeground(new java.awt.Color(153, 0, 153));

        JT_PaisDelEquipo.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        JT_PaisDelEquipo.setForeground(new java.awt.Color(153, 0, 153));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Paise del equipo");

        JT_Estadio.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        JT_Estadio.setForeground(new java.awt.Color(153, 0, 153));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Estadio");

        BT_AgregarEquipos.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        BT_AgregarEquipos.setForeground(new java.awt.Color(0, 0, 0));
        BT_AgregarEquipos.setText("Agregar");
        BT_AgregarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AgregarEquiposActionPerformed(evt);
            }
        });

        JB_AtrasEquipos.setBackground(new java.awt.Color(153, 0, 0));
        JB_AtrasEquipos.setText("Atras");
        JB_AtrasEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AtrasEquiposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(BT_AgregarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(JB_AtrasEquipos)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JT_NombreDelEquipo)
                    .addComponent(JT_PaisDelEquipo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JT_Estadio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JT_Cuidad, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_PaisDelEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JT_NombreDelEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JT_Cuidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JT_Estadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BT_AgregarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_AtrasEquipos))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout JF_CrearEquiposLayout = new javax.swing.GroupLayout(JF_CrearEquipos.getContentPane());
        JF_CrearEquipos.getContentPane().setLayout(JF_CrearEquiposLayout);
        JF_CrearEquiposLayout.setHorizontalGroup(
            JF_CrearEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JF_CrearEquiposLayout.setVerticalGroup(
            JF_CrearEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JF_CrearJugadores.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(0, 255, 204));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Crear Jugadores");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");

        JT_NombreJugador.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("Edad");

        JSP_Edad.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        JSP_Edad.setModel(new javax.swing.SpinnerNumberModel(15, 15, 45, 1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setText("Posicion");

        JCBOX_Posicion.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        JCBOX_Posicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BT_AgregarJugadores.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        BT_AgregarJugadores.setText("Agregar");
        BT_AgregarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AgregarJugadoresActionPerformed(evt);
            }
        });

        JB_AtrasJugadores.setBackground(new java.awt.Color(204, 0, 0));
        JB_AtrasJugadores.setForeground(new java.awt.Color(255, 255, 255));
        JB_AtrasJugadores.setText("Atras");
        JB_AtrasJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AtrasJugadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JT_NombreJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BT_AgregarJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JSP_Edad)
                            .addComponent(JCBOX_Posicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JB_AtrasJugadores)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JT_NombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JSP_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(JCBOX_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_AgregarJugadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_AtrasJugadores, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout JF_CrearJugadoresLayout = new javax.swing.GroupLayout(JF_CrearJugadores.getContentPane());
        JF_CrearJugadores.getContentPane().setLayout(JF_CrearJugadoresLayout);
        JF_CrearJugadoresLayout.setHorizontalGroup(
            JF_CrearJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
            .addGroup(JF_CrearJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JF_CrearJugadoresLayout.setVerticalGroup(
            JF_CrearJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
            .addGroup(JF_CrearJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JF_Transferencias.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel3.setForeground(new java.awt.Color(0, 51, 153));

        jLabel6.setBackground(java.awt.Color.darkGray);
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Trasferencias");

        jLabel12.setBackground(java.awt.Color.darkGray);
        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Jugadores");

        jLabel13.setBackground(java.awt.Color.darkGray);
        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Equipos");

        JTree_Equipos.setBackground(java.awt.Color.orange);
        JTree_Equipos.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(JTree_Equipos);

        JB_TransferenciasJugadores.setBackground(java.awt.Color.green);
        JB_TransferenciasJugadores.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        JB_TransferenciasJugadores.setForeground(new java.awt.Color(0, 0, 0));
        JB_TransferenciasJugadores.setText("Transferir ----->");

        JL_Jugadores.setBackground(java.awt.Color.orange);
        JL_Jugadores.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        JL_Jugadores.setForeground(new java.awt.Color(0, 0, 0));
        JL_Jugadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JL_Jugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_JugadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JL_Jugadores);

        JB_AtrasTransferencias.setBackground(new java.awt.Color(204, 0, 51));
        JB_AtrasTransferencias.setForeground(new java.awt.Color(0, 0, 0));
        JB_AtrasTransferencias.setText("Atras");
        JB_AtrasTransferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AtrasTransferenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JB_TransferenciasJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JB_AtrasTransferencias)
                        .addGap(86, 86, 86)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(JB_TransferenciasJugadores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(JB_AtrasTransferencias))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JF_TransferenciasLayout = new javax.swing.GroupLayout(JF_Transferencias.getContentPane());
        JF_Transferencias.getContentPane().setLayout(JF_TransferenciasLayout);
        JF_TransferenciasLayout.setHorizontalGroup(
            JF_TransferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JF_TransferenciasLayout.setVerticalGroup(
            JF_TransferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JF_MenuPrincipal.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar.setBackground(new java.awt.Color(204, 0, 51));
        jToolBar.setRollover(true);

        JB_CrearEquipos.setBackground(new java.awt.Color(204, 0, 51));
        JB_CrearEquipos.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        JB_CrearEquipos.setText("Crear Equipos");
        JB_CrearEquipos.setFocusable(false);
        JB_CrearEquipos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JB_CrearEquipos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JB_CrearEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CrearEquiposActionPerformed(evt);
            }
        });
        jToolBar.add(JB_CrearEquipos);

        JB_CrearJugadores.setBackground(new java.awt.Color(204, 0, 51));
        JB_CrearJugadores.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        JB_CrearJugadores.setText("Crear Jugadores");
        JB_CrearJugadores.setFocusable(false);
        JB_CrearJugadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JB_CrearJugadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JB_CrearJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CrearJugadoresActionPerformed(evt);
            }
        });
        jToolBar.add(JB_CrearJugadores);

        JB_Transferencias.setBackground(new java.awt.Color(204, 0, 51));
        JB_Transferencias.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        JB_Transferencias.setText("Transferencias");
        JB_Transferencias.setFocusable(false);
        JB_Transferencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JB_Transferencias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JB_Transferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_TransferenciasActionPerformed(evt);
            }
        });
        jToolBar.add(JB_Transferencias);

        jLabel14.setText("jLabel1");

        JMB_Principal.setBackground(new java.awt.Color(204, 0, 51));
        JMB_Principal.setForeground(new java.awt.Color(204, 0, 51));

        JM_OpcionesP.setBackground(new java.awt.Color(204, 0, 51));
        JM_OpcionesP.setText("Opciones");

        JMI_CrearEquipos1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JMI_CrearEquipos1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        JMI_CrearEquipos1.setText("Crear Equipos");
        JM_OpcionesP.add(JMI_CrearEquipos1);

        JMI_CrearJugadores1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JMI_CrearJugadores1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        JMI_CrearJugadores1.setText("Crear Jugadores");
        JM_OpcionesP.add(JMI_CrearJugadores1);

        JMI_Transferencias1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JMI_Transferencias1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        JMI_Transferencias1.setText("Transferencias");
        JM_OpcionesP.add(JMI_Transferencias1);

        JMB_Principal.add(JM_OpcionesP);

        JM_AyudaP.setBackground(new java.awt.Color(204, 0, 51));
        JM_AyudaP.setText("Edit");
        JMB_Principal.add(JM_AyudaP);

        JF_MenuPrincipal.setJMenuBar(JMB_Principal);

        javax.swing.GroupLayout JF_MenuPrincipalLayout = new javax.swing.GroupLayout(JF_MenuPrincipal.getContentPane());
        JF_MenuPrincipal.getContentPane().setLayout(JF_MenuPrincipalLayout);
        JF_MenuPrincipalLayout.setHorizontalGroup(
            JF_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JF_MenuPrincipalLayout.setVerticalGroup(
            JF_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_MenuPrincipalLayout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
        );

        JPOP_ModJugadores.setText("Modificar");
        JPOP_ModJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPOP_ModJugadoresActionPerformed(evt);
            }
        });
        JPOP_MenuJugadores.add(JPOP_ModJugadores);

        JPOP_DELJugadores.setText("Eliminar");
        JPOP_MenuJugadores.add(JPOP_DELJugadores);

        JD_MODJugadores.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        JD_MODJugadores.setBackground(new java.awt.Color(102, 102, 0));
        JD_MODJugadores.setName("MOD Jugadores"); // NOI18N

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel15.setText("Nombre");

        JT_MODNombreJugador.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        JSP_MODEdad.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        JSP_MODEdad.setModel(new javax.swing.SpinnerNumberModel(15, 15, 45, 1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel16.setText("Edad");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel17.setText("Posicion");

        JCBOX_MODPosicion.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        JCBOX_MODPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Modificar Jugadores");

        JB_MODJUG.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        JB_MODJUG.setText("MOD");
        JB_MODJUG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_MODJUGActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JD_MODJugadoresLayout = new javax.swing.GroupLayout(JD_MODJugadores.getContentPane());
        JD_MODJugadores.getContentPane().setLayout(JD_MODJugadoresLayout);
        JD_MODJugadoresLayout.setHorizontalGroup(
            JD_MODJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_MODJugadoresLayout.createSequentialGroup()
                .addGroup(JD_MODJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_MODJugadoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JB_MODJUG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JD_MODJugadoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JD_MODJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JD_MODJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JT_MODNombreJugador)
                            .addComponent(JCBOX_MODPosicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JSP_MODEdad)))
                    .addGroup(JD_MODJugadoresLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel18)
                        .addGap(0, 145, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_MODJugadoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        JD_MODJugadoresLayout.setVerticalGroup(
            JD_MODJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_MODJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(38, 38, 38)
                .addComponent(JB_MODJUG, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(JD_MODJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(JT_MODNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_MODJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSP_MODEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(JD_MODJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBOX_MODPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_CrearEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CrearEquiposActionPerformed
        JF_MenuPrincipal.setVisible(false);
        JF_CrearEquipos.setBounds(this.getBounds());
        JF_CrearEquipos.setLocationRelativeTo(this);
        JF_CrearEquipos.setVisible(true);
        
    }//GEN-LAST:event_JB_CrearEquiposActionPerformed

    private void JB_CrearJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CrearJugadoresActionPerformed
        JF_MenuPrincipal.setVisible(false);
        JF_CrearJugadores.setBounds(this.getBounds());
        JF_CrearJugadores.setLocationRelativeTo(this);
        JF_CrearJugadores.setVisible(true);

    }//GEN-LAST:event_JB_CrearJugadoresActionPerformed

    private void JB_TransferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_TransferenciasActionPerformed
        JF_MenuPrincipal.setVisible(false);
        JF_Transferencias.setBounds(this.getBounds());
        JF_Transferencias.setLocationRelativeTo(this);
        JF_Transferencias.setVisible(true);
        LlenarList();
    }//GEN-LAST:event_JB_TransferenciasActionPerformed

    private void JB_AtrasEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AtrasEquiposActionPerformed
        JF_CrearEquipos.setVisible(false);
        JF_MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JB_AtrasEquiposActionPerformed

    private void JB_AtrasJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AtrasJugadoresActionPerformed
        JF_CrearJugadores.setVisible(false);
        JF_MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JB_AtrasJugadoresActionPerformed

    private void JB_AtrasTransferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AtrasTransferenciasActionPerformed
        JF_Transferencias.setVisible(false);
        JF_MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JB_AtrasTransferenciasActionPerformed

    private void JL_JugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_JugadoresMouseClicked
        if (evt.isMetaDown()) {
            System.out.println(evt.getX() + " " + evt.getY());
            JPOP_MenuJugadores.show(evt.getComponent(), evt.getX(), evt.getY());
        }


    }//GEN-LAST:event_JL_JugadoresMouseClicked

    private void JPOP_ModJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPOP_ModJugadoresActionPerformed
        if (JL_Jugadores.isSelectionEmpty()) {
        } else {
            //Empieza desde 0  
            POS = JL_Jugadores.getSelectedIndex();
            AjustarMod();
        }

    }//GEN-LAST:event_JPOP_ModJugadoresActionPerformed

    private void JB_MODJUGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_MODJUGActionPerformed
        ArrJugadoreLibres.get(POS).setEdad(JSP_MODEdad.getComponentCount());
        ArrJugadoreLibres.get(POS).setNombre(JT_MODNombreJugador.getText());
        ArrJugadoreLibres.get(POS).setPosicion(JCBOX_MODPosicion.getSelectedItem().toString());
        JD_MODJugadores.setVisible(false);
        JOptionPane.showMessageDialog(JF_Transferencias, "Modificado con exito");
    }//GEN-LAST:event_JB_MODJUGActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JD_MODJugadores.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BT_AgregarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AgregarEquiposActionPerformed
        ArrEquipos.add(new Equipos(JT_NombreDelEquipo.getText(), JT_PaisDelEquipo.getText(), JT_Cuidad.getText(), JT_Estadio.getText()));
        JOptionPane.showMessageDialog(JF_CrearEquipos, "Creado con exito");
        JF_CrearEquipos.setVisible(false);
        JF_MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_BT_AgregarEquiposActionPerformed

    private void BT_AgregarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AgregarJugadoresActionPerformed
        ArrJugadoreLibres.add(new Jugadores(JT_NombreJugador.getText(), (Integer) JSP_Edad.getValue(), JCBOX_Posicion.getSelectedItem().toString()));
        JOptionPane.showMessageDialog(JF_CrearJugadores, "Creado con exito");
        JF_CrearJugadores.setVisible(false);
        JF_MenuPrincipal.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_AgregarJugadoresActionPerformed

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
            java.util.logging.Logger.getLogger(JFF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFF_Principal().setVisible(false);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_AgregarEquipos;
    private javax.swing.JButton BT_AgregarJugadores;
    private javax.swing.JButton JB_AtrasEquipos;
    private javax.swing.JButton JB_AtrasJugadores;
    private javax.swing.JButton JB_AtrasTransferencias;
    private javax.swing.JButton JB_CrearEquipos;
    private javax.swing.JButton JB_CrearJugadores;
    private javax.swing.JButton JB_MODJUG;
    private javax.swing.JButton JB_Transferencias;
    private javax.swing.JButton JB_TransferenciasJugadores;
    private javax.swing.JComboBox<String> JCBOX_MODPosicion;
    private javax.swing.JComboBox<String> JCBOX_Posicion;
    private javax.swing.JDialog JD_MODJugadores;
    private javax.swing.JFrame JF_CrearEquipos;
    private javax.swing.JFrame JF_CrearJugadores;
    private javax.swing.JFrame JF_MenuPrincipal;
    private javax.swing.JFrame JF_Transferencias;
    private javax.swing.JList<String> JL_Jugadores;
    private javax.swing.JMenuBar JMB_Principal;
    private javax.swing.JMenuItem JMI_CrearEquipos1;
    private javax.swing.JMenuItem JMI_CrearJugadores1;
    private javax.swing.JMenuItem JMI_Transferencias1;
    private javax.swing.JMenu JM_AyudaP;
    private javax.swing.JMenu JM_OpcionesP;
    private javax.swing.JMenuItem JPOP_DELJugadores;
    private javax.swing.JPopupMenu JPOP_MenuJugadores;
    private javax.swing.JMenuItem JPOP_ModJugadores;
    private javax.swing.JSpinner JSP_Edad;
    private javax.swing.JSpinner JSP_MODEdad;
    private javax.swing.JTextField JT_Cuidad;
    private javax.swing.JTextField JT_Estadio;
    private javax.swing.JTextField JT_MODNombreJugador;
    private javax.swing.JTextField JT_NombreDelEquipo;
    private javax.swing.JTextField JT_NombreJugador;
    private javax.swing.JTextField JT_PaisDelEquipo;
    private javax.swing.JTree JTree_Equipos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar;
    // End of variables declaration//GEN-END:variables
}
