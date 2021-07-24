
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MainDialog2 extends JFrame{
  private Container container;
    private Font f,f1;
    private JButton StatisticalButton,QueryButton,AddAccountButton;
    private JButton DepositButton, WithdrawButton, TransferButton;
    private JButton reloginButton;

    
   
   public MainDialog2(){
   
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setBounds(350,170,620,410);
      this.setTitle("Personal Account System--Main Dialog");
      this.setResizable(false);
      container=this.getContentPane();
     container.setBackground(new Color(51,153,255));
      
      container.setLayout(null);
      
      f=new Font("arial",Font.BOLD,16);
      f1=new Font("arial",Font.BOLD,12);
      
      
      AddAccountButton=new JButton("Create Account");
      AddAccountButton.setBounds(100,60,180,40);
      AddAccountButton.setFont(f);
      AddAccountButton.setFocusable(false);
      AddAccountButton.setBackground(new Color(255,255,255));
      AddAccountButton.setForeground(Color.BLUE);
      AddAccountButton.setEnabled(false);
      container.add(AddAccountButton);
      
      
      StatisticalButton= new JButton("Statistical Analysis");
      StatisticalButton.setBounds(100,160,180,40);
      StatisticalButton.setFont(f);
      StatisticalButton.setFocusable(false);
      StatisticalButton.setForeground(Color.BLUE);
      StatisticalButton.setBackground(new Color(255,255,255));
      StatisticalButton.setEnabled(false);
      container.add(StatisticalButton);
      
      
      
      QueryButton=new JButton("Accounts Query");
      QueryButton.setBounds(100,260,180,40);
      QueryButton.setFont(f);
      QueryButton.setFocusable(false);
      QueryButton.setForeground(Color.BLUE);
      QueryButton.setBackground(new Color(255,255,255));
      QueryButton.setEnabled(false);
      container.add(QueryButton);
      
    
      DepositButton =new JButton("Deposit");
      DepositButton.setBounds(320, 60, 180, 40);
      DepositButton.setFont(f);
      DepositButton.setFocusable(false);
      DepositButton.setForeground(Color.BLUE);
      DepositButton.setBackground(new Color(255,255,255));
      container.add(DepositButton);
      
       DepositButton.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
     
   Deposit deposit=new Deposit();
   // deposit.balanceTextField.setText("200");
    deposit.AddDataToField(100);
    
    deposit.setVisible(true);
    
    dispose();
     }
 });
      
      
      WithdrawButton= new JButton("Withdraw");
      WithdrawButton.setBounds(320,160,180,40);
      WithdrawButton.setFont(f);
      WithdrawButton.setFocusable(false);
      WithdrawButton.setForeground(Color.BLUE);
      WithdrawButton.setBackground(new Color(255,255,255));
      container.add(WithdrawButton);
      
            WithdrawButton.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
     
   Withdraw withdraw=new Withdraw();
    withdraw.setVisible(true);
    dispose();
     }
 });
      
      
      TransferButton= new JButton("Transfer");
      TransferButton.setBounds(320,260,180,40);
      TransferButton.setFont(f);
      TransferButton.setFocusable(false);
      TransferButton.setForeground(Color.BLUE);
      TransferButton.setBackground(new Color(255,255,255));
      container.add(TransferButton);
      
                  TransferButton.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
     
   Transfer transfer=new Transfer();
    transfer.setVisible(true);
    dispose();
     }
 });
      
      
      reloginButton= new JButton("Re-Login");
      reloginButton.setBounds(500,20,100,20);
      reloginButton.setFont(f1);
      reloginButton.setFocusable(false);
      reloginButton.setForeground(Color.BLUE);
      reloginButton.setBackground(new Color(255,255,255));
      container.add(reloginButton);
      
      reloginButton.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
               Application app =new Application();
               app.setVisible(true);
               dispose();
          }
      });
      
   }
    
}
