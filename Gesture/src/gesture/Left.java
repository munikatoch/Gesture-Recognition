package gesture;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Left {
	static String path = "D:\\ForProject\\shutdown.bat";
	Left()throws IOException{
		File f = new File(path);
		if(!Desktop.isDesktopSupported()){
			System.out.println("Unsupported file chosen");
		}
		Desktop act = Desktop.getDesktop();
		if(f.exists()){
			act.open(f);
		}
	}
	Left(String s){
		switch (s){
		case "Shutdown":
			Left.path = "D:\\ForProject\\shutdown.bat";
			break;
		case "Restart":
			Left.path = "D:\\ForProject\\restart.bat";
			break;
		case "Get MAC":			
			Left.path= "D:\\ForProject\\mac.bat";
			break;
		case "Get IP":
			Left.path = "D:\\ForProject\\ip.bat";
			break;
		case "Browse":
			JFileChooser fc = new JFileChooser();
			int i = fc.showOpenDialog(fc);
			if(i==JFileChooser.APPROVE_OPTION){
				File f = fc.getSelectedFile();
				Left.path = f.getPath();
			}
			break;
		}
	}
}
