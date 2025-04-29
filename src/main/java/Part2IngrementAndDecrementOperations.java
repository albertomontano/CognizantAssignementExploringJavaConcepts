public class Part2IngrementAndDecrementOperations {

    public static void main(String[] args) {
        int counter = 10;

        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);

        for(int i=0; i<5; i++){
            counter++;
            System.out.println(counter);
        }
        while(counter > 10){
            counter--;
            System.out.println(counter);
        }



    }
}
