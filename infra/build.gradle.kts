dependencies {
    implementation("com.h2database:h2")
    testImplementation("com.h2database:h2")
}

tasks.getByName("bootJar"){
    enabled=true
}
tasks.getByName("jar"){
    enabled=false
}