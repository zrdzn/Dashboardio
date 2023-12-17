package dev.zrdzn.dashboardio.backend.common.action.infrastructure

import dev.zrdzn.dashboardio.backend.common.action.Action
import dev.zrdzn.dashboardio.backend.common.action.ActionId
import dev.zrdzn.dashboardio.backend.common.action.ActionRepository
import org.springframework.data.repository.Repository

interface JpaActionRepository : ActionRepository, Repository<Action, ActionId>