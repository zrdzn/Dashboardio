package dev.zrdzn.dashboardio.backend.common.action.application

import dev.zrdzn.dashboardio.backend.common.action.ActionFacade
import dev.zrdzn.dashboardio.backend.common.action.ActionRepository
import dev.zrdzn.dashboardio.backend.common.action.infrastructure.JpaActionRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ActionApplicationConfiguration {

    @Bean
    fun actionFacade(actionRepository: ActionRepository): ActionFacade = ActionFacade(actionRepository)

    @Bean
    fun actionRepository(jpaActionRepository: JpaActionRepository): ActionRepository = jpaActionRepository

}