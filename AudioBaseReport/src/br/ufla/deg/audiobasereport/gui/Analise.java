package br.ufla.deg.audiobasereport.gui;

import br.ufla.deg.audiobasereport.dao.Dao;
import br.ufla.deg.audiobasereport.entidades.Avaliacao;
import br.ufla.deg.audiobasereport.entidades.ItemAvaliacao;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Federal University of Lavras - Lavras - MG - Brazil
 * Engineering Department
 * Post graduate program in System Engineering and Automation
 * @author Rodrigo Dantas Nunes
 *         Teacher Advisor Dsc. Demóstenes Zegarra Rodríguez
 * @since 2015
 * @version 1.0
 * Copyrigth© Rodrigo Dantas Nunes
 */
public class Analise extends javax.swing.JFrame {

    private Dao dao;

    /**
     * Creates new form Analise
     */
    public Analise() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTFHost = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTFPort = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFUser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTFSenha = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jtfBaseDados = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFDiretorio = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCBCodec = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTFTaxaPerda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCBLimparTempAntes = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCBGenre = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTFIdentificacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("::DAAF:: Database Analisys of Audio File");

        jLabel11.setText("Host:");

        jTFHost.setText("localhost");

        jLabel12.setText("Port:");

        jTFPort.setText("3306");

        jLabel13.setText("User:");

        jTFUser.setText("root");

        jLabel14.setText("Password:");

        jLabel15.setText("Database:");

        jtfBaseDados.setText("audiobasereport");

        jLabel16.setText("Performed tests");

        jButton1.setText("Connect");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Last Analisys:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Future implementation" }));

        jButton3.setText("Analisys Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFUser)
                            .addComponent(jTFHost, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfBaseDados, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 234, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBaseDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel16))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BD Settings", jPanel1);

        jLabel1.setText("8kHz Audio Base Path:");

        jButton2.setText("Execute");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Codec:");

        jCBCodec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PCMU", "PCMA", "SPEEX", "GSM", "DUMMY" }));

        jLabel3.setText("Loss rate:");

        jTFTaxaPerda.setText("0.1;0.2;0.3");

        jLabel4.setText("Separate by semicolons (Ex. 0.1;0.2;...)");

        jCBLimparTempAntes.setText("Clear temporary files before");

        jLabel5.setText("Audio Base Genre:");

        jCBGenre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Mixed" }));

        jLabel6.setText("Identification:");

        jLabel7.setText("Use this field to identify each evaluation");

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel8.setText("Works ONLY in audio files with 8 kHz");

        jLabel9.setText("Sleep time between each wav2rtp execution:");

        jTextField1.setText("3000");

