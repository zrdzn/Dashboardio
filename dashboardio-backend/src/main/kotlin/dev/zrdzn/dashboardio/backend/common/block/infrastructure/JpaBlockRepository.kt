package dev.zrdzn.dashboardio.backend.common.block.infrastructure

import dev.zrdzn.dashboardio.backend.common.block.Block
import dev.zrdzn.dashboardio.backend.common.block.BlockId
import dev.zrdzn.dashboardio.backend.common.block.BlockRepository
import dev.zrdzn.dashboardio.backend.common.block.BlockName
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.Repository

interface JpaBlockRepository : BlockRepository, Repository<Block, BlockId> {

    @Query("select count(*) from Block block where block.blockName = :name")
    override fun calculateBlocksCountByName(name: BlockName): Long

    @Query("select block from Block block order by block.id")
    override fun findAll(limit: Pageable): List<Block>

}