import java.util.Scanner;

interface Academic {

    void getAcademic();
}

interface Sports {

    void getSports();
}

class Results implements Academic, Sports {

    int academic;
    int sports;

    Results(int aScore, int sScore) {

        academic = aScore;
        sports = sScore;
    }

    public void getAcademic() {

        System.out.println("Academic score : " + academic);
    }

    public void getSports() {

        System.out.println("Sports score : " + sports);
    }

    void displayResult() {

        int total = academic + sports;

        System.out.println("Result :");

        getAcademic();
        getSports();

        System.out.println("Total score : " + total);
    }
}

public class Interface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Academic score : ");
        int aScore = sc.nextInt();

        System.out.print("Enter Sports score : ");
        int sScore = sc.nextInt();

        Results r = new Results(aScore, sScore);

        r.displayResult();
    }
}