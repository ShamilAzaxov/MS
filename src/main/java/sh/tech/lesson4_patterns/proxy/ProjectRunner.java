package sh.tech.lesson4_patterns.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://test-url.com");
        project.run();
    }
}
