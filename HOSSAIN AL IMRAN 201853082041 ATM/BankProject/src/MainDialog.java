
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MainDialog extends JFrame {
   
    
    private Container container;
    private Font f,f1;
    private JButton StatisticalButton,QueryButton,AddAccountButton;
    private JButton DepositButton, WithdrawButton, TransferButton;
    private JButton reloginButton;
     
   public MainDialog(){
   
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
      container.add(AddAccountButton);
      
      AddAccountButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              if(ae.getSource()==AddAccountButton){
               CreateAccount ca=new CreateAccount();
           ca.setVisible(true);
           dispose();
              }
          
          }
      });
      
      
      
      StatisticalButton= new JButton("Statistical Analysis");
      StatisticalButton.setBounds(100,160,180,40);
      StatisticalButton.setFont(f);
      StatisticalButton.setFocusable(false);
      StatisticalButton.setBackground(new Color(255,255,255));
      StatisticalButton.setForeground(Color.blue);
      container.add(StatisticalButton);
      StatisticalButton.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
             Statistic statistic =new Statistic();
             statistic.setVisible(true);
             dispose();
          }
      });
      
      
      QueryButton=new JButton("Accounts Query");
      QueryButton.setBounds(100,260,180,40);
      QueryButton.setFont(f);
      QueryButton.setFocusable(false);
      QueryButton.setForeground(Color.BLUE);
      QueryButton.setBackground(new Color(255,255,255));
      container.add(QueryButton);
      QueryButton.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
             Query query=new Query();
             query.setVisible(true);
             dispose();
          }
      });
      
    
      DepositButton =new JButton("Deposit");
      DepositButton.setBounds(320, 60, 180, 40);
      DepositButton.setFont(f);
      DepositButton.setFocusable(false);
      DepositButton.setForeground(Color.BLUE);
      DepositButton.setBackground(new Color(255,255,255));
      DepositButton.setEnabled(false);
      container.add(DepositButton);
      
      
      WithdrawButton= new JButton("Withdraw");
      WithdrawButton.setBounds(320,160,180,40);
      WithdrawButton.setFont(f);
      WithdrawButton.setFocusable(false);
      WithdrawButton.setForeground(Color.BLUE);
      WithdrawButton.setBackground(new Color(255,255,255));
      WithdrawButton.setEnabled(false);
      container.add(WithdrawButton);
      
      
      TransferButton= new JButton("Transfer");
      TransferButton.setBounds(320,260,180,40);
      TransferButton.setFont(f);
      TransferButton.setFocusable(false);
      TransferButton.setForeground(Color.BLUE);
      TransferButton.setBackground(new Color(255,255,255));
      TransferButton.setEnabled(false);
      container.add(TransferButton);
      
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
           dispose();
           Application app=new Application();
           app.setVisible(true);
           
          }
      });
      
   }
    
}
