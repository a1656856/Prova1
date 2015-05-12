package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Complexo {
    private double real;
    private double img;

    public Complexo() {
    }

    public Complexo(double real, double img) {
        this.real = real;
        this.img = img;
    }

    // implementar getReal()
     public double getReal(){
         return real;
     }
    // implementar getImg()
     public double getImg(){
         return img;
     }

    public Complexo soma(Complexo c) {
        return new Complexo(real + c.real, img + c.img);
    }
    
    // implementar sub(Complexo)
    public Complexo sub(Complexo c){
        return new Complexo(real - c.real, img - c.img);
    }
    // implementar prod(double)
    public Complexo prod(double r){
        return new Complexo(real*r ,img*r);
    }
    // implementar prod(Complexo)
    public Complexo prod(Complexo c){
        double p1 = img*c.img - img*c.img;
        double p2 = img*c.real+real*c.img;
        return new Complexo(p1, p2);
        
       
        
    }
    // implementar div(Complexo)
    public Complexo div(Complexo c){
        double p1 = (real*c.real + img*c.img)/(Math.pow(c.real,2)*Math.pow(c.img,2));
        double p2 = (c.real*img - real*c.img)/(Math.pow(c.real,2)*Math.pow(c.img,2));
        return new Complexo(p1,p2);
    }
    
    
    // implementar sqrt()
    public Complexo[] sqrt() {
        
        double Ro = Math.sqrt(Math.sqrt(Math.pow(real,2)+ Math.pow(img,2)));
        double Fi=0;
        if(real > 0){Fi = Math.atan(img/real);}
        else if(real <0){Fi = Math.atan(img/real +Math.PI);}
        else if(real == 0 && img == 0){Fi = 0;}
        else if(real == 0 && img > 0){Fi = Math.PI/2;}
        else if(real == 0 && img < 0){Fi = 3*Math.PI/2;}
        
        double Fi1 = Fi/2;
        double Fi2 = Fi/2 + Math.PI;
       
        
        double P11 = Ro*Math.cos(Fi1);
        double P12 = Ro*Math.sin(Fi1);
        double p21 = Ro*Math.cos(Fi2);
        double p22 = Ro*Math.sin(Fi2);
                
                
        Complexo[] c = new Complexo[2];
        c[1] = new Complexo(P11,P12);
        c[2] = new Complexo(p21,p22);
       
        return c;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(real)
            ^ (Double.doubleToLongBits(real) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(img)
            ^ (Double.doubleToLongBits(img) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Complexo c = (Complexo) obj;
        return obj != null && getClass() == obj.getClass()
            && real == c.real && img == c.img;
    }

    @Override
    public String toString() {
        return String.format("%+f%+fi", real, img);
    }
}
