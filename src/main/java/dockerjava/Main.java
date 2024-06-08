package dockerjava;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DockerClientBuilder;

public class Main {
    public static void main(String[] args) {
        DockerClient dockerClient = DockerClientBuilder.getInstance().build();

    }
}
