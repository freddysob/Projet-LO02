package PackageLO02;

import java.util.List;

public class IA {
    private SituationIA situation;

    public Joueur joueur;

    public List<Integer> prioriserCartes() {
    }

    public void jouer() {
    }

    SituationIA getSituation() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.situation;
    }

    void setSituation(SituationIA value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.situation = value;
    }

    public IA() {
    	
    }

	public IA(Joueur joueur) {
		this.situation = SituationIA.Normale;
		this.joueur = joueur;
	}

	public static void main(String[] args ) {
    	
    }

}
