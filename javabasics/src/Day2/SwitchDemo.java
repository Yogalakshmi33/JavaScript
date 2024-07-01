package Day2;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x='l';
		switch(x)
		{
		case 'l':
		case 'L':
		System.out.println(x+"is a Letter");
		break;
		case 'd':
		case 'D':
		System.out.println(x+"is a digit");
		break;
		case'W':
		case'w':
		System.out.println(x+"is white space");
		break;
		case's':
		case 'S':
		System.out.println(x+"is special symbol");
		default:
		System.out.println(x+"is other then letter,digit,space or special symbol");
		break;
		}

	}

}
