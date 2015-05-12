
import utfpr.ct.dainf.if62c.avaliacao.Complexo;


/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao1 {

    public static void main(String[] args) {
        // implementar main
        Complexo A1 = new Complexo(1,0);
        Complexo B1 = new Complexo(5,0);
        Complexo C1 = new Complexo(4,0);
        
        Complexo A2 = new Complexo(1,0);
        Complexo B2 = new Complexo(2,0);
        Complexo C2 = new Complexo(5,0);
        
        Complexo raizes1[] = raizesEquacao(A1,B1,A1);
        Complexo raizes2[] = raizesEquacao(A2,B2,C2);
        
        System.out.println("X1=" + raizes1[0]);
        System.out.println("X2=" + raizes1[1]);
        System.out.println("Y1=" + raizes2[0]);
        System.out.println("Y2=" + raizes2[1]);
    }
    
    // implementar raizesEquacao(Complexo, Complexo, Complexo)
   public static Complexo[] raizesEquacao(Complexo a , Complexo b , Complexo c){
       Complexo AC = a.prod(c);
       Complexo mAC = AC.prod(4);
       Complexo n = c.prod(c);
       Complexo sb = n.sub(mAC);
       new Complexo[] = sb.sqrt();
       
       
       
       Complexo B
       
     
       
       
       
       
       delta = 
       raiz1 = 
       raiz1 = (-B + .sqrt(b.prod(b) - sqrt(a.prod(c)).prod(4)*A;
       raiz2 = (-B - .sqrt(Math.pow(B, 2) - 4*A*C))/2*A;
       
       B2 - 4 AC a.prod(c)
       Complexo[] C = new Complexo[2];
       C[1] = 
       C[2] =
       
   }
}
