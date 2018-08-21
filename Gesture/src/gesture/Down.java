package gesture;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Down {
	static String path = "D:\\ForProject\\mac.bat";
	Down()throws IOException{
		File f = new File(path);
		if(!Desktop.isDesktopSupported()){
			System.out.println("Unsupported file chosen");
		}
		Desktop act = Desktop.getDesktop();
		if(f.exists()){
			act.open(f);
		}
	}
	Down(String s){
		switch (s){
		case "Shutdown":
			Down.path = "D:\\ForProject\\shutdown.bat";
			break;
		case "Restart":
			Down.path = "D:\\ForProject\\restart.bat";
			break;
		case "Get MAC":			
			Down.path= "D:\\ForProject\\mac.bat";
			break;
		case "Get IP":
			Down.path = "D:\\ForProject\\ip.bat";
			break;
		case "Browse":
			JFileChooser fc = new JFileChooser();
			int i = fc.showOpenDialog(fc);
			if(i==JFileChooser.APPROVE_OPTION){
				File f = fc.getSelectedFile();
				Down.path = f.getPath();
			}
			break;
		}
	}
}
