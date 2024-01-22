public class Promedio2{
 public static void main(String args[]){
  
   int matematicas = 2;
   int biologia    = 8;
   int quimica     = 7;
   int promedio    = 0;

   promedio = (matematicas + biologia + quimica) / 3;
   
   if(promedio >= 6){
     System.out.println("El alumno aprobó" + promedio);   
   } else {
     System.out.println("El alumno reprobó" + promedio);
   
   }
 }
}