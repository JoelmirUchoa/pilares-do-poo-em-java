package estabelecimento;

import equipamentos.copiadora.Copiadoras;
import equipamentos.digitalizadora.Digitalizadoras;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressoras;
import equipamentos.impressora.Laserjet;
import equipamentos.multifunional.EquipamentoMultifunional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifunional em = new EquipamentoMultifunional();

        Impressoras im = em;
        Digitalizadoras gd = em;
        Copiadoras cp = em;

        im.imprimir();
        gd.digitalizar();
        cp.copiar();
    }
}
