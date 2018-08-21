package gesture;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action implements ActionListener{
	static String path;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="OK"){

		}		
		else if(e.getActionCommand()=="comboBoxChanged"){
			String s1 = String.valueOf(CreateFrame.jcb1.getSelectedItem());
			String s2 = String.valueOf(CreateFrame.jcb2.getSelectedItem());
			switch(s1){
			case "Up":
				new Up(s2);
				break;
			case "Down":
				new Down(s2);
				break;
			case "Left":
				new Left(s2);
				break;
			case "Right":
				new Right(s2);
			}			
		}
	}
}
