package org.atlas.Resources;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

/**
 * Test bot info
 */
@AllArgsConstructor
@Getter
public class TestBot {
    @NotNull
    private final String login;
    @NotNull
    private final String password;
    @NotNull
    private final String id;
}
