package strongerpotions.mod;


import necesse.engine.modLoader.ModSettings;
import necesse.engine.save.LoadData;
import necesse.engine.save.SaveData;
import necesse.inventory.recipe.Recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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


  /**
   * Save settings into mod config file.
   *
   * @param var1 SETTINGS tag from mod's cfg
   */
  public void addSaveData(SaveData var1)
  {
    /*
    List<String> recipes = new ArrayList<String>();
    recipes.add("{sp_incursionalchemytable, 1, fallen, INGREDIENTS{{nightsteelbar, 20}, {spidervenom, 20}, {pearlescentdiamond, 20}, {alchemyshard, 50}}, after:fallenalchemytable}");
    recipes.add("{sp_superioraccuracypotion, 1, sp_incursionalchemy, INGREDIENTS{{greateraccuracypotion, 1}, {alchemyshard, 15}, {slimeessence, 3}}, before:superiorhealthpotion}");
    recipes.add("{sp_superiorattackspeedpotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterattackspeedpotion, 1}, {alchemyshard, 15}, {spideressence, 3}}, before:superiorhealthpotion}");
    recipes.add("{sp_superiorbattlepotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterbattlepotion, 1}, {alchemyshard, 15}, {bloodessence, 3}}, before:superiorhealthpotion}");
    recipes.add("{sp_superiorhealthregenpotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterhealthregenpotion, 1}, {alchemyshard, 15}, {bloodessence, 3}}, before:superiorhealthpotion}");
    recipes.add("{sp_superiormanaregenpotion, 1, sp_incursionalchemy, INGREDIENTS{{greatermanaregenpotion, 1}, {alchemyshard, 15}, {slimeessence, 3}}, before:superiorhealthpotion}");
    recipes.add("{sp_superiorresistancepotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterresistancepotion, 1}, {alchemyshard, 15}, {slimeessence, 3}}, before:superiorhealthpotion}");
    recipes.add("{sp_superiorspeedpotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterspeedpotion, 1}, {alchemyshard, 15}, {spideressence, 3}}, before:superiorhealthpotion}");
    recipes.add("{sp_accuracypotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greateraccuracypotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_attackspeedpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterattackspeedpotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_battlepotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterbattlepotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_buildingpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterbuildingpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_fireresistpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{fireresistancepotion, 1}, {alchemyshard, 5}, {cryoessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_fishingpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterfishingpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_miningpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterminingpotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_healthregenpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterhealthregenpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_manaregenpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greatermanaregenpotion, 1}, {alchemyshard, 5}, {cryoessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_rapidpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterrapidpotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_resistpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterresistancepotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_speedpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterspeedpotion, 1}, {alchemyshard, 5}, {cryoessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_invispotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{invisibilitypotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_knockbackpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{knockbackpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_minionpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{minionpotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_passivepotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{passivepotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_spelunkerpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{spelunkerpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_treasurepotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{treasurepotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_thornspotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{thornspotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}");
    recipes.add("{sp_webpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{webpotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}");
    */
    StringBuilder recipesStr = new StringBuilder();
    recipesStr.append("RECIPES{");
    recipesStr.append("{sp_incursionalchemytable, 1, fallen, INGREDIENTS{{nightsteelbar, 20}, {spidervenom, 20}, {pearlescentdiamond, 20}, {alchemyshard, 50}}, after:fallenalchemytable},");
    recipesStr.append("{sp_superioraccuracypotion, 1, sp_incursionalchemy, INGREDIENTS{{greateraccuracypotion, 1}, {alchemyshard, 15}, {slimeessence, 3}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_superiorattackspeedpotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterattackspeedpotion, 1}, {alchemyshard, 15}, {spideressence, 3}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_superiorbattlepotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterbattlepotion, 1}, {alchemyshard, 15}, {bloodessence, 3}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_superiorhealthregenpotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterhealthregenpotion, 1}, {alchemyshard, 15}, {bloodessence, 3}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_superiormanaregenpotion, 1, sp_incursionalchemy, INGREDIENTS{{greatermanaregenpotion, 1}, {alchemyshard, 15}, {slimeessence, 3}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_superiorresistancepotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterresistancepotion, 1}, {alchemyshard, 15}, {slimeessence, 3}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_superiorspeedpotion, 1, sp_incursionalchemy, INGREDIENTS{{greaterspeedpotion, 1}, {alchemyshard, 15}, {spideressence, 3}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_accuracypotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greateraccuracypotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_attackspeedpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterattackspeedpotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_battlepotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterbattlepotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_buildingpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterbuildingpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_fireresistpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{fireresistancepotion, 1}, {alchemyshard, 5}, {cryoessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_fishingpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterfishingpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_miningpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterminingpotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_healthregenpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterhealthregenpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_manaregenpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greatermanaregenpotion, 1}, {alchemyshard, 5}, {cryoessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_rapidpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterrapidpotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_resistpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterresistancepotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_speedpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{greaterspeedpotion, 1}, {alchemyshard, 5}, {cryoessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_invispotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{invisibilitypotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_knockbackpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{knockbackpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_minionpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{minionpotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_passivepotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{passivepotion, 1}, {alchemyshard, 5}, {shadowessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_spelunkerpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{spelunkerpotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_treasurepotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{treasurepotion, 1}, {alchemyshard, 5}, {bioessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_thornspotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{thornspotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion},");
    recipesStr.append("{sp_webpotionofdurability, 1, sp_incursionalchemy, INGREDIENTS{{webpotion, 1}, {alchemyshard, 5}, {primordialessence, 2}}, before:superiorhealthpotion}");
    recipesStr.append("}");

    var1.addInt("durabilityPotionDuration", durabilityPotionDuration);
    var1.addInt("superiorPotionDuration", superiorPotionDuration);
    var1.addSafeString("recipes", recipesStr.toString());
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
    String str = var1.getSafeString("recipes", "RECIPES{}", true);
    recipes = new LoadData(str);
  }
}