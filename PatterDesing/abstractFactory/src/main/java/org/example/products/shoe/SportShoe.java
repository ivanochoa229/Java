package org.example.products.shoe;

import org.example.products.Shoe;

public class SportShoe implements Shoe {
    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatos deportivos -- Son elegantes ? --> No");
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos deportivos -- Son para correr ? --> Si");
        return true;
    }
}
