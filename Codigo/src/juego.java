import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class juego {
    int tablero[][]= new int [3][3];
    
    
    public static void main(String[] args) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        juego mi_juego= new juego();
        String texto;
        char opcion='1';
        
        
        while((opcion=='1') || (opcion=='2')){
            try {
                 System.out.println("1- Automático");
        System.out.println("2- Modo manual");
                opcion=teclado.readLine().charAt(0);
                
                switch(opcion){
                    case '1':
                        break;
                     
                    case '2':
                    mi_juego.inicializa();
                    mi_juego.dibuja_tres_en_raya();
                    mi_juego.comenzar_a_jugar();
                    break;
                        
                    default: 
                        System.out.println("Opcion incorrecta");
                        opcion='1';
                          
                }
    
            } catch (IOException ex) {
                Logger.getLogger(juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
        
    }
    public void dibuja_tres_en_raya(){         
       int filas_tablero=0;
       int columnas_tablero;
        
        System.out.println("-------------");
        for(int i=0; i<tablero.length;i++){
            for(int j=0; j<tablero.length;j++){
               
                if(tablero[i][j]==0){                    
                    System.out.print("| " + tablero[i][j] + " ");
                }
                if (tablero[i][j]==1)
                {
                     System.out.print("| " + "X" + " ");
                    
                }
                if (tablero[i][j]==3)
                {
                     System.out.print("|" + "  ");
                    
                }
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println("-------------");
        
    }
 
public void inicializa()
{
for(int i=0; i<tablero.length;i++){
            for(int j=0; j<tablero.length;j++){
                tablero[i][j]=3;
            }
}
}
 
public void comenzar_a_jugar(){
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            String introduce0;
            String introduceX;
            boolean fin=false;
           
            System.out.println("¿Cómo quieres jugar X/0?");
            String juego = teclado.readLine().toUpperCase();
            int valor_juego=0;
            if(juego.equals("0")){
                valor_juego=0;
            }
            if(juego.equals("X")){
                
                valor_juego=1;
                
            }
            if(juego.equals("X") || (juego.equals("0"))){
            
            System.out.println("Comienza el 0");
            
            System.out.println("");
            
            while(fin==false){
            dibuja_tres_en_raya();
            if(valor_juego==1){
                System.out.println("Te toca X");
            }
            if(valor_juego==0){
                System.out.println("Te toca 0");
            }
            System.out.println("Introduce coordenadas de posición: (0,0) ");
            System.out.println("Introduce la fila");
            int fila= Integer.parseInt(teclado.readLine());
            System.out.println("Introduce la columna");
            int columna= Integer.parseInt(teclado.readLine());
            if(tablero[fila][columna]==3){
                boolean ganador;
                tablero[fila][columna]=valor_juego;
                dibuja_tres_en_raya();
                ganador=comprobar_ganador(valor_juego);
                
                if(ganador){
                    System.out.println("Ha ganado " + valor_juego);
                    fin=true;
                    inicializa();
                }else {
                    int estado_empate=0;
                    for(int i=0;i<=2;i++){
                        for(int j=0;j<=2;j++){
                            if((tablero[i][j]==0) || (tablero[i][j]==1)){
                                estado_empate=estado_empate+1;
                            }
                        }
                    }
                    if(estado_empate==9){
                        System.out.println("Se ha empatado");
                        fin=true;
                    }
                    if(valor_juego==1){
                        valor_juego=0;
                    }
                    else{
                        if(valor_juego==0){
                        valor_juego=1;
                        }
                    }
                }
            }else{
                System.out.println("No puede jugar, ya está usado");
            }
            }
            }
        } catch (IOException ex) {
            Logger.getLogger(juego.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
public boolean comprobar_ganador(int valor_juego){
    
    if((tablero[0][0]==valor_juego) && (tablero[0][1]==valor_juego) && (tablero[0][2]==valor_juego)){
        return true;
    }
    if((tablero[1][0]==valor_juego) && (tablero[1][1]==valor_juego) && (tablero[1][2]==valor_juego)){
        return true;
    }
    if((tablero[2][0]==valor_juego) && (tablero[2][1]==valor_juego) && (tablero[2][2]==valor_juego)){
        return true;
    }
    if((tablero[0][0]==valor_juego) && (tablero[2][0]==valor_juego) && (tablero[3][0]==valor_juego)){
        return true;
    }
    if((tablero[0][1]==valor_juego) && (tablero[1][1]==valor_juego) && (tablero[2][1]==valor_juego)){
        return true;
    }
    if((tablero[0][2]==valor_juego) && (tablero[1][2]==valor_juego) && (tablero[2][2]==valor_juego)){
        return true;
    }
    if((tablero[0][0]==valor_juego) && (tablero[1][1]==valor_juego) && (tablero[2][2]==valor_juego)){
        return true;
    }
    if((tablero[0][2]==valor_juego) && (tablero[1][1]==valor_juego) && (tablero[2][0]==valor_juego)){
        return true;
    }
    return false;
}
 
}
