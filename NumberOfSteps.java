

public class NumberOfSteps {
    static int step = 0;
    public static int numberOfSteps(int num) { 
        if(num == 0){
            return step;
        }
        if((num & 1) == 0){
            step++;
            return numberOfSteps(num/2);
        }
        else{
            step++;
            return numberOfSteps(num - 1);
        }
    }
    public static void main(String[] args){
        System.out.println(String.format("Steps required: %d", numberOfSteps(8)));
    }
}
