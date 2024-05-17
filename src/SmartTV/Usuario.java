public class Usuario {
    public static void main(String[] args) {
	SmartTv smartTv = new SmartTv();

	smartTv.ligar();

	smartTv.aumentarVolume();
	smartTv.aumentarVolume();

	smartTv.mudarCanal(20);

	System.out.println("TV ligada? " + smartTv.ligado);
	System.out.println("Canal: " + smartTv.canal);
	System.out.println("Volume: " + smartTv.volume);

    }
}
