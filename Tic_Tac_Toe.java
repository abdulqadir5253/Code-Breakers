package new_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Mainframe extends JFrame implements MouseListener
{	
	JLabel player_wins;
	static int player=1;
	static int flag=0;
	static int step=1;
	static int which_player_win;
	static int position;
	static int n;
	int arr[][]=new int[3][3];
	
	
	public Mainframe()
	{
		setTitle("Tic Tac Toe");		
		setLayout(null);				
		
		player_wins=new JLabel();		
		player_wins.setBounds(300,300,150,30);						
		player_wins.setVisible(false);
						
		add(player_wins);						
		addMouseListener(this);			
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]='\0';
			}
		}
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	public void  paint(Graphics g)
	{				
		
		g.drawLine(100, 100, 100, 250); 			//vertical lines
		g.drawLine(180, 100, 180, 250);
		g.drawLine(50, 150, 230, 150);				// horizontal lines
		g.drawLine(50, 200, 230, 200);
		
		if(player==1)
		{						
			
			if(position ==1 && arr[0][0]!=2)
			{
				g.drawLine(60, 110, 90, 140);
				g.drawLine(60, 140, 90, 110);	
				step++;				
				arr[0][0]=1;				
				player=2;			// player chance changed to 2
			}
			else if(position ==2 && arr[0][1]!=2)
			{
				g.drawLine(125, 110, 155, 140);
				g.drawLine(125, 140, 155, 110);
				step++;
				arr[0][1]=1;			
				player=2;			// player chance changed to 2
			}
			
			else if(position==3 && arr[0][2]!=2)
			{
				g.drawLine(190, 110, 220, 140);
				g.drawLine(190, 140, 220, 110);
				step++;
				arr[0][2]=1;				
				player=2;			// player chance changed to 2
			}
			
			else if(position ==4 &&  arr[1][0]!=2)
			{
				g.drawLine(60, 160, 90, 190);
				g.drawLine(60, 190, 90, 160);
				step++;
				arr[1][0]=1;				
				player=2;			// player chance changed to 2
			}
			
			else if(position ==5 && arr[1][1]!=2)
			{
				g.drawLine(125, 160, 155, 190);
				g.drawLine(125, 190, 155, 160);
				step++;
				arr[1][1]=1;				
				player=2;			// player chance changed to 2
			}
			
			else if(position ==6 && arr[1][2]!=2)
			{
				g.drawLine(190, 160, 220, 190);
				g.drawLine(190, 190, 220, 160);
				step++;
				arr[1][2]=1;				
				player=2;			// player chance changed to 2
			}
			
			else if(position ==7 && arr[2][0]!=2)
			{
				g.drawLine(60, 210, 90, 240);
				g.drawLine(60, 240, 90, 210);
				step++;
				arr[2][0]=1;				
				player=2;			// player chance changed to 2
			}
			
			else if(position ==8 && arr[2][1]!=2)
			{
				g.drawLine(125, 210, 155, 240);
				g.drawLine(125, 240, 155, 210);
				step++;
				arr[2][1]=1;				
				player=2;			// player chance changed to 2
			}
			
			else if(position ==9 && arr[2][2]!=2) 
			{
				g.drawLine(190, 210, 220, 240);
				g.drawLine(190, 240, 220, 210);
				step++;
				arr[2][2]=1;
				player=2;			// player chance changed to 2
			}
			
			
					
			
			if(step>=5)					// checking winning status
			{				
				n=win();						
			}
			if(n==1)
			{				
				player_wins.setText("Player 1 Wins");
				player_wins.setVisible(true);
				removeMouseListener(this);
			}
			else if(n==2)
			{
				player_wins.setText("Player 2 Wins");
				player_wins.setVisible(true);
				removeMouseListener(this);
			}
			
			if(which_player_win==1)
			{
				g.drawLine(50,125,230,125);
			}
			
			
			else if(which_player_win==2)
			{
				g.drawLine(50,175,230,175);
			}
			
			else if(which_player_win==3)
			{
				g.drawLine(50,225,230,225);
			}
			
			else if(which_player_win==4)
			{
				g.drawLine(75,100,75,250);
			}
			
			else if(which_player_win==5)
			{
				g.drawLine(140,100,140,250);
			}
			
			else if(which_player_win==6)
			{
				g.drawLine(205,100,205,250);
			}
			
			else if(which_player_win==7)
			{
				g.drawLine(60,100,220,250);
			}
			
			else if(which_player_win==8)
			{
				g.drawLine(60,240,220,110);
			}
		}
		
		
		else
		{												
			
			// drawing oval at specifies position
						
			if(position==1 && arr[0][0]!=1)
			{
				g.drawOval(55,110,30,30);
				step++;
				arr[0][0]=2;
				player=1;				//player chance changed to 1
			}
			else if(position ==2 && arr[0][1]!=1) 
			{
				g.drawOval(120,110,30,30);
				step++;
				arr[0][1]=2;
				player=1;				//player chance changed to 1
			}
			
			else if(position ==3 && arr[0][2]!=1)
			{
				g.drawOval(185,110,30,30);
				step++;
				arr[0][2]=2;
				player=1;				//player chance changed to 1
			}
			
			else if(position ==4 && arr[1][0]!=1)
			{
				g.drawOval(55,160,30,30);
				step++;
				arr[1][0]=2;
				player=1;				//player chance changed to 1
			}
			
			else if(position ==5 && arr[1][1]!=1)
			{
				g.drawOval(120,160,30,30);
				step++;
				arr[1][1]=2;
				player=1;				//player chance changed to 1
			}
			
			else if(position ==6 && arr[1][2]!=1)
			{
				g.drawOval(185,160,30,30);
				step++;
				arr[1][2]=2;
				player=1;				//player chance changed to 1
			}
			
			else if(position ==7 && arr[2][0]!=1)
			{
				g.drawOval(55,210,30,30);
				step++;
				arr[2][0]=2;
				player=1;				//player chance changed to 1
			}
			
			else if(position ==8 && arr[2][1]!=1)
			{
				g.drawOval(120,210,30,30);
				step++;
				arr[2][1]=2;
				player=1;				//player chance changed to 1
			}
			
			else if(position ==9 && arr[2][2]!=1)
			{
				g.drawOval(185,210,30,30);
				step++;
				arr[2][2]=2;
				player=1;				//player chance changed to 1
			}
			
			// checking win 			
			if(	step>=5)
			{
				n=win();				
			}
			if(n==2)
			{				
				player_wins.setText("Player 2 Wins");
				player_wins.setVisible(true);
				removeMouseListener(this);
			}
			else if(n==1)
			{
				player_wins.setText("Player 1 Wins");
				player_wins.setVisible(true);
				removeMouseListener(this);
			}
			
			if(which_player_win==1)
			{
				g.drawLine(50,125,230,125);
			}
			
			
			else if(which_player_win==2)
			{
				g.drawLine(50,175,230,175);
			}
			
			else if(which_player_win==3)
			{
				g.drawLine(50,225,230,225);
			}
			
			else if(which_player_win==4)
			{
				g.drawLine(75,100,75,250);
			}
			
			else if(which_player_win==5)
			{
				g.drawLine(140,100,140,250);
			}
			
			else if(which_player_win==6)
			{
				g.drawLine(205,100,205,250);
			}
			
			else if(which_player_win==7)
			{
				g.drawLine(60,100,220,250);
			}
			
			else if(which_player_win==8)
			{
				g.drawLine(60,240,220,110);
			}
		}
				
	}
	
	
	public int win()
	{
		
		for(int i=0;i<3;i++)			// horizonatal line comparison
		{
			flag=3;
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]==1 && flag!=0 && flag!=2)
				{
				 flag= 1;					 
				}
				else if(arr[i][j]==2 && flag!=1 && flag!=0)
				{
					 flag= 2;
					
				}
				else 
				{
				 flag=0;
				 break;
				}
			}
			if(flag==1)
			{
				which_player_win=i+1;
				return 1;
			}
				
			else if(flag==2)
			{
				which_player_win=i+1;
				return 2;	
			}
				
				
			flag=3;			
											//vertical line comparison
			for(int j=0;j<3;j++)
			{
				
				if(arr[j][i]==1 && flag!=0 &&  flag!=2)
				{
				 flag= 1;				 
				}
				else if(arr[j][i]==2 && flag!=1 && flag!=0)				
				{
					 flag= 2;					 
				}
				else 
				{
				 flag=0;
				 break;
				}
			}
			if(flag==1)
			{
				which_player_win=i+4;
				return 1;
			}
			else if(flag==2)
			{
				which_player_win=i+4;
				return 2;
			}
		}
		
		flag=3;
		for(int i=0;i<3;i++)
		{		
			for(int j=0;j<3;j++)				// cross line
			{
				if(i==j)
				{
					if(arr[i][j]==1 && flag!=2 && flag!=0)
					{
						flag=1;						 						
					}					
					else if(arr[i][j]==2 && flag!=1 && flag!=0)
					{
						flag=2;						
					}	
					else 
					{
						flag=0;
						break;
					}
				}				
			}					
		}
		if(flag==1)
		{
			which_player_win=7;
			return 1;
		}
		else if(flag==2)
		{
			which_player_win=7;
			return 2;
		}
		
		flag=3;						
		for(int i=0;i<3;i++)
		{			
			for(int j=2;j>=0;j--)				// cross lines
			{
				if(i==0 && j==2)
				{
					if(arr[i][j]==1 && flag!=0 && flag!=2)
					{
						flag=1;						
					}
					else if(arr[i][j]==2 && flag!=1 && flag!=0)
					{
						flag=2;						
					}
					else 
					{
						flag=0;
						break;
					}
				}				
				else if(i==1 && j==1)
				{
					if(arr[j][i]==1 && flag!=0 && flag!=2)
					{
						flag=1;						
					}
					else if(arr[j][i]==2 && flag!=1 && flag!=0)
					{
						flag=2;						
					}
					else 
					{
						flag=0;
						break;
					}
				}
				else if( i==2 && j==0)
				{
					if(arr[i][j]==1 && flag!=0 && flag!=2)
					{
						flag=1;						
					}
					else if(arr[2][0]==2 && flag!=1 && flag!=0)
					{
						flag=2;						
					}
					else 
					{
						flag=0;
						break;
					}
				}
			}		
		}
		if(flag==1)
		{
			which_player_win=8;
			return 1;			
		}
		else if(flag==2)
		{
			which_player_win=8;
			return 2;
			
		}
		return 0;
	}
		
	public void move(int a)
	{			
			if (a==1)
			{
				position=1;
				repaint();
			}
			
			else if(a==2)
			{
				position=2;
				repaint();
			}
			
			else if(a==3)
			{
				position=3;
				repaint();
			}
			
			else if(a==4)
			{
				position=4;
				repaint();
			}
			
			else if(a==5)
			{
				position=5;
				repaint();
			}
			
			else if(a==6)
			{
				position=6;
				repaint();
			}
			
			else if(a==7)
			{
				position=7;
				repaint();
			}
			
			else if(a==8)
			{
				position=8;
				repaint();
			}
			
			else if(a==9)
			{
				position=9;
				repaint();
			}										
		
	}

	
	public void mouseClicked(MouseEvent e) 
	{
		int k=e.getX();
		int y=e.getY();
		
		if(50<k && k<100 && 100<y && y<150 )
		{
			move(1);
		}
		
		else if(100<k && k<180 && 100<y && y<150 )
		{
			move(2);
		}
		
		else if(180<k && k<230 && 100<y && y<150 )
		{
			move(3);
		}
		
		else if(50<k && k<100 && 150<y && y<200 )
		{
			move(4);
		}
		
		else if(100<k && k<180 && 150<y && y<200 )
		{
			move(5);
		}
		
		else if(180<k && k<230 && 150<y && y<200 )
		{
			move(6);
		}
		
		else if(50<k && k<100 && 200<y && y<250 )
		{
			move(7);
		}
		
		else if(100<k && k<180 && 200<y && y<250 )
		{
			move(8);
		}
		
		else if(180<k && k<230 && 200<y && y<250 )
		{
			move(9);
		}

	}

	
	public void mouseEntered(MouseEvent arg0) 
	{
	
		
	}

	
	public void mouseExited(MouseEvent arg0) 
	{
	
		
	}


	public void mousePressed(MouseEvent arg0) 
	{

		
	}
	
	public void mouseReleased(MouseEvent arg0) 
	{
	
		
	}	
	
}


public class Tic_Tac_Toe 
{
	public static void main(String[] args) 
	{
		Mainframe main=new Mainframe();		
	}
}
