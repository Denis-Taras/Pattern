package PiizaBuilder.Builder;

import PiizaBuilder.Components.*;

public interface Builder {
    void setDough(Dough dough);
    void setSauce(Sauce sauce);
    void setCheese(Cheese... cheese);
    void setMeet(Meat... meat);
    void setVegetables(Vegetables... vegetables);
}
