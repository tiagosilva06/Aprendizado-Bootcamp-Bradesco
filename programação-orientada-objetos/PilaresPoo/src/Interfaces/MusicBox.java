package Interfaces;

public class MusicBox implements MusicPlayer {

	@Override
	public void playMusic() {
		System.out.println("A caixa de som está tocando a música");
	}

	@Override
	public void pauseMusic() {
		System.out.println("A caixa de som está pausando a música");
		
	}

	@Override
	public void stopMusic() {
		System.out.println("A caixa de som está parando a música");
		
	}

}
