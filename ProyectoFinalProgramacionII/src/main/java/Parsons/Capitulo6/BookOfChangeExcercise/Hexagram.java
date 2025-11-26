package Parsons.Capitulo6.BookOfChangeExcercise;

import java.util.Vector;

public class Hexagram {
	
	public Hexagram() {	
	}
	
	public String getHexagramLine(Vector coinObjects) {
		
		int value1,value2,value3, valueT;
		
		if (coinObjects.get(0).equals("Heads")) {
			value1=1;
		}else {
			value1=2;
		}
		
		if (coinObjects.get(1).equals("Heads")) {
			value2=1;
		}else {
			value2=2;
		}
		
		if (coinObjects.get(2).equals("Heads")) {
			value3=1;
		}else {
			value3=2;
		}
		
		valueT=value1+value2+value3;
		var oldYang=
				("\n"+
				 "- - - -   o   - - - -  \n"
				+ " -       -  -       - \n"
				+ "  -     -    -     -  \n"
				+ "   -   -      -   -   \n"
				+ "               - -    \n"
				+ "     o          o     \n"
				+ "                      \n"
				+ "   -   -       -  -   \n"
				+ "  -     -     -    -  \n"
				+ " -       -   -      - \n"
				+ "-         - -        -\n"
				+ " - - - -   o  - - - - \n"
				);
		
		var oldYin=
				("\n"+
				 "- - - -   x   - - - -  \n"
				+ " -       -  -       - \n"
				+ "  -     -    -     -  \n"
				+ "   -   -      -   -   \n"
				+ "               - -    \n"
				+ "     x          x     \n"
				+ "                      \n"
				+ "   -   -       -  -   \n"
				+ "  -     -     -    -  \n"
				+ " -       -   -      - \n"
				+ "-         - -        -\n"
				+ " - - - -   x  - - - - \n"
				);
		
		var youngYang=
				("\n"+
				 "- - - -   -   - - - -  \n"
				+ " -       -  -       - \n"
				+ "  -     -    -     -  \n"
				+ "   -   -      -   -   \n"
				+ "               - -    \n"
				+ "     -          -     \n"
				+ "                      \n"
				+ "   -   -       -  -   \n"
				+ "  -     -     -    -  \n"
				+ " -       -   -      - \n"
				+ "-         - -        -\n"
				+ " - - - -   -  - - - - \n"
				);
		
		var youngYin=
				("\n"+
				 "- - - -      - - - -   \n"
				+ " -       -  -       - \n"
				+ "  -     -    -     -  \n"
				+ "   -   -      -   -   \n"
				+ "               - -    \n"
				+ "                      \n"
				+ "                      \n"
				+ "   -   -       -  -   \n"
				+ "  -     -     -    -  \n"
				+ " -       -   -      - \n"
				+ "-         - -        -\n"
				+ " - - - -      - - - - \n"
				);
		if (valueT==3) {
			return "Hexagram Type: "+hexagramType.OLD_YANG_LINE + ": " + oldYang;
		} if (valueT==6) {
			return "Hexagram Type: "+hexagramType.OLD_YIN_LINE + ": " + oldYin;
		}else if (valueT==4) {
			return "Hexagram Type: "+hexagramType.YOUNG_YANG_LINE + ": " + youngYang;
		}else {
			return "Hexagram Type: "+hexagramType.YOUNG_YIN_LINE + ": " + youngYin;
		}
		
		
	
	}
	
 enum hexagramType {OLD_YANG_LINE,OLD_YIN_LINE,YOUNG_YANG_LINE,YOUNG_YIN_LINE};
}
