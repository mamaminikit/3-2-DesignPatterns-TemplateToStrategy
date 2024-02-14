/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Plays {
    public static void main(String[] args) {
        GameManager manage = new GameManager();
        manage.setGame(new Football());
        manage.writeGame();
        manage.setGame(new Basketball());
        manage.writeGame();
    }
}
