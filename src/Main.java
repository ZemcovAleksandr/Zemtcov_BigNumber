
//Найдите среднее арифметическое чисел 9_000_000_000_000_000_000 8_444_444_444_444_444_444


import java.math.BigInteger;

public class Main {
  //  BigDecimal i = 9000000000000000000;
   // BigDecimal[]  i =  ;
  public static void main(String[] args) {
      /*
      int[] myArray = {9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
     int[] myArray1 = {8,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
    float[] myArray2  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      float[] myArray3  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
     int[] myArray4  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      float[] myArray5  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      int[] myArray6  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      int[] myArray8  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      float[] myArray7  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

      System.out.print("Среднее ");
      for (int i = 0;  i <  myArray.length; i++) {
          myArray2[i] = myArray1[i] + myArray[i];
           myArray3[i] = myArray2[i] / 2;
                myArray4[i] = (int) myArray3[i] ;
                myArray5[i] = myArray3[i] - myArray4[i];
               myArray7[i] =  myArray5[i]*10;
               if(i+1<19){
               myArray8[i+1] =   (int)myArray7[i];}
               myArray6[i]  = myArray4[i] +  myArray8[i];
          System.out.print(myArray6[i]);
      }*/


      // Верхнее тоже "работает". Но я бы не сказал, что это верное решение.
      // Верное решение было найдено позже

      BigInteger  a = new BigInteger("9000000000000000000");
      BigInteger  b = new BigInteger("8444444444444444444");
      BigInteger  c = new BigInteger("2");
      a = a.add(b);
      System.out.println("Среднее значение =  "+a.divide(c));

      }
  }

