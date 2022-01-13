package Mainpackage;
import javax.swing.JPanel;
import Panels.Calculator.*;
import Panels.Converter.*;
import java.awt.Toolkit;

public class TheFrame extends javax.swing.JFrame {
    //menuState is a variavle which will determine the current screen
    //menuState=0 means, it is in main menu
    //menuState=1 means, it is in calculator options
    //menuState=2 means, it is in converter options
    int menuState=0;
    
    public void setApplicationWindow(JPanel ApplicationWindow) {
      /*This function is creates for removing all contents of current application
         panel and set object of another panel. By this, we will be able to change 
         windows dynamically.
       */
        this.ApplicationWindow.removeAll();
                
        this.ApplicationWindow.setSize(ApplicationWindow.getSize());
        this.ApplicationWindow.add(ApplicationWindow);
        this.ApplicationWindow.repaint();
        this.ApplicationWindow.revalidate();
    }
    
    public TheFrame() {
        initComponents();
        
        //Setting the icon image for the application
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/AppIcons/logo.png")));
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        FramePanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        enterButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        MenuBar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        ApplicationWindow = new javax.swing.JPanel();
        ChooseWindow = new javax.swing.JPanel();
        CaclculatorOptionButton = new javax.swing.JButton();
        ConverterOptionButton = new javax.swing.JButton();
        CalculatorWindow = new javax.swing.JPanel();
        BMICalculatorButton = new javax.swing.JButton();
        ScientificCalculatorButton = new javax.swing.JButton();
        AgeCalculatorButton = new javax.swing.JButton();
        FinancialCalculatorButton = new javax.swing.JButton();
        DiscountCalculatorButton = new javax.swing.JButton();
        PercentageCalculatorButton = new javax.swing.JButton();
        ConverterWindow = new javax.swing.JPanel();
        LengthButton2 = new javax.swing.JButton();
        AreaButton = new javax.swing.JButton();
        MassButton = new javax.swing.JButton();
        VolumeButton = new javax.swing.JButton();
        SpeedButton = new javax.swing.JButton();
        TemperatureButton = new javax.swing.JButton();
        TimeButton1 = new javax.swing.JButton();
        MoneyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UniCalc Pro");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(800, 550));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(new java.awt.CardLayout());

        FramePanel.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(51, 51, 51));
        HomePanel.setLayout(new java.awt.GridBagLayout());

        enterButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        enterButton.setText("Enter");
        enterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterButton.setFocusPainted(false);
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 10;
        HomePanel.add(enterButton, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HelloWorld();");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        HomePanel.add(jLabel4, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("This software is made by some unprofessional people.");
        jLabel6.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        HomePanel.add(jLabel6, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Your satisfaction is our goal .");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        HomePanel.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("requirements and meet those requirements at all times");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        HomePanel.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("We will do our best to understand our customer's");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        HomePanel.add(jLabel10, gridBagConstraints);

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        HomePanel.add(jPanel1, gridBagConstraints);

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        HomePanel.add(jPanel2, gridBagConstraints);

        FramePanel.add(HomePanel, "card4");

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));
        MainPanel.setLayout(new java.awt.GridBagLayout());

        MenuBar.setBackground(new java.awt.Color(204, 204, 204));
        MenuBar.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        ExitButton.setBackground(new java.awt.Color(186, 186, 186));
        ExitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/Exits.png"))); // NOI18N
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.setFocusPainted(false);
        ExitButton.setPreferredSize(new java.awt.Dimension(100, 90));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 2.9;
        MenuBar.add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        BackButton.setBackground(new java.awt.Color(186, 186, 186));
        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/gallery-homepage-icon-png43.png"))); // NOI18N
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.setFocusPainted(false);
        BackButton.setPreferredSize(new java.awt.Dimension(100, 90));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 3.0;
        MenuBar.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        MainPanel.add(MenuBar, gridBagConstraints);

        ApplicationWindow.setBackground(new java.awt.Color(51, 51, 51));
        ApplicationWindow.setMinimumSize(new java.awt.Dimension(700, 500));
        ApplicationWindow.setPreferredSize(new java.awt.Dimension(700, 500));
        ApplicationWindow.setLayout(new java.awt.CardLayout());

