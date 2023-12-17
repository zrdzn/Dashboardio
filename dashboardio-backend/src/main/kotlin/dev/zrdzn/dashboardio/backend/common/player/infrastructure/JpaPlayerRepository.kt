package dev.zrdzn.dashboardio.backend.common.player.infrastructure

import dev.zrdzn.dashboardio.backend.common.player.Player
import dev.zrdzn.dashboardio.backend.common.player.PlayerId
import dev.zrdzn.dashboardio.backend.common.player.PlayerRepository
import org.springframework.data.repository.Repository

interface JpaPlayerRepository : PlayerRepository, Repository<Player, PlayerId>