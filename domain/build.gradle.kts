dependencies {
    implementation(project(":infra"))
}

tasks.getByName("bootJar"){
    enabled=true
}
tasks.getByName("jar"){
    enabled=false
}