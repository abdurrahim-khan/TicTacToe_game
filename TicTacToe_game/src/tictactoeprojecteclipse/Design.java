package tictactoeprojecteclipse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalButtonUI;

class Design implements ActionListener
{
	JButton[] arr;
	JFrame jf;
	
	Font font = new Font("Arial",1,80);
	int count =0;
	void createFrame()
	{
		jf = new JFrame();
		jf.setSize(500, 500);
		jf.setBounds(400,130,500,500);
		jf.setUndecorated(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new GridLayout(3,3));
		arr = new JButton[9];
		for(int a =0; a<9; a++)
		{
			arr[a] = new JButton();
			arr[a].addActionListener(this);
			arr[a].setBackground(Color.WHITE);
			arr[a].setCursor(new Cursor(Cursor.HAND_CURSOR));
			jf.add(arr[a]);
		}
		
		jf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for(int a =0; a<9;a++)
		{
			if(e.getSource() == arr[a])
			{
                count++;
				if(count % 2 ==0)
				{
					arr[a].setText("X");
					arr[a].setFont(font);
					arr[a].setForeground(Color.GREEN);
					arr[a].setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					arr[a].setEnabled(false);
				}
				else
				{
					arr[a].setText("0");
					arr[a].setForeground(Color.RED);
					arr[a].setFont(font);
					arr[a].setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					arr[a].setEnabled(false);
				}
				
			}
		}
		int flag =0;
		if((!arr[0].getText().equals("")) && arr[0].getText().equals(arr[1].getText()) && arr[1].getText().equals(arr[2].getText()))
		{
			JOptionPane.showMessageDialog(jf, arr[0].getText()+" wins");
			for(int a =0; a<9; a++)
			{
				arr[a].setEnabled(false);
			}
			flag =1;
		}
	    if((!arr[3].getText().equals("")) && arr[3].getText().equals(arr[4].getText()) && arr[4].getText().equals(arr[5].getText()))
		{
			JOptionPane.showMessageDialog(jf, arr[3].getText()+" wins");
			for(int a =0; a<9; a++)
			{
				arr[a].setEnabled(false);
			}
			flag =1;
		}
		if((!arr[6].getText().equals("")) && arr[6].getText().equals(arr[7].getText()) && arr[7].getText().equals(arr[8].getText()))
		{
			JOptionPane.showMessageDialog(jf, arr[6].getText()+" wins");
			for(int a =0; a<9; a++)
			{
				arr[a].setEnabled(false);
			}
			flag =1;
		}
		if((!arr[0].getText().equals("")) && arr[0].getText().equals(arr[3].getText()) && arr[3].getText().equals(arr[6].getText()))
		{
			JOptionPane.showMessageDialog(jf, arr[0].getText()+" wins");
			for(int a =0; a<9; a++)
			{
				arr[a].setEnabled(false);
			}
			flag =1;
		}
		if((!arr[1].getText().equals("")) && arr[1].getText().equals(arr[4].getText()) && arr[4].getText().equals(arr[7].getText()))
		{
			JOptionPane.showMessageDialog(jf, arr[1].getText()+" wins");
			for(int a =0; a<9; a++)
			{
				arr[a].setEnabled(false);
			}
			flag =1;
		}
		if((!arr[2].getText().equals("")) && arr[2].getText().equals(arr[5].getText()) && arr[5].getText().equals(arr[8].getText()))
		{
			JOptionPane.showMessageDialog(jf, arr[2].getText()+" wins");
			for(int a =0; a<9; a++)
			{
				arr[a].setEnabled(false);
			}
			flag =1;
		}
		if((!arr[0].getText().equals("")) && arr[0].getText().equals(arr[4].getText()) && arr[4].getText().equals(arr[8].getText()))
		{
			JOptionPane.showMessageDialog(jf, arr[0].getText()+" wins");
			for(int a =0; a<9; a++)
			{
				arr[a].setEnabled(false);
			}
			flag =1;
		}
		if((!arr[2].getText().equals("")) && arr[2].getText().equals(arr[4].getText()) && arr[4].getText().equals(arr[6].getText()))
		{
			JOptionPane.showMessageDialog(jf, arr[2].getText()+" wins");
			for(int a =0; a<9; a++)
			{
				arr[a].setEnabled(false);
			}
			flag =1;
		}
		
		if(count == 9 && flag ==0)
		{
			JOptionPane.showMessageDialog(jf," match draw");
		}
		if(count == 9 || flag == 1)
		{
			int n = JOptionPane.showConfirmDialog(jf, "do you want to play again?", "Confirm", JOptionPane.YES_NO_OPTION);
			
			if(n==0)
			{
				for(int a=0; a<9; a++)
				{
					arr[a].setEnabled(true);
					arr[a].setText("");
					arr[a].setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				count =0;
			}
			if(n==1)
			{
				System.exit(n);
			}
		}
		
		
	}
	
}
