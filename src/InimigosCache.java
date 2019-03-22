

import java.util.HashMap;
import java.util.Map;

public class InimigosCache {
	
	private static Map<String, Inimigo> inimigosCache = new HashMap<String, Inimigo>(); 
	
	
	/*
	 * Recuperando do cache calças clonadas
	 */
	public static Inimigo getInimigo(String inimigoId) {
		Inimigo cache = inimigosCache.get(inimigoId);
	      return (Inimigo) cache.clone();
	}

	   /*
	    * Criando diferentes tipos de calça e adicionando em cache.
	    */
	   
	   public static void loadCache() {
	      Fantasma fantasma = new Fantasma();
	      fantasma.setId("fantasma");
	      inimigosCache.put(fantasma.getId(),fantasma);

	      Mumia mumia = new Mumia();
	      mumia.setId("mumia");
	      inimigosCache.put(mumia.getId(),mumia);

	      Zumbi zumbi = new Zumbi();
	      zumbi.setId("zumbi");
	      inimigosCache.put(zumbi.getId(), zumbi);
	   }
	

}
