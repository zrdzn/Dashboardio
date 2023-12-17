package dev.zrdzn.dashboardio.backend.common.player.application

import dev.zrdzn.dashboardio.backend.common.player.PlayerFacade
import dev.zrdzn.dashboardio.backend.common.player.PlayerRepository
import dev.zrdzn.dashboardio.backend.common.player.infrastructure.JpaPlayerRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PlayerApplicationConfiguration {

    @Bean
    fun playerFacade(playerRepository: PlayerRepository): PlayerFacade = PlayerFacade(playerRepository)

    @Bean
    fun playerRepository(jpaPlayerRepository: JpaPlayerRepository): PlayerRepository = jpaPlayerRepository

}