        ChooseWindow.setBackground(new java.awt.Color(204, 204, 255));
        ChooseWindow.setOpaque(false);
        ChooseWindow.setLayout(new java.awt.GridBagLayout());

        CaclculatorOptionButton.setBackground(new java.awt.Color(186, 186, 186));
        CaclculatorOptionButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CaclculatorOptionButton.setForeground(new java.awt.Color(255, 255, 255));
        CaclculatorOptionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/editCalcuMain.png"))); // NOI18N
        CaclculatorOptionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CaclculatorOptionButton.setFocusPainted(false);
        CaclculatorOptionButton.setPreferredSize(new java.awt.Dimension(200, 250));
        CaclculatorOptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaclculatorOptionButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        ChooseWindow.add(CaclculatorOptionButton, gridBagConstraints);

        ConverterOptionButton.setBackground(new java.awt.Color(186, 186, 186));
        ConverterOptionButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ConverterOptionButton.setForeground(new java.awt.Color(255, 255, 255));
        ConverterOptionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/Converter.png"))); // NOI18N
        ConverterOptionButton.setToolTipText("");
        ConverterOptionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConverterOptionButton.setFocusPainted(false);
        ConverterOptionButton.setPreferredSize(new java.awt.Dimension(200, 250));
        ConverterOptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConverterOptionButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        ChooseWindow.add(ConverterOptionButton, gridBagConstraints);

        ApplicationWindow.add(ChooseWindow, "card4");

        CalculatorWindow.setMinimumSize(new java.awt.Dimension(700, 500));
        CalculatorWindow.setOpaque(false);
        CalculatorWindow.setLayout(new java.awt.GridBagLayout());

        BMICalculatorButton.setBackground(new java.awt.Color(186, 186, 186));
        BMICalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/calculator/bmi.png"))); // NOI18N
        BMICalculatorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BMICalculatorButton.setFocusPainted(false);
        BMICalculatorButton.setPreferredSize(new java.awt.Dimension(150, 150));
        BMICalculatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMICalculatorButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        CalculatorWindow.add(BMICalculatorButton, gridBagConstraints);

        ScientificCalculatorButton.setBackground(new java.awt.Color(186, 186, 186));
        ScientificCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/calculator/ScCalcu.png"))); // NOI18N
        ScientificCalculatorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ScientificCalculatorButton.setFocusPainted(false);
        ScientificCalculatorButton.setPreferredSize(new java.awt.Dimension(150, 150));
        ScientificCalculatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScientificCalculatorButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        CalculatorWindow.add(ScientificCalculatorButton, gridBagConstraints);

        AgeCalculatorButton.setBackground(new java.awt.Color(186, 186, 186));
        AgeCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/calculator/age.png"))); // NOI18N
        AgeCalculatorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgeCalculatorButton.setFocusPainted(false);
        AgeCalculatorButton.setPreferredSize(new java.awt.Dimension(150, 150));
        AgeCalculatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeCalculatorButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        CalculatorWindow.add(AgeCalculatorButton, gridBagConstraints);

        FinancialCalculatorButton.setBackground(new java.awt.Color(186, 186, 186));
        FinancialCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/calculator/CGPA.png"))); // NOI18N
        FinancialCalculatorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FinancialCalculatorButton.setFocusPainted(false);
        FinancialCalculatorButton.setPreferredSize(new java.awt.Dimension(150, 150));
        FinancialCalculatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinancialCalculatorButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        CalculatorWindow.add(FinancialCalculatorButton, gridBagConstraints);

        DiscountCalculatorButton.setBackground(new java.awt.Color(186, 186, 186));
        DiscountCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/calculator/discount.png"))); // NOI18N
        DiscountCalculatorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DiscountCalculatorButton.setFocusPainted(false);
        DiscountCalculatorButton.setPreferredSize(new java.awt.Dimension(150, 150));
        DiscountCalculatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountCalculatorButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        CalculatorWindow.add(DiscountCalculatorButton, gridBagConstraints);

        PercentageCalculatorButton.setBackground(new java.awt.Color(186, 186, 186));
        PercentageCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/calculator/percentage.png"))); // NOI18N
        PercentageCalculatorButton.setToolTipText("");
        PercentageCalculatorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PercentageCalculatorButton.setFocusPainted(false);
        PercentageCalculatorButton.setPreferredSize(new java.awt.Dimension(150, 150));
        PercentageCalculatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PercentageCalculatorButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        CalculatorWindow.add(PercentageCalculatorButton, gridBagConstraints);

