import java.util.ArrayList;
import java.util.Scanner;
public class TvShowMain {
    public static void main(String[] args) {
        ArrayList<TvShow> tvShowList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name of show: ");
            String showName = scanner.nextLine();
            if (showName.equals("")) {
                break;
            }
            System.out.println("How many episode?: ");
            int numOfEpisodes = scanner.nextInt();
            scanner.nextLine();
            System.out.println("What is the genre?: ");
            String genre = scanner.nextLine();

            TvShow tvShow = new TvShow(showName, numOfEpisodes, genre);
            tvShowList.add(tvShow);
        }


        for (TvShow tvShow : tvShowList) {
            System.out.println(tvShow.toString());
        }


    }

}
