/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tareaclass;

/**
 *
 * @author Osvaldo
 */
public class Articulo {
    public int sku;
    private int existencia;
    private double Precio;
    private double Costo;
    public String Descripcion;
     
   public Articulo(int existencia,double Costo,String Descripcion){
        this.existencia=existencia;
        this.Costo=Costo;
        this.Descripcion=Descripcion;
    }
   public Articulo(){
       this(0,0,"Descripción no existente");
   }
   public int getsku(){
       return this.sku;
   }
   public void setsku(int sku){
       this.sku=sku;
   }
   public int getExistencia(){
       return this.existencia;
   }
   public void setExistencia(int existencia){
       this.existencia=existencia;
   }
   public double getPrecio(){
       return this.Precio;
   }
   public void setPrecio(double precio){
       this.Precio=precio;
   }
   public double getCosto(){
       return this.Costo;
   }
   public void setCosto(double costo){
       this.Costo=costo;
   }
   public String getDescripcion(){
       return this.Descripcion;
   }
   public void setDescripcion(String descripcion){
       this.Descripcion=descripcion;
   }
   public void Compra (int articulo, double costo){
       setExistencia(articulo);
       setCosto(costo);
   }
   public boolean venta(int articulo){
        if(articulo <= getExistencia()){
            setExistencia(getExistencia() - articulo);
        return true;
            }else{ 
        return false;
        }
    }
   public double verificarExistencia(){
        return existencia;
          
    }
    public void actualizaPrecio(double precio){
        this.Precio=precio;
    }
}