        ApplicationWindow.add(CalculatorWindow, "card2");

        ConverterWindow.setMinimumSize(new java.awt.Dimension(700, 500));
        ConverterWindow.setOpaque(false);
        ConverterWindow.setLayout(new java.awt.GridBagLayout());

        LengthButton2.setBackground(new java.awt.Color(186, 186, 186));
        LengthButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/converter/length.png"))); // NOI18N
        LengthButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LengthButton2.setFocusPainted(false);
        LengthButton2.setPreferredSize(new java.awt.Dimension(150, 150));
        LengthButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LengthButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        ConverterWindow.add(LengthButton2, gridBagConstraints);

        AreaButton.setBackground(new java.awt.Color(186, 186, 186));
        AreaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/converter/area.png"))); // NOI18N
        AreaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AreaButton.setFocusPainted(false);
        AreaButton.setPreferredSize(new java.awt.Dimension(150, 150));
        AreaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        ConverterWindow.add(AreaButton, gridBagConstraints);

        MassButton.setBackground(new java.awt.Color(186, 186, 186));
        MassButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/converter/mass.png"))); // NOI18N
        MassButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MassButton.setFocusPainted(false);
        MassButton.setPreferredSize(new java.awt.Dimension(150, 150));
        MassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MassButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        ConverterWindow.add(MassButton, gridBagConstraints);

        VolumeButton.setBackground(new java.awt.Color(186, 186, 186));
        VolumeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/converter/volume.png"))); // NOI18N
        VolumeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolumeButton.setFocusPainted(false);
        VolumeButton.setPreferredSize(new java.awt.Dimension(150, 150));
        VolumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        ConverterWindow.add(VolumeButton, gridBagConstraints);

        SpeedButton.setBackground(new java.awt.Color(186, 186, 186));
        SpeedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/converter/speed.png"))); // NOI18N
        SpeedButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SpeedButton.setFocusPainted(false);
        SpeedButton.setPreferredSize(new java.awt.Dimension(150, 150));
        SpeedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeedButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        ConverterWindow.add(SpeedButton, gridBagConstraints);

        TemperatureButton.setBackground(new java.awt.Color(186, 186, 186));
        TemperatureButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/converter/temp.png"))); // NOI18N
        TemperatureButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TemperatureButton.setFocusPainted(false);
        TemperatureButton.setPreferredSize(new java.awt.Dimension(150, 150));
        TemperatureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemperatureButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        ConverterWindow.add(TemperatureButton, gridBagConstraints);

        TimeButton1.setBackground(new java.awt.Color(186, 186, 186));
        TimeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/converter/time.png"))); // NOI18N
        TimeButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TimeButton1.setFocusPainted(false);
        TimeButton1.setPreferredSize(new java.awt.Dimension(150, 150));
        TimeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        ConverterWindow.add(TimeButton1, gridBagConstraints);

        MoneyButton.setBackground(new java.awt.Color(186, 186, 186));
        MoneyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppIcons/converter/money.png"))); // NOI18N
        MoneyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MoneyButton.setFocusPainted(false);
        MoneyButton.setPreferredSize(new java.awt.Dimension(150, 150));
        MoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        ConverterWindow.add(MoneyButton, gridBagConstraints);

        ApplicationWindow.add(ConverterWindow, "card3");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        MainPanel.add(ApplicationWindow, gridBagConstraints);

        FramePanel.add(MainPanel, "card2");

        getContentPane().add(FramePanel, "card5");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConverterOptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConverterOptionButtonActionPerformed
        //clearing Application window's panel and set converter window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ConverterWindow);
        
