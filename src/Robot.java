public class Robot {
    private Bateria bateria;
    private boolean estado;

    public Robot() {
        bateria=new Bateria(1000);
        this.estado = true;
    }
    public void avanzar(int pasos){
        bateria.setCarga(bateria.getCarga()-10);
    }
    public void retrocerder(int pasos){
        bateria.setCarga(bateria.getCarga()-10);
    }
    public void dormir(){
        estado=false;
    }
    public void despertar(){
        estado=true;
    }
    public void recargar(){
        bateria.setCarga(1000);
    }
    public boolean bateriLLena(){
        if(bateria.getCarga()==1000){
            return true;
        }else return false;
    }
    public boolean bateriaVacia(){
        if(bateria.getCarga()==0){
            return true;
        }else return false;
    }
    public int energiaActual(){
        return bateria.getCarga();
    }
    public boolean estado() {
        return estado;
    }

}
