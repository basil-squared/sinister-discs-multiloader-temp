package basilsquared.sinisterdiscs

import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.chat.Component
import net.minecraft.resources.Identifier
import net.minecraft.world.item.CreativeModeTab

object ModUtils {
    const val MOD_ID = "sinister-discs"
    val TAB_NAME: Component = Component.translatable("itemGroup.$MOD_ID.main_tab")
    fun populateTab(params: CreativeModeTab.ItemDisplayParameters,output: CreativeModeTab.Output) {
        for (item in ModItems.ITEMS_INDEX) {
           val id = BuiltInRegistries.ITEM.getKey(item.value)
            if (id.namespace == "sinister-discs") {
                output.accept(item.value)
            }

        }
    }
    val SONG_IDS: List<String> = listOf(
        "welcome_home",
        "i_miss_the_quiet",
        "you_must_answer",
        "minds",
        "big_misser",
        "i_did_that",
        "meatshow",
        "beauty",
        "scars",
        "the_fire_rises",
        "sinister",
        "feel_that_dread",
        "runaway",
        "red_handed",
        "one_last_ask",
        "dont_come_back"
    )
    /**
     * Given a name, register an identifier associated with that name
     * @param name The name of the to-be-registered identifier
     */

    fun createIdentifier(name: String): Identifier {
        return Identifier.fromNamespaceAndPath(MOD_ID,name)
    }

}