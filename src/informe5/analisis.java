/*
/*
basicamente hay dos tablas, donde en la tabla 2 se ven los filtros que hay
hasta el momento para aplicar en la tabla 1, usando dtm, faltan arreglar los condicionales
para que los filtros se muestren corretamente y tambien hacer que cuando se 
cada vez que vuelvan a poner datos se borren todos los asignados anteriormente
y como ultima instancia lograr descargar el archivoy grafica para despues llevar la logica para otros tipos de archivos csv
*/
package informe5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
public class analisis extends javax.swing.JFrame {
DefaultTableModel dmt = new DefaultTableModel();
DefaultTableModel dmt2 = new DefaultTableModel();
   String linea;//variable para guardar los datos de una linea
   String []valores;//vector para guardar las variables
   boolean b1=false,b2=false,b3=false,b4=false,b5=false,b6=false,banderita=false;
   int it=0,c=0;
   float cd1=0,cd2=0,cd3=0,cd4=0,cd5=0,pord1=0,pord2=0,pord3=0,pord4=0,pord5=0;
   float ca1=0,ca2=0,ca3=0,ca4=0,ca5=0,ca6=0,ca7=0,pora1=0,pora2=0,pora3=0,pora4=0,pora5=0,pora6=0,pora7=0;
   float cmas=0,cfem=0,pormas=0,porfem=0;
   float cadulto=0,cmenor=0,cadol=0,poradulto=0,pormenor=0,poradol=0;
   int mes;
   String fecha1=" ";
    String filtro1="";
        String filtro2="";
        String filtro3="";
        String filtro4="";
        String filtro5="";
        String filtro6="";
        String filtro7="";
    public analisis() {
        initComponents();
        String ide []={"departamento","arma","fecha","genero","poblacion"};
        String ide2 []={"excepcion","filtros"};
        dmt.setColumnIdentifiers(ide);
        dmt2.setColumnIdentifiers(ide2);
        tabla1.setModel(dmt);
        tabla2.setModel(dmt2);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        texto1 = new javax.swing.JTextField();
        texto3 = new javax.swing.JTextField();
        btfiltrar = new javax.swing.JButton();
        btdescargar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btreiniciarfiltros = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        texto5 = new javax.swing.JTextField();
        texto6 = new javax.swing.JTextField();
        texto4 = new javax.swing.JTextField();
        texto7 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        btbuscarfiltros = new javax.swing.JButton();
        btactualizarfiltros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btantioquia1 = new javax.swing.JToggleButton();
        btvalle1 = new javax.swing.JToggleButton();
        btcundinamarca1 = new javax.swing.JToggleButton();
        bttolima1 = new javax.swing.JToggleButton();
        btcauca1 = new javax.swing.JButton();
        btmasculino = new javax.swing.JButton();
        btfemenino = new javax.swing.JButton();
        btarmafuego = new javax.swing.JToggleButton();
        btarmablanca = new javax.swing.JToggleButton();
        btllavemaestra = new javax.swing.JToggleButton();
        btpalanca = new javax.swing.JToggleButton();
        btsinempleo = new javax.swing.JButton();
        btadulto = new javax.swing.JButton();
        btadolescentes = new javax.swing.JButton();
        btcontundentes = new javax.swing.JButton();
        btescopolamina = new javax.swing.JButton();
        btmenores = new javax.swing.JButton();
        btgraficas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto1ActionPerformed(evt);
            }
        });

        texto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto3ActionPerformed(evt);
            }
        });

        btfiltrar.setBackground(new java.awt.Color(102, 153, 255));
        btfiltrar.setText("filtrar");
        btfiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfiltrarActionPerformed(evt);
            }
        });

        btdescargar.setBackground(new java.awt.Color(0, 153, 0));
        btdescargar.setText("descargar csv");
        btdescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdescargarActionPerformed(evt);
            }
        });

        btsalir.setBackground(new java.awt.Color(255, 0, 51));
        btsalir.setText("salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        tabla1.setBackground(new java.awt.Color(0, 204, 0));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla1.setGridColor(new java.awt.Color(255, 51, 102));
        jScrollPane1.setViewportView(tabla1);

        btreiniciarfiltros.setBackground(new java.awt.Color(204, 204, 204));
        btreiniciarfiltros.setText("reiniciar filtros");
        btreiniciarfiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btreiniciarfiltrosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("INGRESE LOS FILTROS");

        jLabel3.setText("SOLO EN:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("sino requiere algun filtro mantenga el espacio vacio");

        jLabel7.setText("SOLO EL GENERO:");

        jLabel8.setText("TIPO DE ARMA:");

        jLabel9.setText("DESDE EL MES:");

        jLabel10.setText("HASTA EL MES:");

        jLabel11.setText("POBLACION:");

        tabla2.setBackground(new java.awt.Color(255, 255, 102));
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla2);

        btbuscarfiltros.setBackground(new java.awt.Color(255, 102, 102));
        btbuscarfiltros.setText("borrar filtrado");
        btbuscarfiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarfiltrosActionPerformed(evt);
            }
        });

        btactualizarfiltros.setBackground(new java.awt.Color(204, 204, 204));
        btactualizarfiltros.setText("actualizar filtros ");
        btactualizarfiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactualizarfiltrosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("ESTADISTICAS UMNG");

        btantioquia1.setText("ANTIOQUIA");
        btantioquia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btantioquia1ActionPerformed(evt);
            }
        });

        btvalle1.setText("VALLE");
        btvalle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvalle1ActionPerformed(evt);
            }
        });

        btcundinamarca1.setText("CUNDINAMARCA");
        btcundinamarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcundinamarca1ActionPerformed(evt);
            }
        });

        bttolima1.setText("TOLIMA");
        bttolima1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttolima1ActionPerformed(evt);
            }
        });

        btcauca1.setText("CAUCA");
        btcauca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcauca1ActionPerformed(evt);
            }
        });

        btmasculino.setText("MASCULINO");
        btmasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmasculinoActionPerformed(evt);
            }
        });

        btfemenino.setText("FEMENINO");
        btfemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfemeninoActionPerformed(evt);
            }
        });

        btarmafuego.setText("ARMA DE FUEGO");
        btarmafuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btarmafuegoActionPerformed(evt);
            }
        });

        btarmablanca.setText("ARMA BLANCA");
        btarmablanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btarmablancaActionPerformed(evt);
            }
        });

        btllavemaestra.setText("LLAVE MAESTRA");
        btllavemaestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btllavemaestraActionPerformed(evt);
            }
        });

        btpalanca.setText("PALANCA");
        btpalanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpalancaActionPerformed(evt);
            }
        });

        btsinempleo.setText("NO APLICA");
        btsinempleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsinempleoActionPerformed(evt);
            }
        });

        btadulto.setText("ADULTO");
        btadulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadultoActionPerformed(evt);
            }
        });

        btadolescentes.setText("ADOLESCENTES");
        btadolescentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadolescentesActionPerformed(evt);
            }
        });

        btcontundentes.setText("CONTUNDENTE");
        btcontundentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcontundentesActionPerformed(evt);
            }
        });

        btescopolamina.setText("ESCOPOLAMINA");
        btescopolamina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btescopolaminaActionPerformed(evt);
            }
        });

        btmenores.setText("MENOR");
        btmenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenoresActionPerformed(evt);
            }
        });

        btgraficas.setBackground(new java.awt.Color(255, 255, 102));
        btgraficas.setText("generar graficas");
        btgraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgraficasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("DANIEL MENESES Y ALEJANDRO RAMIREZ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(43, 43, 43)
                        .addComponent(texto5, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)
                        .addComponent(texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(60, 60, 60)
                            .addComponent(btadulto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btadolescentes, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(btmenores, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1279, 1279, 1279))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(432, 432, 432)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel3)
                                .addGap(98, 98, 98)
                                .addComponent(btantioquia1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btvalle1)
                                .addGap(35, 35, 35)
                                .addComponent(btcundinamarca1)
                                .addGap(42, 42, 42)
                                .addComponent(bttolima1)
                                .addGap(94, 94, 94)
                                .addComponent(btcauca1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(226, 226, 226))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(103, 103, 103)
                                                .addComponent(btmasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(156, 156, 156)
                                                .addComponent(btfemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(26, 26, 26)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btarmafuego)
                                                                .addGap(3, 3, 3)
                                                                .addComponent(btarmablanca)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btllavemaestra)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btpalanca)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btsinempleo))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(87, 87, 87)))
                                                .addComponent(btcontundentes)
                                                .addGap(18, 18, 18)
                                                .addComponent(btescopolamina)))))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator5)
                                    .addComponent(jSeparator4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(656, 656, 656)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(362, 362, 362)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btactualizarfiltros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btreiniciarfiltros))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btfiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btgraficas, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btbuscarfiltros, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                            .addComponent(btdescargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(1271, 1271, 1271))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btbuscarfiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btdescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btantioquia1)
                                            .addComponent(btvalle1)
                                            .addComponent(btcundinamarca1)
                                            .addComponent(bttolima1)
                                            .addComponent(btcauca1)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btmasculino)
                                            .addComponent(btfemenino)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(btarmafuego)
                                    .addComponent(btarmablanca)
                                    .addComponent(btllavemaestra)
                                    .addComponent(btpalanca)
                                    .addComponent(btsinempleo)
                                    .addComponent(btcontundentes)
                                    .addComponent(btescopolamina))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(texto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(10, 10, 10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btactualizarfiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btreiniciarfiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btadulto)
                                    .addComponent(btadolescentes)
                                    .addComponent(btmenores))
                                .addGap(5, 5, 5)
                                .addComponent(jLabel11)
                                .addGap(13, 13, 13)
                                .addComponent(texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btgraficas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1062, 1062, 1062))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto1ActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btsalirActionPerformed

    private void btfiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfiltrarActionPerformed
       
        File archivo=new File("basehomi.csv");//objeto que lee el archivo
        try {
            Scanner in=new Scanner (archivo);//objeto procesa la informacion
           while(in.hasNext()) {
                linea=in.nextLine();
                valores =linea.split(";");//mira donde esta la coma,toma los valores separados
                if(it>0)
                {
                String departamento=valores[0];
                String arma=valores[1];
                String fecha=valores[2];
                String genero=valores[3];
                String poblacion=valores[4];
                
                SimpleDateFormat sdf= new  SimpleDateFormat("dd/MM/yy");
                Date fecha1=sdf.parse(fecha);
                mes=fecha1.getMonth()+1;
                    
                    if (filtro5.isEmpty()) {
                        filtro5="0";
                    }
                    if (filtro6.isEmpty()) {
                        filtro6="100";
                    }
                boolean agregarFila = true;
                    if ((!filtro1.isEmpty() && !departamento.equalsIgnoreCase(filtro1))
                    || (!filtro4.isEmpty() && !arma.equalsIgnoreCase(filtro4))
                    || (!filtro5.isEmpty()&&mes < Integer.parseInt(filtro5)) 
                    || (!filtro6.isEmpty()&&mes > Integer.parseInt(filtro6))
                    || (!filtro3.isEmpty() && !genero.equalsIgnoreCase(filtro3))
                    || (!filtro7.isEmpty() && !poblacion.equalsIgnoreCase(filtro7))) {
                      agregarFila=false;  
                    }
                    if (agregarFila) {
                        dmt.addRow(new Object[]{departamento, arma, fecha, genero, poblacion});
                    }
                    
                         
                    
                }
         it++;
           }
        } catch (FileNotFoundException | ParseException ex) {
            Logger.getLogger(analisis.class.getName()).log(Level.SEVERE, null, ex);
        }
      texto1.setText("");
     
      texto3.setText("");
      texto4.setText("");
      texto5.setText("");
      texto6.setText("");
      texto7.setText("");
      filtro1="";
        filtro3="";
        filtro4="";
        filtro5="";
        filtro6="";
        filtro7="";
    }//GEN-LAST:event_btfiltrarActionPerformed

    private void btactualizarfiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactualizarfiltrosActionPerformed
        if (banderita) {
            dmt2.addRow(new Object[]{"===============","============="});
        }
        if (texto1.getText().length()>0) {
            filtro1=texto1.getText();
            dmt2.addRow(new Object[]{"departamento:",filtro1});
        }
     
        if (texto3.getText().length()>0) {
             filtro3=texto3.getText();
            dmt2.addRow(new Object[]{"genero:",filtro3});
        }
        if (texto4.getText().length()>0) {
             filtro4=texto4.getText();
            dmt2.addRow(new Object[]{"tipo de arma:",filtro4});
        }
        if (texto5.getText().length()>0) {
             filtro5=texto5.getText();
            dmt2.addRow(new Object[]{"desde el mes numero:",filtro5});
        }
        if (texto6.getText().length()>0) {
             filtro6=texto6.getText();
            dmt2.addRow(new Object[]{"hasta el mes numero:",filtro6});
        }
        if (texto7.getText().length()>0) {
             filtro7=texto7.getText();
            dmt2.addRow(new Object[]{"para la poblacion:",filtro7});
        }
        it=0;
        banderita=true;
    }//GEN-LAST:event_btactualizarfiltrosActionPerformed

    private void btbuscarfiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarfiltrosActionPerformed
        for (int i = tabla1.getRowCount()-1; i >=0; i--) {
            dmt.removeRow(i);
        }
    }//GEN-LAST:event_btbuscarfiltrosActionPerformed

    private void bttolima1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttolima1ActionPerformed
        texto1.setText("TOLIMA");
    }//GEN-LAST:event_bttolima1ActionPerformed

    private void btcundinamarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcundinamarca1ActionPerformed
       texto1.setText("CUNDINAMARCA");
    }//GEN-LAST:event_btcundinamarca1ActionPerformed

    private void btcauca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcauca1ActionPerformed
        texto1.setText("CAUCA");
    }//GEN-LAST:event_btcauca1ActionPerformed

    private void btllavemaestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btllavemaestraActionPerformed
       texto4.setText("LLAVE MAESTRA");
    }//GEN-LAST:event_btllavemaestraActionPerformed

    private void btpalancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpalancaActionPerformed
        texto4.setText("PALANCAS");
    }//GEN-LAST:event_btpalancaActionPerformed

    private void texto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto3ActionPerformed

    private void btantioquia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btantioquia1ActionPerformed
        texto1.setText("ANTIOQUIA");
    }//GEN-LAST:event_btantioquia1ActionPerformed

    private void btvalle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvalle1ActionPerformed
        texto1.setText("VALLE");
    }//GEN-LAST:event_btvalle1ActionPerformed

    private void btmasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmasculinoActionPerformed
        texto3.setText("MASCULINO");
    }//GEN-LAST:event_btmasculinoActionPerformed

    private void btfemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfemeninoActionPerformed
        texto3.setText("FEMENINO");
    }//GEN-LAST:event_btfemeninoActionPerformed

    private void btarmafuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btarmafuegoActionPerformed
        texto4.setText("ARMA DE FUEGO");
    }//GEN-LAST:event_btarmafuegoActionPerformed

    private void btarmablancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btarmablancaActionPerformed
       texto4.setText("ARMA BLANCA / CORTOPUNZANTE");
    }//GEN-LAST:event_btarmablancaActionPerformed

    private void btsinempleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsinempleoActionPerformed
        texto4.setText("SIN EMPLEO DE ARMAS");
    }//GEN-LAST:event_btsinempleoActionPerformed

    private void btcontundentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcontundentesActionPerformed
       texto4.setText("CONTUNDENTES");
    }//GEN-LAST:event_btcontundentesActionPerformed

    private void btescopolaminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btescopolaminaActionPerformed
        texto4.setText("ESCOPOLAMINA");
    }//GEN-LAST:event_btescopolaminaActionPerformed

    private void btadultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadultoActionPerformed
        texto7.setText("ADULTOS");
    }//GEN-LAST:event_btadultoActionPerformed

    private void btadolescentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadolescentesActionPerformed
         texto7.setText("ADOLESCENTES");
    }//GEN-LAST:event_btadolescentesActionPerformed

    private void btmenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenoresActionPerformed
         texto7.setText("MENORES");
    }//GEN-LAST:event_btmenoresActionPerformed

    private void btreiniciarfiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btreiniciarfiltrosActionPerformed
        texto1.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");
        filtro1="";
        filtro3="";
        filtro4="";
        filtro5="";
        filtro6="";
        filtro7="";
        it=0;
        for (int i = tabla2.getRowCount()-1; i >=0; i--) {
            dmt2.removeRow(i);
        }
        banderita=false;
    }//GEN-LAST:event_btreiniciarfiltrosActionPerformed

    private void btdescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdescargarActionPerformed
         File f=new File("reporteresultado.csv");
       try{
       FileWriter fw =new FileWriter (f);
      
       fw.write("DEPARTAMENTO;");
        fw.write("ARMA;");
         fw.write("FECHA;");
          fw.write("GENERO;");
           fw.write("POBLACION;"+"\n");
           
           for (int i = 0; i < tabla1.getRowCount(); i++) {
               fw.write(tabla1.getValueAt(i, 0)+";");
                fw.write(tabla1.getValueAt(i, 1)+";");
                 fw.write(tabla1.getValueAt(i, 2)+";");
                  fw.write(tabla1.getValueAt(i, 3)+";");
                   fw.write(tabla1.getValueAt(i, 4)+";"+"\n");
           }
       }catch(IOException ex){
           Logger.getLogger(analisis.class.getName()).log(Level.SEVERE, null, ex);
        
       }
    }//GEN-LAST:event_btdescargarActionPerformed

    private void btgraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgraficasActionPerformed
       
        for (int i = 0; i < tabla1.getRowCount(); i++) {
            if ("ANTIOQUIA".equals(tabla1.getValueAt(i, 0).toString())) {
                cd1++;
              
            }
            else
                if ("VALLE".equals(tabla1.getValueAt(i, 0).toString())) {
                cd2++;
            }
            else
                    if ("CUNDINAMARCA".equals(tabla1.getValueAt(i, 0).toString())) {
                cd3++;
            }
            else
                    if ("TOLIMA".equals(tabla1.getValueAt(i, 0).toString())) {
                cd4++;
            }
            else
                    if ("CAUCA".equals(tabla1.getValueAt(i, 0).toString())) {
                cd5++;
            }
            c++;
        }
        for (int i = 0; i < tabla1.getRowCount(); i++) {
                    if ("ARMA DE FUEGO".equals(tabla1.getValueAt(i, 1).toString())) {
                ca1++;
            }
                    else
                        if ("ARMA BLANCA / CORTOPUNZANTE".equals(tabla1.getValueAt(i, 1).toString())) { 
                            ca2++;
            }
                    else
                        if ("LLAVE MAESTRA".equals(tabla1.getValueAt(i, 1).toString())) {  
                            ca3++;
            }
                    else
                        if ("PALANCAS".equals(tabla1.getValueAt(i, 1).toString())) {  
                            ca4++;
            }
                    else
                        if ("CONTUNDENTES".equals(tabla1.getValueAt(i, 1).toString())) {  
                            ca5++;
            }
                    else
                        if ("ESCOPOLAMINA".equals(tabla1.getValueAt(i, 1).toString())) { 
                            ca6++;
            }
                    else
                        if ("SIN EMPLEO DE ARMAS".equals(tabla1.getValueAt(i, 1).toString())) {  
                            ca7++;
            }
                    
        }
        for (int i = 0; i < tabla1.getRowCount(); i++) {
            if ("MASCULINO".equals(tabla1.getValueAt(i, 3).toString())) {  
                            cmas++;
            }
                    else
                        if ("FEMENINO".equals(tabla1.getValueAt(i, 3).toString())) { 
                            cfem++;
            }
           
        }
        for (int i = 0; i < tabla1.getRowCount(); i++) {
            if ("ADULTOS".equals(tabla1.getValueAt(i, 4).toString())) {  
                            cadulto++;
            }
                    else
                        if ("MENORES".equals(tabla1.getValueAt(i, 4).toString())) { 
                            cmenor++;
            }
            else
                        if ("ADOLESCENTES".equals(tabla1.getValueAt(i, 4).toString())) { 
                            cadol++;
            }
           
        }
        pord1=(cd1*100)/c;
        pord2=(cd2*100)/c;
        pord3=(cd3*100)/c;
        pord4=(cd4*100)/c;
        pord5=(cd5*100)/c;
        pora1=(ca1*100)/c;
        pora2=(ca2*100)/c;
        pora3=(ca3*100)/c;
        pora4=(ca4*100)/c;
        pora5=(ca5*100)/c;
        pora6=(ca6*100)/c;
        pora7=(ca7*100)/c;
        pormas=(cmas*100)/c;
        porfem=(cfem*100)/c;
        poradulto=(cadulto*100)/c;
        pormenor=(cmenor*100)/c;
        poradol=(cadol*100)/c;
        DefaultPieDataset graficadepartamentos = new DefaultPieDataset();
        graficadepartamentos.setValue("ANTIOQUIA", new Float(pord1));
        graficadepartamentos.setValue("VALLE", new Float(pord2));
        graficadepartamentos.setValue("CUNDINAMARCA", new Float(pord3));
        graficadepartamentos.setValue("TOLIMA", new Float(pord4));
        graficadepartamentos.setValue("CAUCA", new Float(pord5));
        JFreeChart chartdepartamento = ChartFactory.createPieChart
        ("TASA POR DEPARTAMENTO", // Title
         graficadepartamentos, // Dataset
        true, // Show legend
         true, // Use tooltips
        false // Configure chart to generate URLs?
        );
        try {
        ChartUtilities.saveChartAsJPEG(new File("graficadepartamentos.jpg"), chartdepartamento, 1000, 800);
        } catch (Exception e) {
         System.out.println("Problem occurred creating chart.");
         }
        
        DefaultPieDataset graficatipodearma = new DefaultPieDataset();
        graficatipodearma.setValue("ARMA DE FUEGO", new Float(pora1));
        graficatipodearma.setValue("ARMA BLANCA", new Float(pora2));
        graficatipodearma.setValue("LLAVE MAESTRA", new Float(pora3));
        graficatipodearma.setValue("PALANCAS", new Float(pora4));
        graficatipodearma.setValue("CONTUNDENTES", new Float(pora5));
        graficatipodearma.setValue("ESCOPOLAMINA", new Float(pora6));
        graficatipodearma.setValue("SIN EMPLEO", new Float(pora7));
        JFreeChart charttipodeearma = ChartFactory.createPieChart
        ("TASA POR TIPO DE ARMA", // Title
         graficatipodearma, // Dataset
        true, // Show legend
         true, // Use tooltips
        false // Configure chart to generate URLs?
        );
        try {
        ChartUtilities.saveChartAsJPEG(new File("graficatipodearma.jpg"), charttipodeearma, 1000, 800);
        } catch (Exception e) {
         System.out.println("Problem occurred creating chart.");
         }
        
        
        DefaultPieDataset graficagenero = new DefaultPieDataset();
        graficagenero.setValue("MASCULINO", new Float(pormas));
        graficagenero.setValue("FEMENINO", new Float(porfem));
        JFreeChart chartgenero = ChartFactory.createPieChart
        ("TASA POR GENERO", // Title
         graficagenero, // Dataset
        true, // Show legend
         true, // Use tooltips
        false // Configure chart to generate URLs?
        );
        try {
        ChartUtilities.saveChartAsJPEG(new File("graficagenero.jpg"), chartgenero, 1000, 800);
        } catch (Exception e) {
         System.out.println("Problem occurred creating chart.");
         }
        
        
        DefaultPieDataset graficapoblacion = new DefaultPieDataset();
        graficapoblacion.setValue("ADULTOS", new Float(poradulto));
        graficapoblacion.setValue("ADOLESCENTES", new Float(poradol));
        graficapoblacion.setValue("MENORES", new Float(pormenor));
        JFreeChart chartpoblacion = ChartFactory.createPieChart
        ("TASA POR GENERO", // Title
         graficapoblacion, // Dataset
        true, // Show legend
         true, // Use tooltips
        false // Configure chart to generate URLs?
        );
        try {
        ChartUtilities.saveChartAsJPEG(new File("graficapoblacion.jpg"), chartpoblacion, 1000, 800);
        } catch (Exception e) {
         System.out.println("Problem occurred creating chart.");
         }
        
        
        
        DefaultCategoryDataset datadepartamento = new DefaultCategoryDataset();
        datadepartamento.setValue(cd1, "CANTIDAD", "ANTIOQUIA");
        datadepartamento.setValue(cd2, "CANTIDAD", "VALLE");
        datadepartamento.setValue(cd3, "CANTIDAD", "CUNDINAMARCA");
        datadepartamento.setValue(cd4, "CANTIDAD", "TOLIMA");
        datadepartamento.setValue(cd5, "CANTIDAD", "CAUCA");
        JFreeChart chartdepartamento2 = ChartFactory.createBarChart("TASA POR DEPARTAMENTO",
        "DEPARTAMENTO", "CANTIDAD", datadepartamento, PlotOrientation.VERTICAL,
        false, true, false);

        try {
        ChartUtilities.saveChartAsJPEG(new File("barrasdepartamento.jpg"), chartdepartamento2, 1000, 800);
        } catch (IOException e) {
        System.err.println("Problem occurred creating chart.");
        }
        
        
        
        DefaultCategoryDataset datatipodearma = new DefaultCategoryDataset();
        datatipodearma.setValue(ca1, "CANTIDAD", "ARMA DE FUEGO");
        datatipodearma.setValue(ca2, "CANTIDAD", "ARMA BLANCA");
        datatipodearma.setValue(ca3, "CANTIDAD", "LLAVE MAESTRA");
        datatipodearma.setValue(ca4, "CANTIDAD", "PALANCA");
        datatipodearma.setValue(ca5, "CANTIDAD", "CONTUNDENTE");
        datatipodearma.setValue(ca6, "CANTIDAD", "ESCOPOLAMINA");
        datatipodearma.setValue(ca7, "CANTIDAD", "NO EMPLEO");
        JFreeChart charttipodearma = ChartFactory.createBarChart("TASA POR TIPO DE ARMA",
        "TIPO DE ARMA", "CANTIDAD", datatipodearma, PlotOrientation.VERTICAL,
        false, true, false);

        try {
        ChartUtilities.saveChartAsJPEG(new File("barrastipodearma.jpg"), charttipodearma, 1000, 800);
        } catch (IOException e) {
        System.err.println("Problem occurred creating chart.");
        }
        
        
        
        
        DefaultCategoryDataset datagenero = new DefaultCategoryDataset();
        datagenero.setValue(cmas, "CANTIDAD", "MASCULINO");
        datagenero.setValue(cfem, "CANTIDAD", "FEMENINO");
        JFreeChart chartgenero1 = ChartFactory.createBarChart("TASA POR GENERO",
        "GENERO", "CANTIDAD", datagenero, PlotOrientation.VERTICAL,
        false, true, false);

        try {
        ChartUtilities.saveChartAsJPEG(new File("barrasgenero.jpg"), chartgenero1, 1000, 800);
        } catch (IOException e) {
        System.err.println("Problem occurred creating chart.");
        }
        
        
        DefaultCategoryDataset datapoblacion = new DefaultCategoryDataset();
        datapoblacion.setValue(cadulto, "CANTIDAD", "ADULTOS");
        datapoblacion.setValue(cadol, "CANTIDAD", "ADOLESCENTES");
        datapoblacion.setValue(cmenor, "CANTIDAD", "MENORES");
        JFreeChart chartpob1 = ChartFactory.createBarChart("TASA POR POBLACION",
        "GENERO", "CANTIDAD", datapoblacion, PlotOrientation.VERTICAL,
        false, true, false);

        try {
        ChartUtilities.saveChartAsJPEG(new File("barraspoblacion.jpg"), chartpob1, 1000, 800);
        } catch (IOException e) {
        System.err.println("Problem occurred creating chart.");
        }
    }//GEN-LAST:event_btgraficasActionPerformed

    
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
            java.util.logging.Logger.getLogger(analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new analisis().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btactualizarfiltros;
    private javax.swing.JButton btadolescentes;
    private javax.swing.JButton btadulto;
    private javax.swing.JToggleButton btantioquia1;
    private javax.swing.JToggleButton btarmablanca;
    private javax.swing.JToggleButton btarmafuego;
    private javax.swing.JButton btbuscarfiltros;
    private javax.swing.JButton btcauca1;
    private javax.swing.JButton btcontundentes;
    private javax.swing.JToggleButton btcundinamarca1;
    private javax.swing.JButton btdescargar;
    private javax.swing.JButton btescopolamina;
    private javax.swing.JButton btfemenino;
    private javax.swing.JButton btfiltrar;
    private javax.swing.JButton btgraficas;
    private javax.swing.JToggleButton btllavemaestra;
    private javax.swing.JButton btmasculino;
    private javax.swing.JButton btmenores;
    private javax.swing.JToggleButton btpalanca;
    private javax.swing.JButton btreiniciarfiltros;
    private javax.swing.JButton btsalir;
    private javax.swing.JButton btsinempleo;
    private javax.swing.JToggleButton bttolima1;
    private javax.swing.JToggleButton btvalle1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField texto1;
    private javax.swing.JTextField texto3;
    private javax.swing.JTextField texto4;
    private javax.swing.JTextField texto5;
    private javax.swing.JTextField texto6;
    private javax.swing.JTextField texto7;
    // End of variables declaration//GEN-END:variables
}
