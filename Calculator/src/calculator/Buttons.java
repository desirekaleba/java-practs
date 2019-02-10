
package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends JPanel{
    JPanel center, south, east,up_commands, center_center;
    JButton[] btns_center_center = new JButton[9];
    JButton[] btns_south = new JButton[3];
    JButton[] btns_east = new JButton[4];
    JButton[] btns_up_commands = new JButton[4];
    JButton equal = new JButton("=");
    String number1, number2,sign;
    
    boolean m = true;
    
    public Buttons(){
        super();
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){JOptionPane.showMessageDialog(null,e);}
        setLayout(new BorderLayout());
        
        //center
        center = new JPanel();
        center.setLayout(new BorderLayout());
            //up_commands
            up_commands = new JPanel();
            up_commands.setLayout(new GridBagLayout());
            btns_up_commands[0] = new JButton("C");
            btns_up_commands[1] = new JButton("(");
            btns_up_commands[2] = new JButton(")");
            btns_up_commands[3] = new JButton("%");
                for(int i = 0; i< 4; i++){
                    up_commands.add(btns_up_commands[i]);
                }
                for(JButton bt : btns_up_commands){
                    bt.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            switch(bt.getText()){
                                case "C" :
                                    Calculator.lab_number1.setText("");
                                    Calculator.lab_number2.setText("");
                                    Calculator.lab_sign.setText("");
                                    Calculator.lab_answer.setText("");
                                    Calculator.field.setText("");
                                    break;
                                
                                default : Calculator.field.setText(Calculator.field.getText()+bt.getText());
    
                            }
                            
                        }
                    });
                }
                
            //center_center
            center_center = new JPanel();
            center_center.setLayout(new GridLayout(3,3));
            btns_center_center[0] = new JButton("7");
            btns_center_center[1] = new JButton("8");
            btns_center_center[2] = new JButton("9");
            btns_center_center[3] = new JButton("4");
            btns_center_center[4] = new JButton("5");
            btns_center_center[5] = new JButton("6");
            btns_center_center[6] = new JButton("1");
            btns_center_center[7] = new JButton("2");
            btns_center_center[8] = new JButton("3");

                for(int i = 0; i<9; i++){
                    
                    center_center.add(btns_center_center[i]);
                }
                for(JButton bt : btns_center_center){
                    bt.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            Calculator.field.setText(Calculator.field.getText()+bt.getText());
                        }
                    });
                
                }
                
        center.add(up_commands, BorderLayout.NORTH);
        center.add(center_center, BorderLayout.CENTER);
        
        
        
        
        
        //south
        south = new JPanel();
        south.setLayout(new GridBagLayout());
        btns_south[0] = new JButton("+/-");
        btns_south[1] = new JButton("0");
        btns_south[2] = new JButton(".");
        for(int i = 0; i< 3;i++){
            south.add(btns_south[i]);
        }
        for(JButton bt : btns_south){
            
            bt.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    switch(bt.getText()){
                        case "+/-" :
                            if(m){
                               Calculator.field.setText(Calculator.field.getText()+"-");
                                m = false;
                                }
                                else{
                                    m = true;
                                }
                        break;
                        default : Calculator.field.setText(Calculator.field.getText()+bt.getText());
                    }
                    
                }
            });
        }
        equal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                char[] ta = number1.toCharArray();
                Calculator.lab_number1.setText(number1);
                Calculator.lab_sign.setText(sign);
                number2 = Calculator.field.getText().substring(ta.length+1);
                Calculator.lab_number2.setText(" "+number2);
                Calculator.field.setText("");
                double answer = 0d;
                
                switch(sign){
                    case " /" :
                        
                        answer = Double.parseDouble(number1) / Double.parseDouble(number2);
                        
                        break;
                    case " *" :
                        answer = Double.parseDouble(number1) * Double.parseDouble(number2);
                        
                        break;
                    case " -" :
                        answer = Double.parseDouble(number1) - Double.parseDouble(number2);
                        
                        break;
                    case " +" :
                        answer = Double.parseDouble(number1) + Double.parseDouble(number2);
                        break;
                    
                }
                Calculator.lab_answer.setText(" = "+answer);
                
                
            }
        });
        south.add(equal);
        
        //East
        east = new JPanel();
        east.setLayout(new GridLayout(4,1));
        btns_east[0] = new JButton("/");
        btns_east[1] = new JButton("*");
        btns_east[2] = new JButton("-");
        btns_east[3] = new JButton("+");
        for(int i = 0; i< 4;i++){
            east.add(btns_east[i]);
        }
        for(JButton bt : btns_east)
        {
            bt.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    switch(bt.getText()){
                        case "/" :
                            
                            number1 = Calculator.field.getText();
                            sign = " "+bt.getText();
                            Calculator.field.setText(Calculator.field.getText()+bt.getText());
                        
                        break;
                        case "*" :
                            number1 = Calculator.field.getText();
                            sign = " "+bt.getText();
                            Calculator.field.setText(Calculator.field.getText()+bt.getText());
                        break;
                        case "-" :
                           number1 = Calculator.field.getText();
                            sign = " "+bt.getText();
                            Calculator.field.setText(Calculator.field.getText()+bt.getText());
                        break;
                        case "+" :
                            number1 = Calculator.field.getText();
                            sign = " "+bt.getText();
                            Calculator.field.setText(Calculator.field.getText()+bt.getText());
                        break;
                    }
                }
            });
        }
        
        
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
    }
    
   
   
    
}
