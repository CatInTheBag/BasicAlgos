package com.company;

public class ArrayStructores
{
   //50 boxes
   private int[] arr  = new int[] {68,20,81,93,61,79,89,3,5,6};

   private int arrSize = 10;

   /*public void generateRandom()
   {
      for (int i = 0; i < arrSize; i++)
      {
         arr[i]=(int)(Math.random()*100);
      }
   }*/

   public void printArr()
   {
      System.out.println("---------------------------------------------------");
      System.out.print("| ");

      for (int i = 0; i < arrSize; i++)
      {
         System.out.print( i +"  | ");
      }
      System.out.println();


      System.out.print("| ");
      for (int i = 0; i < arrSize; i++)
      {
         if(arr[i] < 10)
         {
            System.out.print(arr[i] + " | " );
            System.out.printf(" ");
         }
         else
            System.out.print(arr[i] + " | ");
      }
      System.out.println();
      System.out.println("---------------------------------------------------");

   }

   public int getValueAtIndex(int index)
   {
      if(index < arrSize)
      {
         return arr[index];
      }

      return 0;
   }

   public boolean doesArrContains(int value)
   {
      boolean valueInArr = false;

      for(int i = 0; i < arrSize; i++)
      {
         if( arr[i] == value)
         {
            valueInArr = true;
            break;
         }
      }

      return valueInArr;
   }

   public void deleteIndex(int index)
   {
      if( index < arrSize)
      {
         for (int i = index; i < (arrSize-1); i++)
         {
            arr[i] = arr[i+1];
         }
      }

      arrSize--;
   }

   public void insertValue(int value)
   {
      if ( arrSize < 50)
      {
         arr[arrSize] = value;
         arrSize++;
      }
   }

   public void liniearSearch(int value)
   {
      boolean valueFound = false;

      for (int i = 0; i < arr.length; i++)
      {
         if(arr[i] == value)
         {
            valueFound = true;
            System.out.println("Value found at index " + i);
         }
      }

      if(!valueFound)
      {
         System.out.println("Element was not found");
      }
   }

   public void bubleSortDescending()
   {
      for (int i = arrSize - 1; i > 0; i-- )
      {
         for(int y = 0; y < i; y++)
         {
            if(arr[y] < arr[y+1])
            {
               swapValues(y, y+1);
            }
         }
      }
      System.out.println("Descending order");
      printArr();
   }

   public void bubleSortAscending()
   {
      for (int i = arrSize - 1; i > 0; i-- )
      {
         for(int y = 0; y < i; y++)
         {
            if(arr[y] > arr[y+1])
            {
               swapValues(y, y+1);
            }
         }
      }
      System.out.println("Ascending order");
      printArr();
   }

   public void swapValues(int indexOne, int indexTwo)
   {
      int temp = arr[indexOne];
      arr[indexOne] = arr[indexTwo];
      arr[indexTwo] = temp;
   }

   public void binarySearch(int value)
   {
      int lowIndex = 0;
      int highIndex = arrSize - 1;
      boolean found = false;
      int foundIndex = 0;

      while (lowIndex <= highIndex)
      {
         int middleIndex = (highIndex+lowIndex) /2;

         if(arr[middleIndex] < value)
         {
            lowIndex = middleIndex + 1;
         }
         else if(arr[middleIndex] > value)
         {
            highIndex = middleIndex -1;
         }
         else
         {
            System.out.println("\nFound match for " + value + " at Index " + middleIndex);
            found = true;
            foundIndex = middleIndex;

            lowIndex = highIndex+1;
         }
      }

      if (!found)
      {
         System.out.println("Value "+value+" was not found :(");
      }
   }

   public void selectionSort()
   {
      for(int i = 0 ; i < arrSize; i++)
      {
         int minValue = i;

         for (int y = i; y < arrSize; y++)
         {
            if (arr[minValue] > arr[y])
            {
               minValue = y;
            }
         }

         swapValues(i, minValue);
         printArr();
      }
   }

   public void insertionSort()
   {
      for (int i = 1; i< arrSize; i++)
      {
         int y = i;
         int toInsert = arr[i];

         while((y>0)&& (arr[y-1] > toInsert))
         {
            arr[y] = arr[y - 1];
            y--;
         }

         arr[y] = toInsert;
      }
      printArr();
   }
}
