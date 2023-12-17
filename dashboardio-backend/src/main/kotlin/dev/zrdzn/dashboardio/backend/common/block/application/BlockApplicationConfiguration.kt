package dev.zrdzn.dashboardio.backend.common.block.application

import dev.zrdzn.dashboardio.backend.common.block.BlockFacade
import dev.zrdzn.dashboardio.backend.common.block.BlockRepository
import dev.zrdzn.dashboardio.backend.common.block.infrastructure.JpaBlockRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlockApplicationConfiguration {

    @Bean
    fun blockFacade(blockRepository: BlockRepository): BlockFacade = BlockFacade(blockRepository)

    @Bean
    fun blockRepository(jpaBlockRepository: JpaBlockRepository): BlockRepository = jpaBlockRepository

}