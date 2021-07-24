
import java.awt.Color;
import java.awt.Container;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Statistic extends JFrame{
    
    private Container container;
    private JLabel accnumlabel,nameLabel,accTypeLabel,savingAccLabel,cheakingAccLabel,CreditAccLabel,alldepLabel,allCreditLabel,AvgDepLabel,AvgCreLabel;
   
     public JTextField accnumTextField,allbalTextField, AvgbalTextField,savTextField,creditTextField,checkTextField,
                       alldepTextField,allCreditTextfield,avgDepositTextFiled,avgCreditTextField ; 
    private JButton statisticButton,returnButton, updateButton;
    private JPasswordField passTextField,conPasswordField;
    private Font f,newf;
    private JList JListField;
    
    
    
    
    public Statistic(){
    
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(350,170,620,410);
        this.setTitle("Personal Account Create Account Dialog");
        this.setResizable(false);

 container=this.getContentPane();
   container.setBackground(new Color(51,153,255));
      
  container.setLayout(null);
  
  
  f=new Font("arial",Font.ITALIC,16);
  newf=new Font("arial",Font.ITALIC,15);
  
  //label...............................
  
  accnumlabel=new JLabel("Account Number:"); 
  accnumlabel.setBounds(30,40,150,40);
  accnumlabel.setFont(f);
  accnumlabel.setForeground(Color.BLUE);
  container.add(accnumlabel);
  
   nameLabel=new JLabel("All Balance:"); 
  nameLabel.setBounds(30,140,150,40);
  nameLabel.setFont(f);
  nameLabel.setForeground(Color.BLUE);
  container.add(nameLabel);
  
  
  accTypeLabel=new JLabel("Average Balance:"); 
  accTypeLabel.setBounds(30,220,150,40);
  accTypeLabel.setFont(f);
  accTypeLabel.setForeground(Color.BLUE);
  container.add(accTypeLabel);
  
  
  
  
  savingAccLabel=new JLabel("Saving Account");
  savingAccLabel.setBounds(310,5,150,30);
  savingAccLabel.setFont(f);
  savingAccLabel.setForeground(Color.BLUE);
  container.add(savingAccLabel);
  
  cheakingAccLabel=new JLabel("Checking Account");
  cheakingAccLabel.setBounds(310,40,150,30);
  cheakingAccLabel.setFont(f);
  cheakingAccLabel.setForeground(Color.BLUE);
  container.add(cheakingAccLabel);
  
  
  CreditAccLabel=new JLabel("Credit Account");
  CreditAccLabel.setBounds(310,75,150,30);
  CreditAccLabel.setFont(f);
  CreditAccLabel.setForeground(Color.BLUE);
  container.add(CreditAccLabel);
  
  alldepLabel=new JLabel("All Deposit");
  alldepLabel.setBounds(310,130,150,30);
  alldepLabel.setFont(f);
  alldepLabel.setForeground(Color.BLUE);
  container.add(alldepLabel);
  
 
  allCreditLabel=new JLabel("All Deposit");
  allCreditLabel.setBounds(310,170,150,30);
  allCreditLabel.setFont(f);
  allCreditLabel.setForeground(Color.BLUE);
  container.add( allCreditLabel);
  
  
  
  AvgDepLabel=new JLabel("All Deposit");
  AvgDepLabel.setBounds(310,210,150,30);
  AvgDepLabel.setFont(f);
  AvgDepLabel.setForeground(Color.BLUE);
  container.add( AvgDepLabel);
  
  
  
  
     AvgCreLabel=new JLabel("All Deposit");
     AvgCreLabel.setBounds(310,250,150,30);
     AvgCreLabel.setFont(f);
     AvgCreLabel.setForeground(Color.BLUE);
     container.add(AvgCreLabel);
  
  
  
  //Text Field...........................
  
  accnumTextField=new JTextField("0");
   //accnumTextField.setEnabled(false);
   accnumTextField.setFont(newf);
   accnumTextField.setBounds(200,40,100,30); 
   accnumTextField.setEnabled(false);
    accnumTextField.setBackground(new Color(255,255,204));
   container.add(accnumTextField);
   
   
      allbalTextField=new JTextField("0");
   allbalTextField.setFont(newf);
   //allbalTextField.setEnabled(false);
   allbalTextField.setBounds(200,140,100,30); 
   allbalTextField.setEnabled(false);
   container.add(allbalTextField);
    allbalTextField.setBackground(new Color(255,255,204));
   
     AvgbalTextField=new JTextField("0");
   AvgbalTextField.setFont(newf);
   AvgbalTextField.setBounds(200,220,100,30); 
  AvgbalTextField.setEnabled(false);
   AvgbalTextField.setBackground(new Color(255,255,204));
   container.add(AvgbalTextField);
   
   

  
      savTextField=new JTextField("0");
   savTextField.setFont(newf);
   savTextField.setBounds(470,5,100,30); 
   savTextField.setEnabled(false);
    savTextField.setBackground(new Color(255,255,204));
   container.add(savTextField);
   
   
       checkTextField=new JTextField("0");
   checkTextField.setFont(newf);
   checkTextField.setBounds(470,40,100,30); 
   checkTextField.setEnabled(false);
   container.add(checkTextField);
    checkTextField.setBackground(new Color(255,255,204));
   
   
         creditTextField=new JTextField("0");
   creditTextField.setFont(newf);
   creditTextField.setBounds(470,75,100,30); 
    creditTextField.setBackground(new Color(255,255,204));
   container.add(creditTextField);
   creditTextField.setEnabled(false);
   
   

   alldepTextField=new JTextField("0");
   alldepTextField.setFont(newf);
    alldepTextField.setBackground(new Color(255,255,204));
   alldepTextField.setBounds(470,130,100,30); 
   container.add(alldepTextField);
        
   alldepTextField.setEnabled(false);
      
    allCreditTextfield=new JTextField("0");
   allCreditTextfield.setFont(newf);
   allCreditTextfield.setBounds(470,170,100,30); 
   container.add(allCreditTextfield);
    allCreditTextfield.setBackground(new Color(255,255,204));
   allCreditTextfield.setEnabled(false);
        
        
   avgDepositTextFiled=new JTextField("0");
   avgDepositTextFiled.setFont(newf);
   avgDepositTextFiled.setBounds(470,210,100,30); 
   container.add(avgDepositTextFiled);
    avgDepositTextFiled.setBackground(new Color(255,255,204));
   avgDepositTextFiled.setEnabled(false);
       
   avgCreditTextField=new JTextField("0");
   avgCreditTextField.setFont(newf);
   avgCreditTextField.setBounds(470,250,100,30); 
    avgCreditTextField.setBackground(new Color(255,255,204));
   container.add(avgCreditTextField);
   avgCreditTextField.setEnabled(false);
   
   
   
   
  //button..................
  
   updateButton= new JButton("Update");
   updateButton.setBounds(80,320,100,30);
   updateButton.setFocusable(false);
   container.add(updateButton);
   updateButton.addActionListener(new ActionListener(){
            @Override
          
            public void actionPerformed(ActionEvent ae) {
               accnumTextField.setText("6");
                allbalTextField.setText("1212.0");
                 savTextField.setText("202.00");
                  creditTextField.setText("2");
                   checkTextField.setText("2");
                    alldepTextField.setText("1212.0");
                     allCreditTextfield.setText("0.00");
                     avgDepositTextFiled.setText("606.0");
                             avgCreditTextField.setText("0.00");
            }
        });
  
   statisticButton= new JButton("Statistic");
   statisticButton.setBounds(260,320,100,30);
   statisticButton.setFocusable(false);
   container.add(statisticButton);
    accnumTextField.setText("6");
    statisticButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               allbalTextField.setText("1212.0");
                 savTextField.setText("202.00");
                  creditTextField.setText("2");
                   checkTextField.setText("2");
                    alldepTextField.setText("1212.0");
                     allCreditTextfield.setText("0.00");
                     avgDepositTextFiled.setText("606.0");
                             avgCreditTextField.setText("0.00");
            }
        });
               
   
   
   returnButton=new JButton("Return");
   returnButton.setBounds(440, 320, 100, 30);
   returnButton.setFocusable(false);
   container.add(returnButton);
   
   returnButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               MainDialog main=new MainDialog();
               main.setVisible(true);
               dispose();
            }
        });
    }
    
}
