public class ArrayDemo1 {
    public class ArrayDemo1 {
        public static void main(String[] args){
            fianl int EMPLOYEES = 3;//ตัวแปรค่าคงที่
            int[]hours = new int[EMPLOYEES];
            Scanner in = new Scanner(System.in);
           System.out.println ("Enter the hours workec by" + EMPLOYEES )
            for(int index =0; ndex<EMPLOYEES; index++)
            System.out.println("Employee" +(index + 1)+ " :");
            hours[index]= in.nextint();
        }
        System.out.println("The hours you  enterred are: ");
        for (int index =0 ; index < EMPLOYEES; index ++){
            System.out.println(hours[index]);
        }
    
        
    }
}
