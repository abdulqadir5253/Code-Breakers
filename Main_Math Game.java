package daily_practise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import daily_practise.Game_timer;

class Event extends JFrame implements ActionListener , KeyListener 
{	
	Game_timer tm=new Game_timer();
	int k;
	char arr[]={'+','-','/','*'};
	Random rm=new Random();
	String getValue;
	Color color=new Color(200,240,250);
	Font font1=new Font("Calisto MT",Font.BOLD,14);
	Font font2=new Font("Cambria",Font.BOLD,15);
	String txtarea;
	int a,b,c;
	int n,i,j;
	String lc;
	JFrame jf=new JFrame("GAME");
	Container cntr=jf.getContentPane();
	JTextField jfld=new JTextField();
	JButton jb=new JButton("Submit");
	JButton new_game=new JButton("New Game");
	JLabel l1=new JLabel();
	JLabel l2=new JLabel();
	JLabel timer =new JLabel();
	JLabel l3=new JLabel();
	JLabel l4=new JLabel();
	JLabel level=new JLabel();
	JLabel Number_of_ques=new JLabel();
	JLabel score=new JLabel();
	JLabel l5=new JLabel("Correct");
	JLabel l6=new JLabel("Wrong Answer");
	Event()
	{			
		jf.setSize(600,600);
		jf.setLayout(null);
		jf.setVisible(true);	
		
		level.setText("Level 1");
		n=0;
		i=1;
		j=1;
		level.setBounds(50,50,100,30);
		timer.setBounds(0,0,50,50);
		l1.setBounds(150,100,50,20);
		jb.setBounds(180,150,80,20);
		l2.setBounds(100,100,50,20);
		l3.setBounds(200,100,50,20);
		l4.setBounds(200,250,200,40);
		l5.setBounds(180,200,100,20);
		l6.setBounds(200,200,150,40);
		jfld.setBounds(250,100,80,30);
		score.setBounds(200,350,100,30);
		Number_of_ques.setBounds(150,300,250,30);
		new_game.setBounds(200,450,100,50);
		
		level.setFont(font1);
		l1.setFont(font2);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		Number_of_ques.setFont(font1);
		score.setFont(font1);
		l6.setFont(font1);
		l5.setFont(font1);
		jb.setFont(font1);
		
		jf.add(level);
		jf.add(jfld);
		jf.add(jb);
		jf.add(l1);
		jf.add(l2);
		jf.add(l3);
		jf.add(l5);
		jf.add(l6);
		jf.add(l4);
		jf.add(new_game);
		jf.add(score);
		jf.add(Number_of_ques);
		jf.add(timer);
		
		cntr.setBackground(color);
		
		l5.setVisible(false);
		l4.setVisible(false);	
		l6.setVisible(false);
		new_game.setVisible(false);
		Number_of_ques.setVisible(false);
		score.setVisible(false);
		jfld.addKeyListener(this);			
		jb.addActionListener(this);
		new_game.addActionListener(this);	
		new_game.setVisible(false);
	}
	
	public void run()
	{			
		
		if(n%4==0 && n!=0)
		{
			tm.start();
			j++;
			i=(++i)*5;				
		}
		if(n==0)
		{
		tm.start();
		a=rm.nextInt(10*(i*3));
		b=rm.nextInt(10*(i*3));
		}
		else
		{
			a=rm.nextInt(10*(i*3));
			b=rm.nextInt(10*(i*3));
		}
		level.setText("Level "+j);
		if(j<3)
		k=rm.nextInt(j+1);					
		if(arr[k]=='+')
			c=a+b;
		else if(arr[k]=='-')
			c=a-b;
		else if(arr[k]=='*')
			c=a*b;
		else
			c=a/b;
			
		lc=String.valueOf(c);			
		l1.setText(Character.toString(arr[k]));
		l2.setText(String.valueOf(a));
		l3.setText(String.valueOf(b));		
		timer.setText(String.valueOf(tm.time));		
	}
	public int  ans()
	{
		int k;				
		if(jfld.getText().equals(lc))
		{
			n++;
			return 1;
		}
		else 
			return 0;			
	}
public void actionPerformed(ActionEvent a)
	{		
	if(a.getSource() == jb)
	{
		int k=ans();		
		if(k==1)
		{						
			l5.setVisible(true);	
			jfld.setText("");
			run();			
		}
		else
		{ 
			jfld.setText("");
			l5.setVisible(false);
			score.setText("Your Score :"+ n*3);
			score.setVisible(true);
			Number_of_ques.setText("Number of qusetions you answered: "+n);
			Number_of_ques.setVisible(true);
			l4.setText("Right answer is : " + String.valueOf(c));
			l4.setVisible(true);
			l6.setVisible(true);
			new_game.setVisible(true);
		}
	}
	else
		{									
			n=0;
			i=j=1;
			score.setVisible(false);
			Number_of_ques.setVisible(false);
			l4.setVisible(false);
			l6.setVisible(false);
			new_game.setVisible(false);
			run();
		}
	}
public void keyPressed(KeyEvent e)
	  {		
		if(e.getKeyCode()==KeyEvent.VK_ENTER)
		{		
			int k=ans();			
				if(k==1)
					{					
						l5.setVisible(true);												
						jfld.setText("");
						run();								
					}
				else
				{							
					l5.setVisible(false);
					score.setText("Your Score :"+ n*3);
					score.setVisible(true);
					Number_of_ques.setText("Number of qusetions you answered: "+n);
					Number_of_ques.setVisible(true);
					l4.setText("Right answer is : " + String.valueOf(c));
					l4.setVisible(true);
					l6.setVisible(true);
					new_game.setVisible(true);					
				}
		}		
	}
	public void keyReleased(KeyEvent e)
	{		
	}
	public void keyTyped(KeyEvent e)
	{
	}	
}
public class games1
{
	public static void main(String[] args) 
	{
		Event ev=new Event();
		ev.run();		
	}
}