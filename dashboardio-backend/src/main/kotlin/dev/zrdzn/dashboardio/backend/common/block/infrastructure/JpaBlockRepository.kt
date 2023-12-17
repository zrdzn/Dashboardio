package dev.zrdzn.dashboardio.backend.common.block.infrastructure

import dev.zrdzn.dashboardio.backend.common.block.Block
import dev.zrdzn.dashboardio.backend.common.block.BlockId
import dev.zrdzn.dashboardio.backend.common.block.BlockRepository
import dev.zrdzn.dashboardio.backend.common.block.BlockName
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.Repository

interface JpaBlockRepository : BlockRepository, Repository<Block, BlockId> {

    @Query("select count(*) from Block block where block.name = :name")
    override fun calculateBlocksCountByName(name: BlockName): Long

}