public class Playboard {

    final private int LENGTH;
    final private int HEIGHT;

    Playboard(int LENGTH, int HEIGHT) {
        this.LENGTH = LENGTH;
        this.HEIGHT = HEIGHT;
    }

    public void drawInit() {
        for(int i = 0; i < this.HEIGHT;i++) {
            System.out.print("\n");
            for(int j = 0; j < this.LENGTH; j++) {
                System.out.print("x ");
            }
        }
    }

    public void drawUserAnswer(UserAnsw[] answer) {

    }
}
