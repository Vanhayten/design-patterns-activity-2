package observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        System.out.println("Observer 1 : L'état a changé. Nouvel état = " + state);
    }
}
