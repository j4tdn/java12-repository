package control;

public class Ex02 {
	enum Level{
		BAD,MEDIUM,PRETTY_GOOD,GOOD
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	private static Level getLevel(float point) {
		
//		Level level =null;
//		
//		if(point<5) {
//			level=level.BAD;
//		}else if(point >=5 && point<6.5f) {
//			level=level.MEDIUM;
//		}else if(point >=6.5 && point<8.5f) {
//			level=level.PRETTY_GOOD;
//		}else {
//			level=level.GOOD;
//		}
//		return level;
		
		
		if(point<5) {
			return Level.BAD;
		}
		if( point<6.5f) {
			return Level.MEDIUM;
		}
		if( point<8.5f) {
			return Level.PRETTY_GOOD;
		}
			return Level.GOOD;
		
	}

}
