dependencies {
    api(project(":infra"))
}

tasks.getByName("bootJar"){
    enabled=true
}
tasks.getByName("jar"){
    enabled=false
}