        menuState=0;
    }//GEN-LAST:event_ConverterOptionButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void CaclculatorOptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaclculatorOptionButtonActionPerformed
        //clearing Application window's panel and set calculator window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(CalculatorWindow);
        
        menuState=0;
    }//GEN-LAST:event_CaclculatorOptionButtonActionPerformed

    private void BMICalculatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMICalculatorButtonActionPerformed
        BMICalculator ob = new BMICalculator();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=1;
    }//GEN-LAST:event_BMICalculatorButtonActionPerformed

    private void ScientificCalculatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScientificCalculatorButtonActionPerformed
        ScientificCalculator ob = new ScientificCalculator();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=1;
    }//GEN-LAST:event_ScientificCalculatorButtonActionPerformed

    private void AgeCalculatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeCalculatorButtonActionPerformed
        AgeCalculator ob = new AgeCalculator();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=1;
    }//GEN-LAST:event_AgeCalculatorButtonActionPerformed

    private void FinancialCalculatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinancialCalculatorButtonActionPerformed
        CgpaCalculator ob = new CgpaCalculator();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=1;
    }//GEN-LAST:event_FinancialCalculatorButtonActionPerformed

    private void DiscountCalculatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountCalculatorButtonActionPerformed
        DiscountCalculator ob = new DiscountCalculator();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=1;
    }//GEN-LAST:event_DiscountCalculatorButtonActionPerformed

    private void PercentageCalculatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PercentageCalculatorButtonActionPerformed
        PercentageCalculator ob = new PercentageCalculator();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=1;
    }//GEN-LAST:event_PercentageCalculatorButtonActionPerformed

    private void LengthButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LengthButton2ActionPerformed
        Length ob = new Length();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=2;
    }//GEN-LAST:event_LengthButton2ActionPerformed

    private void AreaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaButtonActionPerformed
        Area ob = new Area();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=2;
    }//GEN-LAST:event_AreaButtonActionPerformed

    private void VolumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumeButtonActionPerformed
        Volume ob = new Volume();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=2;
    }//GEN-LAST:event_VolumeButtonActionPerformed

    private void SpeedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeedButtonActionPerformed
        Speed ob = new Speed();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=2;
    }//GEN-LAST:event_SpeedButtonActionPerformed

    private void TemperatureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemperatureButtonActionPerformed
        Temperature ob = new Temperature();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=2;
    }//GEN-LAST:event_TemperatureButtonActionPerformed

    private void TimeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeButton1ActionPerformed
        Time ob = new Time();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=2;
    }//GEN-LAST:event_TimeButton1ActionPerformed

    private void MoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyButtonActionPerformed
        Money ob = new Money();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=2;
    }//GEN-LAST:event_MoneyButtonActionPerformed

    private void MassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MassButtonActionPerformed
        Mass ob = new Mass();
        //clearing Application window's panel and set the following window's panel
        ApplicationWindow.removeAll();
        setApplicationWindow(ob);
        
        menuState=2;
    }//GEN-LAST:event_MassButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        //clearing Application window's panel and set following window's panel
        
        if(menuState==0){
            //it will set work as a back button in mainmenu
            ApplicationWindow.removeAll();
            setApplicationWindow(ChooseWindow);
        }
        else if(menuState==1){
            //it will set work as a back button in calculator options
            ApplicationWindow.removeAll();
            setApplicationWindow(CalculatorWindow);
            menuState=0;
        }
        else if(menuState==2){
            //it will set work as a back button in convrter options
            ApplicationWindow.removeAll();
            setApplicationWindow(ConverterWindow);
            menuState=0;
        }
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        FramePanel.removeAll();
                
        FramePanel.setSize(MainPanel.getSize());
        FramePanel.add(MainPanel);
        FramePanel.repaint();
        FramePanel.revalidate();
    }//GEN-LAST:event_enterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ErrorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ErrorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ErrorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ErrorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheFrame().setVisible(true);
                
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgeCalculatorButton;
    private javax.swing.JPanel ApplicationWindow;
    private javax.swing.JButton AreaButton;
    private javax.swing.JButton BMICalculatorButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CaclculatorOptionButton;
    private javax.swing.JPanel CalculatorWindow;
    private javax.swing.JPanel ChooseWindow;
    private javax.swing.JButton ConverterOptionButton;
    private javax.swing.JPanel ConverterWindow;
    private javax.swing.JButton DiscountCalculatorButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton FinancialCalculatorButton;
    private javax.swing.JPanel FramePanel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JButton LengthButton2;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton MassButton;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JButton MoneyButton;
    private javax.swing.JButton PercentageCalculatorButton;
    private javax.swing.JButton ScientificCalculatorButton;
    private javax.swing.JButton SpeedButton;
    private javax.swing.JButton TemperatureButton;
    private javax.swing.JButton TimeButton1;
    private javax.swing.JButton VolumeButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
