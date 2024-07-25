package equipamentos.multifunional;

import equipamentos.copiadora.Copiadoras;
import equipamentos.digitalizadora.Digitalizadoras;
import equipamentos.impressora.Impressoras;

public class EquipamentoMultifunional implements Copiadoras, Digitalizadoras, Impressoras{

    @Override
    public void copiar() {
        // TODO Auto-generated method stub
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");    
    }

    @Override
    public void digitalizar() {
        // TODO Auto-generated method stub
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");    
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");    
    }

}
