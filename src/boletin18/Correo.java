
package boletin18;


public class Correo {
    private String nomecorreo;
    private boolean leido;
    private String contido;
    
    public Correo() {
    }

    public Correo(String nomecorreo, String contido, boolean leido) {
        this.nomecorreo = nomecorreo;
        this.contido = contido;
        this.leido = leido;
    }

    public String getNomecorreo() {
        return nomecorreo;
    }

    public void setNomecorreo(String nomecorreo) {
        this.nomecorreo = nomecorreo;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    @Override
    public String toString() {
        return "Correo{" + "nomecorreo=" + nomecorreo + ", leido=" + leido + ", contido=" + contido + '}';
    }
    
    
    
    
}