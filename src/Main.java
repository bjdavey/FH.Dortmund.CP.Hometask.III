import java.util.ArrayList;

import models.BEV;
import models.Engine;
import models.HybridV;
import models.ICEV;
import models.Manufacture;

public class Main {

    public static void main(String[] args) throws Exception {

        var manufacture = new Manufacture("titleTest", "testOwner", "Germany");
        var engine = new Engine("makerTest", 1000, 200);

        var ICEV = new ArrayList<ICEV>();
        // Fill with dummy Data
        for (int i = 1; i <= 4; i++) {
            ICEV.add(new ICEV(i, "makeTest" + i, "modelTest" + i, 1990 + i, "colorTest" + i, 5000 + 100 * i, "t" + i,
                    manufacture, engine));
        }
        for (var x : ICEV) {
            x.showCharacteristics();
        }
        // ------------

        var BEV = new ArrayList<BEV>();
        // Fill with dummy Data
        for (int i = 1; i <= 4; i++) {
            BEV.add(new BEV(i, "makeTest" + i, "modelTest" + i, 1990 + i, "colorTest" + i, 5000 + 100 * i, "t" + i,
                    manufacture, engine));
        }
        for (var x : BEV) {
            x.showCharacteristics();
        }
        // ------------

        var HybridV = new ArrayList<HybridV>();
        // Fill with dummy Data
        for (int i = 1; i <= 4; i++) {
            HybridV.add(
                    new HybridV(i, "makeTest" + i, "modelTest" + i, 1990 + i, "colorTest" + i, 5000 + 100 * i, "t" + i,
                            manufacture, engine));
        }
        for (var x : HybridV) {
            x.showCharacteristics();
        }
        // ------------

    }

}


//-------------Console Output-------------
// ICEV - Characteristics
// ICEV - Characteristics
// ICEV - Characteristics
// ICEV - Characteristics
// BEV - Characteristics
// BEV - Characteristics
// BEV - Characteristics
// BEV - Characteristics
// HybridV - Characteristics
// HybridV - Characteristics
// HybridV - Characteristics
// HybridV - Characteristics