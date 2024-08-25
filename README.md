# StrongerPotions
 Necesse mod for better potions

## Added Content:
1. New alchemy table, Incursion Alchemy Table where all new potions are craftable.
2. Potions of durability: New potions that makes all potions last longer.
3. More superior potions: New combat potions that have an increased effect.

## Supported languages:
* [EN] English

## Mod Configurable Settings
1. Duration on potions of durability
2. Duration on superior potions
3. Recipes of added content (Sorry for bad format...)

### Changing configurable settings
* Configure server/game with mod and run it once.
* Modify %APPDATA%/Roaming/Necesse/cfg/mods/*.strongerpotions.cfg as desired.
* Restart server/game.

### Recipe changing notes
* If this file is deleted, it will be created again on game startup.
* Recipe syntax: {resultName, resultAmount, tech, INGREDIENTS{{ingredientName, ingredientAmount [,requiredToShow]}, .. }[, isHidden][,<before/after>:resultName][, GND_DATA]}
* If ingredient amount is 0 or less, the item will not be consumed on crafting.
* The requiredToShow value determines if the ingredient must be in inventory for the recipe to show.
* If the recipe is hidden, it means all ingredients must be in in inventory for the recipe to show (basically be craftable)
* <before/after>:resultName determines if the recipe should be shown before or after another. Example: "before:torch" to make it appear before the torch
* Techs: none, workstation, forge, carpenter, ironanvil, demonic, alchemy, advanced
* Example 1: {firearrow, 5, none, INGREDIENTS{{stonearrow, 5}, {torch, 1}}} = 5 fire arrows costs 5 stone arrows and 1 torch, crafted in inventory.
* Example 2: {cannonball, 1, ironanvil, INGREDIENTS{{ironbar, 1}, {handcannon, 0, true}}} = 1 cannonball costs 1 iron bar and you must have a hand cannon to craft and to show, crafted in iron anvil.
* Example 3: {villagemap, 1, none, INGREDIENTS{{mapfragment, 2}}, true} = 1 village map costs 2 map fragments and must be craftable for it to show up, crafted in inventory.
* Example 4: {ironpickaxe, 1, ironanvil, INGREDIENTS{{ironbar, 10}, {anylog, 1}}, {enchantment = sharp}} = 1 iron pickaxe with sharp enchantment costs 10 iron bars and 1 log.
