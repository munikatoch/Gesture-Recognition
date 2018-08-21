package gesture;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
public class CreateFrame implements ActionListener{
	
	MouseMotion mm;
	JMenuBar jmb;
	JMenu jm;
	JMenuItem EditGesture;
	JFrame newF,f;
	static JComboBox<String> jcb1,jcb2;
	 CreateFrame(){
		 try {
			    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			        if ("Nimbus".equals(info.getName())) {
			            UIManager.setLookAndFeel(info.getClassName());
			            break;
			        }
			    }
			} catch (Exception e) {
			    
			}
		f = new JFrame("Gesture Detection");
		mm = new MouseMotion();		
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		f.add(mm);
		f.setBackground(Color.WHITE);
		jmb = new JMenuBar();
		jm = new JMenu("Edit");
		EditGesture = new JMenuItem("Gesture");
		jm.add(EditGesture);
		jmb.add(jm);
		f.setJMenuBar(jmb);
		EditGesture.addActionListener(this);		
		}
	 CreateFrame(ActionEvent e){
		 try{
			 newF.setVisible(false);;
		 }
		 catch(Exception eu){
			 System.out.println("Error");
		 }
	 }
	 public void actionPerformed(ActionEvent e) {    
			if(e.getSource()==EditGesture){
				newF = new JFrame();
				String []options = {"Select","Up","Down","Right","Left"};
				String []select = {"Select","Shutdown", "Restart","Get MAC","Get IP","Browse"};
				jcb1 = new JComboBox<String>(options);
				jcb2 = new JComboBox<String>(select);
				jcb1.setBounds(20, 50, 90, 30);
				jcb2.setBounds(130, 50, 90, 30);
				jcb1.addActionListener(new Action());
				jcb2.addActionListener(new Action());
				newF.add(jcb1);
				newF.add(jcb2);
				newF.setSize(250, 200);
				newF.setLayout(null);
				newF.setVisible(true);
				newF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
			}
	}
}
