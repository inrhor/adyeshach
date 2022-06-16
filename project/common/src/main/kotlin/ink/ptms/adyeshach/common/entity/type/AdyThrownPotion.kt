package ink.ptms.adyeshach.common.entity.type

import ink.ptms.adyeshach.common.entity.EntityThrowable
import org.bukkit.inventory.ItemStack

/**
 * @author sky
 * @date 2020/8/4 23:15
 */
abstract class AdyThrownPotion : AdyEntity(), EntityThrowable {

    open fun getItem(): ItemStack {
        return getMetadata("item")
    }

    open fun setItem(item: ItemStack) {
        setMetadata("item", item)
    }
}