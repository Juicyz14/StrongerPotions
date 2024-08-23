package strongerpotions.potions;


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
  public static int potionDuration = 2700;

  /**
   * Save settings into mod config file.
   *
   * @param var1 SETTINGS tag from mod's cfg
   */
  public void addSaveData(SaveData var1)
  {
    var1.addInt("potionDuration", potionDuration);
  }

  /**
   * Load mod config file.
   *
   * @param var1 SETTINGS tag from mod's cfg
   */
  public void applyLoadData(LoadData var1)
  {
    potionDuration = var1.getInt("potionDuration", 2700, 0, 7200);
  }
}
