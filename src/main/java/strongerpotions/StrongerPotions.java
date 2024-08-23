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
        PotionModEntry.registerItemsPotions();
    }

    public void initResources()
    {
    }

    public ModSettings initSettings()
    {
        return new PotionModSettings();
    }

    public void postInit()
    {
        // Potions recipes are in recipes.cfg
        PotionModEntry.registerRecipesPotions();
    }

}
