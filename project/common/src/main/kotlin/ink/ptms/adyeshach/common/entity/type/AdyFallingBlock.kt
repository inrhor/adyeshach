package ink.ptms.adyeshach.common.entity.type

import org.bukkit.Material

/**
 * @author sky
 * @date 2020/8/4 23:15
 */
abstract class AdyFallingBlock : AdyEntity() {

    /**
     * 设置材质及附加值
     */
    abstract fun setMaterial(material: Material, data: Byte)

    /**
     * 设置材质
     */
    abstract fun setMaterial(material: Material)

    /**
     * 获取材质
     */
    abstract fun getMaterial(): Material

    /**
     * 设置附加值
     */
    abstract fun setData(data: Byte)

    /**
     * 获取附加值
     */
    abstract fun getData(): Byte
}