package com.company;
@FunctionalInterface                                      // skapar anotation för att kolla om intefacet är korrekt //

interface  MyFuncTask {                                       // Gjort abstracta classen till ett interface //
    int apply(int x);                                        // skapat en metod till myFunc //
}
public class Main {

    public static void main(String[] args) {
        MyFuncTask add = x -> x +2;                          // lambda expression istället för flera implementationer //

        MyFuncTask Substract = new MyFuncTask() {                // skapar en ny implemenation av interfacet, utan lambda expression//
            @Override
            public int apply(int x) {
                return x - 10;                                   // subtraherar x värdet med 10


            }
        };

        usingFuncInterface(add,5);
        usingFuncInterface(Substract,15);

        usingFuncInterface( x -> x /5 , 10);               // Lambda expression direkt utan att spara i variable //
    }
    private static void usingFuncInterface(MyFuncTask myFunc, int x){  // Gör en metod usingFuncInterface, ger metoden parametrar//
        int result = myFunc.apply(x);                                 // Hämtar metoden i funktionella interfacet //
        System.out.println(result);
    }
}
