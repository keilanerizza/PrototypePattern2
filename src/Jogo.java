
public class Jogo {
	
	public static void main(String[] args) {
		
		  InimigosCache.loadCache();

	      Inimigo cloneFantasma = (Inimigo) InimigosCache.getCalca("fantasma");
	      System.out.println("Inimigo clonado: "+ cloneFantasma.getTipo());
	      cloneFantasma.ataque();

	      Inimigo cloneMumia = (Inimigo) InimigosCache.getCalca("mumia");
	      System.out.println("\nInimigo clonado: " + cloneMumia.getTipo());		
	      cloneMumia.ataque();
	      
	      Inimigo cloneZumbi = (Inimigo) InimigosCache.getCalca("zumbi");
	      System.out.println("\nInimigo clonado: " + cloneZumbi.getTipo());		
	      cloneZumbi.ataque();
	}

}
