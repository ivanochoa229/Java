package org.example.products.trousers;

import org.example.products.Trousers;

public class GalaTrousers implements Trousers {

    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones de gala -- Tiene bolsillos ? --> Si");
        return true;
    }

    @Override
    public String getClosureType() {
        System.out.println("Pantalones de gala -- Tipo de cierre --> Con cierre");
        return "Tipo de cierre --> Con cierre";
    }
}
