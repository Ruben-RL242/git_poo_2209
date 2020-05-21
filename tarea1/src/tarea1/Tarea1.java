/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphone;
/**
 *
 * @author crist
 */
public class smartphone {

    public class smartphone{
        private float precio;
        private float ram;
        private boolean iphone;

        public smartphone() {
        }

        public smartphone(float precio, float ram, boolean iphone) {
            this.precio = precio;
            this.ram = ram;
            this.iphone = iphone;
        }

        public boolean isIphone() {
            return iphone;
        }

        public void setIphone(boolean iphone) {
            this.iphone = iphone;
        }

        public float getPrecio() {
            return precio;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        public float getRam() {
            return ram;
        }

        public void setRam(float ram) {
            this.ram = ram;
        }
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    
}
