public class GameStarter {
    public static void main(String[] args) {

        GameFrame gf = new GameFrame(1920, 1080);
        gf.connectToServer();
        gf.setUpGUI();
    }
}
