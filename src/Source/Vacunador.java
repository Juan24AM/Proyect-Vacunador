    package Source;

    import Carnet.CuartaDosis;
    import Carnet.SegundaDosis;
    import Carnet.TerceraDosis;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import javax.swing.DefaultListModel;
    import javax.swing.JOptionPane;

public class Vacunador extends javax.swing.JFrame {

    DefaultListModel LNum, LDNI, LNombres, LGenero, LEdad, LTelefono, LNumDosis, LNomVacuna, LFechaVacunacion;
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    int numlist;
    void CargarModelos(){
        //Creando los modelos
        LNum = new DefaultListModel();
        LDNI = new DefaultListModel();
        LNombres = new DefaultListModel();
        LGenero = new DefaultListModel();
        LEdad = new DefaultListModel();
        LTelefono = new DefaultListModel();
        LNumDosis = new DefaultListModel();
        LNomVacuna = new DefaultListModel();
        LFechaVacunacion = new DefaultListModel();
        
        //Colocamos los modelos en los list
        jNum.setModel(LNum);
        jDNI.setModel(LDNI);
        jNombres.setModel(LNombres);
        jGenero.setModel(LGenero);
        jEdad.setModel(LEdad);
        jTelefono.setModel(LTelefono);
        jNumDosis.setModel(LNumDosis);
        jNomVacuna.setModel(LNomVacuna);
        jFechaVacunacion.setModel(LFechaVacunacion);       
    }
    
