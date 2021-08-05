public class Main {

    public static void main(String[] args) {
	Fighter f1=new Fighter("Rabia",100,30,60,50,50);
	Fighter f2=new Fighter("Ogeday",100,15,55,50,50);
	Match match=new Match(f1,f2,50,70);
	match.run();

    }
}
