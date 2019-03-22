
public class Jogo {
	
	public static void main(String[] args) {
		
		  InimigosCache.loadCache();

	      Inimigo cloneFantasma = (Inimigo) InimigosCache.getInimigo("fantasma");
	      System.out.println("Inimigo clonado: "+ cloneFantasma.getTipo());
	      cloneFantasma.ataque();

	      Inimigo cloneMumia = (Inimigo) InimigosCache.getInimigo("mumia");
	      System.out.println("\nInimigo clonado: " + cloneMumia.getTipo());		
	      cloneMumia.ataque();
	      
	      Inimigo cloneZumbi = (Inimigo) InimigosCache.getInimigo("zumbi");
	      System.out.println("\nInimigo clonado: " + cloneZumbi.getTipo());		
	      cloneZumbi.ataque();
	}

}
