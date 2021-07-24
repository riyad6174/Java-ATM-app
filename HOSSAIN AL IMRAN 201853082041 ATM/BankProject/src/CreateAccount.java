

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import javax.swing.JPasswordField;

import javax.swing.JTextField;



public class CreateAccount extends JFrame {
    
    
    
    private Container container;
    private JComboBox combo;
    private JLabel idLabel,passwordLabel,passConLabel,nameLabel,accTypeLabel,finalLabel;
    public static JTextField accTextField ,nameTextField ,finalTextField,TypeTextField ; 
    private JButton registerButton, clearButton,returnButton;
    private JPasswordField passTextField,conPasswordField;
    private Font f,newf;
   
    
    File fnew=new File("c:\\UserInformation");
    int ln;
    
    String UserName,Password,accountType,account_id;
    int balance;
    
    
    void CreateFolder(){
    if(!fnew.exists()){
    fnew.mkdirs();
    }
    
    }
    
    void readFile(){
        try {
            FileReader fr=new FileReader("c:\\UserInformation\\logins.txt");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw=new FileWriter("c:\\UserInformation\\logins.txt");
                System.out.println("file  Created");
            } catch (IOException ex1) {
                Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      



    void addData(String accTextField,String passTextField,String nameTextField,String TypeTextField,String finalTextField) throws IOException{
        try {
            RandomAccessFile raf=new RandomAccessFile("c:\\UserInformation\\logins.txt","rw");
            
            for(int i=0;i<ln;i++){
            raf.readLine();
            }
           if(ln>0){
              raf.writeBytes("\r\n");
              raf.writeBytes("\r\n");
              
          }
          raf.writeBytes("UserId:"+accTextField+"\r\n");
          raf.writeBytes("Password:"+passTextField+"\r\n");
          raf.writeBytes("Name:"+nameTextField+"\r\n");
          raf.writeBytes("Accounttype:"+TypeTextField+"\r\n");
          raf.writeBytes("rate:"+finalTextField);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }  
    
  
  
  
       void logic(String accTextField,String passTextField,String nameTextField,String TypeTextField,String finalTextField){
            String userid,pass,name,acctype,rate;
           try {
            RandomAccessFile raf = new RandomAccessFile("c:\\UserInformation\\logins.txt","rw");
            for(int i=0;i<ln;i+=7){System.out.println("count "+i);
                    String line = raf.readLine();
                   userid=line.substring(7);
                   pass=raf.readLine().substring(9);
                   name=raf.readLine().substring(5);
                   acctype=raf.readLine().substring(12);
                   rate=raf.readLine().substring(5);
               
                
                
                
             
                for(int k=1;k<=5;k++){
                    raf.readLine();
                    
                }
               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
  
       
       
       void countLines(){
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile("c:\\UserInformation\\logins.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            //System.out.println("number of lines:"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
         
         

  
   
    
    
    
    
 public CreateAccount(){
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setBounds(350,170,620,410);
 this.setTitle("Personal Account Create Account Dialog");
 this.setResizable(false);
  container=this.getContentPane();
  container.setBackground(new Color(51,153,255));
      
  container.setLayout(null);
  
  
  f=new Font("arial",Font.ITALIC,16);
  newf=new Font("arial",Font.ITALIC,15);
  
  
     
      
   
      
      
      
  idLabel=new JLabel("Account ID:"); 
  idLabel.setBounds(100,60,100,40);
  idLabel.setFont(f);
  idLabel.setForeground(Color.BLUE);
  container.add(idLabel);
  
    passwordLabel=new JLabel("Password(>6 Chars):"); 
  passwordLabel.setBounds(100,100,150,40);
  passwordLabel.setFont(f);
  passwordLabel.setForeground(Color.BLUE);
  container.add(passwordLabel);
  
    passConLabel=new JLabel("Password Confirm:"); 
  passConLabel.setBounds(100,140,150,40);
  passConLabel.setFont(f);
  passConLabel.setForeground(Color.BLUE);
  container.add(passConLabel);
  
    nameLabel=new JLabel("Name:"); 
  nameLabel.setBounds(100,180,150,40);
  nameLabel.setFont(f);
  nameLabel.setForeground(Color.BLUE);
  container.add(nameLabel);
  
    accTypeLabel=new JLabel("Account Type:"); 
  accTypeLabel.setBounds(100,220,150,40);
  accTypeLabel.setFont(f);
  accTypeLabel.setForeground(Color.BLUE);
  container.add(accTypeLabel);
  
    finalLabel=new JLabel("Transition Fee:"); 
  finalLabel.setBounds(100,260,150,40);
  finalLabel.setForeground(Color.BLUE);
  finalLabel.setFont(f);
  container.add(finalLabel);
  
      
   accTextField=new JTextField();

   accTextField.setEnabled(false);
   accTextField.setFont(newf);
   accTextField.setBounds(300,60,260,30); 
   container.add(accTextField);
   
   
   
    passTextField=new JPasswordField();
   passTextField.setFont(newf);
   passTextField.setBounds(300,100,260,30); 
   container.add(passTextField);
   
   
     conPasswordField=new JPasswordField();
   conPasswordField.setFont(newf);
   conPasswordField.setBounds(300,140,260,30); 
   container.add(conPasswordField);
      
      
   nameTextField=new JTextField();
   nameTextField.setFont(newf);
   nameTextField.setBounds(300,180,260,30); 
   container.add(nameTextField);
   
    TypeTextField=new JTextField();
   TypeTextField.setFont(newf);
   TypeTextField.setBounds(300,220,260,30); 
  // container.add(TypeTextField);
   
  /*
   JListField=new JList(Accounts);
   JListField.setVisibleRowCount(1);
   JListField.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   
   JListField.setBounds(300, 220, 200, 100);
   container.add(JListField);
  
   
   selection=new JScrollPane(JListField);
  revalidate();
  */
   
   registerButton=new JButton("Register");
   registerButton.setBounds(300,320,100,30);
   registerButton.setFocusable(false);
   registerButton.setBackground(new Color(250,250,250));
  
   container.add(registerButton);
   registerButton.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
         
         
         try {
             addData(accTextField.getText(),passTextField.getText(),nameTextField.getText(),TypeTextField.getText(),finalTextField.getText());
             CreateFolder();
             //logic(account_id,passTextField.getText(),nameTextField.getText(),balance);
             readFile();
             countLines();
             JOptionPane.showMessageDialog(null, "Account Registered!");
             
         } catch (IOException ex) {
             Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
         }
        
     }
 });

   clearButton= new JButton("Clear");
   clearButton.setBounds(400,320,80,30);
   clearButton.setFocusable(false);
   clearButton.setBackground(new Color(250,250,250));
   container.add(clearButton);
      clearButton.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
        accTextField.setText("");
        passTextField.setText("");
        finalTextField.setText("");
        nameTextField.setText("");
         passTextField.setText("");
           conPasswordField.setText("");
        
        
     }
 });
  
   returnButton=new JButton("Return");
   returnButton.setBounds(480, 320, 100, 30);
   returnButton.setFocusable(false);
   container.add(returnButton);
   returnButton.setBackground(new Color(250,250,250));
   returnButton.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
     
    MainDialog m=new MainDialog();
   
    m.setVisible(true);
    dispose();
     }
 });
   String Accounts[]={"Cheking Account","Credit Account","Saving Account"}; 
   combo=new JComboBox(Accounts);
   combo.setBounds(300,220,260,30);
   container.add(combo);
   
   combo.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
     String selectedValue=combo.getSelectedItem().toString();
       //  finalLabel.setText(selectedValue);
        // TypeTextField.setText(selectedValue);
         switch (combo.getSelectedIndex()) {
             case 0:
                 finalLabel.setText("Transition Fee:");
                 break;
             case 1:
                 finalLabel.setText("Credit Line:");
                 break;
             case 2:
                 finalLabel.setText("Interest Rate");
                 break;
             default:
                 break;
         }
     
     }
 });
   
   
   
   
   finalTextField=new JTextField();
    finalTextField.setFont(newf);
   finalTextField.setBounds(300,260,260,30); 
   container.add(finalTextField);
   
 }
 
   
 }

