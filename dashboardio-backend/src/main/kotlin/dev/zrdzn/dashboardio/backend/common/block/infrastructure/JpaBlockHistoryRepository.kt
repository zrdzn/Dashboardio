package dev.zrdzn.dashboardio.backend.common.block.infrastructure

import dev.zrdzn.dashboardio.backend.common.block.BlockHistoryEntry
import dev.zrdzn.dashboardio.backend.common.block.BlockHistoryEntryId
import dev.zrdzn.dashboardio.backend.common.block.BlockHistoryRepository
import dev.zrdzn.dashboardio.backend.common.block.BlockName
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.Repository

interface JpaBlockHistoryRepository : BlockHistoryRepository, Repository<BlockHistoryEntry, BlockHistoryEntryId> {

    @Query("SELECT SUM(blockHistoryEntry.change) FROM BlockHistoryEntry blockHistoryEntry WHERE blockHistoryEntry.name = :name")
    override fun calculateBlocksCountByName(name: BlockName): Int

}