

public class Main {
    public static void main(String[] args) {
        Save save = new Save();
        Update update = new Update();
        Show show = new Show();
        show.start();
        save.start();
        update.start();
      }
    }
