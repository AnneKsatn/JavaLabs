import java.util.Random;

public class U0901Main {
    public static void main(String[] args) {
        Integer[] intArr = {10,15,25};

        Random rnd = new Random();
        Float[] floatArr = new Float[3];

        for (int i=0; i<3; i++){
            floatArr[i] = rnd.nextFloat();
        }

        U0901WorkArray insWorkArrayInt = new U0901WorkArray(intArr);
        U0901WorkArray insWorkArrayFloat = new U0901WorkArray(floatArr);

        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());

      //  String[] stringArr = {"1", "2", "3"};
      //  U0901WorkArray insWorkArrayString = new U0901WorkArray(stringArr);
    }
}

