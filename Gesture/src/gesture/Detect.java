package gesture;

import java.awt.Point;
import java.io.IOException;

public class Detect {
	static int rootX, rootY;
	static boolean isGesture;
	Detect() throws IOException{
		int getX=rootX-MouseMotion.nextX;
		int getY=rootY-MouseMotion.nextY;
		int i;
		Point p;
		if((getX>=-10 && getX<=10) && (getY>=10)) {
			for(i=0;i<MouseMotion.coordinate.size();i++){
				p = MouseMotion.coordinate.get(i);
				if((rootX-p.x<=-10 || rootX-p.x>=10) || rootY-p.y<-1){
					System.out.println("Wrong gesture try again");
					isGesture = false;
					break;
				}
			}
			if(isGesture)
				new Up();
		}
		else if((getX>=-10 && getX<=10) && (getY<=-10)){
			for(i=0;i<MouseMotion.coordinate.size();i++){
				p = MouseMotion.coordinate.get(i);
				if((rootX-p.x<=-10 || rootX-p.x>=10)|| rootY-p.y>1){
					System.out.println("Wrong gesture try again");
					isGesture = false;
					break;
				}				
			}
			if(isGesture){
				new Down();
			}				
		}
		else if((getY>=-10 && getY<=10) && (getX<=-10)){
			for(i=0;i<MouseMotion.coordinate.size();i++){
				p = MouseMotion.coordinate.get(i);
				if((rootY-p.y<=-10 || rootY-p.y>=10)|| rootX-p.x>1){
					System.out.println("Wrong gesture try again");
					isGesture = false;
					break;
				}
			}
			if(isGesture)
				new Right();
		}
		else if((getY>=-10 && getY<=10) && (getX>=10)){
			for(i=0;i<MouseMotion.coordinate.size();i++){
				p = MouseMotion.coordinate.get(i);
				if((rootY-p.y<=-10 || rootY-p.y>=10)|| rootX-p.x<-1){
					System.out.println("Wrong gesture try again");
					isGesture = false;
					break;
				}
			}
			if(isGesture)
				new Left();
		}			
		else
			System.out.println("Wrong gesture try again");
	}
}
