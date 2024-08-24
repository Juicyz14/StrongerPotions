package strongerpotions.mod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import necesse.engine.modLoader.LoadedMod;
import necesse.engine.modifiers.ModifierValue;
import necesse.engine.registries.BuffRegistry;
import necesse.engine.registries.ItemRegistry;
import necesse.engine.registries.ObjectRegistry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.engine.save.LoadData;
import necesse.engine.save.SaveSyntaxException;
import necesse.engine.save.levelData.RecipeSave;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.SimplePotionBuff;
import necesse.inventory.item.Item;
import necesse.inventory.item.placeableItem.consumableItem.potionConsumableItem.SimplePotionItem;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;
import necesse.inventory.recipe.Tech;
import strongerpotions.objects.IncursionAlchemyObject;

public final class PotionModEntry
{
  public static Tech SP_INCURSIONALCHEMY;

  private PotionModEntry()
  {
  }

  public static void registerBuffs()
  {
    BuffRegistry.registerBuff("sp_superiorspeedpotion",
        new SimplePotionBuff(new ModifierValue<>(BuffModifiers.SPEED, 0.4F)));
    BuffRegistry.registerBuff("sp_superiorhealthregenpotion",
        new SimplePotionBuff(new ModifierValue<>(BuffModifiers.COMBAT_HEALTH_REGEN_FLAT, 1.5F)));
    BuffRegistry.registerBuff("sp_superiormanaregenpotion",
        new SimplePotionBuff(new ModifierValue<>(BuffModifiers.COMBAT_MANA_REGEN, 5.0F)));
    BuffRegistry.registerBuff("sp_superiorattackspeedpotion",
        new SimplePotionBuff(new ModifierValue<>(BuffModifiers.ATTACK_SPEED, 0.45F)));
    BuffRegistry.registerBuff("sp_superiorbattlepotion",
        new SimplePotionBuff(new ModifierValue<>(BuffModifiers.ALL_DAMAGE, 0.25F)));
    BuffRegistry.registerBuff("sp_superiorresistancepotion",
        new SimplePotionBuff(new ModifierValue<>(BuffModifiers.ARMOR_FLAT, 18)));
    BuffRegistry.registerBuff("sp_superioraccuracypotion",
        new SimplePotionBuff(new ModifierValue<>(BuffModifiers.CRIT_CHANCE, 0.3F)));
  }

  public static void registerTech()
  {
    SP_INCURSIONALCHEMY = RecipeTechRegistry.registerTech("sp_incursionalchemy", "sp_incursionalchemytable");
  }

  public static void registerItems()
  {
    // Register our items
    ItemRegistry.registerItem("sp_accuracypotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "greateraccuracypotion",
            PotionModSettings.durabilityPotionDuration,
            "greateraccuracypot").overridePotion("accuracypotion"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_attackspeedpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "greaterattackspeedpotion",
            PotionModSettings.durabilityPotionDuration,
            "greaterattackspeedpot").overridePotion("attackspeedpotion"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_battlepotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "greaterbattlepotion",
            PotionModSettings.durabilityPotionDuration,
            "greaterbattlepot").overridePotion("battlepotion"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_buildingpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "greaterbuildingpotion",
            PotionModSettings.durabilityPotionDuration,
            "greaterbuildingpot").overridePotion("buildingpotion"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_fireresistpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "fireresistancepotion",
            PotionModSettings.durabilityPotionDuration,
            "fireresistpot"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_fishingpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "greaterfishingpotion",
            PotionModSettings.durabilityPotionDuration,
            "fishingpot1", "fishingpot2").overridePotion("fishingpotion"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_miningpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "greaterminingpotion",
            PotionModSettings.durabilityPotionDuration,
            "greaterminingpot").overridePotion("miningpotion"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_healthregenpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "greaterhealthregenpotion",
            PotionModSettings.durabilityPotionDuration,
            "greaterhealthregenpot").overridePotion("healthregenpotion"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_manaregenpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "greatermanaregenpotion",
            PotionModSettings.durabilityPotionDuration,
            "greatermanaregenpot").overridePotion("manaregenpotion"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_rapidpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "greaterrapidpotion",
            PotionModSettings.durabilityPotionDuration,
            "greaterrapidpot").overridePotion("rapidpotion"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_resistpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "greaterresistancepotion",
            PotionModSettings.durabilityPotionDuration,
            "greaterresistpot").overridePotion("resistancepotion"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_speedpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "greaterspeedpotion",
            PotionModSettings.durabilityPotionDuration,
            "greaterspeedpot").overridePotion("speedpotion"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_invispotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "invisibilitypotion",
            PotionModSettings.durabilityPotionDuration,
            "invispot"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_knockbackpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "knockbackpotion",
            PotionModSettings.durabilityPotionDuration,
            "knockbackpot"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_minionpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "minionpotion",
            PotionModSettings.durabilityPotionDuration,
            "minionpot"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_passivepotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "passivepotion",
            PotionModSettings.durabilityPotionDuration,
            "passivepot"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_spelunkerpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "spelunkerpotion",
            PotionModSettings.durabilityPotionDuration,
            "spelunkerpot"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_treasurepotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "treasurepotion",
            PotionModSettings.durabilityPotionDuration,
            "treasurepot"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_thornspotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "thornspotion",
            PotionModSettings.durabilityPotionDuration,
            "thornspot"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_webpotionofdurability",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "webpotion",
            PotionModSettings.durabilityPotionDuration,
            "webpot"),
        100.0F,
        true);

