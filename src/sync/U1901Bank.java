package sync;

public class U1901Bank {
    int intTo; //счет-отправитель
    int intFrom = 220; //счет-получатель

    public synchronized void clac(int intTransaction, long lngTimeout) {

        System.out.println("Before");
        System.out.print("From = " + intFrom + " ");
        System.out.print("To = " + intTo + " ");
        System.out.println("Thread: " + Thread.currentThread().getName());
        intFrom = intFrom - intTransaction;

        try{
            Thread.sleep(lngTimeout);
        } catch (Exception e){};

        intTo = intTo + intTransaction;

        System.out.println("After");
        System.out.print("To =  " + intFrom + " ");
        System.out.print("From = " + intTo + " ");
        System.out.println("Thread: " + Thread.currentThread().getName());
    }

}
