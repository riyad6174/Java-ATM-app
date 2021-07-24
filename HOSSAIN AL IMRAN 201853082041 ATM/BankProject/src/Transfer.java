
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import javax.swing.JTextField;


public class Transfer extends JFrame {
   private Container container;
    private JLabel idLabel,moneyLabel,nameLabel,accTypeLabel,balanceLabel,translabel;
    private JTextField accTextField ,nameTextField ,AccTypeTextField,balanceTextField,moneyTextField,transid ; 
    private JButton TransferButton,returnButton;

    private Font f,newf;
  
    private int bal;
     public void TransferMoney(int transAmount){
   
   if(bal>0){
       
       if(bal>transAmount){
       
       bal=bal-transAmount;
       
       }
       else{
           JOptionPane.showMessageDialog(null, "Insufficient Balance");
       }   
   }
   else{
      JOptionPane.showMessageDialog(null, "Insufficient Balance");
   }
   }
    public void changeData(int amnt){
    this.bal=amnt;
    balanceTextField.setText(bal+"");
    
    }
public Transfer(){
 this.bal=100;
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setBounds(350,170,620,410);
 this.setTitle("Personal Account Create Account Dialog");
 this.setResizable(false);
  container=this.getContentPane();
 container.setBackground(new Color(51,153,255));
      
  container.setLayout(null);
  
  
  f=new Font("arial",Font.ITALIC,16);
  newf=new Font("arial",Font.ITALIC,15);
  
  
  //label starts
  idLabel=new JLabel("Account ID:"); 
  idLabel.setBounds(100,60,100,40);
  idLabel.setFont(f);
  idLabel.setForeground(Color.BLUE);
  container.add(idLabel);
  
   nameLabel=new JLabel("Name:"); 
  nameLabel.setBounds(100,100,150,40);
  nameLabel.setFont(f);
  nameLabel.setForeground(Color.BLUE);
  container.add(nameLabel);
  
  
  accTypeLabel=new JLabel("Account Type:"); 
  accTypeLabel.setBounds(100,140,150,40);
  accTypeLabel.setFont(f);
  accTypeLabel.setForeground(Color.BLUE);
  container.add(accTypeLabel);
  
   balanceLabel=new JLabel("Balance:"); 
  balanceLabel.setBounds(100,180,150,40);
  balanceLabel.setFont(f);
  balanceLabel.setForeground(Color.BLUE);
  container.add(balanceLabel);
  
    moneyLabel=new JLabel("Money:"); 
  moneyLabel.setBounds(100,220,150,40);
  moneyLabel.setFont(f);
  moneyLabel.setForeground(Color.BLUE);
  container.add(moneyLabel);
  
  translabel=new JLabel("Transfer To:"); 
  translabel.setBounds(100,260,150,40);
  translabel.setFont(f);
  translabel.setForeground(Color.BLUE);
  container.add(translabel);
  
  
  //textField Starts
   accTextField=new JTextField();
   accTextField.setFont(newf);
   accTextField.setBounds(300,60,260,30);
    accTextField.setBackground(new Color(255,255,204));
   container.add(accTextField);
   accTextField.setEnabled(false);
   
      nameTextField=new JTextField("");
   nameTextField.setFont(newf);
   nameTextField.setBounds(300,100,260,30); 
    nameTextField.setBackground(new Color(255,255,204));
   container.add(nameTextField);
    nameTextField.setEnabled(false);
   
   
    AccTypeTextField=new JTextField();
   AccTypeTextField.setFont(newf);
   AccTypeTextField.setBounds(300,140,260,30); 
    AccTypeTextField.setBackground(new Color(255,255,204));
   container.add(AccTypeTextField);
    AccTypeTextField.setEnabled(false);
   
   
     balanceTextField=new JTextField();
   balanceTextField.setFont(newf);
   balanceTextField.setBounds(300,180,260,30); 
    balanceTextField.setBackground(new Color(255,255,204));
   container.add(balanceTextField);
    balanceTextField.setEnabled(false);
   
   moneyTextField=new JTextField();
     moneyTextField.setFont(newf);
   moneyTextField.setBounds(300,220,260,30); 
    moneyTextField.setBackground(new Color(255,255,204));
   container.add(moneyTextField);  
   
   
    transid=new JTextField();
     transid.setFont(newf);
      transid.setBackground(new Color(255,255,204));
   transid.setBounds(300,260,260,30); 
   container.add(transid);    
   

 
  TransferButton=new JButton();
  
  
   TransferButton= new JButton("Transfer");
   TransferButton.setBounds(300,320,100,30);
   TransferButton.setFocusable(false);
    TransferButton.setBackground(new Color(255,255,255));
   container.add(TransferButton);
   TransferButton.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
          
    
          changeData(bal);
     }
 });
   

   
   
   returnButton=new JButton("Return");
   returnButton.setBounds(500, 320, 100, 30);
   returnButton.setFocusable(false);
     returnButton.setBackground(new Color(255,255,255));
   container.add(returnButton);
   returnButton.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
     
    MainDialog2 customer=new MainDialog2();
    customer.setVisible(true);
    
    dispose();
     }

   
 });

}    
}
