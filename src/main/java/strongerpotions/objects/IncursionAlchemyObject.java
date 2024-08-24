package strongerpotions.objects;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.List;

import necesse.engine.gameLoop.tickManager.TickManager;
import necesse.engine.localization.Localization;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.entity.mobs.PlayerMob;
import necesse.gfx.camera.GameCamera;
import necesse.gfx.drawOptions.texture.TextureDrawOptions;
import necesse.gfx.drawables.LevelSortedDrawable;
import necesse.gfx.drawables.OrderableDrawables;
import necesse.gfx.gameTexture.GameTexture;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.Item;
import necesse.inventory.item.toolItem.ToolType;
import necesse.inventory.recipe.Tech;
import necesse.level.gameObject.CraftingStationObject;
import necesse.level.gameObject.ObjectHoverHitbox;
import necesse.level.maps.Level;
import necesse.level.maps.light.GameLight;
import strongerpotions.mod.PotionModEntry;

/**
 * @implNote Copy of FallenAlchemyTableObject
 */
public class IncursionAlchemyObject extends CraftingStationObject
{
  public GameTexture texture;

  public IncursionAlchemyObject()
  {
    super(new Rectangle(32, 32));
    this.mapColor = new Color(90, 89, 97);
    this.toolType = ToolType.ALL;
    this.rarity = Item.Rarity.EPIC;
    this.objectHealth = 50;
    this.drawDamage = false;
    this.isLightTransparent = true;
    this.roomProperties.add("potionwork");
  }

  @Override
  public ListGameTooltips getItemTooltips(InventoryItem item, PlayerMob perspective)
  {
    ListGameTooltips tooltips = super.getItemTooltips(item, perspective);
    tooltips.add(Localization.translate("itemtooltip", "alchemytabletip"));
    return tooltips;
  }

  @Override
  public void loadTextures()
  {
    super.loadTextures();
    this.texture = GameTexture.fromFile("objects/sp_incursionalchemytable");
  }

  @Override
  public Rectangle getCollision(Level level, int x, int y, int rotation)
  {
    return rotation % 2 == 0 ?
        new Rectangle(x * 32 + 2, y * 32 + 6, 28, 20) :
        new Rectangle(x * 32 + 4, y * 32 + 2, 24, 28);
  }

  @Override
  public List<ObjectHoverHitbox> getHoverHitboxes(Level level, int tileX, int tileY)
  {
    List<ObjectHoverHitbox> list = super.getHoverHitboxes(level, tileX, tileY);
    list.add(new ObjectHoverHitbox(tileX, tileY, 0, -16, 32, 16));
    return list;
  }

  @Override
  public void addDrawables(
      List<LevelSortedDrawable> list,
      OrderableDrawables tileList,
      Level level,
      int tileX,
      int tileY,
      TickManager tickManager,
      GameCamera camera,
      PlayerMob perspective)
  {
    GameLight light = level.getLightLevel(tileX, tileY);
    int drawX = camera.getTileDrawX(tileX);
    int drawY = camera.getTileDrawY(tileY);
    int rotation = level.getObjectRotation(tileX, tileY) % 2;
    final TextureDrawOptions options = this.texture
        .initDraw()
        .sprite(rotation % 2, 0, 32, this.texture.getHeight())
        .light(light)
        .pos(drawX, drawY - this.texture.getHeight() + 32);
    list.add(new LevelSortedDrawable(this, tileX, tileY)
    {
      @Override
      public int getSortY()
      {
        return 16;
      }

      @Override
      public void draw(TickManager tickManager)
      {
        options.draw();
      }
    });
  }

  @Override
  public void drawPreview(Level level, int tileX, int tileY, int rotation, float alpha, PlayerMob player, GameCamera camera)
  {
    int drawX = camera.getTileDrawX(tileX);
    int drawY = camera.getTileDrawY(tileY);
    this.texture.initDraw().sprite(
        rotation % 2,
        0,
        32,
        this.texture.getHeight()).alpha(alpha).draw(drawX, drawY - this.texture.getHeight() + 32);
  }

  @Override
  public Tech[] getCraftingTechs()
  {
    return new Tech[] {
        PotionModEntry.SP_INCURSIONALCHEMY,
        RecipeTechRegistry.FALLEN_ALCHEMY,
        RecipeTechRegistry.ALCHEMY
    };
  }
}
