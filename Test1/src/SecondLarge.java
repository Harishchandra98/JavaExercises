public class SecondLarge {

//     if we do not declare the main function as static, then
//     the JVM have to create a object first and call the main method.

    public static void main(String[] args) {

        int[] numArray = { 20, 54, 98, 0, 54, 0, 40, 98};
        int firstLarge, secondLarge, temp;

        if ( numArray[0] > numArray[1] ) {
            firstLarge = numArray[0];
            secondLarge = numArray[1];
        }
        else {
            firstLarge = numArray[1];
            secondLarge = numArray[0];
        }

        for ( int i=2; i< numArray.length; i++) {
            if ( numArray[i] > firstLarge ) {
                temp = firstLarge;
                firstLarge = numArray[i];
                secondLarge = temp;
            }
            else if ( numArray[i]<firstLarge && numArray[i]>secondLarge) {
                secondLarge = numArray[i];
            }
        }

        System.out.println("Second largest element : " + secondLarge);
    }
}


