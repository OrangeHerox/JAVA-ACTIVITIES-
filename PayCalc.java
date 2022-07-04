
package paycalc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PayCalc {

    JFrame mainframe, othersframe;
    JPanel mainpanel, sidepanel, toppanel, midpanel, botpanel, otherspanel;
    JLabel pclbl, inputlbl, namelbl, ratelbl, dowlbl, contriblbl, ssslbl, pagiblbl, phlbl;
    JLabel taxlbl, otlbl, otratelbl, otherslbl,org1lbl, org2lbl, org3lbl;
    JLabel pagibval, phval, orgded1, orgded2, orgded3;
    JTextField nametxt, ratetxt, dowtxt, ssstxt, pagibtxt, phtxt;
    JTextField ottxt, otratetxt, org1txt, org2txt, org3txt, orgded1txt, orgded2txt, orgded3txt;
    JButton othersbtn, calcbtn, historybtn, exitbtn, clearbtn;
    JButton continuebtn, cancelbtn;
    JComboBox ratecb, ssscb;
    JCheckBox manualcheck;
     
    String [] ratecombo = {"PER HOUR","PER DAY"}; 
    String [] ssscombo = {"11 %","3.63 %","7.33 %"};
    
    public PayCalc() {
      mainframe = new JFrame();
      mainpanel = new JPanel();
      sidepanel = new JPanel();
      toppanel = new JPanel();
      botpanel = new JPanel();
      midpanel = new JPanel();
      pclbl = new JLabel();
      namelbl = new JLabel();
      ratelbl = new JLabel();
      dowlbl = new JLabel();
      nametxt = new JTextField();
      ratetxt = new JTextField();
      dowtxt  = new JTextField();   
      contriblbl = new JLabel();
      ssslbl = new JLabel();
      pagiblbl = new JLabel();
      phlbl = new JLabel();
      ssstxt = new JTextField();
      pagibtxt = new JTextField();
      phtxt  = new JTextField();
      othersbtn = new JButton();
      taxlbl = new JLabel();
      calcbtn = new JButton();
      inputlbl = new JLabel();
      historybtn = new JButton();
      exitbtn = new JButton();
      clearbtn = new JButton();
      ratecb = new JComboBox(ratecombo);
      otlbl = new JLabel();
      otratelbl = new JLabel();
      ottxt = new JTextField();
      otratetxt = new JTextField();
      ssscb = new JComboBox(ssscombo);
      pagibval = new JLabel();   
      phval = new JLabel();
      manualcheck = new JCheckBox();
      
      //others
      othersframe = new JFrame();
      otherspanel = new JPanel();
      otherslbl = new JLabel();
      org1lbl = new JLabel();
      org2lbl = new JLabel();
      org3lbl = new JLabel();
      org1txt = new JTextField();
      org2txt = new JTextField();
      org3txt = new JTextField();
      orgded1 = new JLabel();
      orgded2 = new JLabel();
      orgded3 = new JLabel();
      orgded1txt = new JTextField();
      orgded2txt = new JTextField();
      orgded3txt = new JTextField();
      continuebtn = new JButton();
      cancelbtn = new JButton();
    }
    

    public void setGUI() {
      //CHECKBOX
      manualcheck.setText("MANUAL INPUT");
      manualcheck.setBounds(550,5,120,30);
      
      //LABEL2   
      phval.setText("4% of INCOME");
      phval.setBounds(860,390,300,100);
      phval.setForeground(Color.WHITE);
      phval.setFont(new Font("Times New Roman", Font.PLAIN,16));
      
      pagibval.setText("100");
      pagibval.setBounds(640,390,300,100);
      pagibval.setForeground(Color.WHITE);
      pagibval.setFont(new Font("Times New Roman", Font.PLAIN,18));
       
      //COMBOBOX
      ratecb.setBounds(770,205,90,30);
      ssscb.setBounds(405,425,90,30);
    
      //BUTTON
      othersbtn.setText("OTHERS");
      othersbtn.setBounds(350,470,120,30);
      othersbtn.setBackground(new Color(153,0,0));
      othersbtn.setForeground(Color.white);
      othersbtn.setFont(new Font("Times New Roman", Font.PLAIN,15));
      
      calcbtn.setText("CALCULATE");
      calcbtn.setBounds(460,510,300,40);
      calcbtn.setBackground(new Color(0,103,0));
      calcbtn.setForeground(Color.white);
      calcbtn.setFont(new Font("Times New Roman", Font.PLAIN,15));
      
      clearbtn.setText("RESET");
      clearbtn.setBounds(870,510,80,40);
      clearbtn.setBackground(new Color(153,0,0));
      clearbtn.setForeground(Color.white);
      clearbtn.setFont(new Font("Times New Roman", Font.PLAIN,15));
      
      historybtn.setText("HISTORY");
      historybtn.setBounds(0,185,300,80);
      historybtn.setBackground(Color.DARK_GRAY/*new Color(153,0,0)*/);
      historybtn.setForeground(Color.white);
      historybtn.setFont(new Font("Times New Roman", Font.PLAIN,30));
      
      exitbtn.setText("EXIT");
      exitbtn.setBounds(20,510,100,40);
      exitbtn.setBackground(Color.DARK_GRAY/*new Color(153,0,0)*/);
      exitbtn.setForeground(Color.white);
      exitbtn.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
       //LABEL
      inputlbl.setText("           INPUT ");
      inputlbl.setBounds(0,85,300,80);
      inputlbl.setBackground(Color.DARK_GRAY);
      inputlbl.setForeground(Color.WHITE);
      inputlbl.setOpaque(true);
      inputlbl.setFont(new Font("Times New Roman", Font.PLAIN,35));
      
      otlbl.setText("NUMBER OF OVER TIME : ");
      otlbl.setBounds(350,260,250,100);
      otlbl.setForeground(Color.WHITE);
      otlbl.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      otratelbl.setText("OVER TIME RATE : ");
      otratelbl.setBounds(700,215,300,100);
      otratelbl.setForeground(Color.WHITE);
      otratelbl.setFont(new Font("Times New Roman", Font.PLAIN,20));
       
      /*taxlbl.setText("TAX NOT INCLUDED IN BASIC SALARY");
      taxlbl.setBounds(20,5,700,100);
      taxlbl.setForeground(Color.DARK_GRAY);
      taxlbl.setFont(new Font("Times New Roman", Font.PLAIN,15));*/
      
      phlbl.setText("PHIL-HEALTH : ");
      phlbl.setBounds(720,390,300,100);
      phlbl.setForeground(Color.WHITE);
      phlbl.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      pagiblbl.setText("PAG-IBIG : ");
      pagiblbl.setBounds(530,390,300,100);
      pagiblbl.setForeground(Color.WHITE);
      pagiblbl.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      ssslbl.setText("SSS : ");
      ssslbl.setBounds(350,390,300,100);
      ssslbl.setForeground(Color.WHITE);
      ssslbl.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      contriblbl.setText("CONTRIBUTIONS");
      contriblbl.setBounds(200,-25,700,100);
      contriblbl.setForeground(Color.DARK_GRAY);
      contriblbl.setFont(new Font("Times New Roman", Font.PLAIN,35));
  
      dowlbl.setText("DAYS/HOURS OF WORK :");
      dowlbl.setBounds(350,215,300,100);
      dowlbl.setForeground(Color.WHITE);
      dowlbl.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      ratelbl.setText("RATE : ");
      ratelbl.setBounds(700,170,300,100);
      ratelbl.setForeground(Color.WHITE);
      ratelbl.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      namelbl.setText("NAME : ");
      namelbl.setBounds(350,170,300,100);
      namelbl.setForeground(Color.WHITE);
      namelbl.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      pclbl.setText("PAYROLL CALCULATOR");
      pclbl.setBounds(20,5,700,100);
      pclbl.setForeground(Color.WHITE);
      pclbl.setFont(new Font("Times New Roman", Font.PLAIN,55));
      
      //TEXT
      ottxt.setBounds(890,247,50,30);
      ottxt.setBackground(Color.WHITE);
      ottxt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      otratetxt.setBounds(590,290,50,30);
      otratetxt.setBackground(Color.WHITE);
      otratetxt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      phtxt.setBounds(865,425,50,30);
      phtxt.setBackground(Color.WHITE);
      phtxt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      phtxt.setVisible(false);
      
      pagibtxt.setBounds(640,425,50,30);
      pagibtxt.setBackground(Color.WHITE);
      pagibtxt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      pagibtxt.setVisible(false);
      
      ssstxt.setBounds(410,425,50,30);
      ssstxt.setBackground(Color.WHITE);
      ssstxt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      //ssstxt.setVisible(false);
      
      nametxt.setBounds(430,205,210,30);
      nametxt.setBackground(Color.WHITE);
      nametxt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      ratetxt.setBounds(870,205,70,30);
      ratetxt.setBackground(Color.WHITE);
      ratetxt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      dowtxt.setBounds(590,250,50,30);
      dowtxt.setBackground(Color.WHITE);
      dowtxt.setFont(new Font("Times New Roman", Font.PLAIN,20));
         
      //PANELS
      mainpanel.setBounds(0,0,1000,600);
      mainpanel.setBackground(Color.DARK_GRAY);      
      sidepanel.setBounds(0,0,300,600);
      sidepanel.setBackground(Color.orange);
      toppanel.setBounds(300,70,700,100);
      toppanel.setBackground(new Color(153,0,0));
      midpanel.setBounds(300,345,700,45);
      midpanel.setBackground(Color.LIGHT_GRAY);
      //botpanel.setBounds(300,470,700,25);
      //botpanel.setBackground(Color.LIGHT_GRAY);
      
      //LAYOUT
      toppanel.setLayout(null);
      mainpanel.setLayout(null);
      sidepanel.setLayout(null);
      midpanel.setLayout(null);
      
      //ADDING TO PANEL/FRAME
      midpanel.add(manualcheck);
              
      mainpanel.add(pagibval);
      mainpanel.add(phval);
      
      mainpanel.add(ssscb);
      mainpanel.add(ottxt);
      mainpanel.add(otratetxt);
      mainpanel.add(otlbl);
      mainpanel.add(otratelbl);
      
      mainpanel.add(ratecb);
      
      sidepanel.add(inputlbl);
      sidepanel.add(historybtn);
      sidepanel.add(exitbtn);
      
      //botpanel.add(taxlbl);
      toppanel.add(pclbl);
      midpanel.add(contriblbl);
      
      mainpanel.add(othersbtn);
      mainpanel.add(clearbtn);
      mainpanel.add(calcbtn);
      
      mainpanel.add(phlbl);
      mainpanel.add(phtxt);
      
      mainpanel.add(pagiblbl);
      mainpanel.add(pagibtxt);
      
      mainpanel.add(ssslbl);
      mainpanel.add(ssstxt);
      
      mainpanel.add(dowtxt);
      mainpanel.add(dowlbl);
      
      mainpanel.add(ratetxt);
      mainpanel.add(ratelbl);
      
      mainpanel.add(namelbl);
      mainpanel.add(nametxt);
      
      mainframe.add(botpanel);
      mainframe.add(midpanel);
      mainframe.add(toppanel);
      mainframe.add(sidepanel);
      mainframe.add(mainpanel);
      
      mainframe.setLayout(null);
      mainframe.setTitle("PAYROL CALCULATOR");
      mainframe.setSize(1000,600);
      mainframe.setResizable(false);
      mainframe.setLocationRelativeTo(null);
      mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainframe.setVisible(true);
     
    }
    
    public void setOtherGui() {
    	//othersframe
      //others buttton
      continuebtn.setText("CONTINUE");
      continuebtn.setBounds(350,470,120,30);
      continuebtn.setBackground(new Color(0,103,0)/*new Color(153,0,0)*/);
      continuebtn.setForeground(Color.white);
      continuebtn.setFont(new Font("Times New Roman", Font.PLAIN,15));
      
      cancelbtn.setText("CANCEL");
      cancelbtn.setBounds(200,470,120,30);
      cancelbtn.setBackground(new Color(153,0,0));
      cancelbtn.setForeground(Color.white);
      cancelbtn.setFont(new Font("Times New Roman", Font.PLAIN,15));
     
      //otherstxt
      org1txt.setBounds(450,135,250,30);
      org1txt.setBackground(Color.WHITE);
      org1txt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      org2txt.setBounds(450,235,250,30);
      org2txt.setBackground(Color.WHITE);
      org2txt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      org3txt.setBounds(450,335,250,30);
      org3txt.setBackground(Color.WHITE);
      org3txt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      orgded1txt.setBounds(600,175,100,30);
      orgded1txt.setForeground(Color.DARK_GRAY);
      orgded1txt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      orgded2txt.setBounds(600,275,100,30);
      orgded2txt.setForeground(Color.DARK_GRAY);
      orgded2txt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      orgded3txt.setBounds(600,375,100,30);
      orgded3txt.setForeground(Color.DARK_GRAY);
      orgded3txt.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      //otherslbl
      otherslbl.setText("OTHER DEDUCTIONS/CONTRIBUTIONS");
      otherslbl.setBounds(200,15,700,100);
      otherslbl.setForeground(Color.ORANGE);
      otherslbl.setFont(new Font("Times New Roman", Font.PLAIN,35));
      
      org1lbl.setText("ORGANIZATION 1 NAME : ");
      org1lbl.setBounds(200,100,300,100);
      org1lbl.setForeground(Color.WHITE);
      org1lbl.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      org2lbl.setText("ORGANIZATION 2 NAME : ");
      org2lbl.setBounds(200,200,300,100);
      org2lbl.setForeground(Color.WHITE);
      org2lbl.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      org3lbl.setText("ORGANIZATION 3 NAME : ");
      org3lbl.setBounds(200,300,300,100);
      org3lbl.setForeground(Color.WHITE);
      org3lbl.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      orgded1.setText("DEDUCTION/CONTRIBUTION PER MONTH : ");
      orgded1.setBounds(200,177,400,30);
      orgded1.setForeground(Color.WHITE);
      orgded1.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      orgded2.setText("DEDUCTION/CONTRIBUTION PER MONTH : ");
      orgded2.setBounds(200,277,400,30);
      orgded2.setForeground(Color.WHITE);
      orgded2.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      orgded3.setText("DEDUCTION/CONTRIBUTION PER MONTH : ");
      orgded3.setBounds(200,377,400,30);
      orgded3.setForeground(Color.WHITE);
      orgded3.setFont(new Font("Times New Roman", Font.PLAIN,20));
      
      otherspanel.setLayout(null);
      
      otherspanel.add(continuebtn);
      otherspanel.add(cancelbtn);
      otherspanel.add(orgded1);
      otherspanel.add(orgded2);
      otherspanel.add(orgded3);
      otherspanel.add(orgded1txt);
      otherspanel.add(orgded2txt);
      otherspanel.add(orgded3txt);
      otherspanel.add(otherslbl);
      othersframe.add(otherspanel);
      otherspanel.add(org1lbl);
      otherspanel.add(org2lbl);
      otherspanel.add(org3lbl);
      otherspanel.add(org1txt);
      otherspanel.add(org2txt);
      otherspanel.add(org3txt);
      otherspanel.add(otherslbl);
      othersframe.add(otherspanel);
      
      otherspanel.setBounds(0,0,1000,600);
      otherspanel.setBackground(Color.DARK_GRAY);
      
      othersframe.setLayout(null);
      othersframe.setTitle("PAYROL CALCULATOR");
      othersframe.setSize(1000,600);
      othersframe.setResizable(false);
      othersframe.setLocationRelativeTo(null);
      othersframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //othersframe.setVisible(true);
    }
    
    public static void main(String[] args) {
       PayCalc pc = new PayCalc();
       pc.setGUI();
       pc.setOtherGui();
       pc.setButtons();
    } 
    
    public void setButtons() {
    //visibility of elements for checkbox
    manualcheck.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent event) {
        JCheckBox cb1 = (JCheckBox) event.getSource();
        if (cb1.isSelected()) {
            /*ssscb.hide();
            phval.hide();
            pagibval.hide();
            ssstxt.show();
            pagibtxt.show();
            phtxt.show();*/
                    
            ssstxt.setVisible(true);
            pagibtxt.setVisible(true);
            phtxt.setVisible(true);
            ssscb.setVisible(false);
            phval.setVisible(false);
            pagibval.setVisible(false);
        } else {
            /*ssstxt.hide();
            pagibtxt.hide();
            phtxt.hide();*/
            
            ssstxt.setVisible(false);
            pagibtxt.setVisible(false);
            phtxt.setVisible(false);
            ssscb.setVisible(true);
            phval.setVisible(true);
            pagibval.setVisible(true);
            
            /*ssscb.show();
            phval.show();
            pagibval.show();*/
        }
    }
});

  //SETTING LABEL
    ratecb.addActionListener (new ActionListener ()
        {
    public void actionPerformed(ActionEvent e)
        {
            if (ratecb.getSelectedItem().equals("PER HOUR")) {
                dowlbl.setText("HOURS OF WORK :");
            } else {
                dowlbl.setText("DAYS OF WORK : ");
            }
        }
    });
    
    //opening others frame
            othersbtn.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
         //othersframe.setVisible(true);
         othersframe.show();
         mainframe.hide();
            } 
        } );
        
        clearbtn.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
         //othersframe.setVisible(true);
         nametxt.setText("");
         dowtxt.setText("");
         ratetxt.setText("");
         otratetxt.setText("");
         ottxt.setText("");
         ssstxt.setText("");
         pagibtxt.setText("");
         phtxt.setText("");
            } 
        } );
        
        exitbtn.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
         //othersframe.setVisible(true);
         System.exit(0);
            } 
        } );
        
        continuebtn.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
         //othersframe.setVisible(true);
         othersframe.hide();
         mainframe.show();
            } 
        } );
      
      cancelbtn.addActionListener(new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) { 
         //othersframe.setVisible(true);
         othersframe.hide();
         mainframe.show();
            } 
        } );
}
}