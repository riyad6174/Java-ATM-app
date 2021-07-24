import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Query extends JFrame{
    
    private Container container;
    private JLabel minIDLabel,AfterLabel,nameLabel,MaxIDLabel,beforeLabel,formatLabel;
   
    public JTextField nameTextField, MinIDTextField,MaxIDTextField,aftferTextField,beforeTextField ; 
    private JButton queryButton,returnButton;
    private JPasswordField passTextField,conPasswordField;
    private Font f,newf,newfont;
    private JList JListField;
    private static JTable table;
    
    

    
    
    
    
public Query(){

 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setBounds(350,170,620,410);
 this.setTitle("Personal Account Create Account Dialog");
 this.setResizable(false);
  container=this.getContentPane();
  container.setBackground(new Color(51,153,255));
      
  container.setLayout(null);
  
  
  f=new Font("arial",Font.ITALIC,16);
  newf=new Font("arial",Font.ITALIC,15);
  newfont=new Font("arail",Font.BOLD,16);


  nameLabel=new JLabel("Name:");
  nameLabel.setBounds(30,5,100,30);
  nameLabel.setFont(f);
  nameLabel.setForeground(Color.BLUE);
  container.add(nameLabel);
  
  minIDLabel=new JLabel("Min ID:");
  minIDLabel.setBounds(30,40,100,30);
  minIDLabel.setFont(f);
  minIDLabel.setForeground(Color.BLUE);
  container.add(minIDLabel);
  
  
  AfterLabel=new JLabel("After");
  AfterLabel.setBounds(30,75,100,30);
  AfterLabel.setFont(f);
  AfterLabel.setForeground(Color.BLUE);
  container.add(AfterLabel);
  

  
    MaxIDLabel=new JLabel("Max ID:");
    MaxIDLabel.setBounds(290,40,100,30);
    MaxIDLabel.setFont(f);
    MaxIDLabel.setForeground(Color.BLUE);
    container.add(MaxIDLabel);
   
  
    beforeLabel=new JLabel("Before");
    beforeLabel.setBounds(290,75,100,30);
    beforeLabel.setFont(f);
    beforeLabel.setForeground(Color.BLUE);
    container.add(  beforeLabel);
    
    
    
  
    formatLabel=new JLabel("(Format Example:2007-03-04) ");
    formatLabel.setBounds(150,160,300,30);
    formatLabel.setFont(newfont);
    formatLabel.setForeground(Color.PINK);
    container.add(formatLabel);
    
    
    //text Field...............
   
    

            nameTextField=new JTextField();
            nameTextField.setBounds(120,5,100,30);
            nameTextField.setFont(f);
            nameTextField.setForeground(Color.BLUE);
             nameTextField.setBackground(new Color(255,255,204));
            container.add(nameTextField);

            MinIDTextField=new JTextField();
            MinIDTextField.setBounds(120,40,100,30);
            MinIDTextField.setFont(f);
            MinIDTextField.setForeground(Color.BLUE);
             MinIDTextField.setBackground(new Color(255,255,204));
            container.add(MinIDTextField);


           aftferTextField=new JTextField();
           aftferTextField.setBounds(120,75,100,30);
           aftferTextField.setFont(f);
           aftferTextField.setForeground(Color.BLUE);
            aftferTextField.setBackground(new Color(255,255,204));
           container.add(aftferTextField);

           MaxIDTextField=new JTextField();
           MaxIDTextField.setBounds(370,40,100,30);
           MaxIDTextField.setFont(f);
           MaxIDTextField.setForeground(Color.BLUE);
            MaxIDTextField.setBackground(new Color(255,255,204));
           container.add(MaxIDTextField);



           beforeTextField=new JTextField();
           beforeTextField.setBounds(370,75,100,30);
           beforeTextField.setFont(f);
           beforeTextField.setForeground(Color.BLUE);
            beforeTextField.setBackground(new Color(255,255,204));
           
           container.add(  beforeTextField);
           
           
           
           //table field....
           CreateAccount ca=new CreateAccount();
           String []columnNames={"Account ID","Name","Balance"};
          String data[][]={ {"100001","Riyad","100"},    
                          {"102","Rakib","100"},    
                          {"101","Rimi","100"},
                          {"","",""},
                          {"","",""},
                          {"","",""},
                          {"","",""}
                                   };  
         table=new JTable (data,columnNames);
         DefaultTableModel tableModel = new DefaultTableModel(columnNames, 7);
         tableModel.addRow(new Object[]{});

//table.setPreferredSize(new Dimension(500,50));
         table.setBounds(100,200,400,200);
           container.add(table);
           //button field.............
     

           
           
   queryButton= new JButton("Query");
   queryButton.setBounds(500,5,100,30);
   queryButton.setFocusable(false);
   queryButton.setBackground(new Color(255,255,255));
   container.add(queryButton);
   
   returnButton= new JButton("Return");
   returnButton.setBounds(500,50,100,30);
   returnButton.setFocusable(false);
   returnButton.setBackground(new Color(255,255,255));
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
 