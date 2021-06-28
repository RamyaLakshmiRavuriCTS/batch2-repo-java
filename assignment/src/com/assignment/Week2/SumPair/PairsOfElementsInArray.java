public class PairsOfElementsInArray {

        public static void findThePairs(int[] inputArray)
        {
            System.out.println("Pairs of elements whose sum is "+ 10 +" are : ");

            for (int i = 0; i < inputArray.length; i++)
            {
                for (int j = i+1; j < inputArray.length; j++)
                {
                    if(inputArray[i]+inputArray[j] == 10)
                    {
                        System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+ 10);
                    }
                }
            }
        }

        public static void main(String[] args)
        {
            findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20});


        }
    }
