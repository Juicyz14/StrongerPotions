package strongerpotions;


import necesse.engine.modLoader.ModSettings;
import necesse.engine.modLoader.annotations.ModEntry;
import strongerpotions.mod.PotionModEntry;
import strongerpotions.mod.PotionModSettings;


@ModEntry
public class StrongerPotions
{
  public void init()
  {
    PotionModEntry.registerBuffs();
    PotionModEntry.registerTech();
    PotionModEntry.registerItems();
    PotionModEntry.registerObjects();
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
    PotionModEntry.registerRecipes();
  }

}
