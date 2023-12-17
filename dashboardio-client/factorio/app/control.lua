require("handlers.player_tile_build_handler")
require("handlers.player_tile_mine_handler")

script.on_event(defines.events.on_player_built_tile, handle_player_tile_build)
script.on_event(defines.events.on_player_mined_tile, handle_player_tile_mine)