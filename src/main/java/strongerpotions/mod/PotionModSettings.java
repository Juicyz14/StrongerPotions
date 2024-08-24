package strongerpotions.mod;


import necesse.engine.modLoader.ModSettings;
import necesse.engine.save.LoadData;
import necesse.engine.save.SaveData;

/**
 * Handles the AppData/Necesse/cfg/mods/strongerpotions.cfg file.
 *
 * @apiNote
 * This path is not exact but close.
 */
public class PotionModSettings extends ModSettings
{
  public static int durabilityPotionDuration = 2700;
  public static int superiorPotionDuration = 600;


  /**
   * Save settings into mod config file.
   *
   * @param var1 SETTINGS tag from mod's cfg
   */
  public void addSaveData(SaveData var1)
  {
    var1.addInt("durabilityPotionDuration", durabilityPotionDuration);
    var1.addInt("superiorPotionDuration", superiorPotionDuration);

  }

  /**
   * Load mod config file.
   *
   * @param var1 SETTINGS tag from mod's cfg
   */
  public void applyLoadData(LoadData var1)
  {
    durabilityPotionDuration = var1.getInt("durabilityPotionDuration", 2700, 0, 7200);
    superiorPotionDuration = var1.getInt("superiorPotionDuration", 600, 0, 7200);
  }
}
