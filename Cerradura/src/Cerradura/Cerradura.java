/*
La clase cerradura tiene un constructor que recibe 2 parametros que son
un Nro Entero (clave de Apertura)
un Nro Entero (cantidad de fallos seguidos que la bloquean)
 
metodos:
*Abrir (recibe un entero, que es la clave{un entero})
*Cerrar
*metodo que te dice si esta abierta("estaAbierta")
*metodo que te dice si esta cerrada("estaCerrada")
*metodo que te dice si fue bloqueada("fueBloqueada")
*un metodo que te devuelve la cantiadad de aperturas Exitosas
*un metodo que te devuelve la cantiadad de aperturas fallidas
 
considerar que cuando una cerradura se bloquea no se puede abrir nunca mas..
*/
 
 
 
package Cerradura;
 
public class Cerradura {
 
 
        private int claveApertura;
        private int cantdeFallosqueBloquean;
        private int cantAperturasExitosas;
        private int cantAperturasFallidas;
        private boolean estAbierto;
        private int intentosPermitidos;
 
 
        public Cerradura(int claveApertura, int cantdeFallosqueBloquean){
       
                this.claveApertura = claveApertura;
                this.cantdeFallosqueBloquean = cantdeFallosqueBloquean;
               
               
        }
               
       
        public void abrir(int claveApertura){
               
                if(this.claveApertura != claveApertura){
                        System.out.println("No es la clave correcta");
                        estAbierto = false;
                        cantidadAperturasFallidas();
                }else{
                       
                        System.out.println("Clave correcta!");
                        estAbierto = true;
                        cantidadAperturasExitosas();
                }
        }
       
        public boolean cerrar(){
       
                System.out.println("La cerradura esta cerrada");
                return estAbierto = true ? true : false;
               
        }
 
        public boolean estaBloqueada(){
       
                return this.cantdeFallosqueBloquean >= this.intentosPermitidos;
               
        }      
       
        public boolean estAbierta(){
       
                return estAbierto;
        }
       
        private void cantidadAperturasExitosas(){
         
                cantAperturasExitosas++;
               
        }
       
        private void cantidadAperturasFallidas(){
               
                cantAperturasFallidas++;
        }
       
}