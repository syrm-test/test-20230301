rootProject.name = "yaml-retraction"

include("submodules:app-web")
findProject(":submodules:app-web")?.name = "app-web"
