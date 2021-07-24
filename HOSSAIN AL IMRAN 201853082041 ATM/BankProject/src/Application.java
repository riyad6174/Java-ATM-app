






import java.awt.Color;
import java.awt.Container;


import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Application extends JFrame {
    public JFrame frame;
   
    private JLabel id, pass;
    public static JTextField userNameField;
    private static JPasswordField passWordField;
    private ButtonGroup button;
    private JRadioButton customerBox, clerkBox;
    private JButton loginButton, resetButton, register;
    private Font font;
    private ImageIcon img;
    private Container container;
     
   
   
  

 
   
   
   
   
   
    File f=new File("c:\\UserInformation");
   int ln;
  
    void CreateFolder(){
        Deposit d=new Deposit();
    if(!f.exists()){
    f.mkdirs();
    }
   }
     void readFile(){
        try {
            FileReader fr = new FileReader("c:\\UserInformation\\logins.txt");
            System.out.println("file exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter("c:\\UserInformation\\logins.txt");
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }
  

    
  
     void logic(String user,String pass){
        try {
            RandomAccessFile raf = new RandomAccessFile("c:\\UserInformation\\logins.txt", "rw");
            for(int i=0;i<ln;i+=7){
                
            
                String foruser = raf.readLine().substring(7);
                String forpassword = raf.readLine().substring(9);
                
                if(user.equals(foruser) & pass.equals(forpassword)){
                    if (customerBox.isSelected()){
                     MainDialog2 customer=new MainDialog2();
                 
                        customer.setVisible(true);
                        
                        
                        dispose(); 
                        
                    }
                    else if(clerkBox.isSelected()){
                     JOptionPane.showMessageDialog(null, "Illegal login Operation");
                    }
                   
                      
                    break;
                        
                    
                }
                if(user.equals("admin") & pass.equals("admin")){
                
                 if (clerkBox.isSelected()){
                     MainDialog main=new MainDialog();
                        main.setVisible(true);
                        
                        dispose(); 
                        
                    }
                 else if (customerBox.isSelected()){
                 JOptionPane.showMessageDialog(null, "Illegal login Operation");
                 }
                 break;
                }
                
                
                else if(i==(ln-2)){
                    JOptionPane.showMessageDialog(null, "incorrect username/password");
                    break;
                }
                
                // if you are using user & passwword without email
                // then dont forget to replace  k<=2 with k=2 below
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
 
    Application(){
      
      Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Riyad\\Desktop\\BankProject\\src\\atm.png");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setBounds(350,170,620,410);
      this.setTitle("Personal Account System--Login Dialog");
      this.setResizable(false);
      JFrame frame= new JFrame();
      frame.setIconImage(icon);
 
      container=this.getContentPane();
      container.setBackground(new Color(51,153,255));
     
     
      container.setLayout(null);
     

       
     
      
   
      font= new Font("Arial",Font.ITALIC,15);
      
      id=new JLabel("Account ID:");
      
      id.setBounds(140,60,100,40);
      id.setFont(font); 
      container.add(id);
      
      
          font= new Font("Arial",Font.ITALIC,16);

    
    
    pass=new JLabel("Password:");
    
    pass.setBounds(140,110,100,40);
    
    pass.setFont(font);
    container.add(pass);

   
   userNameField=new JTextField("10000");
   userNameField.setBounds(250,60,190,40);
    userNameField.setForeground(Color.BLUE);
    userNameField.setBackground(new Color(255,255,204));
   userNameField.setFont(font);
   container.add(userNameField);

   
   
   
   
    passWordField= new JPasswordField("admin");
    passWordField.setForeground(Color.BLUE);
    passWordField.setBackground(new Color(255,255,204));
    passWordField.setBounds(250,110,190,40);
    passWordField.setFont(font);
    container.add(passWordField);
   
    
    
  
    button=new ButtonGroup();
    customerBox= new JRadioButton("Customer");
    customerBox.setBorder(null);

    customerBox.setBounds(170, 160, 100, 20);
    customerBox.setBackground(null);
    customerBox.setOpaque(false);
    customerBox.setFocusable(false);
    customerBox.setBackground(new Color(0,0,0,0));
    customerBox.setForeground(Color.white);
    container.add(customerBox);
    
  
   

    clerkBox= new JRadioButton("Clerk",true);
    clerkBox.setBorder(null);
    clerkBox.setFocusable(false);
    clerkBox.setBounds(280,160,100,20);
    clerkBox.setOpaque(false);
    clerkBox.setBackground(new Color(0,0,0,0));
    clerkBox.setForeground(Color.white);
    container.add(clerkBox);
  
    
   button.add(customerBox);
   button.add(clerkBox);
      
   
   ImageIcon loginIcon=new ImageIcon("C:\\Users\\Riyad\\Desktop\\BankProject\\src\\log-in-button.png");
   
           
           
    loginButton =new JButton("Login",loginIcon);
    loginButton.setBounds(160, 210, 120, 40);
    loginButton.setBackground(new Color(250,250,250));
    loginButton.setFocusable(false);
    container.add(loginButton);
    
     ImageIcon resetIcon=new ImageIcon("C:\\Users\\Riyad\\Desktop\\BankProject\\src\\refreshing.png");
    resetButton=new JButton("Reset",resetIcon);
    resetButton.setBounds(310, 210, 120, 40);
    resetButton.setBackground(new Color(250,250,250));
    resetButton.setFocusable(false);
    container.add(resetButton);
    resetButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
             userNameField.setText("");
             passWordField.setText("");
          }
      });
    

         
     
    
    resetButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
             userNameField.setText("");
             passWordField.setText("");
        }
      });
    
    
    
             
      
    
     loginButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              
              if(ae.getSource()==loginButton){
              
                 
                      String username=userNameField.getText();
                      String password=passWordField.getText();
                      
                      logic(userNameField.getText(),passWordField.getText());
                      readFile();
                      countLines();
                   
                   
                   //Deposit d=new Deposit(); 
                   // d.AddDataToField(username, password);
                      
                
              
              
              
              
              
              
              }
  

            

           
           
        
            }
          

          
          
      });
    
    
    }
    
    
    
    
    
    public static void main(String[] args) 
            
{
    
   Application app =new Application();
   app.setVisible(true);
   
      
     /*
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    */
          
    
    }
 
		
}
