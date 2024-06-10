package ahmed;

import java.util.ArrayList;
import java.util.List;

public class Service implements Statistique {
    private List<Voiture> voitures = new ArrayList<>();

    @Override
    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }

    @Override
    public int prix() throws ArithmeticException {
        if (voitures.isEmpty()) {
            throw new ArithmeticException("Il n'y a pas de voiture");
        }

        int totalPrix = 0;
        for (int i = 0; i < voitures.size(); i++) {
            double prix = voitures.get(i).getPrix();
            int remise = (i / 5) * 5; // 5% de remise supplémentaire pour chaque 5 voitures
            remise = Math.min(remise, 20000); // Remise maxi de 20 000 euros
            totalPrix += prix - remise;
        }
        return totalPrix;
    }
}