    public Vacunador() {
        initComponents();
        CargarModelos();
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnGrabarEstudiante5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jtxtDNI = new javax.swing.JTextField();
        jbtnGrabarEstudiante1 = new javax.swing.JButton();
        jbtnNuevosDatos1 = new javax.swing.JButton();
        cbxNomvacuna = new javax.swing.JComboBox<>();
        jtxtNombres = new javax.swing.JTextField();
        jtxtEdad = new javax.swing.JTextField();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        cbxNumdosis = new javax.swing.JComboBox<>();
        cbxgenero = new javax.swing.JComboBox<>();
        jtxtTelefono = new javax.swing.JTextField();
        jbtnBuscarDatosPaciente = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnSalir2 = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jtxtNum_dosisPaciente = new javax.swing.JTextField();
        jtxtNom_vacunaPaciente = new javax.swing.JTextField();
        jtxtFechaPaciente = new javax.swing.JTextField();
        jtxtDNIPaciente = new javax.swing.JTextField();
        jbtnGrabar = new javax.swing.JButton();
        jtxtNomPaciente = new javax.swing.JTextField();
        jbtnGrabarEstudiante6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDNI = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jNum = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jNombres = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTelefono = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jEdad = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jNumDosis = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jGenero = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jNomVacuna = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        jFechaVacunacion = new javax.swing.JList<>();
        jbtnGrabarEstudiante4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jbtnGrabarEstudiante5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jbtnGrabarEstudiante5.setForeground(new java.awt.Color(183, 138, 138));
        jbtnGrabarEstudiante5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifier-1_icon-icons.com_56924.png"))); // NOI18N
        jbtnGrabarEstudiante5.setBorderPainted(false);
        jbtnGrabarEstudiante5.setContentAreaFilled(false);
        jbtnGrabarEstudiante5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarEstudiante5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" APLICATIVO: COVID - 19 DIGITAL CARD                                                                                                                                                               GRUPO 04");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL PACIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jScrollPane1.setForeground(new java.awt.Color(183, 138, 138));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jPanel3.add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 210, 50));

        jbtnGrabarEstudiante1.setBackground(new java.awt.Color(98, 147, 179));
        jbtnGrabarEstudiante1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jbtnGrabarEstudiante1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGrabarEstudiante1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/javaaaaa xd.png"))); // NOI18N
        jbtnGrabarEstudiante1.setText("GRABAR DATOS");
        jbtnGrabarEstudiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarEstudiante1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnGrabarEstudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 200, 50));

        jbtnNuevosDatos1.setBackground(new java.awt.Color(98, 147, 179));
        jbtnNuevosDatos1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jbtnNuevosDatos1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnNuevosDatos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarrr.png"))); // NOI18N
        jbtnNuevosDatos1.setText("NUEVOS DATOS");
        jbtnNuevosDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevosDatos1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnNuevosDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 200, 50));

        cbxNomvacuna.setEditable(true);
        cbxNomvacuna.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        cbxNomvacuna.setForeground(new java.awt.Color(183, 138, 138));
        cbxNomvacuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----SELECCIONE----", "Pfizer-BioNTech", "Moderna", "Sputnik V", "Jhonson & Jhonson", "AstraZeneca", "Sinopharm", "Sinovac", "Covaxin", "Covovax" }));
        cbxNomvacuna.setAutoscrolls(true);
        cbxNomvacuna.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de la vacuna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        cbxNomvacuna.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxNomvacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNomvacunaActionPerformed(evt);
            }
        });
        jPanel3.add(cbxNomvacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 220, 70));

        jtxtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jPanel3.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 460, 60));

        jtxtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jPanel3.add(jtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 220, 60));

        jDateFecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de vacunación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jDateFecha.setForeground(new java.awt.Color(0, 153, 153));
        jDateFecha.setDateFormatString("dd/MM/yyyy");
        jPanel3.add(jDateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 220, 80));

        cbxNumdosis.setEditable(true);
        cbxNumdosis.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        cbxNumdosis.setForeground(new java.awt.Color(183, 138, 138));
        cbxNumdosis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----SELECCIONE----", "1", "2", "3", "4" }));
        cbxNumdosis.setAutoscrolls(true);
        cbxNumdosis.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número de dosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        cbxNumdosis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxNumdosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNumdosisActionPerformed(evt);
            }
        });
        jPanel3.add(cbxNumdosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 220, 60));
        cbxNumdosis.getAccessibleContext().setAccessibleDescription("");

        cbxgenero.setEditable(true);
        cbxgenero.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        cbxgenero.setForeground(new java.awt.Color(98, 147, 179));
        cbxgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----SELECCIONE----", "MASCULINO", "FEMENINO" }));
        cbxgenero.setAutoscrolls(true);
        cbxgenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Género", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        cbxgenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxgeneroActionPerformed(evt);
            }
        });
        jPanel3.add(cbxgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 70));

        jtxtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jtxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTelefonoActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 220, 60));

        jbtnBuscarDatosPaciente.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jbtnBuscarDatosPaciente.setForeground(new java.awt.Color(183, 138, 138));
        jbtnBuscarDatosPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifier_icon-icons.com_49240.png"))); // NOI18N
        jbtnBuscarDatosPaciente.setBorderPainted(false);
        jbtnBuscarDatosPaciente.setContentAreaFilled(false);
        jbtnBuscarDatosPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarDatosPacienteActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnBuscarDatosPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 60, 70));

        jScrollPane1.setViewportView(jPanel3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 510, 420));

        jbtnLimpiar.setBackground(new java.awt.Color(98, 147, 179));
        jbtnLimpiar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jbtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ic_delete_128_28267.png"))); // NOI18N
        jbtnLimpiar.setText("LIMPIAR");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 230, 60));

        jbtnSalir2.setBackground(new java.awt.Color(98, 147, 179));
        jbtnSalir2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jbtnSalir2.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tool-eraser_115252.png"))); // NOI18N
        jbtnSalir2.setText("CORREGIR DATOS");
        jbtnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalir2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 700, 340, 60));

        jbtnEliminar.setBackground(new java.awt.Color(98, 147, 179));
        jbtnEliminar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_delete_deleteusers_delete_male_user_maleclient_2348 (1).png"))); // NOI18N
        jbtnEliminar.setText("ELIMINAR DATOS");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 700, 340, 60));

        jbtnSalir.setBackground(new java.awt.Color(98, 147, 179));
        jbtnSalir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jbtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4115235-exit-logout-sign-out_114030.png"))); // NOI18N
        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 220, 60));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BÚSQUEDA DEL PACIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNum_dosisPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° de dosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jtxtNum_dosisPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNum_dosisPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtNum_dosisPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 68));

        jtxtNom_vacunaPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de la vacuna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jtxtNom_vacunaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNom_vacunaPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtNom_vacunaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 310, 68));

        jtxtFechaPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de vacunación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jtxtFechaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFechaPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtFechaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 380, 70));

        jtxtDNIPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jPanel4.add(jtxtDNIPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 210, 60));

        jbtnGrabar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jbtnGrabar.setForeground(new java.awt.Color(183, 138, 138));
        jbtnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifier_icon-icons.com_49240.png"))); // NOI18N
        jbtnGrabar.setBorderPainted(false);
        jbtnGrabar.setContentAreaFilled(false);
        jbtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 50, 80));

        jtxtNomPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jPanel4.add(jtxtNomPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 440, 70));

        jbtnGrabarEstudiante6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jbtnGrabarEstudiante6.setForeground(new java.awt.Color(183, 138, 138));
        jbtnGrabarEstudiante6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N
        jbtnGrabarEstudiante6.setBorderPainted(false);
        jbtnGrabarEstudiante6.setContentAreaFilled(false);
        jbtnGrabarEstudiante6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarEstudiante6ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnGrabarEstudiante6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 460, 320));

        jDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jScrollPane2.setViewportView(jDNI);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 110, 240));

        jNum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N°", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jScrollPane3.setViewportView(jNum);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 60, 240));

        jNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jScrollPane4.setViewportView(jNombres);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 290, 240));

        jTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jScrollPane5.setViewportView(jTelefono);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 150, 240));

        jEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jScrollPane6.setViewportView(jEdad);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 80, 240));

        jNumDosis.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° de Dosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jScrollPane7.setViewportView(jNumDosis);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 130, 240));

        jGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Género", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jScrollPane8.setViewportView(jGenero);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 120, 240));

        jNomVacuna.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de la vacuna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jScrollPane9.setViewportView(jNomVacuna);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, 200, 240));

        jFechaVacunacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de vacunación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18), new java.awt.Color(98, 147, 179))); // NOI18N
        jScrollPane10.setViewportView(jFechaVacunacion);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 450, 190, 240));

        jbtnGrabarEstudiante4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jbtnGrabarEstudiante4.setForeground(new java.awt.Color(98, 147, 179));
        jbtnGrabarEstudiante4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yellow Illustrated Logo Indonesian Food Logo.png"))); // NOI18N
        jbtnGrabarEstudiante4.setBorderPainted(false);
        jbtnGrabarEstudiante4.setContentAreaFilled(false);
        jbtnGrabarEstudiante4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarEstudiante4ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnGrabarEstudiante4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 460, 360));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(98, 147, 179));
        jLabel1.setText("¡REGÍSTRATE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 320, 40));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(98, 147, 179));
        jLabel2.setText("AQUÍ!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 320, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agendas-escolares-personalizadas-baratas-imprenta-las-nieves-fondo-celeste.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 1380, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        //Limpiando los JList
        LNum.removeAllElements();
        LDNI.removeAllElements();
        LNombres.removeAllElements();
        LGenero.removeAllElements();
        LEdad.removeAllElements();
        LTelefono.removeAllElements();
        LNumDosis.removeAllElements();
        LNomVacuna.removeAllElements();
        LFechaVacunacion.removeAllElements();
        
        jtxtDNIPaciente.setText("");
        jtxtNomPaciente.setText("");
        jtxtNum_dosisPaciente.setText("");
        jtxtNom_vacunaPaciente.setText("");
        jtxtFechaPaciente.setText("");
        //Llamando al metodo para limpiar entradas
        LimpiarEntradas();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        //Boton Salir
        System.exit(0);
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnNuevosDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevosDatos1ActionPerformed
        LimpiarEntradas();
    }//GEN-LAST:event_jbtnNuevosDatos1ActionPerformed

    private void jbtnGrabarEstudiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarEstudiante1ActionPerformed
        //Declaración de variable locales
        String campo, nombres, genero, Nom_vacuna, DNI;
        int Telefono, Edad, Num_dosis;
        String Fecha_vacunacion;
        
        //Llamada a función para verificar datos
        campo = VerificaCampos();
        if(campo.equals(""))
        {
            String existe = VerificaExiste();
            if(existe.equals("no"))
            {
            // Capturando los datos de entrada
            DNI=jtxtDNI.getText();
            nombres=jtxtNombres.getText();
            genero=cbxgenero.getSelectedItem().toString();
            Edad=Integer.parseInt(jtxtEdad.getText());
            Telefono=Integer.parseInt(jtxtTelefono.getText());
            Num_dosis=Integer.parseInt(cbxNumdosis.getSelectedItem().toString());
            Nom_vacuna=cbxNomvacuna.getSelectedItem().toString();
            Fecha_vacunacion = formato.format(jDateFecha.getDate());
            
            //Conocer el numero
            numlist = LNombres.size()+1;

            //Colocando la información de los Jlist
            LNum.addElement(numlist);
            LDNI.addElement(DNI);
            LNombres.addElement(nombres);
            LGenero.addElement(genero);
            LEdad.addElement(Edad);
            LTelefono.addElement(Telefono);
            LNumDosis.addElement(Num_dosis);
            LNomVacuna.addElement(Nom_vacuna);
            LFechaVacunacion.addElement(Fecha_vacunacion);
            
            //Llamada al método que limpia las entradas
            LimpiarEntradas();

            //Colocando el cursor en el boton nuevo
            jtxtDNI.requestFocus();
            }
        }
        else JOptionPane.showMessageDialog(null, "Verifique los datos en el campo de "+campo);
    }//GEN-LAST:event_jbtnGrabarEstudiante1ActionPerformed

    private void cbxgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxgeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxgeneroActionPerformed

    private void cbxNumdosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNumdosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNumdosisActionPerformed

    private void cbxNomvacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNomvacunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNomvacunaActionPerformed

    private void jbtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarActionPerformed
        // Buscar pacientes registrados
        
        if(jtxtDNIPaciente.getText().equals("") || jtxtDNIPaciente.getText().length() >=9 || jtxtDNIPaciente.getText().length() <=7) 
        {
           JOptionPane.showMessageDialog(null, "Ingresar un DNI Valido");
        }
        else 
        {
            //Declarando de variables locales
            int n,i;
            String DNI_paciente, Nombres_paciente, Num_dosis_paciente, Nom_vacuna_paciente, Fecha_vacunacion_paciente="", Edad_paciente = "";
            String DNI = jtxtDNIPaciente.getText();
            String datoNombre="", datoDosis="", datoNom_vacuna="", datoFecha_vacuna="", datoEDAD = "";
            
            //Encontramos la cantidad Items en los JList
            n=LNombres.size();
            //Recorrido a todos los registros de los JList
            for(i=0;i<n;i++)
            {
                //Extrayendo de los JList los datos de nombre y promedio ponderado
                DNI_paciente=LDNI.getElementAt(i).toString();
                Nombres_paciente=LNombres.getElementAt(i).toString();
                Num_dosis_paciente=LNumDosis.getElementAt(i).toString();
                Nom_vacuna_paciente=LNomVacuna.getElementAt(i).toString();
                Fecha_vacunacion_paciente=LFechaVacunacion.getElementAt(i).toString();
                Edad_paciente = LEdad.getElementAt(i).toString();

                    //Encontrando el DNI del paciente
                    if(DNI_paciente.equals(DNI)){
                        datoNombre = Nombres_paciente;
                        datoDosis = Num_dosis_paciente;
                        datoNom_vacuna = Nom_vacuna_paciente;
                        datoFecha_vacuna = Fecha_vacunacion_paciente;
                        datoEDAD = Edad_paciente;
                    }
                    
            }
            //Datos de Salida
            jtxtNomPaciente.setText(datoNombre);
            jtxtNum_dosisPaciente.setText(datoDosis);
            jtxtNom_vacunaPaciente.setText(datoNom_vacuna);
            jtxtFechaPaciente.setText(datoFecha_vacuna);
            
            
            if (datoNombre.equals(""))
                    JOptionPane.showMessageDialog(null, "La persona que busca no se encuentra en esta base de datos");
            
            else {
                String[] botones = {"Si", "No"};
                int ventana = JOptionPane.showOptionDialog(null, 
						"¿Deseas mostrar el Canet de vacunación?", 
						"Canet de Vacunacion", 
						JOptionPane.DEFAULT_OPTION, 
						JOptionPane.QUESTION_MESSAGE, null, 
						botones, botones[0]);
            
            if(ventana == 0){
                switch (datoDosis) {
                    case "2":

                        SegundaDosis SD = new SegundaDosis(this, false);
                        SD.setVisible(true);

                        SegundaDosis.C_DNI.setText(DNI);
                        SegundaDosis.C_EDAD.setText(datoEDAD);
                        SegundaDosis.C_NOMBRE.setText(datoNombre);
                        break;

                    case "3":

                        TerceraDosis TD = new TerceraDosis(this, false);
                        TD.setVisible(true);

                        TerceraDosis.C_DNI.setText(DNI);
                        TerceraDosis.C_EDAD.setText(datoEDAD);
                        TerceraDosis.C_NOMBRE.setText(datoNombre);
                        break;

                    case "4":

                        CuartaDosis CD = new CuartaDosis(this, false);
                        CD.setVisible(true);

                        CuartaDosis.C_DNI.setText(DNI);
                        CuartaDosis.C_EDAD.setText(datoEDAD);
                        CuartaDosis.C_NOMBRE.setText(datoNombre);
                        break;
                    }
                }
            }
        }   
    }//GEN-LAST:event_jbtnGrabarActionPerformed

    private void jtxtNom_vacunaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNom_vacunaPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNom_vacunaPacienteActionPerformed

    private void jtxtNum_dosisPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNum_dosisPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNum_dosisPacienteActionPerformed

    private void jtxtFechaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFechaPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFechaPacienteActionPerformed

    private void jtxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTelefonoActionPerformed

    private void jbtnGrabarEstudiante4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarEstudiante4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGrabarEstudiante4ActionPerformed

    private void jbtnGrabarEstudiante5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarEstudiante5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGrabarEstudiante5ActionPerformed

    private void jbtnGrabarEstudiante6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarEstudiante6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGrabarEstudiante6ActionPerformed

    private void jbtnBuscarDatosPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarDatosPacienteActionPerformed
    //Buscar Persona por DNI
        Http http = new Http();
        
        if(jtxtDNI.getText().equals("") || jtxtDNI.getText().length() >=9 || jtxtDNI.getText().length() <=7) 
        {
           JOptionPane.showMessageDialog(null, "Ingresar un DNI Valido");
        }
        else 
        {
            String dni = jtxtDNI.getText();
            String nombres = http.getDatosDNI(dni);
            jtxtNombres.setText(nombres);
        }
        
    }//GEN-LAST:event_jbtnBuscarDatosPacienteActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
    int index = jDNI.getSelectedIndex();
            String contraseña= "18052005";
            if(index >= 0){
            String pass = JOptionPane.showInputDialog("Para poder eliminar los datos, digite su contraseña...");

            if(pass.equals(contraseña)){
                String opcion = JOptionPane.showInputDialog("Si: Confirmar eliminación\nNo: Cancelar");
                if (opcion.equalsIgnoreCase("Si")){
                numlist = LDNI.size();

                LNum.remove(index);
                LDNI.remove(index);
                LNombres.remove(index);
                LGenero.remove(index);
                LEdad.remove(index);
                LTelefono.remove(index);
                LNumDosis.remove(index);
                LNomVacuna.remove(index);
                LFechaVacunacion.remove(index);
                
                numlist = LDNI.size();
                if (numlist >=0){
                
                    for(int i = 0; i < numlist; i++)
                        LNum.set(i, i+1);
                }
            } else if (opcion.equalsIgnoreCase("No"))
                JOptionPane.showMessageDialog(null, "Operacion cancelada...");
        }
    
            else
                    JOptionPane.showMessageDialog(null, "La contraseña es incorrecta..");
        }
        else
            JOptionPane.showMessageDialog(null, "Seleccione un DNI de la columna, para poder realizar la eliminación de los datos");
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalir2ActionPerformed
        //Obtener el index seleccionado
        int index = jDNI.getSelectedIndex();
        String contraseña= "18052005";
        if(index >= 0){
            String pass = JOptionPane.showInputDialog("Para poder modificar los datos, digite su contraseña...");

            if(pass.equals(contraseña)){
                String options = JOptionPane.showInputDialog("Ingrese el número segun lo que desee corregir:\n1. DNI\n2. Nombres\n3. Genero\n4. Edad\n5. Telefono\n6. N° de Dosis\n7. Nombre de La vacuna\n8. Fecha de vacunacion\n9. Cancelar");

                switch (options) {
                        case "1":
                            String dni = JOptionPane.showInputDialog("Ingrese el nuevo DNI");
                            LDNI.set(index, dni);
                            break;

                        case "2":
                            String nombre = JOptionPane.showInputDialog("Ingrese el nuevo Nombre");
                            LNombres.set(index, nombre);
                            break;

                        case "3":
                            String genero = JOptionPane.showInputDialog("Ingrese el nuevo Género");
                            LGenero.set(index, genero);
                            break;

                        case "4":
                            String edad = JOptionPane.showInputDialog("Ingrese la nueva Edad");
                            LEdad.set(index, edad);
                            break;

                        case "5":
                            String telefono = JOptionPane.showInputDialog("Ingrese el nuevo Teléfono");
                            LTelefono.set(index, telefono);
                            break;

                        case "6":
                            String num_dosis = JOptionPane.showInputDialog("Ingrese el nuevo N° de dosis");
                            LNumDosis.set(index, num_dosis);
                            break;

                        case "7":
                            String nom_vacuna = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la vacuna");
                            LNomVacuna.set(index, nom_vacuna);
                            break;

                        case "8":
                            String fechavacunacion = JOptionPane.showInputDialog("Ingrese la nueva fecha de vacunación");
                            LFechaVacunacion.set(index, fechavacunacion);
                            break;

                        case "9":
                            break;
                    }
            }
            else
                JOptionPane.showMessageDialog(null, "La contraseña es incorrecta..");
        }
        else
            JOptionPane.showMessageDialog(null, "Seleccione un DNI de la columna, para poder realizar la modificación de los datos");
    }//GEN-LAST:event_jbtnSalir2ActionPerformed

    String VerificaCampos() 
    {
        if(jtxtDNI.getText().equals("") || jtxtDNI.getText().length() >=9 || jtxtDNI.getText().length() <=7)
            return "DNI";
        else if(jtxtNombres.getText().equals(""))
            return "Apellidos y Nombres";
        else if (cbxgenero.getSelectedItem().toString().equals("----SELECCIONE----"))
            return "Genero";
        else if (jtxtEdad.getText().equals("") || Double.parseDouble(jtxtEdad.getText())<=0 || Double.parseDouble(jtxtEdad.getText())>150)
            return "Edad";
        else if (jtxtTelefono.getText().equals("") || jtxtTelefono.getText().length() >=10 || jtxtTelefono.getText().length() <=8)
            return "Telefono";
        else if (cbxNumdosis.getSelectedItem().toString().equals("----SELECCIONE----"))
            return "Número de dosis";
        else if (cbxNomvacuna.getSelectedItem().toString().equals("----SELECCIONE----"))
            return "Nombre de la vacuna";
        else if (jDateFecha.getDate() == null)
            return "Fecha de vacunación";
        //Si todos los jText estan con datos, retornamos un texto vacio.
        else
            return "";
    }
    
    String VerificaExiste() 
    {
        String existe = "";
        String DNI = jtxtDNI.getText(), DNI_paciente;
        int i, n;
        
        n = LDNI.size();
        
        if(n == 0)
            existe = "no";
        else if(n >= 1){
            for(i = 0; i < n; i++){
                DNI_paciente = LDNI.getElementAt(i).toString();
                if (DNI_paciente.equals(DNI))
                    existe = "si";
            }
            if(existe.equals("si")) {
                JOptionPane.showMessageDialog(null, "Esta persona ya se encuentra registrada.");
            } else
                existe = "no";
        }
        return existe;
    }
    
    
    void LimpiarEntradas() {
        jtxtDNI.setText("");
        jtxtNombres.setText("");
        cbxgenero.setSelectedIndex(0);
        jtxtEdad.setText("");
        jtxtTelefono.setText("");
        cbxNumdosis.setSelectedIndex(0);
        cbxNomvacuna.setSelectedIndex(0);
        jDateFecha.setDate(null);
        jtxtDNI.requestFocus();
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vacunador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vacunador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vacunador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vacunador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vacunador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxNomvacuna;
    private javax.swing.JComboBox<String> cbxNumdosis;
    private javax.swing.JComboBox<String> cbxgenero;
    private javax.swing.JList<String> jDNI;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JList<String> jEdad;
    private javax.swing.JList<String> jFechaVacunacion;
    private javax.swing.JList<String> jGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jNomVacuna;
    private javax.swing.JList<String> jNombres;
    private javax.swing.JList<String> jNum;
    private javax.swing.JList<String> jNumDosis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JList<String> jTelefono;
    private javax.swing.JButton jbtnBuscarDatosPaciente;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGrabar;
    private javax.swing.JButton jbtnGrabarEstudiante1;
    private javax.swing.JButton jbtnGrabarEstudiante4;
    private javax.swing.JButton jbtnGrabarEstudiante5;
    private javax.swing.JButton jbtnGrabarEstudiante6;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnNuevosDatos1;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JButton jbtnSalir2;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtDNIPaciente;
    private javax.swing.JTextField jtxtEdad;
    private javax.swing.JTextField jtxtFechaPaciente;
    private javax.swing.JTextField jtxtNomPaciente;
    private javax.swing.JTextField jtxtNom_vacunaPaciente;
    private javax.swing.JTextField jtxtNombres;
    public static javax.swing.JTextField jtxtNum_dosisPaciente;
    private javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
