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
  public static LoadData recipes;

  private void loadDefaultRecipes()
  {
    final String recipeStr =
        "RECIPES{" +
        "{sp_incursionalchemytable, 1, fallen, INGREDIENTS{{nightsteelbar, 20}, {spidervenom, 20}, {pearlescentdiamond, 20}, {alchemyshard, 50}}, after:fallenalchemytable}," +
        "{sp_superioraccuracypotion, 1, sp_incursionalchemy, INGREDIENTS{{greateraccuracypotion, 1}, {alchemyshard, 15}, {slimeessence, 3}}, before:superiorhealthpotion}," +
        "{sp_superiorattackspeedpotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterattackspeedpotion, 1}, {alchemyshard, 15}, {spideressence, 3}}, before:superiorhealthpotion}," +
        "{sp_superiorbattlepotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterbattlepotion, 1}, {alchemyshard, 15}, {bloodessence, 3}}, before:superiorhealthpotion}," +
        "{sp_superiorhealthregenpotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterhealthregenpotion, 1}, {alchemyshard, 15}, {bloodessence, 3}}, before:superiorhealthpotion}," +
        "{sp_superiormanaregenpotion, 1, sp_incursionalchemy, INGREDIENTS{{greatermanaregenpotion, 1}, {alchemyshard, 15}, {slimeessence, 3}}, before:superiorhealthpotion}," +
        "{sp_superiorresistancepotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterresistancepotion, 1}, {alchemyshard, 15}, {slimeessence, 3}}, before:superiorhealthpotion}," +
        "{sp_superiorspeedpotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterspeedpotion, 1}, {alchemyshard, 15}, {spideressence, 3}}, before:superiorhealthpotion}," +
        "{sp_accuracypotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greateraccuracypotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}," +
        "{sp_attackspeedpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterattackspeedpotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}," +
        "{sp_battlepotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterbattlepotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}," +
        "{sp_buildingpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterbuildingpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}," +
        "{sp_fireresistpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{fireresistancepotion, 1}, {alchemyshard, 5}, {cryoessence, 2}}, before:superiorhealthpotion}," +
        "{sp_fishingpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterfishingpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}," +
        "{sp_miningpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterminingpotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion}," +
        "{sp_healthregenpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterhealthregenpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}," +
        "{sp_manaregenpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greatermanaregenpotion, 1}, {alchemyshard, 5}, {cryoessence, 2}}, before:superiorhealthpotion}," +
        "{sp_rapidpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterrapidpotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion}," +
        "{sp_resistpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterresistancepotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion}," +
        "{sp_speedpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterspeedpotion, 1}, {alchemyshard, 5}, {cryoessence, 2}}, before:superiorhealthpotion}," +
        "{sp_invispotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{invisibilitypotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion}," +
        "{sp_knockbackpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{knockbackpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}," +
        "{sp_minionpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{minionpotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}," +
        "{sp_passivepotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{passivepotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion}," +
        "{sp_spelunkerpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{spelunkerpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}," +
        "{sp_treasurepotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{treasurepotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}," +
        "{sp_thornspotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{thornspotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}," +
        "{sp_webpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{webpotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}" +
        "}";

    recipes = new LoadData(recipeStr);
  }

  /**
   * Save settings into mod config file.
   *
   * @param var1 SETTINGS tag from mod's cfg
   */
  public void addSaveData(SaveData var1)
  {
    var1.addInt("durabilityPotionDuration", durabilityPotionDuration);
    var1.addInt("superiorPotionDuration", superiorPotionDuration);

    if ((recipes == null) || recipes.isEmpty())
    {
      loadDefaultRecipes();
    }

    var1.addSaveData(recipes.toSaveData());
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

    if (var1.hasLoadDataByName("RECIPES"))
    {
      recipes = var1.getFirstLoadDataByName("RECIPES");
    }
    else
    {
      loadDefaultRecipes();
    }
  }
}