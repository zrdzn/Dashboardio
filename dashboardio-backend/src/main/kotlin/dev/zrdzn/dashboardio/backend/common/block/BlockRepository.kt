package dev.zrdzn.dashboardio.backend.common.block

interface BlockRepository {

    fun save(block: Block): Block

    fun findAll(limit: Int): Set<Block>

    fun calculateBlocksCountByName(name: BlockName): Long

}