        jLabel10.setText("ms");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTFTaxaPerda, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(536, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFDiretorio)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTFIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBCodec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jCBGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(jCBLimparTempAntes))
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(132, 132, 132)
                                .addComponent(jLabel8)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(9, 9, 9)
                .addComponent(jTFDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCodec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBLimparTempAntes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTaxaPerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Process", jPanel2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Credits for Third-party software used here:\n\n * Wav2rtp Software avaliable on http://wav2rtp.sourceforge.net/index.html\n * ITU-T P. 563 Software avaliable on http://www.itu.int/rec/T-REC-P.563/en \n * ITU-T P. 862 Software avaliable on http://www.itu.int/rec/T-REC-P.862/en");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("This software was developed ");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Credits", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String validaEntradasDeUsuario(){
        String erros = "";
        //acrescenta o escape em aspas simples
        jTFDiretorio.setText(jTFDiretorio.getText().replace("'", "\'"));
        jTFIdentificacao.setText(jTFIdentificacao.getText().replace("'", " "));
        
        if(jTFDiretorio.getText().trim().isEmpty()){
            erros +="The path to 8 kHz audio base cannot be empty.\n";
        }else{
            File f = new File(jTFDiretorio.getText().trim());
            if(!f.exists()){
                erros += "The address you entered does not exist.\n";
            }else if(!f.isDirectory())
                erros += "The address does not match a directory.\n";
        }
        
        if(jTFIdentificacao.getText().trim().isEmpty()){
            erros += "The identification field cannot be empty.\n";
        }else if(jTFIdentificacao.getText().trim().length() > 20){
            erros += "Type only 20 character to Identification field.\n";
        }
        
        try{
            long test = Long.parseLong(jTextField1.getText().trim());
        }catch(NumberFormatException n){
            erros += "The informed sleep time must be a integer number.\n";
        }
        String[] taxas_perda;
        if (jTFTaxaPerda.getText().trim().contains(";")) {
            taxas_perda = jTFTaxaPerda.getText().split(";");
        } else {
            taxas_perda = new String[1];
            taxas_perda[0] = jTFTaxaPerda.getText().trim();
        }
        
        for(int i =0; i< taxas_perda.length;i++){
            try{
                //se informar um ; no fechamento do campo (ex. 0.1;0.2;), 
                //o ultimo valor do vetor vai ser vazio, 
                //entao vou tratar isso p o usuario
                if(i == taxas_perda.length-1 && taxas_perda[i].isEmpty()){
                    jTFTaxaPerda.setText(jTFTaxaPerda.getText().substring(0, jTFTaxaPerda.getText().length()-1));
                }else{
                    float fl = Float.parseFloat(taxas_perda[i]);
                }
            }catch(NumberFormatException n){
                erros += "The value in loss rate field is wrong. The correct value must be as follow: 0.1;0.2;1.0;2.5";
            }
        }
        
        return erros.isEmpty()?null:erros;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            
            String erro = validaEntradasDeUsuario();
            if(erro != null){
                JOptionPane.showMessageDialog(this, erro, 
                        "Error on entry fields", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(dao == null)
                conecta();
            
            Avaliacao av = new Avaliacao(jTFIdentificacao.getText(),
                    new Date(), null,jTFDiretorio.getText(),jCBCodec.getSelectedItem().toString());
            if (jCBGenre.getSelectedIndex() == 0) {
                av.setGenre("M");
            } else if (jCBGenre.getSelectedIndex() == 1) {
                av.setGenre("F");
            } else {
                av.setGenre("N");
            }

            File dir = new File(jTFDiretorio.getText());
            String[] arquivos = dir.list();
            String[] taxasPerda;
            if (jTFTaxaPerda.getText().trim().contains(";")) {
                taxasPerda = jTFTaxaPerda.getText().split(";");
            } else {
                taxasPerda = new String[1];
                taxasPerda[0] = jTFTaxaPerda.getText().trim();
            }
            
            if(continua(arquivos.length,taxasPerda.length) != JOptionPane.YES_OPTION){
                return;
            }

            //criando diretorios
            for (String taxaPerda : taxasPerda) {

                String nomeDirTx = getLossRateDir(taxaPerda);

                //para cada arquivo, vou gerar o degradado correspondente
                for (String arquivo : arquivos) {
                    //rodando o wav2rtp
                    executeWav2Rtp(dir.getPath() + File.separator + arquivo, nomeDirTx + arquivo, jCBCodec.getSelectedItem().toString(), Float.parseFloat(taxaPerda));
                    waitAnInstant();
                    //obtendo valor do P.862
                    float pesq_mos = getPesqMos(arquivo,dir,nomeDirTx);
                    //obtendo valor do P.563
                    float mos_563 = get563Mos(nomeDirTx,arquivo);
                    //armazenando os valores
                    ItemAvaliacao itemAv = new ItemAvaliacao(arquivo, pesq_mos,
                            mos_563, Float.parseFloat(taxaPerda), av);
                    av.getItens().add(itemAv);
                }
            }
            dao.inserirAvaliacao(av);
            JOptionPane.showMessageDialog(this, "Process successfully done!", "Sucess", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(Analise.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(dao != null){
                dao.close();
                dao = null;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            conecta();
            JOptionPane.showMessageDialog(this, "Connected!", "Sucess", JOptionPane.INFORMATION_MESSAGE);
            jTabbedPane1.setSelectedIndex(1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void conecta(){
        dao = new Dao(jTFUser.getText().trim(), String.valueOf(jTFSenha.getPassword()), 
                    "jdbc:mysql://"+jTFHost.getText().trim()+":"+
                    jTFPort.getText()+"/"+jtfBaseDados.getText().trim(), "com.mysql.jdbc.Driver");
    }
    
    private int continua(int qtdeArquivos, int qtdeTaxas){
        String[] opcoes = {"Yes","No"};
        double sleep = Long.parseLong(jTextField1.getText().trim());
        //sleep = sleep / 1000;
        Double tempoTotal = ((qtdeArquivos * (sleep / 1000)) / 60) * qtdeTaxas;
        
        String mensagem = "Considering the "+qtdeArquivos
                + " audio files, "+qtdeTaxas
                + " loss rates and "+sleep
                + " milliseconds of waiting,\n"
                + "this process will take approximately "+tempoTotal.intValue()
                + " minutes. Confirms the execution?";
        return JOptionPane.showOptionDialog(this, mensagem, "Continue?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, "Yes");
    }
    
    private void waitAnInstant() {
        try {
            Thread.sleep(Long.parseLong(jTextField1.getText()));
        } catch (InterruptedException ex) {
            Logger.getLogger(Analise.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String getLossRateDir(String taxaPerda) {
        String nomeDirTx = "deg/loss_rate_" + taxaPerda
                .replace(".", "_") + File.separator;
        
        File dirTx = new File(nomeDirTx);
        if (!dirTx.exists()) {
            dirTx.mkdirs();
        } else if (jCBLimparTempAntes.isSelected()) {
            String[] tempFiles = dirTx.list();
            for (String tempFile : tempFiles) {
                File f = new File(tempFile);
                f.delete();
            }
        }

        return nomeDirTx;
    }
    
    
    /*Process process = Runtime.getRuntime().exec("./wav2rtp "
     + "-f dg137.wav "
     + "-t /dev/null "
     + "-c PCMU "
     + "-o independent_losses:enabled=true "
     + "-o independent_losses:loss_rate=0.1 "
     + "-o wavfile_output:filename=sample3_demo.wav");
    
     process = Runtime.getRuntime().exec("./itu_t_862 +8000 dg137.wav sample3_demo.wav");
     String mos = "Mos pesq= " + getPesqMos(process);
     System.out.println(mos);

     process = Runtime.getRuntime().exec("./itu_t_563 sample3_demo.wav");
     mos = "Mos 563= " + get563Mos(process);
     System.out.println(mos); */
    
    
    private void executeWav2Rtp(String arquivo_original, String arquivo_deg, String codec, float tx_perda) {
        try {
            
            String comando = "./wav2rtp "
                    + "-f " + arquivo_original + " "
                    + "-t /dev/null "
                    + "-c " + codec + " "
                    + "-o independent_losses:enabled=true "
                    + "-o independent_losses:loss_rate=" + tx_perda + " "
                    + "-o wavfile_output:filename=" + arquivo_deg;
            
            System.out.println(comando);
            Runtime.getRuntime().exec(comando);
        } catch (IOException ex) {
            Logger.getLogger(Analise.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private float get563Mos(String nome_dir_tx, String arquivo) throws IOException {
        String comando = "./itu_t_563 " + nome_dir_tx + arquivo;
        
        System.out.println(comando);
        Process process = Runtime.getRuntime().exec(comando);
        
        InputStreamReader in = new InputStreamReader(process.getInputStream());
        BufferedReader br = new BufferedReader(in);

        String line;
        float mos = 0f;
        try {
            while ((line = br.readLine()) != null) {
                line = line.trim().toLowerCase();
                if (line.contains("filename")) {
                    line = br.readLine();
                    if (line == null) {
                        return mos;
                    }

                    //System.out.println(line.indexOf(".wav"));
                    mos = Float.parseFloat(line.substring(line.indexOf(".wav") + 4).trim());
                    br.close();
                    in.close();
                    return mos;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Analise.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mos;
    }

    private float getPesqMos(String arquivo, File dir, String nome_dir_tx) throws IOException {
        
        String comando = "./itu_t_862 +8000 "
                            + dir.getPath() + File.separator + arquivo + " "
                            + nome_dir_tx + arquivo;
        System.out.println(comando);
        Process process = Runtime.getRuntime().exec(comando);
        
        InputStreamReader in = new InputStreamReader(process.getInputStream());
        BufferedReader br = new BufferedReader(in);

        String line;
        float mos = 0f;
        try {
            while ((line = br.readLine()) != null) {
                line = line.trim().toLowerCase();
                if (line.contains("prediction : pesq_mos =")) {
                    mos = Float.parseFloat(line.substring(line.indexOf("=") + 1).trim());
                    br.close();
                    in.close();
                    return mos;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Analise.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jCBCodec;
    private javax.swing.JComboBox jCBGenre;
    private javax.swing.JCheckBox jCBLimparTempAntes;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFDiretorio;
    private javax.swing.JTextField jTFHost;
    private javax.swing.JTextField jTFIdentificacao;
    private javax.swing.JTextField jTFPort;
    private javax.swing.JPasswordField jTFSenha;
    private javax.swing.JTextField jTFTaxaPerda;
    private javax.swing.JTextField jTFUser;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jtfBaseDados;
    // End of variables declaration//GEN-END:variables
}
