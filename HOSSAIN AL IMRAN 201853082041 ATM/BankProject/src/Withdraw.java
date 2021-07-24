
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Withdraw extends JFrame{
     private Container container;
    private JLabel idLabel,moneyLabel,nameLabel,accTypeLabel,balanceLabel;
    private JTextField accTextField ,nameTextField ,AccTypeTextField,balanceTextField,moneyTextField ; 
    private JButton withdrawButton,returnButton;
    private JPasswordField passTextField,conPasswordField;
    private Font f,newf;
    private JList JListField;
        private int bal;
     public void withrawMoney(int withdrawAmount){
   
   if(bal>0){
       
       if(bal>withdrawAmount){
       
       bal=bal-withdrawAmount;
       
       }
       else{
           JOptionPane.showMessageDialog(null, "Insufficient Balance");
       }   
   }
   else{
       System.out.println("0 balance");
   }
   }
    public void changeData(int amnt){
    this.bal=amnt;
    balanceTextField.setText(bal+"");
    
    }
public Withdraw(){
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
  
  
  //textField Starts
   accTextField=new JTextField();
   accTextField.setFont(newf);
   accTextField.setBounds(300,60,260,30); 
   accTextField.setEnabled(false);
   container.add(accTextField);
    accTextField.setBackground(new Color(255,255,204));
   
      nameTextField=new JTextField();
   nameTextField.setFont(newf);
   nameTextField.setBounds(300,100,260,30);
   nameTextField.setEnabled(false);
   container.add(nameTextField);
    nameTextField.setBackground(new Color(255,255,204));
   
   
    AccTypeTextField=new JTextField();
   AccTypeTextField.setFont(newf);
   AccTypeTextField.setEnabled(false);
   AccTypeTextField.setBounds(300,140,260,30); 
   container.add(AccTypeTextField);
    AccTypeTextField.setBackground(new Color(255,255,204));
   
   
     balanceTextField=new JTextField();
   balanceTextField.setFont(newf);
   balanceTextField.setEnabled(false);
   balanceTextField.setBounds(300,180,260,30); 
   container.add(balanceTextField);
    balanceTextField.setBackground(new Color(255,255,204));
   
   moneyTextField=new JTextField();
     moneyTextField.setFont(newf);
        moneyTextField.setBackground(new Color(255,255,204));
   moneyTextField.setBounds(300,220,260,30); 
   container.add(moneyTextField);  
      

 
  withdrawButton=new JButton();
  
  
   withdrawButton= new JButton("Withdraw");
   withdrawButton.setBounds(300,320,100,30);
   withdrawButton.setFocusable(false);
      withdrawButton.setBackground(new Color(255,255,255));
   container.add(withdrawButton);
   withdrawButton.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
          changeData(bal);
        JOptionPane.showMessageDialog(null, "Withdraw Successful!");
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
