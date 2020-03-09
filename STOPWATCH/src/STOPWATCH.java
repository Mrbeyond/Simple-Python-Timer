import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class STOPWATCH  extends JFrame
{
	JLabel[] lab;
	JButton[] but;
	JTextField[] entry;
	JPanel panel;
	
	public STOPWATCH()
	{
		lab = new JLabel[3];
		but = new JButton[3];
		entry = new JTextField[3];		
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		
		String[] texts = {"Start Timing", "Start Time", "","Stop Timing", "Stop Time", "","Exit", "Elapsed Time", ""};

		for(int i=0; i<9; i++)
		{
			int j;
			if(i==0 || i==3 || i==6)
			{
				j = (i == 0)? 0 : (i == 3)? 1: 2;
				but[j] = new JButton(texts[i]);
				panel.add(but[j]);
			}
			else if (i==1 || i==4 || i==7)
			{
				j = (i == 1)? 0 : (i == 4)? 1: 2;
				lab[j] = new JLabel(texts[i]);
				panel.add(lab[j]);
			}
			else if (i==2 || i==5 || i==8)
			{	
				j = (i == 2)? 0 : (i == 5)? 1: 2;
				entry[j] = new JTextField(texts[i]);
				panel.add(entry[j]);
			}			
		}
		
		
		System.out.println(555);
		
		
		setLayout( new BorderLayout());
		add(panel, BorderLayout.CENTER);
		setTitle("Stop Watch"); 
		setSize(400,400);
		setVisible(true);
//		pack();
		
	}
	
	public static void main(String[] args)
	{
//		STOPWATCH stopwatch = 
				new STOPWATCH();
//		stopwatch();
	}
}
