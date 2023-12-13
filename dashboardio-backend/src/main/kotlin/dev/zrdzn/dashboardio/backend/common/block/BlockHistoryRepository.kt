package dev.zrdzn.dashboardio.backend.common.block

interface BlockHistoryRepository {

    fun save(blockHistoryEntry: BlockHistoryEntry): BlockHistoryEntry

    fun findAll(limit: Int): Set<BlockHistoryEntry>

    fun calculateBlocksCountByName(name: BlockName): Int

}