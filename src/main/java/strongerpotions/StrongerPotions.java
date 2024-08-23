package strongerpotions;


import necesse.engine.modLoader.ModSettings;
import necesse.engine.modLoader.annotations.ModEntry;

import strongerpotions.potions.PotionModEntry;
import strongerpotions.potions.PotionModSettings;


@ModEntry
public class StrongerPotions
{
    public void init()
    {
        System.out.println("StrongerPotions::init");
        PotionModEntry.initPotions();
    }

    public void initResources()
    {

    }

    public ModSettings initSettings()
    {
        System.out.println("StrongerPotions::initSettings");

        return new PotionModSettings();
    }

    public void postInit()
    {
        System.out.println("StrongerPotions::postInit");
        // Potions recipes are in recipes.cfg
    }

}
