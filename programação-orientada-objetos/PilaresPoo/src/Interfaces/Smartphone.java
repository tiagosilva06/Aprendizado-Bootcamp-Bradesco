package Interfaces;

public class Smartphone implements VideoPlayer, MusicPlayer {

	@Override
	public void playVideo() {
		System.out.println("O Smartphone está reproduzindo a música");
		
	}

	@Override
	public void pauseVideo() {
		System.out.println("O Smartphone está pausando o video");
		
	}

	@Override
	public void stopVideo() {
		System.out.println("O Smartphone está parando o video");
		
	}

	@Override
	public void playMusic() {
		System.out.println("O Smartphone está tocando a música");
	}

	@Override
	public void pauseMusic() {
		System.out.println("O Smartphone está pausando a música");
		
	}

	@Override
	public void stopMusic() {
		System.out.println("O Smartphone está parando a música");
		
	}

}
