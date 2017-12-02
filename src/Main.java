public class Main {
    public static void main(String[] args) {
                 PainList<String> list = new PainList<>();
                list.addLast("perviy");
                list.addLast("vtoroy");
                list.addLast("tretiy");
                list.addLast( "chetvortiy" );
                System.out.println(list.getFirst());
                System.out.println(list.getLast());
            }
        }


