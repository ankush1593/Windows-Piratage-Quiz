package app;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class Pirate extends javax.swing.JFrame {
    
    String[][] qpa;
    String[][] qca;
    String [][] qh;
    int i = 0;
    int j = 0;    
    int totalScore = 0;
    int score = 10;
    int timeRemaining = 300;
    Timer countdownTimer;
    int TTS = 0;    
   
    public Pirate() {
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setTitle("WINDOWS PIRATAGE"); 
        setExtendedState(MAXIMIZED_BOTH);
        /*setResizable(false);*/
        getContentPane().setBackground(Color.DARK_GRAY);        
        initializedata();
        initComponents();        
    }
    
     class CountdownTimerListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         if (--timeRemaining > 0) {
            jLabel3.setText("Timer: "+String.valueOf(timeRemaining));
         } else {
            jLabel3.setText("Time's up!");
            countdownTimer.stop();
              try {
                Process p = Runtime.getRuntime().exec("C:\\runit.bat");
                p.waitFor();
            } catch (Exception err) {
                err.printStackTrace();
            }
         }
      }
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 255));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 51));
        jButton1.setText("GET HINT 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("START ROUND");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCORE:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIMER: 10");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUESTION");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HINT 1");

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("VALIDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setText("LOCK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("jPasswordField1");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("HINT 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        j++;
        hint(j);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(jPasswordField1.getText().equals("pirate42015")){
            jPasswordField1.setText("");
            select(i);
            i++;
        }
        else if(jPasswordField1.getText().equals("barbosa2611")){
            // add points
            score = 10;
            if (jLabel5.isVisible()) {
                score -= 2;
            }
            if (jLabel6.isVisible()) {
                score -= 3;
            }
            /*if (jLabel7.isVisible()) {
                score -= 3;
            }*/
            totalScore += score;
            jLabel2.setText(" Score : " + totalScore + "     Time Saved : " + TTS);
            jPasswordField1.setText("");            
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
                countdownTimer.stop();
                Process p = Runtime.getRuntime().exec("C:\\runit.bat");
                p.waitFor();
                TTS = TTS + timeRemaining;
            } catch (Exception err) {
                err.printStackTrace();
            }
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
            java.util.logging.Logger.getLogger(Pirate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pirate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pirate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pirate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pirate().setVisible(true);
            }
        });
    }
    
    public void initializedata() {
        //qpa stores pairs of question and its possible answers
        qpa = new String[10][1];    

        qpa[0][0] = "Tia Dalma Calypso made a prophecy \"Nobody in the world could make a folder with names 'COM3' 'LPT1' 'PRN' except for a true pirate.\" You being Captain Jack Sparrow be our only hope. (Make the folders on Desktop) </html>";

        qpa[1][0] = "Black Pearl often used to deviate from its path. Jack Sparrow developed an application (Black Pearl Tracker) that tracked the path of Black Pearl.\n But the problem was, Jack Sparrow being a lazy captain wanted to create a shortcut key (Ctrl+Alt+j) for it so that he can directly execute the application. Try help him out.";

        qpa[2][0] = "Sparrow doesn’t rely on the blacksmith, He never buy tools he makes his own tools. And so you have to create your own run command. Make a command to open recycle bin from run. Run command should be 'rbin'";

        qpa[3][0] = "Secret messages are a part and parcel of pirates. One of the techniques commonly used is hiding useful information behind apparently useless information. You have a file named abc.gif which has some secret information hidden underneath it. Find that information.";

        qpa[4][0] = "Bootstrap has been tricked by the pirates. The deeper he goes in directory structure he always comes back to the same point. Help him exit this recursion. Figure out the anomaly and rectify it. (Folder is in drive D with name D)";

        qpa[5][0] = "Sparrow hates defaults. He always stays out of the league. He wants all his program to go in a custom folder ( D:/myprg) rather than program files.";

        qpa[6][0] = "It’s a bad day for Elizabeth today. She received a message saying that she has won a lottery. It was after the click that she realized that it was a virus in disguised. Help her to get rid of it.";

        qpa[7][0] = "Sparrow used to work on Linux where paging was a breeze. Recently he switched to windows and paging is apparently inefficient here. Since he is new to windows he has asked you to disable the paging system here. ";

        qpa[8][0] = "There is a hidden file on the desktop do the following: find the folder named secret and find the flag hidden in the file in it.";

        qpa[9][0] = "A true pirate loves to travel. He has installed windows 7 in a virtual disk file. Whenever he needs to use it he copies the file to a public computer, add it to the boot menu, boots into it, does his work and takes back the vhd file with him.";

        //qca stores pairs of question and its correct answer
        /*qca = new String[10][2];

        qca[0][0] = "How to run Java program on the command prompt?";
        qca[0][1] = "java JavaProgram";

        qca[1][0] = "What is the use of the println method?";
        qca[1][1] = "It is used to print text on the screen with the line break.";

        qca[2][0] = "How to read a character from the keyboard?";
        qca[2][1] = "char c=(char)System.in.read()";

        qca[3][0] = "Which one is a single-line comment?";
        qca[3][1] = "//...";

        qca[4][0] = "How do you declare an integer variable x?";
        qca[4][1] = "int x";

        qca[5][0] = "How do you convert a string of number to a number?";
        qca[5][1] = "int num=Integer.parseInt(str_num)";

        qca[6][0] = "What is the value of x? int x=3>>2";
        qca[6][1] = "0";

        qca[7][0] = "How to do exit a loop?";
        qca[7][1] = "Using break";

        qca[8][0] = "What is the correct way to allocate one-dimensional array?";
        qca[8][1] = "int[] arr=new int[size]";

        qca[9][0] = "What is the correct way to allocate two-dimensional array?";
        qca[9][1] = "int[][] arr=new int[rows][cols]";
        */
        qh = new String[10][3];
        
        qh[0][0] = "Try inserting the special character 'empty space' ";
        qh[0][1] = "Press shift + right click to insert advanced Unicode character";
        /*qh[0][2] = "How to run Java program on the command prompt?c";*/
        
        qh[1][0] = "Shortcut keys can be assigned to shortcuts only";
        qh[1][1] = "Why don’t you play with the properties ?";
        /*qh[1][2] = "What is the use of the println method?c";*/

        qh[2][0] = "Look for directory where run command executables are kept.";
        qh[2][1] = "Look for the directory where executable of the explorer is.";
        /*qh[2][2] = "How to read a character from the keyboard?c";*/
    
        qh[3][0] = "Winrar might help you, Ahoy!";
        qh[3][1] = "It might split the file into two files.";
        /*qh[3][2] = "Which one is a single-line comment?c";*/

        qh[4][0] = "Do you know about disk management tool";
        qh[4][1] = "Do you know we can mount volumes on folders";
        /*qh[4][2] = "How do you declare an integer variable x?c";*/

        qh[5][0] = "Run regedit and find local machine registry.";
        qh[5][1] = "Go to software/Microsoft/windows/currentversion. From here now on you are on your own";
        /*qh[5][2] = "How do you convert a string of number to a number?c";*/

        qh[6][0] = "It looks like some batch is executing a script indefinitely.";
        qh[6][1] = "Task manager might help you to stop it.";
        /*qh[6][2] = "What is the value of x? int x=3>>2c";*/

        qh[7][0] = "Try changing ‘advanced system settings’.";
        qh[7][1] = "The ‘performance’ of windows is affected by the virtual memory and virtual memory is related to paging.";
        /*qh[7][2] = "How to do exit a loop?c";*/
        

        qh[8][0] = "Try changing attributes of the folder.";
        qh[8][1] = "Use cacls command to access the folder.";
        /*qh[8][2] = "What is the correct way to allocate one-dimensional array?c";*/

        qh[9][0] = "In the folder windows/system32 (inside the VHD) lies the program called BCD boot. It is a tool that helps us to add boot entries to the bcd store.";
        qh[9][1] = "Give the path of the new windows directory as a parameter to the bcdboot program to add it to the boot store.";
        /*qh[9][2] = "What is the correct way to allocate two-dimensional array?c";*/

    }
    
        public void select(int i) {
        if(i==0 || i==1 || i==2 || i==6){
            timeRemaining = 300;
        }
        else if(i==3 || i==5 || i==7 || i==8){
            timeRemaining = 600;
        }
        if(i==4 || i==9){
            timeRemaining = 900;
        }
        
        countdownTimer = new Timer(1000, new CountdownTimerListener());
        setVisible(true);
        countdownTimer.start();
        jLabel4.setText("<html>  " + qpa[i][0]);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);        
        jLabel1.setText("   Level  " + (i + 1));
        j=0;
        jButton1.setText("Get Hint 1");
        /*new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                // your code here
                try {
                Process p = Runtime.getRuntime().exec("C:\\runit.bat");
                p.waitFor();
            } catch (Exception err) {
                err.printStackTrace();
            }
            }
        }, 
        5000 //timer duration
);*/

    }
        
        public void hint(int j){
            if(j == 1){
                jLabel5.setVisible(true);
                jLabel5.setText("<html>"+qh[i-1][j-1]);
                jButton1.setText("Get Hint 2");
            }
            if(j == 2){
                jLabel6.setVisible(true);
                jLabel6.setText("<html>"+qh[i-1][j-1]);
                jButton1.setText("Becoming Greedy ?");
            }
            /*if(j == 3){
                jLabel7.setVisible(true);
                jLabel7.setText(qh[i-1][j-1]);
                jButton1.setText("Becoming Greedy ?");
            }*/
        }
        
        

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration                   
}
