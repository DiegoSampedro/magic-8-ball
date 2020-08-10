public class Fortune {
    public static void main(String[] args) {
        System.out.println("MAGIC 8-BALL: \n");
        int num = (int) (Math.random() * 8 + 1);
        switch(num) {
            case 1:
                System.out.println("It is certain");
                break;
            case 2:
                System.out.println("It is decidedly so");
                break;
            case 3:
                System.out.println("Most likely yes");
                break;
            case 4:
                System.out.println("Ask again later");
                break;
            case 5:
                System.out.println("Don't count on it");
                break;
            case 6:
                System.out.println("My sources say no");
                break;
            case 7:
                System.out.println("Outlook not so good");
                break;
            default:
                System.out.println("Concentrate and ask again");
        }
    }
}
