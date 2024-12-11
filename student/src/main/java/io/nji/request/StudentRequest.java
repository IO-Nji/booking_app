package io.nji.request;

public record StudentRequest(
        String name,
        String surname,
        String email
) {
}
