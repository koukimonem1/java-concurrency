package thread;


public class Thread1Implementation {

    public static void main(String[] args) {
        // Quand on crée  thread qui implémente Runnable, il faut passer un objet de ce class pour le constructeur de la class Thread, et appeler la metode start
        (new Thread(new ThreadWithRunnable())).start();
        // Quand on crée  thread qui hérite Thread, il faut créer un objet et appeler la méthode start
        (new ExtendedTreadClass()).start();
        /**
         * The first idiom, which employs a Runnable object, is more general, because the Runnable object can subclass a class other than Thread.
         * The second idiom is easier to use in simple applications, but is limited by the fact that your task class must be a descendant of Thread.
         */
    }

    // Création d'un thread en héritant la class Thread
    private static class ExtendedTreadClass extends Thread{
        @Override
        public void run() {
            System.out.println("un thread qui hérilte la classe Thread");
        }
    }

    // Création d'un thread en implémentant l'interface Runnable
    private static class ThreadWithRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("thread qui implémente l'interface Runnable");
        }
    }
}
