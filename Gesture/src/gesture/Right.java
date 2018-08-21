package gesture;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Right {
	static String path = "D:\\ForProject\\restart.bat";
	Right() throws IOException{
		File f = new File(path);
		if(!Desktop.isDesktopSupported()){
			System.out.println("Unsupported file chosen");
		}
		Desktop act = Desktop.getDesktop();
		if(f.exists()){
			act.open(f);
		}
	}
	Right(String s){
		switch (s){
		case "Shutdown":
			Right.path = "D:\\ForProject\\shutdown.bat";
			break;
		case "Restart":
			Right.path = "D:\\ForProject\\restart.bat";
			break;
		case "Get MAC":			
			Right.path= "D:\\ForProject\\mac.bat";
			break;
		case "Get IP":
			Right.path = "D:\\ForProject\\ip.bat";
			break;
		case "Browse":
			JFileChooser fc = new JFileChooser();
			int i = fc.showOpenDialog(fc);
			if(i==JFileChooser.APPROVE_OPTION){
				File f = fc.getSelectedFile();
				Right.path = f.getPath();
			}
			break;
		}
	}
}
