package basilsquared.sinisterdiscs



import basilsquared.sinisterdiscs.ModUtils.populateTab
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.Identifier
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack

object FabricCreativeTabs {
    // 1. Create a Key for the tab
    private val SINISTER_TAB_KEY: ResourceKey<CreativeModeTab> = ResourceKey.create(
        Registries.CREATIVE_MODE_TAB,
        Identifier.fromNamespaceAndPath(ModUtils.MOD_ID, "general_tab")
    )


    private val SINISTER_TAB: CreativeModeTab = FabricItemGroup.builder()
        .icon { ItemStack(ModItems.ITEMS_INDEX["welcome_home"]!!) }
        .title(Component.translatable("itemGroup.${ModUtils.MOD_ID}.general"))
        .displayItems(ModUtils::populateTab)
        .build()

    fun register() {
        Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            SINISTER_TAB_KEY,
            SINISTER_TAB
        )


    }
}