import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean operatorClicked = false;
	JFrame jf;
	String oldValue;
	String newValue;
	char operator;
	double result;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton,perButton;
	JButton plusButton,clearButton;
	
     public Calculator() {
		jf = new JFrame("CALCULATOR");
		jf.setLayout(null);
	    jf.getContentPane().setBackground(Color.LIGHT_GRAY);
		jf.setSize(530, 670);
		jf.setLocation(500, 170);
		
	    displayLabel = new JLabel();
	    displayLabel.setBounds(30, 40, 450, 60);
	    
	    displayLabel.setFont(new Font("Arial",Font.CENTER_BASELINE,20));
	    displayLabel.setOpaque(true);
	    displayLabel.setBackground(Color.WHITE);
	    displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    jf.add(displayLabel);
	    
	    sevenButton = new JButton("7");
	    sevenButton.setBounds(50,150,80,60);
	    sevenButton.addActionListener(this);	    
	    sevenButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(sevenButton);
	    
	    eightButton = new JButton("8");
	    eightButton.setBounds(160,150,80,60);
	    eightButton.addActionListener(this);	    
	    eightButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(eightButton);
	    
	    nineButton = new JButton("9");
	    nineButton.setBounds(270,150,80,60);
	    nineButton.addActionListener(this);	    
	    nineButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(nineButton);
	    
	    fourButton = new JButton("4");
	    fourButton.setBounds(50,250,80,60);
	    fourButton.addActionListener(this);	    
	    fourButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(fourButton);
	    
	    fiveButton = new JButton("5");
	    fiveButton.setBounds(160,250,80,60);
	    fiveButton.addActionListener(this);
	    fiveButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(fiveButton);
	    
	    sixButton = new JButton("6");
	    sixButton.setBounds(270,250,80,60);
	    sixButton.addActionListener(this);
	    sixButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(sixButton);
	    
	    oneButton = new JButton("1");
	    oneButton.setBounds(50,350,80,60);
	    oneButton.addActionListener(this);	    
	    oneButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(oneButton);
	    
	    twoButton = new JButton("2");
	    twoButton.setBounds(160,350,80,60);
	    twoButton.addActionListener(this);	    
	    twoButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(twoButton);
	    
	    threeButton = new JButton("3");
	    threeButton.setBounds(270,350,80,60);
	    threeButton.addActionListener(this);	    
	    threeButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(threeButton);
	    
	    dotButton = new JButton(".");
	    dotButton.setBounds(50,450,80,60);
	    dotButton.addActionListener(this);	    
	    dotButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(dotButton);
	    
	    zeroButton = new JButton("0");
	    zeroButton.setBounds(160,450,80,60);
	    zeroButton.addActionListener(this);	    
	    zeroButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(zeroButton);
	    
	    equalButton = new JButton("=");
	    equalButton.setBounds(380, 550, 80, 60);
	    equalButton.addActionListener(this);	    
	    equalButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(equalButton);
	    
	    divButton = new JButton("/");
	    divButton.setBounds(380,150,80,60);
	    divButton.addActionListener(this);	    
	    divButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(divButton);
	    
	    mulButton = new JButton("*");
	    mulButton.setBounds(380,250,80,60);
	    mulButton.addActionListener(this);	   
	    mulButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(mulButton);
	    
	    minusButton = new JButton("-");
	    minusButton.setBounds(380,350,80,60);
	    minusButton.addActionListener(this);	    
	    minusButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(minusButton);
	    
	    plusButton = new JButton("+");
	    plusButton.setBounds(380,450,80,60);
	    plusButton.addActionListener(this);    
	    plusButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(plusButton);
	    
	    perButton = new JButton("%");
	    perButton.setBounds(270,450,80,60);
	    perButton.addActionListener(this);	   
	    perButton.setFont(new Font("Arial",Font.BOLD,30));
	    jf.add(perButton);
	    
	    clearButton = new JButton("Clear");
	    clearButton.setBounds(130,550,200,60);
	    clearButton.addActionListener(this);
	    
	    clearButton.setFont(new Font("Arial",Font.BOLD,20));
	    jf.add(clearButton);
	    
	    
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
     

 
    public static void main(String a[]) {
    	new Calculator();
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== sevenButton) {
			if(operatorClicked) {
				displayLabel.setText("7");
				operatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}else if(e.getSource()== eightButton) {
			if(operatorClicked) {
				displayLabel.setText("8");
				operatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}else if(e.getSource()== nineButton) {
			if(operatorClicked) {
				displayLabel.setText("9");
				operatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if(e.getSource()== fourButton) {
			if(operatorClicked) {
				displayLabel.setText("4");
				operatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource()== fiveButton) {
			if(operatorClicked) {
				displayLabel.setText("5");
				operatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()== sixButton) {
			if(operatorClicked) {
				displayLabel.setText("6");
				operatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if(e.getSource()== oneButton) {
			if(operatorClicked) {
				displayLabel.setText("1");
				operatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource()== twoButton) {
			if(operatorClicked) {
				displayLabel.setText("2");
				operatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource()== threeButton) {
			if(operatorClicked) {
				displayLabel.setText("3");
				operatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}else if(e.getSource()== dotButton) {
			if(operatorClicked) {
				displayLabel.setText(".");
				operatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
		}else if(e.getSource()== zeroButton) {
			if(operatorClicked) {
				displayLabel.setText("0");
				operatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}else if(e.getSource()== equalButton) {
			
			newValue = displayLabel.getText();
			double oldValue1 = Double.parseDouble(oldValue);
			double newValue1 = Double.parseDouble(newValue);
			
			switch(operator) {
			     case '/': result = oldValue1/newValue1;
			             displayLabel.setText(result+"");
			             break;
			     case '*': result = oldValue1*newValue1;
			    	     displayLabel.setText(result+"");
			    	     break;
			     case '-': result = oldValue1-newValue1;
			             displayLabel.setText(result+"");
			             break;
			     case '+': result = oldValue1+newValue1;
			             displayLabel.setText(result+"");
			             break;
			     case '%': result = oldValue1/100;
	                     displayLabel.setText(result+"");
	                     break;
			}
			
			
		}else if(e.getSource()== divButton) {
			operatorClicked = true;
			operator = '/';
			oldValue = displayLabel.getText();
		}else if(e.getSource()== mulButton) {
			operatorClicked = true;
			operator = '*';
			oldValue = displayLabel.getText();
		}else if(e.getSource()== minusButton) {
			operatorClicked = true;
			operator = '-';
			oldValue = displayLabel.getText();
		}else if(e.getSource()== plusButton) {
			operatorClicked = true;
			operator = '+';
			oldValue = displayLabel.getText();
		}else if(e.getSource()== perButton) {
			operatorClicked = true;
			operator = '%';
			oldValue = displayLabel.getText();
		}else if(e.getSource()== clearButton) {
			displayLabel.setText("");
		}
}
}
