package basilsquared.sinisterdiscs

import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.world.item.Item
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.common.Mod
import net.neoforged.neoforge.registries.DeferredRegister

@Mod("sinisterdiscs")
class SinisterDiscs(modEventBus: IEventBus) {

    init {
        println("SINISTER DISCS: Hello from Kotlin on NeoForge!")
        ITEMS.register(modEventBus)
    }

    companion object {

        val ITEMS: DeferredRegister<Item> = DeferredRegister.create(BuiltInRegistries.ITEM, "sinister-discs")

        /*val DUMMY_ITEM = ITEMS.register("dummy_item") { ->
            Item(Item.Properties())
        }*/
    }
}