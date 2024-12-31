import java.util.Scanner;
class CheckGrade_Steel{

    
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter hardnessof steel:");
        int hardness=sc.nextInt();
        System.out.print("Enter carbon content of steel:");
        double car_con=sc.nextDouble();
        System.out.print("Enter Tensile strength steel:");
        int t_strength=sc.nextInt();
        if((hardness>50)&&(car_con<0.7)&&(t_strength>5600)){
            System.out.println("Grade 10");
        }
        else  if((hardness>50)&&(car_con<0.7)){
            System.out.println("Grade 9");
        }
        else if((car_con<0.7)&&(t_strength>5600)){
            System.out.println("Grade 8");
        }
        else if((hardness>50)&&(t_strength>5600)){
            System.out.println("Grade 7");
        }
        else if((hardness>50)||(car_con<0.7)||(t_strength>5600)){
            System.out.println("Grade 6");
        }
        else{
            System.out.println("Grade 5");
        }
        
        
        

    }
}
