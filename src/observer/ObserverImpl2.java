package observer;

public class ObserverImpl2 implements Observer {
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        System.out.println("Observer 2 : Mise à jour reçue. Nouvel état = " + state);
    }
}
