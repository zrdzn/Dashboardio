package dev.zrdzn.dashboardio.backend.common.action

import dev.zrdzn.dashboardio.backend.api.action.ActionType
import dev.zrdzn.dashboardio.backend.common.player.PlayerId
import io.hypersistence.utils.hibernate.type.basic.PostgreSQLEnumType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant
import org.hibernate.annotations.Type

typealias ActionId = Long

@Entity(name = "Action")
@Table(name = "actions_history")
data class Action(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: ActionId?,

    @Column(name = "action_type", updatable = false)
    @Enumerated(EnumType.STRING)
    @Type(PostgreSQLEnumType::class)
    val actionType: ActionType,

    @Column(name = "player_id", updatable = false)
    val playerId: PlayerId,

    @Column(name = "occurred_at", updatable = false)
    val occurredAt: Instant
)