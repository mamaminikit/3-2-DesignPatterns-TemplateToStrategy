/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class GameManager { /* CONTEXT */
    private Game game;

    public void setGame(Game game) {
        this.game = game;
    }

    public void writeGame() {
        this.game.initializeGame();
        this.game.playingGame();
        this.game.ShowResult();
    }
}
