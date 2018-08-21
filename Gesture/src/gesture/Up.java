package gesture;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Up {
	static String path = "D:\\ForProject\\ip.bat";
	File f;
	Up()throws IOException{
		f = new File(path);
		if(!Desktop.isDesktopSupported()){
			System.out.println("Unsupported file chosen");
		}
		Desktop act = Desktop.getDesktop();
		if(f.exists()){
			act.open(f);
		}
	}
	Up(String s){
		switch (s){
		case "Shutdown":
			Up.path = "D:\\ForProject\\shutdown.bat";
			break;
		case "Restart":
			Up.path = "D:\\ForProject\\restart.bat";
			break;
		case "Get MAC":			
			Up.path= "D:\\ForProject\\mac.bat";
			break;
		case "Get IP":
			Up.path = "D:\\ForProject\\ip.bat";
			break;
		case "Browse":
			JFileChooser fc = new JFileChooser();
			int i = fc.showOpenDialog(fc);
			if(i==JFileChooser.APPROVE_OPTION){
				File nf = fc.getSelectedFile();
				Up.path = nf.getPath();
			}
			break;
		}
	}
}
