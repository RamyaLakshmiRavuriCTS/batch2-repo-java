import java.util.*;
public class SearchingOfElement {
    static List<Number> numbers=new ArrayList<>();
    static Set<Number> noDuplicate=new HashSet<>();

    public static List<Number> removeDuplicates(List<Number> numbers){
        List<Number> originalList=new ArrayList<>();
        for(Number number:numbers){
            noDuplicate.add(number);
        }
        for(Number number:noDuplicate){
            originalList.add(number);
        }
        return originalList;
    }

    public static List<Number> sort(List<Number> result){
        Number temp;

        for(int i=0;i<result.size();i++){
            for(int j=i+1;j<result.size();j++){
                if(result.get(i).getNumber()>result.get(j).getNumber()){
                    temp=result.get(i);
                    result.set(i,result.get(j));
                    result.set(j,temp);
                }
            }
        }
        return result;
    }

    public static int binarySearch(int n,List<Number> sort){
        int first=0;
        int last=sort.size()-1;
        int mid;
        while(first<=last){
            mid=(first+last)/2;
            if(sort.get(mid).getNumber()==n){
                return mid;
            }
            else if(sort.get(mid).getNumber()<n){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter size of Collection");
        int size=sc.nextInt();
        System.out.println("Enter element Collection");
        for(int i=0;i<size;i++){
            numbers.add(new Number(sc.nextInt()));
        }
        List<Number> result=removeDuplicates(numbers);
        List<Number> sorted=sort(result);
        System.out.println("Sorted elements:");
        for(Number i:sorted) {
            System.out.print(i.getNumber()+"\t");
        }
        int index=binarySearch(n,sorted);
        if(index==-1){
            System.out.println("\nGiven element doesn't exist");
        }
        else {
            System.out.println("\nElement " + n + " exists at index " + index);
        }
    }
}