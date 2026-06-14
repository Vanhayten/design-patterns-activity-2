package observer;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();

        System.out.println("--- Souscription de Observer 1 et Observer 2 ---");
        observable.subscribe(o1);
        observable.subscribe(o2);

        System.out.println("\n--- Changement d'état à 20 ---");
        observable.setState(20);

        System.out.println("\n--- Changement d'état à 30 ---");
        observable.setState(30);

        System.out.println("\n--- Désabonnement de Observer 1 ---");
        observable.unsubscribe(o1);

        System.out.println("\n--- Changement d'état à 40 ---");
        observable.setState(40);
    }
}
