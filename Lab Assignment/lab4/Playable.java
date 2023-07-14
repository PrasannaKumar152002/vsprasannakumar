package lab4;

public interface Playable {
	void play();
}
class Guitar implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is Playing");
		
	}
	
}
class piano implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano is Playing");
	}
	
}