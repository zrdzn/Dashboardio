package dev.zrdzn.dashboardio.backend.common.block

import org.springframework.data.domain.Pageable

interface BlockRepository {

    fun save(block: Block): Block

    fun findAll(limit: Pageable): List<Block>

    fun calculateBlocksCountByName(name: BlockName): Long

}