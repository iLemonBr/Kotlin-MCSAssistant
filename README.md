# FnitMCSAssistant-plugin
Spigot plugin : send user's statistics via Http POST

## What is this
* the plugin for Minecraft Spigot Server

## About this plugin
* Send user statistics as JSON via Http POST
* trigger when player join and player leave

## Support
* version 1.12.1+

## Download
https://github.com/Fnit-Crafters/FnitMCSAssistant-plugin/raw/master/out/artifacts/FnitMCSAssistant_plugin_jar/FnitMCSAssistant-plugin.jar

## Installation
1. Download the jar file and drop it into your plugins folder
2. in config.yml, write url you wanna send data as http post

## Request Json sample

```

{ 
  name: 'Steve',
  isOnline: true,
  uuid: 'players-unique-id-is-here',
  statistics: {
    DAMAGE_DEALT: 1937,
     DAMAGE_TAKEN: 2120,
     DEATHS: 8,
     MOB_KILLS: 13,
     PLAYER_KILLS: 0,
     FISH_CAUGHT: 0,
     ANIMALS_BRED: 0,
     LEAVE_GAME: 64,
     JUMP: 284,
     PLAY_ONE_TICK: 361518,
     WALK_ONE_CM: 38528,
     SWIM_ONE_CM: 18678,
     FALL_ONE_CM: 8206,
     SNEAK_TIME: 0,
     CLIMB_ONE_CM: 2963,
     FLY_ONE_CM: 56660,
     DIVE_ONE_CM: 16989,
     MINECART_ONE_CM: 0,
     BOAT_ONE_CM: 0,
     PIG_ONE_CM: 0,
     HORSE_ONE_CM: 0,
     SPRINT_ONE_CM: 39754,
     CROUCH_ONE_CM: 0,
     AVIATE_ONE_CM: 0,
     TIME_SINCE_DEATH: 0,
     TALKED_TO_VILLAGER: 0,
     TRADED_WITH_VILLAGER: 0,
     CAKE_SLICES_EATEN: 0,
     CAULDRON_FILLED: 0,
     CAULDRON_USED: 0,
     ARMOR_CLEANED: 0,
     BANNER_CLEANED: 0,
     BREWINGSTAND_INTERACTION: 0,
     BEACON_INTERACTION: 0,
     DROPPER_INSPECTED: 0,
     HOPPER_INSPECTED: 0,
     DISPENSER_INSPECTED: 0,
     NOTEBLOCK_PLAYED: 0,
     NOTEBLOCK_TUNED: 0,
     FLOWER_POTTED: 0,
     TRAPPED_CHEST_TRIGGERED: 0,
     ENDERCHEST_OPENED: 0,
     ITEM_ENCHANTED: 0,
     RECORD_PLAYED: 0,
     FURNACE_INTERACTION: 0,
     CRAFTING_TABLE_INTERACTION: 2,
     CHEST_OPENED: 0,
     SLEEP_IN_BED: 0,
     SHULKER_BOX_OPENED: 0
  }
}


```

## Author
TaikiFnit

---

## これはなんですか
* Minecraft Spigot Serverで動くPluginです

## このプラグインについて
* 設定したURLに対して, サーバーに参加しているユーザーの統計データとオンラインの状況を送信します
* HTTPを経由してJSON形式でデータをPOSTします
* プレイヤーがサーバーに参加した時, 退出した時にデータが送信されます

## Support
* version 1.12.1+

## Download
https://github.com/Fnit-Crafters/FnitMCSAssistant-plugin/raw/master/out/artifacts/FnitMCSAssistant_plugin_jar/FnitMCSAssistant-plugin.jar

## 導入
1. jarファイルをダウンロードして `plugins` フォルダに入れてください
2. Serverを一度起動することにより, config.ymlファイルが自動で生成されます
3. 生成されたconfig.ymlファイルにHTTP POSTをしたいurlを書き込んでください

## 送信されるJSONの形式
Request Json sample と同じ

## Author
TaikiFnit
