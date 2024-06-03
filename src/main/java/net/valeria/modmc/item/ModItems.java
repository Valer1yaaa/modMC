package net.valeria.modmc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.valeria.modmc.Modmc;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;

public class ModItems {

    public static final Item CUPCAKE = registerItem("cupcake", new Item(new FabricItemSettings().food(ModFoodComponents.CUPCAKE)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(CUPCAKE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Modmc.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        Modmc.LOGGER.info("Registering mod items for " + Modmc.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
