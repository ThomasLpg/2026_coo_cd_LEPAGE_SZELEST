import XML.ChargeurMagasin;
import donnees.Magasin;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import static org.testng.AssertJUnit.assertEquals;


public class testChargerMagasin {

    @Test
    public void testChargerMagasinValide() throws FileNotFoundException {
        ChargeurMagasin cm = new ChargeurMagasin("musicbrainzsimple");
        Magasin m = cm.chargerMagasin();

        assertEquals(12, m.getNombreCds());
    }
    @Test
    public void testChargerMagasinInvalide(){
        ChargeurMagasin cm = new ChargeurMagasin("invalide");
        try{
            Magasin m = cm.chargerMagasin();
        }catch (FileNotFoundException e) {

        } ;

    }
}
