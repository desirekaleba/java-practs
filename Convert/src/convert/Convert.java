
package convert;

import javax.swing.JOptionPane;


public class Convert extends javax.swing.JFrame{

//boxes
private javax.swing.ButtonGroup group;
private javax.swing.JRadioButton box_bin_to_dec, box_oct_to_dec, box_hex_to_dec;

//number_field
private javax.swing.JTextField number_field ;

//btn_convert
private javax.swing.JButton btn_convert;

//answer_label
private javax.swing.JLabel answer_label;

//pan
javax.swing.JPanel container;

//
int ans = 0;

public Convert(){
    
    
    //boxes config
    box_bin_to_dec = new javax.swing.JRadioButton("Binary to decimal");
    box_bin_to_dec.setSelected(true);
    box_oct_to_dec = new javax.swing.JRadioButton("Octal to decimal");
    box_hex_to_dec = new javax.swing.JRadioButton("Hexadecimal to decimal");
    
    //group config
    group = new javax.swing.ButtonGroup();
    group.add(box_bin_to_dec);
    group.add(box_oct_to_dec);
    group.add(box_hex_to_dec);
    
    //number_field config
    number_field = new javax.swing.JTextField();
    number_field.setToolTipText("Enter your number here...");
    number_field.setPreferredSize(new java.awt.Dimension(300,20));
    
    //btn_convert
    btn_convert = new javax.swing.JButton("CONVERT");
    btn_convert.addActionListener(new java.awt.event.ActionListener(){
        
        @Override
        public void actionPerformed(java.awt.event.ActionEvent event){
            showAnswer(number_field.getText());
            ans = 0;
        }
    });
    
    //answer_label
    answer_label = new javax.swing.JLabel("Answer is : ");
    answer_label.setPreferredSize(new java.awt.Dimension(500,100));
    
    //container configuration
    container = new javax.swing.JPanel();
    container.setLayout(new java.awt.BorderLayout());
            //top
    javax.swing.JPanel top = new javax.swing.JPanel();
    top.setBackground(java.awt.Color.GRAY);
    top.add(box_bin_to_dec);
    top.add(box_oct_to_dec);
    top.add(box_hex_to_dec);
            //center
    javax.swing.JPanel center = new javax.swing.JPanel();
    center.setLayout(new java.awt.FlowLayout());
    javax.swing.JLabel label = new javax.swing.JLabel("Number ");
    center.add(label);
    center.add(number_field);
    center.add(btn_convert);
    container.add(top, java.awt.BorderLayout.NORTH);
    container.add(center, java.awt.BorderLayout.CENTER);
    container.add(answer_label, java.awt.BorderLayout.SOUTH);
    
    //window configuration
    try{
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        
    }catch(Exception e){
        javax.swing.JOptionPane.showMessageDialog(null, e);
    }
    setTitle("Conversion");
    setSize(500,300);
    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    setContentPane(container);
}

private void showAnswer(String input){
    
    char[] c_values = input.toCharArray();
    int[] i_values = new int[c_values.length];
    int max ; 
    int base = getBase();
   
   for(int i = 0 ; i < i_values.length; i++){
      if(base == 16){
          switch (c_values[i]) {
              case 'a':
                  i_values[i] = 10;
                  break;
              case 'b':
                  i_values[i] = 11;
                  break;
              case 'c':
                  i_values[i] = 12;
                  break;
              case 'd':
                  i_values[i] = 13;
                  break;
              case 'e':
                  i_values[i] = 14;
                  break;
              case 'f':
                  i_values[i] = 15;
                  break;
              default:
                  try{
                      i_values[i] = Integer.parseInt(""+c_values[i]);
                  }catch(NumberFormatException e){
                      
                      answer_label.setText("Unable to calculate, please verify your inputs");
                      JOptionPane.showMessageDialog(null, "number must be from 0 to 9 or from A to F","Number Error",JOptionPane.INFORMATION_MESSAGE);
                      
                  }
                  break;
          }
      }
      else
      {
          try{
          i_values[i] = Integer.parseInt(""+c_values[i]);
          }catch(NumberFormatException e){
              
              answer_label.setText("Unable to calculate, please verify your inputs");
              JOptionPane.showMessageDialog(null, "Wrong inputs ");
          }
      }
   }
   
   max = (i_values.length) - 1;
   
   for(int i = 0 ; i < i_values.length; i++){
       
       
      int p = (int) Math.pow(base, max);
      int pp = i_values[i] * p;
      max--;
       ans = ans + pp;
        
   }
   answer_label.setText("The Answer is "+ans);
}

public int getBase(){
    int base;
    if(box_bin_to_dec.isSelected())
    {
        base = 2;
    }
    else if(box_oct_to_dec.isSelected()){
        base = 8;
    }
    else{
        base = 16;
    }
    
    return base;
}
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable(){
           @Override
           public void run(){
               new Convert().setVisible(true);
           }
       });
    }
    
}
