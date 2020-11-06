import java.util.Scanner;

class EstructuraDatos{
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);

        int edad;
        float x;
        double resultado, grados, bono;
        int opcion; 
        int opciong=0;
        int opciongg=0;
        String respuesta;
        char exit;
        System.out.println("3IV9 - Perez Lopez Jesus Eduardo");
        System.out.println("Selecciona el programa que desees.");
        System.out.println("1. Descuento al abono.");
        System.out.println("2. Convertir numero decimal a binario.");
        System.out.println("3. Conversión de grados de temperatura (Farenheit,Celsius, Kelvine y Rankie).");
        System.out.println("4. Contar positivos y negativos.");
        System.out.println("5. Lector de Cantidades.");
        System.out.println("6. Areas y perímetros.");
        System.out.println("7. Tabla de Valores.");
        System.out.println("8. Factorial de un Numero.");
        System.out.println("13. Calculadora.");
        opcion = entrada.nextInt();
        
        do{
            switch (opcion) {
                    case 1:

                        System.out.println("¿De cuánto es tu bono?");
                        bono = entrada.nextFloat();
                        System.out.println("¿Cuál es tu edad?");
                        edad = entrada.nextInt();
                        if(edad>65){
                            resultado =  bono*.40;
                            System.out.println("Tu abono ahora es de $"+resultado+".");
                        }else{
                        if (edad<21){
                            System.out.println("¿Tus padres son socios");
                            respuesta = System.console().readLine();
                            if (respuesta == "Si"){
                            resultado = bono*.45;
                            System.out.println("Tu abono ahora es de $"+resultado+"");
                            }else{
                                resultado = bono*.20;
                                System.out.println("Tu abono ahora es de $"+resultado+"");
                            }
                        }
                    }
                    
                        break;
                    case 2:

                        break; 
                
                    case 3:
                        System.out.println("Hola, bienvenido al conversor de Grados. :3");
                        

                        System.out.println("Que grados tienes que convertir");
                        System.out.println();
                        System.out.println("1. Fahrenheit");
                        System.out.println("2. Celcius");
                        System.out.println("3. Kelvine");
                        System.out.println("4. Rankie");
                        opciong = entrada.nextInt();

                        switch (opciong){
                            case 1:
                                do{
                                System.out.println("A que grados los quieres convertir?");
                                System.out.println();
                                System.out.println("1. De Fahrenheit a Celcius.");
                                System.out.println("2. De Fahrenheit a Kelvine");
                                System.out.println("3. De Fahenheit a Rankie");
                                opciongg = entrada.nextInt();
                                }while (opciongg<=0 || opciongg>=5);
                                switch (opciongg){
                                    case 1: 
                                        System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = (grados-32)/(1.8);
                                        System.out.println("Los "+grados+"°F equivalen a "+resultado+"°C");
                                        break;
                                    case 2:
                                        System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = ((grados-32)*(5/9))+273.15;
                                        System.out.println("Los "+grados+"°F equivalen a "+resultado+"K");
                                        break;
                                    case 3:
                                    System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = grados+459.67;
                                        System.out.println("Los "+grados+"°F equivalen a "+resultado+"R");
                                        break;
                                }

                            break;
                            case 2:
                                do{
                                System.out.println("A que grados los quieres convertir?");
                                System.out.println();
                                System.out.println("1. De Celcius a Fahrenheit");
                                System.out.println("2. De Celcius a Kelvine");
                                System.out.println("3. De Celcius a Rankie");
                                opciongg = entrada.nextInt();
                                }while (opciongg<=0 || opciongg>=5);
                                switch (opciongg){
                                    case 1: 
                                        System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = (grados*1.8)+32;
                                        System.out.println("Los "+grados+"°C equivalen a "+resultado+"°F");
                                        
                                        break;
                                    case 2:
                                        System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = grados+273.15;
                                        System.out.println("Los "+grados+"°C equivalen a "+resultado+" K");
                                        break;
                                    case 3:
                                        System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = (grados*(9/5))+491.67;
                                        System.out.println("Los "+grados+"°C equivalen a "+resultado+" R");
                                        break;
                                }

                            break;
                            case 3:
                                do{
                                System.out.println("A que grados los quieres convertir?");
                                System.out.println();
                                System.out.println("1. De Kelvine a Fahrenheit");
                                System.out.println("2. De Kelvine a Celcius");
                                System.out.println("3. De Kelvine a Rankie");
                                opciongg = entrada.nextInt();
                                }while (opciongg<=0 || opciongg>=5);
                                switch (opciongg){
                                    case 1:
                                        System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = (9/5)*(grados-273.15)+32;
                                        System.out.println("Los "+grados+"K equivalen a "+resultado+"°F");
                                        break;
                                    case 2:
                                        System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = grados-273.15;
                                        System.out.println("Los "+grados+"K equivalen a "+resultado+"°C");
                                        break;
                                    case 3:
                                        System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = grados*(9/5);
                                        System.out.println("Los "+grados+"K equivalen a "+resultado+"R");
                                        break;
                                }
                            break;
                            case 4:
                                do{
                                System.out.println("A que grados los quieres convertir?");
                                System.out.println();
                                System.out.println("1. De Rankie a Fahrenheit");
                                System.out.println("2. De Rankie a Celcius");
                                System.out.println("3. De Rankie a Kelvine");
                                opciongg = entrada.nextInt();
                                }while (opciongg<=0 || opciongg>=5);
                                switch (opciongg){
                                    case 1: 
                                        System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = grados-459.67;
                                        System.out.println("Los "+grados+"R equivalen a "+resultado+"°F");
                                        break;
                                    case 2:
                                        System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = (5/9)*(grados-491.67);
                                        System.out.println("Los "+grados+"R equivalen a "+resultado+"°C");
                                        break;
                                    case 3:
                                        System.out.println("Ingresa los grados.");
                                        grados = entrada.nextDouble();
                                        resultado = grados*(5/9);
                                        System.out.println("Los "+grados+"R equivalen a "+resultado+"°F");
                                        break;
                                }
                            break;
                        }
                    
                        break;
                    case 4:
                        
                        System.out.println("Bienvenido, aqui podras contar numeros positivos y negativos");
                        System.out.println("Cuantos números vas a digitar?");
                        edad = entrada.nextInt();
                        for(int i=0; i <= edad; i++){
                            System.out.println("Digita el numero");
                            x = entrada.nextFloat();
                            if (x>0){
                                System.out.println("Este es un numero positivo"+x);
                                opciong++;
                                i++;
                            }
                            if (x<0){        
                                System.out.println("Este es un numero negativo"+x);
                                opciongg++;
                                i++;
                            }
                        }
                        System.out.println("Ingresaste "+opciong+" numeros positivos.");
                        System.out.println("Ingresaste "+opciongg+" numeros negativos.");
                        break;
                    case 5:

                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                        
                default:
                    System.out.println("Lo siento, no hay nada mas de momento. UnU");
                    break;
                }
            System.out.print("Si deseas volver a mostrar el menu, presiona R, sino entonces presiona S.");
            exit = entrada.next().charAt(0);
        }while (exit=='R');;


    }

}