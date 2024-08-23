package strongerpotions.potions;


import necesse.engine.modLoader.LoadedMod;
import necesse.engine.registries.ItemRegistry;
import necesse.engine.save.LoadData;
import necesse.engine.save.SaveSyntaxException;
import necesse.engine.save.levelData.RecipeSave;
import necesse.inventory.item.Item;
import necesse.inventory.item.placeableItem.consumableItem.potionConsumableItem.SimplePotionItem;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.jar.JarEntry;

public final class PotionModEntry
{
    private PotionModEntry() {}

    public static void registerItemsPotions()
    {
        // Register our items
        ItemRegistry.registerItem("sp_accuracypotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "greateraccuracypotion",
                PotionModSettings.potionDuration,
                "greateraccuracypot").overridePotion("accuracypotion"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_attackspeedpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "greaterattackspeedpotion",
                PotionModSettings.potionDuration,
                "greaterattackspeedpot").overridePotion("attackspeedpotion"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_battlepotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "greaterbattlepotion",
                PotionModSettings.potionDuration,
                "greaterbattlepot").overridePotion("battlepotion"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_buildingpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "greaterbuildingpotion",
                PotionModSettings.potionDuration,
                "greaterbuildingpot").overridePotion("buildingpotion"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_fireresistpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "fireresistancepotion",
                PotionModSettings.potionDuration,
                "fireresistpot"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_fishingpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "greaterfishingpotion",
                PotionModSettings.potionDuration,
                "fishingpot1", "fishingpot2").overridePotion("fishingpotion"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_miningpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "greaterminingpotion",
                PotionModSettings.potionDuration,
                "greaterminingpot").overridePotion("miningpotion"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_healthregenpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "greaterhealthregenpotion",
                PotionModSettings.potionDuration,
                "greaterhealthregenpot").overridePotion("healthregenpotion"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_manaregenpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "greatermanaregenpotion",
                PotionModSettings.potionDuration,
                "greatermanaregenpot").overridePotion("manaregenpotion"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_rapidpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "greaterrapidpotion",
                PotionModSettings.potionDuration,
                "greaterrapidpot").overridePotion("rapidpotion"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_resistpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "greaterresistancepotion",
                PotionModSettings.potionDuration,
                "greaterresistpot").overridePotion("resistancepotion"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_speedpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "greaterspeedpotion",
                PotionModSettings.potionDuration,
                "greaterspeedpot").overridePotion("speedpotion"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_invispotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "invisibilitypotion",
                PotionModSettings.potionDuration,
                "invispot"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_knockbackpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "knockbackpotion",
                PotionModSettings.potionDuration,
                "knockbackpot"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_minionpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "minionpotion",
                PotionModSettings.potionDuration,
                "minionpot"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_passivepotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "passivepotion",
                PotionModSettings.potionDuration,
                "passivepot"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_spelunkerpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "spelunkerpotion",
                PotionModSettings.potionDuration,
                "spelunkerpot"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_treasurepotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "treasurepotion",
                PotionModSettings.potionDuration,
                "treasurepot"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_thornspotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "thornspotion",
                PotionModSettings.potionDuration,
                "thornspot"),
            100.0F,
            true);

        ItemRegistry.registerItem("sp_webpotionofdurability",
            new SimplePotionItem(
                100,
                Item.Rarity.LEGENDARY,
                "webpotion",
                PotionModSettings.potionDuration,
                "webpot"),
            100.0F,
            true);
    }

    public static void registerRecipesPotions()
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