    ItemRegistry.registerItem("sp_superioraccuracypotion",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "sp_superioraccuracypotion",
            PotionModSettings.superiorPotionDuration,
            "sp_superioraccuracypotion")
          .overridePotion("greateraccuracypotion")
          .overridePotion("accuracypotion"),
        200.0F,
        true);

    ItemRegistry.registerItem("sp_superiorattackspeedpotion",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "sp_superiorattackspeedpotion",
            PotionModSettings.superiorPotionDuration,
            "sp_superiorattackspeedpotion")
          .overridePotion("greaterattackspeedpotion")
          .overridePotion("attackspeedpotion"),
        200.0F,
        true);

    ItemRegistry.registerItem("sp_superiorbattlepotion",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "sp_superiorbattlepotion",
            PotionModSettings.superiorPotionDuration,
            "sp_superiorbattlepotion")
          .overridePotion("greaterbattlepotion")
          .overridePotion("battlepotion"),
        200.0F,
        true);

    ItemRegistry.registerItem("sp_superiorhealthregenpotion",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "sp_superiorhealthregenpotion",
            PotionModSettings.superiorPotionDuration,
            "sp_superiorhealthregenpotion")
          .overridePotion("greaterhealthregenpotion")
          .overridePotion("healthregenpotion"),
        200.0F,
        true);

    ItemRegistry.registerItem("sp_superiormanaregenpotion",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "sp_superiormanaregenpotion",
            PotionModSettings.superiorPotionDuration,
            "sp_superiormanaregenpotion")
          .overridePotion("greatermanaregenpotion")
          .overridePotion("manaregenpotion"),
        200.0F,
        true);

    ItemRegistry.registerItem("sp_superiorresistancepotion",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "sp_superiorresistancepotion",
            PotionModSettings.superiorPotionDuration,
            "sp_superiorresistancepotion")
          .overridePotion("greaterresistancepotion")
          .overridePotion("resistancepotion"),
        200.0F,
        true);

    ItemRegistry.registerItem("sp_superiorspeedpotion",
        new SimplePotionItem(
            100,
            Item.Rarity.EPIC,
            "sp_superiorspeedpotion",
            PotionModSettings.superiorPotionDuration,
            "sp_superiorspeedpotion")
          .overridePotion("greaterspeedpotion")
          .overridePotion("speedpotion"),
        200.0F,
        true);
  }

  public static void registerObjects()
  {
    ObjectRegistry.registerObject("sp_incursionalchemytable",
        new IncursionAlchemyObject(), 15, true);
  }

  public static void registerRecipes()
  {
    LoadedMod mod = LoadedMod.getRunningMod();

    try
    {
      Enumeration<JarEntry> entries = mod.jarFile.entries();
      while (entries.hasMoreElements())
      {
        JarEntry entry = entries.nextElement();
        String path = entry.getName();
        if (path.equals("resources/recipes.cfg"))
        {
          InputStreamReader isr = new InputStreamReader(mod.jarFile.getInputStream(entry), StandardCharsets.UTF_8);
          BufferedReader br = new BufferedReader(isr);

          StringBuilder recipeFile = new StringBuilder();
          String line;
          while ((line = br.readLine()) != null)
          {
            recipeFile.append(line).append("\n");
          }

          LoadData data = new LoadData(recipeFile.toString());
          if (!data.isArray())
          {
            throw new SaveSyntaxException("Ingredients script is not an array");
          }

          for (Recipe recipe : RecipeSave.loadRecipesSave(data))
          {
            Recipes.registerModRecipe(recipe);
          }

          br.close();
          break;
        }
      }
    }
    catch (IOException e)
    {
      System.err.println("Could not load mod " + mod.id + " recipes file");
      e.printStackTrace();
    }
  }

}
