public class Main {
    public static void main(String[] args)
    {
        //PREFIJOS Y SUFIJOS ++X --X   X++ X--
        int someValue=5;
        int otherValue=10;
        System.out.println(++someValue); //Prefijo: El incremento vá antes de la variable, en consecuencia, me imprime el incremento
        System.out.println(someValue); //Luego del incremento, me vuelve a mostrar ese mismo valor.

        System.out.println(otherValue++); //Posfijo: El incremento va despues de la variable, en consecuencia, me imprime el valor incial, luego el incremento.
        System.out.println(otherValue);

        //Operadores de asignación compuesto
          /*
          5 operaciones matemática básicas
          += -= *= /= %=
           */

        int nextValue=200;
        int v1=5;
        int v2=2;
        nextValue/=v1*v2;
        System.out.println(nextValue);

        //Siguiente ejemplo
        int valA=21;
        int valB=6;
        int valC=3;
        int valID=1;

        int result1=valA+valB/valC; //21+6/3=21+2=23
        int result2=(valA-valB)/valC;// 15/3=5
        System.out.println(result1);//23
        System.out.println(result2);//5

        int result3=valA/valC*valID+valB; //21/3*1+6=7*1+6=7+6=13
        int result4=valA/(valC*(valID+valB)); //1
        System.out.println(result3);//13
        System.out.println(result4);//1
    }
}