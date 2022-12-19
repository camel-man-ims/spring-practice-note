dependencies {
    implementation(project(":modulea"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.getByName("bootJar"){
    enabled=true
}
tasks.getByName("jar"){
    enabled=false
}