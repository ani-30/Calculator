package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui extends JFrame  {
    private JTextField answerfield;
    private JButton decimal,pn,one,two,three,four,five,six,seven,eight,nine,zero,add,sub ,mul,div,equals,clear,sqrt,perc,pow,inv,bs;
    private JPanel contentPanel;
    Double d1=0.0,d2=0.0;
   char operation=' ',spc1=' ',spc2=' ';
    boolean calculation=false;
    String str1=null,str2=null,ans=null;
    boolean opChosen=false,sq1=false,sq2=false,perc1=false,inv1=false,inv2=false,pn1=false,pn2=false;
    double answer;

Gui()
{super("Calculator");
     
     answerfield=new JTextField(null,22);
     Font font=new Font("Courier",Font.BOLD,16);
     answerfield.setFont(font);
     answerfield.setEditable(false);
     pow=new JButton("^");
      perc=new JButton("%");
       sqrt=new JButton("√");
     one=new JButton("1");
     two=new JButton("2");
     three=new JButton("3");
     four=new JButton("4");
     five=new JButton("5");
     six=new JButton("6");
     seven=new JButton("7");
     eight=new JButton("8");
     nine=new JButton("9");
     zero=new JButton("0");
     add=new JButton("+");
     sub=new JButton("-");
     mul=new JButton("*");
     div=new JButton("/");
     equals=new JButton("=");
     clear=new JButton("C");
     decimal=new JButton(".");
     pn=new JButton("+/-");
     inv=new JButton("1/x");
     bs=new JButton("←");
     
     Dimension dm=new Dimension(75,50);
     answerfield.setPreferredSize(new Dimension(400,50));
    one.setPreferredSize(dm);
    two.setPreferredSize(dm);
    three.setPreferredSize(dm);
    four.setPreferredSize(dm);
    five.setPreferredSize(dm);
    six.setPreferredSize(dm);
    seven.setPreferredSize(dm);
    eight.setPreferredSize(dm);
    nine.setPreferredSize(dm);
    pow.setPreferredSize(dm);
     sqrt.setPreferredSize(dm);
     perc.setPreferredSize(dm);
    zero.setPreferredSize(dm);
    equals.setPreferredSize(new Dimension(150,50));
    add.setPreferredSize(dm);
    sub.setPreferredSize(dm);
    mul.setPreferredSize(dm);
    div.setPreferredSize(dm);
    clear.setPreferredSize(dm);
    decimal.setPreferredSize(dm);
    pn.setPreferredSize(dm);
    inv.setPreferredSize(dm);
    bs.setPreferredSize(dm);
    Numbers n=new Numbers();
    Calculation c=new Calculation();
    one.addActionListener(n);
    two.addActionListener(n);
    three.addActionListener(n);
    four.addActionListener(n);
    five.addActionListener(n);
    six.addActionListener(n);
    seven.addActionListener(n);
    eight.addActionListener(n);
    nine.addActionListener(n);
    zero.addActionListener(n);
    add.addActionListener(c);
    sub.addActionListener(c);
    mul.addActionListener(c);
    div.addActionListener(c);
    equals.addActionListener(c);
    clear.addActionListener(c);
    sqrt.addActionListener(c);
    perc.addActionListener(c);
    pow.addActionListener(c);
    inv.addActionListener(c);
    decimal.addActionListener(n);
    pn.addActionListener(n);
    bs.addActionListener(n);
    
     contentPanel=new JPanel();
     contentPanel.setBackground(Color.ORANGE);
     contentPanel.setLayout(new FlowLayout());
     contentPanel.add(answerfield,BorderLayout.NORTH);
     contentPanel.add(sqrt);
         contentPanel.add(pow);
           contentPanel.add(perc);
           contentPanel.add(inv);
              contentPanel.add(seven);
     contentPanel.add(eight);
     contentPanel.add(nine);
    
     contentPanel.add(add);
     contentPanel.add(four);
     contentPanel.add(five);
     contentPanel.add(six);
     contentPanel.add(sub);
  
      contentPanel.add(one);
     contentPanel.add(two);
     contentPanel.add(three);
       contentPanel.add(mul);
      contentPanel.add(pn);
      contentPanel.add(zero);
     contentPanel.add(decimal);
      contentPanel.add(div);
     
     
     
   
    
     contentPanel.add(equals);
     contentPanel.add(bs);
     contentPanel.add(clear);
    
       
     
         
             
             
             
             
     

   this.setContentPane(contentPanel);
    }
private class Numbers implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          JButton src=(JButton) e.getSource();
          if(src.equals(one)){
              if(opChosen==false){
                  if(str1==null){
                      str1="1";}
                  else{
                      str1=str1+"1";}}
                  else{
                          if(str2==null)
                              str2="1";
                          else
                              str2=str2+"1";
                                      }
              }
          if(src.equals(two)){
              if(opChosen==false){
                  if(str1==null){
                      str1="2";}
                  else{
                      str1=str1+"2";}}
                  else{
                          if(str2==null)
                              str2="2";
                          else
                              str2=str2+"2";
                                      }
              }
          if(src.equals(three)){
              if(opChosen==false){
                  if(str1==null){
                      str1="3";}
                  else{
                      str1=str1+"3";}}
                  else{
                          if(str2==null)
                              str2="3";
                          else
                              str2=str2+"3";
                                      }
              }
          if(src.equals(four)){
              if(opChosen==false){
                  if(str1==null){
                      str1="4";}
                  else{
                      str1=str1+"4";}}
                  else{
                          if(str2==null)
                              str2="4";
                          else
                              str2=str2+"4";
                                      }
              }
          if(src.equals(five)){
              if(opChosen==false){
                  if(str1==null){
                      str1="5";}
                  else{
                      str1=str1+"5";}}
                  else{
                          if(str2==null)
                              str2="5";
                          else
                              str2=str2+"5";
                                      }
              }
          if(src.equals(six)){
              if(opChosen==false){
                  if(str1==null){
                      str1="6";}
                  else{
                      str1=str1+"6";}}
                  else{
                          if(str2==null)
                              str2="6";
                          else
                              str2=str2+"6";
                                      }
              }
          if(src.equals(seven)){
              if(opChosen==false){
                  if(str1==null){
                      str1="7";}
                  else{
                      str1=str1+"7";}}
                  else{
                          if(str2==null)
                              str2="7";
                          else
                              str2=str2+"7";
                                      }
              }
          if(src.equals(eight)){
              if(opChosen==false){
                  if(str1==null){
                      str1="8";}
                  else{
                      str1=str1+"8";}}
                  else{
                          if(str2==null)
                              str2="8";
                          else
                              str2=str2+"8";
                                      }
              }
          if(src.equals(nine)){
              if(opChosen==false){
                  if(str1==null){
                      str1="9";}
                  else{
                      str1=str1+"9";}}
                  else{
                          if(str2==null)
                              str2="9";
                          else
                              str2=str2+"9";
                                      }
              }
          if(src.equals(zero)){
              if(opChosen==false){
                  if(str1==null){
                      str1="0";}
                  else{
                      str1=str1+"0";}}
                  else{
                          if(str2==null)
                              str2="0";
                          else
                              str2=str2+"0";
                                      }
              }
       if(src.equals(decimal)){
              if(opChosen==false){
                  if(str1==null){
                      str1="0.0";}
                  else{if(str1.contains("."))
                      System.out.println("alrady decimal point contained");
                      else
                      str1=str1+".";}}
                  else{
                          if(str2==null)
                              str2="0.0";
                          else
                              if(str2.contains("."))
                      System.out.println("alrady decimal point contained");
                      else
                      str2=str2+".";
                                      }
              }
       if(src.equals(pn)){
              if(opChosen==false){
                  if(str1!=null){
               
                      pn1=true;}}
                  else{
                          if(str2!=null)
                              pn2=true;
                           
                                      }
              }
           if(src.equals(bs)){
              if(opChosen==false){
                  if(str1!=null){str1=str1.substring(0,str1.length()-1);
                                }}
                  else{
                          if(str2!=null)
                                str2=str2.substring(0,str2.length()-1);
                           
                                      }
              }
          
          
if(opChosen==false){
    if(pn1==true)
        answerfield.setText(spc1+str1+"(-)");
    else
answerfield.setText(spc1+str1);
}
else
{
    if(pn2==true)
    {if(pn1==true)
        answerfield.setText(spc1+str1+"(-)"+operation+spc2+str2+"(-)");
    else
        answerfield.setText(spc1+str1+operation+spc2+str2+"(-)");}
   else if(inv1==true)
         answerfield.setText(spc1+str1+"(1/x)"+operation+spc2+str2);
    else
   {if(pn1==true)
       answerfield.setText(spc1+str1+"(-)"+operation+spc2+str2);
   else
    answerfield.setText(spc1+str1+operation+spc2+str2);}
}
}}
          
           
private class Calculation implements ActionListener{
    public void equals()
    {
        if(str1!=null && str2==null)
        {
             d1=Double.parseDouble(str1);
             if(pn1==true)
                 d1*=-1;
             if(inv1==true)
                 d1=Math.pow(d1,-1);
                    if(sq1==true)
                        d1=Math.sqrt(d1);
                        if(perc1==true)
                        d2=d2/100*d1;
                    sq1=false;
                    spc1=' ';
                    perc1=false;
                    inv1=false;
                    pn1=false;
                    
                                     if(operation==' ')
                                         answer=d1;
                                     else
                                     {     
                                                    switch(operation)
                            {
                                case '+':
                                   answer=d1+d2;
                                    break;
                                case '-':
                                    answer=d1-d2;
                                    break;
                                case '*':
                                    answer=d1*d2;
                                    break;
                                case '/':
                                  answer=d1/d2;
                                    break;
                                case '^':
                                    answer=Math.pow(d1,d2);
                                       }

                                     }
                       ans=Double.toString(answer);
                                answerfield.setText(ans);
        }
          if(str1!=null && str2!=null)
                {
                    d1=Double.parseDouble(str1);
                     if(inv1==true)
                 d1=Math.pow(d1,-1);
                    if(sq1==true)
                        d1=Math.sqrt(d1);
                    
                    d2=Double.parseDouble(str2);
                    if(pn1==true)
                        d1*=-1;
                    if(pn2==true)
                        d2*=-1;
                    if(sq2==true)
                        d2=Math.sqrt(d2);
                    if(perc1==true)
                        d2=d2/100*d1;
                     if(inv2==true)
                 d2=Math.pow(d2,-1);
                    sq1=false;
                    spc1=' ';
                    spc2=' ';
                    perc1=false;
                    sq2=false;
                    inv1=false;
                    inv2=false;
                     pn1=false;
                    pn2=false;                   switch(operation)
                            {
                                case '+':
                                   answer=d1+d2;
                                    break;
                                case '-':
                                    answer=d1-d2;
                                    break;
                                case '*':
                                    answer=d1*d2;
                                    break;
                                case '/':
                                  answer=d1/d2;
                                    break;
                                case '^':
                                    answer=Math.pow(d1,d2);
                                       }
                                       
                                ans=Double.toString(answer);
                                answerfield.setText(ans);
                                
                            }
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton src=(JButton)e.getSource();
            if(src.equals(clear))
            {str1=null;
            str2=null;
            opChosen=false;
            operation=' ';
              inv1=false;
                    inv2=false;
                    sq1=false;
                    sq2=false;
                    perc1=false;
                     spc1=' ';
                    spc2=' ';
                     pn1=false;
                    pn2=false;
            answerfield.setText(null);
            }
            if(src.equals(add)){
             
                if(str1==null  )
                    System.out.println("Choose the nos first");
                else if(str1!=null && str2==null){
                    opChosen=true;
                     operation='+';
                     if(pn1==true)
                          answerfield.setText(spc1+str1+"(-)"+operation);
                   else if(inv1==true)
                  answerfield.setText(spc1+str1+"(1/x)"+operation);
                else
                        answerfield.setText(spc1+str1+operation);}
                    else if(str1!=null && str2!=null)
                    {
                        equals();
                         operation='+';
                        str1=Double.toString(answer);
                      
                        answerfield.setText(str1+operation);
                        str2=null;
                    }
                  }
             if(src.equals(sub)){
                 
                
                if(str1==null  )
                    System.out.println("Choose the nos first");
                else if(str1!=null && str2==null){
                     operation='-';
                    opChosen=true;
                     if(pn1==true)
                          answerfield.setText(spc1+str1+"(-)"+operation);
                   else if(inv1==true)
                  answerfield.setText(spc1+str1+"(1/x)"+operation);
                else
                        answerfield.setText(spc1+str1+operation);}
                   else if(str1!=null && str2!=null)
                    {
                        equals();
                         operation='-';
                        str1=Double.toString(answer);
                        answerfield.setText(str1+operation);
                        str2=null;
                    }
                  }
              if(src.equals(mul)){
                  
                if(str1==null  )
                    System.out.println("Choose the nos first");
                else if(str1!=null && str2==null){
                    opChosen=true;
                    operation='*';
                     if(pn1==true)
                          answerfield.setText(spc1+str1+"(-)"+operation);
                   else if(inv1==true)
                  answerfield.setText(spc1+str1+"(1/x)"+operation);
                else
                        answerfield.setText(spc1+str1+operation);}
                   
                  
              
               else if(str1!=null && str2!=null)
                    {
                        equals();
                         operation='*';
                        str1=Double.toString(answer);
                        answerfield.setText(str1+operation);
                        str2=null;
                    }
                  }
               if(src.equals(div)){
                if(str1==null  )
                    System.out.println("Choose the nos first");
                else if(str1!=null && str2==null){
                    opChosen=true;
                    operation='/';
                    
                      if(pn1==true)
                          answerfield.setText(spc1+str1+"(-)"+operation);
                   else if(inv1==true)
                  answerfield.setText(spc1+str1+"(1/x)"+operation);
                else
                        answerfield.setText(spc1+str1+operation);}
         else if(str1!=null && str2!=null)
                    { 
                        equals();
                         operation='/';
                        str1=Double.toString(answer);
                        answerfield.setText(str1+operation);
                        str2=null;
                    }
                  }
               if(src.equals(pow)){
                if(str1==null  )
                    System.out.println("Choose the nos first");
                else if(str1!=null && str2==null){
                    opChosen=true;
                    answerfield.setText(spc1+str1+"^");
                    operation='^';}
                    else if(str1!=null && str2!=null)
                        System.out.println("two operations only till now");
                  }
                 if(src.equals(sqrt)){
                     
                     
                if(str1==null  )
                {sq1=true;
                answerfield.setText("√");
                spc1='√';
                    
                }
                    
                     if(str1!=null && str2==null  ){
                    sq2=true;
                     answerfield.setText(spc1+str1+operation+"√");
                spc2='√';
                     }
                  }
                 if(src.equals(perc)){
                if(str1!=null && str2!=null )
                    perc1=true;
                answerfield.setText(spc1+str1+operation+spc2+str2+"%");
                  }
                  if(src.equals(inv)){
                  
                if(str1==null  )
                    System.out.println("Choose the nos first");
                else if(str1!=null && str2==null){
                    inv1=true;
                    answerfield.setText(spc1+str1+("(1/x)"));
                    }
                   
                  
              
               else if(str1!=null && str2!=null)
                    {
                        
                        inv2=true;
                        if(inv1==false)
                         answerfield.setText(spc1+str1+operation+str2+("(1/x)"));
                        else
                              answerfield.setText(spc1+str1+"(1/x)"+operation+str2+("(1/x)"));
                    }
                  }
               
                if(src.equals(equals)){
                  
                    equals();
                   
                    sq1=false;
                    spc1=' ';
                    spc2=' ';
                    perc1=false;
                    sq2=false;
                      inv1=false;
                    inv2=false;
                    str1=Double.toString(answer);
                    str2=null;
  
                }
                  }
    
}
}


